package com.gft.deconto;

public class CalculadoraDescontoPrimeiraFaixa extends CalculadoraDesconto {

	public CalculadoraDescontoPrimeiraFaixa(CalculadoraDesconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double calcular(double valorTotal) {
		if(valorTotal >300.0 && valorTotal <= 800.0)
			return valorTotal * 0.04;
		
		return -1;
	}

}
