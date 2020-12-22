package modelsTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import models.Jogador;

public class JogadorTest {
	
	private Jogador jogador;
	
	@Before
	public void setUp() {
		jogador = new Jogador();
	}
	
	@Test
	public void deveEscolherPapel() throws Exception {
		
		jogador.setEscolha(1);
		
		assertEquals("Papel", jogador.jogando());
		
	}
	
	@Test
	public void deveEscolherPedra() throws Exception {
		Jogador jogador = new Jogador();
		jogador.setEscolha(2);
		
		assertEquals("Pedra", jogador.jogando());
		
	}
	
	@Test
	public void deveEscolherTesoura() throws Exception {
		Jogador jogador = new Jogador();
		jogador.setEscolha(3);
		
		assertEquals("Tesoura", jogador.jogando());
		
	}
}
