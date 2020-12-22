package service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;

public class JuizTest {
	
	@Mock
	private Juiz juiz;

	//EMPATE
	@Test
	public void testandoQuandoEmpate() throws Exception {
		when(juiz.comparar()).thenReturn("Empate");
		
		assertEquals("Empate", juiz.comparar());
	}
	
	
	//GANHA JOGADOR 1
	@Test
	public void testandoQuandoJogador1GanhaComPedra() throws Exception {
		when(juiz.jogador1()).thenReturn("Pedra");
		when(juiz.jogador2()).thenReturn("Tesoura");
		
		assertEquals("Jogador 1", juiz.comparar());
	}
	
	@Test
	public void testandoQuandoJogador1GanhaComTesoura() throws Exception {
		when(juiz.jogador1()).thenReturn("Tesoura");
		when(juiz.jogador2()).thenReturn("Papel");
		
		assertEquals("Jogador 1", juiz.comparar());
	}
	
	@Test
	public void testandoQuandoJogador1GanhaComPapel() throws Exception {
		when(juiz.jogador1()).thenReturn("Papel");
		when(juiz.jogador2()).thenReturn("Pedra");
		
		assertEquals("Jogador 1", juiz.comparar());
	}
	
	
	//GANHA JOGADOR 2
	@Test
	public void testandoQuandoJogador2GanhaComPedra() throws Exception {
		when(juiz.jogador1()).thenReturn("Tesoura");
		when(juiz.jogador2()).thenReturn("Pedra");
		
		assertEquals("Jogador 2", juiz.comparar());
	}
	@Test
	public void testandoQuandoJogador2GanhaComTesoura() throws Exception {
		when(juiz.jogador1()).thenReturn("Papel");
		when(juiz.jogador2()).thenReturn("Tesoura");
		
		assertEquals("Jogador 2", juiz.comparar());
	}
	
	@Test
	public void testandoQuandoJogador2GanhaComPapel() throws Exception {
		when(juiz.jogador1()).thenReturn("Pedra");
		when(juiz.jogador2()).thenReturn("Papel");
		
		assertEquals("Jogador 2", juiz.comparar());
	}
	
	
}
