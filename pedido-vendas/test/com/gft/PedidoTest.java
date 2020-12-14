package com.gft;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PedidoTest {
	
	private Pedido pedido;
	
	@Before
	public void setup() {
		pedido = new Pedido();
	}
	
	private void assertResumoPedido(double valorTotal, double desconto) {
		assertEquals(valorTotal, pedido.valorTotal(), 0.0001);//0.0001 -> margem de erro
		assertEquals(desconto, pedido.desconto(), 0.0001);
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
	
}
