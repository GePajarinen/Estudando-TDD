package service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import models.Gerente;
import models.Supervisor;
import models.Vendedor;

public class Exercicio07Test {
	
	Gerente gerente;
	Supervisor supervisor;
	Vendedor vendedor;
	
	
	@Before
	public void setUp() {
		gerente = new Gerente("Camila Dornelas", 35, 5000.00);
		supervisor = new Supervisor("Mureil Garcia", 25, 3000.00 );
		vendedor = new Vendedor("Natalia Cortes", 18, 1800.00);
	}
	
	@Test
	public void testandoBonificacaoGerente() throws Exception {
				
		assertEquals(15000.00, gerente.bonificacao(), 0.0001);
	}
	
	@Test
	public void testandoBonificacaoSupervisor() throws Exception {
		
		assertEquals(8000.00, supervisor.bonificacao(), 0.0001);
	}
	
	@Test
	public void testandoBonificacaoVendedor() throws Exception {
		
		assertEquals(4800.00, vendedor.bonificacao(), 0.0001);
	}
}
