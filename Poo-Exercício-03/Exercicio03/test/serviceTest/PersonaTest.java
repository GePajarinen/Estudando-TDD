package serviceTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import models.Guerreiro;
import models.Mago;
import service.Persona;

public class PersonaTest {
	
	private Persona persona;
	private Mago mago;
	private Guerreiro guerreiro;
	
	@Before
	public void setUp() {
		persona = new Persona();
		
		List<String> magiasMago = new ArrayList<String>();
		magiasMago.add("Varinha mágica");
		mago = new Mago("Sininho", 1, 1, 1, 1, 1, 1, magiasMago);
		 
		List<String> habilidadesGuerreiro = new ArrayList<String>();
		habilidadesGuerreiro.add("Martela o martelão");
		guerreiro = new Guerreiro("Thor", 1, 1, 1, 1, 1, 1, habilidadesGuerreiro);
	}
	
	@Test
	public void deveImprimirPersonaMago() throws Exception {
		persona.personaMago(mago);
		
		assertEquals("Sininho", mago.getNome());
	}
	
	@Test
	public void deveImprimirPersonaGuerreiro() throws Exception {
		persona.personaGuerreiro(guerreiro);
		
		assertEquals("Thor", guerreiro.getNome());
	}

}
