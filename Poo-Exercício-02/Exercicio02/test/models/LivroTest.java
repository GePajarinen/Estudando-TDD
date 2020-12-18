package models;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LivroTest {
	
	private Livro livro;
	
	@Before
	public void setUp(){
		livro = new Livro("Humilhados e ofendidos", 12.5, 20, "Dostoievsky", "romance", 10); 
	}
	
	@Test
	public void deveCalcularImpostoDoLivroEducativo() throws Exception {
		livro.setTema("Educativo");
		System.out.println(livro.getTema().toLowerCase());
		
		assertEquals(0.0, livro.calcularImposto(), 0.0001);
	}
	
	@Test
	public void deveCalcularImpostoDoLivroNaoEducativo() throws Exception {
		livro.setTema("Romance");
		
		assertEquals(1.25, livro.calcularImposto(), 0.0001);
	}
}
