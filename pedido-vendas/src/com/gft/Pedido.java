package com.gft;

public class Pedido {
	
	private double valorTotal;
	private double desconto;

	public void adicionarItem(ItemPedido itemPedido) {
		valorTotal = itemPedido.getValor() * itemPedido.getQuantidade();
	}

	public double valorTotal() {
		return valorTotal;
	}

	public double desconto() {
		return desconto;
	}
	
}
