package com.gft.deconto;

public class CalculadoraDescontoSegundaFaixa extends CalculadoraDesconto {

	public CalculadoraDescontoSegundaFaixa(CalculadoraDesconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double calcular(double valorTotal) {
		if(valorTotal > 800.0 && valorTotal <=1000.00 ) 
			return valorTotal * 0.06;
		
		return -1;
	}

}
