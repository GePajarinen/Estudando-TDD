package com.gft;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.gft.deconto.CalculadoraDesconto;
import com.gft.deconto.CalculadoraDescontoPrimeiraFaixa;
import com.gft.deconto.CalculadoraDescontoSegundaFaixa;
import com.gft.deconto.CalculadoraDescontoTerceiraFaixa;
import com.gft.deconto.SemDesconto;

public class PedidoTest {
	
	private Pedido pedido;
	
	@Before
	public void setup() {
		CalculadoraDesconto cd = 
				new CalculadoraDescontoTerceiraFaixa(
						new CalculadoraDescontoSegundaFaixa(
								new CalculadoraDescontoPrimeiraFaixa(
										new SemDesconto(null))));
		
		pedido = new Pedido(cd);
	}
	
	private void assertResumoPedido(double valorTotal, double desconto) {
		ResumoPedido rp = pedido.resumo();
		assertEquals(valorTotal, rp.getValorTotal(), 0.0001);//0.0001 -> margem de erro
		assertEquals(desconto, rp.getDesconto(), 0.0001);
	}
	
	@Test
	public void deveAdicionarUmItemNoPedido() throws Exception {
		pedido.adicionarItem(new ItemPedido("Sabonete", 3.0, 10));
	}
	
	@Test
	public void deveCalcularValorTotalEDescontoDoPedido() throws Exception {
		assertResumoPedido(0.0, 0.0);
	} 
	
	@Test
	public void deveCalcularResumoDeItemSemDesconto() throws Exception {
		pedido.adicionarItem(new ItemPedido("Sabone", 5.0, 5));
		
		assertResumoPedido(25.0, 0.0);
	}
	
	@Test
	public void deveCalcularResumoDeDoisItensSemDesconto() throws Exception {
		pedido.adicionarItem(new ItemPedido("Sabone", 3.0, 3));
		pedido.adicionarItem(new ItemPedido("Pasta dental", 7.0, 3));
		
		assertResumoPedido(30.0, 0.0);
	}
	
	
	@Test
	public void deveAplicarDescontoDa1aFaixa() throws Exception {
		pedido.adicionarItem(new ItemPedido("Creme", 20.0, 20));
		
		assertResumoPedido(400.0, 16.0);
	}
	
	
	@Test
	public void deveAplicarDescontoDa2aFaixa() throws Exception {
		pedido.adicionarItem(new ItemPedido("Shampoo", 15.0, 30));
		pedido.adicionarItem(new ItemPedido("Óleo", 15.0, 30));
		
		assertResumoPedido(900.0, 54.0);
	}
	
	
	@Test
	public void deveAplicarDescontoDa3aFaixa() throws Exception {
		pedido.adicionarItem(new ItemPedido("Shampoo", 15.0, 30));
		pedido.adicionarItem(new ItemPedido("Óleo", 15.0, 30));
		pedido.adicionarItem(new ItemPedido("Creme", 10.0, 30));
		
		assertResumoPedido(1200.0, 96.0);
	}
	
}
