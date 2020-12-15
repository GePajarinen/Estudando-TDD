package com.gft;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PedidoTest {
	
	private PedidoBuilder pedido;
	
	@Before
	public void setup() {
		pedido = new PedidoBuilder();
		
	}
	
	private void assertResumoPedido(double valorTotal, double desconto) {
		ResumoPedido resumoPedido = pedido.construir().resumo();
		//assertEquals(valorTotal, rp.getValorTotal(), 0.0001);//0.0001 -> margem de erro
		//assertEquals(desconto, rp.getDesconto(), 0.0001);
		
		//Como as duas assertEquals estão relacionadas entre si, pode-se 
		//resumir em uma assertEquals:
		assertEquals(new ResumoPedido(valorTotal, desconto), resumoPedido);
	}
	
	
	@Test
	public void deveCalcularValorTotalEDescontoDoPedido() throws Exception {
		assertResumoPedido(0.0, 0.0);
	} 
	
	@Test
	public void deveCalcularResumoDeItemSemDesconto() throws Exception {
		//pedido.adicionarItem(new ItemPedido("Sabone", 5.0, 5));
		pedido.comItem(5.0, 5); //Interface mais fluente
		
		assertResumoPedido(25.0, 0.0);
	}
	
	
	@Test
	public void deveCalcularResumoDeDoisItensSemDesconto() throws Exception {
		//pedido.adicionarItem(new ItemPedido("Sabone", 3.0, 3));
		//pedido.adicionarItem(new ItemPedido("Pasta dental", 7.0, 3));
		pedido.comItem(3.0, 3)
				.comItem(7.0, 3);
		
		assertResumoPedido(30.0, 0.0);
	}
	
	
	@Test
	public void deveAplicarDescontoDa1aFaixa() throws Exception {
		//pedido.adicionarItem(new ItemPedido("Creme", 20.0, 20));
		pedido.comItem(20.0, 20);
		
		assertResumoPedido(400.0, 16.0);
	}
	
	
	@Test
	public void deveAplicarDescontoDa2aFaixa() throws Exception {
		//pedido.adicionarItem(new ItemPedido("Shampoo", 15.0, 30));
		//pedido.adicionarItem(new ItemPedido("Óleo", 15.0, 30));
		pedido.comItem(15.0,  30)
				.comItem(15.0, 30);
		
		assertResumoPedido(900.0, 54.0);
	}
	
	
	@Test
	public void deveAplicarDescontoDa3aFaixa() throws Exception {
		//pedido.adicionarItem(new ItemPedido("Shampoo", 15.0, 30));
		//pedido.adicionarItem(new ItemPedido("Óleo", 15.0, 30));
		//pedido.adicionarItem(new ItemPedido("Creme", 10.0, 30));
		pedido.comItem(15.0, 30)
				.comItem(15.0, 30)
				.comItem(10.0, 30);
		
		assertResumoPedido(1200.0, 96.0);
	}
	
}
