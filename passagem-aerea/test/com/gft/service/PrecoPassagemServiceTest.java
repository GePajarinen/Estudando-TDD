package com.gft.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.gft.model.Passageiro;
import com.gft.model.TipoPassageiro;
import com.gft.model.Voo;

public class PrecoPassagemServiceTest {
	
	private PrecoPassagemService precoPassagemService;
	
	@Before
	public void setup() {
		precoPassagemService= new PrecoPassagemService();
	}
		
	
	private void assertValorPassagem(Passageiro passageiro, Voo voo, double esperado) {
		double valor = precoPassagemService.calcular(passageiro, voo);
		assertEquals(esperado, valor, 0.0001);
	}
	
	@Test
	public void deveCalcularPrecoParaPassageiroGoldComValorAbaixoDoLimite() throws Exception {
		Passageiro passageiro = new Passageiro("Jo�o", TipoPassageiro.GOLD);
		Voo voo = new Voo("S�o Paulo", "Rio de Janeiro", 100.0);
		assertValorPassagem(passageiro, voo, 90.0);
	}


	@Test
	public void deveCalcularPrecoParaPassageiroGoldComValorAcimaDoLimite() throws Exception {
		Passageiro passageiro = new Passageiro("Jo�o", TipoPassageiro.GOLD);
		Voo voo = new Voo("S�o Paulo", "Rio de Janeiro", 600.0);
		assertValorPassagem(passageiro, voo, 510.0);
	}

	
	@Test
	public void deveCalcularPrecoParaPassageiroSilverComValorAbaixoDoLimite() throws Exception {
		Passageiro passageiro = new Passageiro("Jo�o", TipoPassageiro.SILVER);
		Voo voo = new Voo("S�o Paulo", "Rio de Janeiro", 100.0);
		assertValorPassagem(passageiro, voo, 94.0);
	}
	
	@Test
	public void deveCalcularPrecoParaPassageiroSilverComValorAcimaDoLimite() throws Exception {
		Passageiro passageiro = new Passageiro("Jo�o", TipoPassageiro.SILVER);
		Voo voo = new Voo("S�o Paulo", "Rio de Janeiro", 800.0);
		assertValorPassagem(passageiro, voo, 720.0);
	}
}
