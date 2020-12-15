package com.gft.deconto;

public class SemDesconto  extends CalculadoraDesconto {

	public SemDesconto(CalculadoraDesconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected double calcular(double valorTotal) {
		return 0;
		
	}
	
}
