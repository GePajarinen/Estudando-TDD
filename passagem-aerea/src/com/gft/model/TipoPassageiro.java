package com.gft.model;

import com.gft.service.CalculadoraPrecoPassagem;
import com.gft.service.PrecoPassagemGold;
import com.gft.service.PrecoPassagemSilver;

public enum TipoPassageiro {
	
	GOLD(new PrecoPassagemGold()),
	SILVER(new PrecoPassagemSilver());

	CalculadoraPrecoPassagem calculadora;
	
	TipoPassageiro(CalculadoraPrecoPassagem calculadora){
		this.calculadora = calculadora;
	}

	public CalculadoraPrecoPassagem getCalculadora(){
		return calculadora;
	}
}
