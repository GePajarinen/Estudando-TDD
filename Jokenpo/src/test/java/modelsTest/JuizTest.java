package modelsTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import models.Juiz;

public class JuizTest {
private Juiz juiz;
	
	
	@Before
	public void setUp() {
		juiz = new Juiz();
	}

	//EMPATE
	@Test
	public void testandoQuandoEmpate() throws Exception {
		String jogo = juiz.comparar("Pedra", "Pedra");
		
		assertEquals("Empate", jogo);
	}
	
	
	//GANHA JOGADOR 1
	@Test
	public void testandoQuandoJogador1GanhaComPedra() throws Exception {
		String jogo = juiz.comparar("Pedra", "Tesoura");
		
		assertEquals("Jogador 1", jogo);
	}
	
	@Test
	public void testandoQuandoJogador1GanhaComTesoura() throws Exception {
		String jogo = juiz.comparar("Tesoura", "Papel");
		
		assertEquals("Jogador 1", jogo);
	}
	
	@Test
	public void testandoQuandoJogador1GanhaComPapel() throws Exception {
		String jogo = juiz.comparar("Papel", "Pedra");
		
		assertEquals("Jogador 1", jogo);
	}
	
	
	//GANHA JOGADOR 2
	@Test
	public void testandoQuandoJogador2GanhaComPedra() throws Exception {
		String jogo = juiz.comparar("Tesoura", "Pedra");
		
		assertEquals("Jogador 2", jogo);
	}
	
	@Test
	public void testandoQuandoJogador2GanhaComTesoura() throws Exception {
		String jogo = juiz.comparar("Papel", "Tesoura");
		
		assertEquals("Jogador 2", jogo);
	}
	
	@Test
	public void testandoQuandoJogador2GanhaComPapel() throws Exception {
		String jogo = juiz.comparar("Pedra", "Papel");
		
		assertEquals("Jogador 2", jogo);
	}
	
}
