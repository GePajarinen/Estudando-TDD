package com.gft.service;

import com.gft.model.Voo;

public class PrecoPassagemSilver implements CalculadoraPrecoPassagem{

	@Override
	public double calcular(Voo voo) {
		if(voo.getPreco() > 700.0)
			return calcularValorAbaixoDoLimite(voo);
		return calcularValorAcimaDoLimite(voo);
	}

	private double calcularValorAcimaDoLimite(Voo voo) {
		return voo.getPreco() * 0.94;
	}

	private double calcularValorAbaixoDoLimite(Voo voo) {
		return voo.getPreco() * 0.9;
	}

}
