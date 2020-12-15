package com.gft;


import java.util.ArrayList;
import java.util.List;

import com.gft.deconto.CalculadoraDesconto;



public class Pedido {
	
	private List<ItemPedido> itens = new ArrayList<>();
	
	private CalculadoraDesconto cd;
	
	public Pedido(CalculadoraDesconto cd) {
		this.cd = cd;
	}
	
	
	private void validarQuantidadeItens(ItemPedido itemPedido) {
		if (itemPedido.getQuantidade() < 0)
			throw new QuantidadeItensInvalidaException();
	}
	
	
	public void adicionarItem(ItemPedido itemPedido) {
		validarQuantidadeItens(itemPedido);
		
		itens.add(itemPedido);
	}

	
	public ResumoPedido resumo() {
		double valorTotal = itens.stream().mapToDouble(i -> i.getValor() * i.getQuantidade()).sum();
		double desconto = cd.desconto(valorTotal);
		
		return new ResumoPedido(valorTotal, desconto);
	}

	
	
}
