package serviceTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import models.Guerreiro;
import models.Mago;
import models.Personagem;

public class Exercicio03Test {
	
	
	@Before
	public void setUp() {
		
		List<String> magiasMago = new ArrayList<String>();
		magiasMago.add("Varinha mágica");
		Mago mago = new Mago("Sininho", 1, 1, 1, 1, 1, 1, magiasMago);
		 
		List<String> habilidadesGuerreiro = new ArrayList<String>();
		habilidadesGuerreiro.add("Martela o martelão");
		Guerreiro guerreiro = new Guerreiro("Thor", 1, 1, 1, 1, 1, 1, habilidadesGuerreiro);
		Guerreiro guerreiro2 = new Guerreiro("Lukki", 1, 1, 1, 1, 1, 1, habilidadesGuerreiro);
}
	
	@Test
	public void testandoOCalculoDePersonagensCriados() throws Exception {
		
		assertEquals(3,Personagem.getTotalDePersonagensCriados());
	}

}
