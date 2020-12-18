package models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VideoGameTest {
	
	private VideoGame game;
	
	@Before
	public void setUp(){
		 game = new VideoGame("Video Game", 300.0, 2, "PSP", "XX", false);
	}

	@Test
	public void deveCalcularImpostoDoGameNovo() throws Exception {
		assertEquals(135.0, game.calcularImposto(), 0.0001);
	}
	
	@Test
	public void deveClacularImpostoDoGameUsado() throws Exception {
		game.setIsUsado(true);
		
		assertEquals(75.0, game.calcularImposto(), 0.0001);
	}
}
