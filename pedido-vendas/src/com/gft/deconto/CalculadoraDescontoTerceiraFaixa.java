package com.gft.deconto;

public class CalculadoraDescontoTerceiraFaixa extends CalculadoraDesconto{
	
	public CalculadoraDescontoTerceiraFaixa(CalculadoraDesconto proximo) {
		super(proximo);
	}
	
	@Override
	protected double calcular(double valorTotal) {
		if (valorTotal >1000.0)
			return valorTotal * 0.08;
		
		return -1;
	}
}
