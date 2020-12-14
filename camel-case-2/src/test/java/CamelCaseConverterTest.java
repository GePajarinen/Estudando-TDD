import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CamelCaseConverterTest {

	private CamelCaseConverter cc;
	
	@Before //Vai ser executado toda vez, antes de cada test
	public void setup() {
		cc = new CamelCaseConverter();
	}
	
	
	@Test
	public void aplicarCamelCaseEmNomeunico() throws Exception {
		assertEquals("Madona", cc.converter("madona"));
	}
	
	@Test
	public void converterNomeComCaseMisturado() throws Exception {
		assertEquals("Madona", cc.converter("mAdOnA"));
	}
	
	//Quando for fazer um BUILD no marven, ele mostra no console os TESTS corridos.
	
	
	/*
	@Test
	public void nada() throws Exception {
	}*/ 
	//Tesntando tb no projeto maven
}
