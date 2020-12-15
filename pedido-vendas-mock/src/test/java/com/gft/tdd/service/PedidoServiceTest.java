package com.gft.tdd.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.gft.tdd.email.NotificadorEmail;
import com.gft.tdd.model.Pedido;
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
		pedidoService = new PedidoService(pedidos, email, sms);
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
		Mockito.verify(pedidos).guardar(pedido); //Verificar a atividade do Mock
	}
	
	@Test
	public void deveNotificarPorEmail() throws Exception {
		pedidoService.lancar(pedido);
		Mockito.verify(email).enviar(pedido);
	}
	
	@Test
	public void deveNotificarPorSms() throws Exception {
		pedidoService.lancar(pedido);
		Mockito.verify(sms).notificar(pedido);
	}

}
