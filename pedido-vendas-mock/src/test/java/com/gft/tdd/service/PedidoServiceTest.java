package com.gft.tdd.service;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
//import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;

import com.gft.tdd.email.NotificadorEmail;
import com.gft.tdd.model.Pedido;
import com.gft.tdd.model.StatusPedido;
import com.gft.tdd.model.builder.PedidoBuilder;
import com.gft.tdd.repository.Pedidos;
import com.gft.tdd.sms.NotificadorSms;

public class PedidoServiceTest {
	
	private PedidoService pedidoService;
	
	private Pedido pedido;
	
	@Mock //Avisa quais classes vão ser Mock
	private Pedidos pedidos;
	
	@Mock
	private NotificadorEmail email;
	
	@Mock
	private NotificadorSms sms;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
		
		List<AcaoLancamentoPedido> acoes =  Arrays.asList(pedidos, email, sms);
		pedidoService = new PedidoService(pedidos, acoes);
		pedido = new PedidoBuilder()
				.comValor(100.0)
				.para("Maria", "maria@maria.com", "6666-6666")
				.construir();
	}

	@Test
	public void deveCalcularImposto() throws Exception {
		double imposto = pedidoService.lancar(pedido);
		assertEquals(10.0, imposto, 0.0001);
	}
	
	@Test
	public void deveSalvarPedidoNoBancoDeDados() throws Exception {
		pedidoService.lancar(pedido);
		
		//Adicionado o IMPORT STATIC MOCKITO, não precisa do prefixo 'Mockito'
		//Mockito.verify(pedidos).executar(pedido); //Verificar a atividade do Mock
		verify(pedidos).executar(pedido);
	}
	
	@Test
	public void deveNotificarPorEmail() throws Exception {
		pedidoService.lancar(pedido);
		
		//Mockito.verify(email).executar(pedido);
		verify(email).executar(pedido);
	}
	
	@Test
	public void deveNotificarPorSms() throws Exception {
		pedidoService.lancar(pedido);
		
		//Mockito.verify(sms).executar(pedido);
		verify(sms).executar(pedido);
	}
	
	@Test
	public void devePagarPedidoPendente() throws Exception {
		Long codigoPedido = 135L;
		
		Pedido pedidoPendente = new Pedido();
		pedidoPendente.setStatus(StatusPedido.PENDENTE);
		
		//Adicionado o IMPORT STATIC MOCKITO, não precisa do prefixo 'Mockito'
		when(pedidos.buscarPeloCodigo(codigoPedido)).thenReturn(pedidoPendente); 
		
		Pedido pedidoPago = pedidoService.pagar(codigoPedido);
		
		assertEquals(StatusPedido.PAGO, pedidoPago.getStatus());
	}
	
	@Test(expected = PedidoJaPodeEstarPagoException.class)
	public void deveNegarPagamentoDePedidoJaPago() throws Exception {
		Long codigoPedido = 135L;
		
		Pedido pedidoPendente = new Pedido();
		pedidoPendente.setStatus(StatusPedido.PAGO);
		
		//Adicionado o IMPORT STATIC MOCKITO, não precisa do prefixo 'Mockito'
		when(pedidos.buscarPeloCodigo(codigoPedido)).thenReturn(pedidoPendente); 
		
		pedidoService.pagar(codigoPedido);
		
	}
	
	

}
