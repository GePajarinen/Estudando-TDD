package com.gft.deconto;

public abstract class CalculadoraDesconto {

	private CalculadoraDesconto proximo;
	
	public CalculadoraDesconto(CalculadoraDesconto proximo) {
		this.proximo = proximo;
	}
	
	public double desconto(double valorTotal) {
		double desconto = calcular(valorTotal);
		
		if(desconto == -1) 
			return proximo.desconto(valorTotal);
		
		return desconto;
		
	}

	protected abstract double calcular(double valorTotal);
}
