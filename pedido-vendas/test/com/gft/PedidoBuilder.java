package com.gft;

import com.gft.deconto.CalculadoraDesconto;
import com.gft.deconto.CalculadoraDescontoPrimeiraFaixa;
import com.gft.deconto.CalculadoraDescontoSegundaFaixa;
import com.gft.deconto.CalculadoraDescontoTerceiraFaixa;
import com.gft.deconto.SemDesconto;

public class PedidoBuilder {
	
	private Pedido instancia;
	
	public PedidoBuilder() {
		CalculadoraDesconto cd = 
				new CalculadoraDescontoTerceiraFaixa(
						new CalculadoraDescontoSegundaFaixa(
								new CalculadoraDescontoPrimeiraFaixa(
										new SemDesconto(null))));
		
		instancia = new Pedido(cd);
	}

	public PedidoBuilder comItem(double valorUnitario, int quantidade) {
		instancia.adicionarItem(new ItemPedido("Gerado", valorUnitario, quantidade));
		return this;
	}
	
	public Pedido construir() {
		return instancia;
	}
}
