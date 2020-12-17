package models;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import service.VeiculoFuncionando;

public class VeiculoFuncionandoTest {
	
	private Veiculo v;
	private VeiculoFuncionando vf;
	
	
	@Before 
	public void setup() {
		vf = new VeiculoFuncionando();
		//public Veiculo(String mrc, String mdl, String plc, String c, float k, boolean isLig, int ltro, int veloc, Double p){
		v = new Veiculo("Ford", "Fiesta", "1234", "Branca", 60.0f, false, 40, 0, 30000.00); 
	}
	
	
	@Test
	public void deveAceleraroVeiculo() throws Exception {
		vf.acelerar(v);
		
		assertEquals(20, v.getVelocidade());
	}



}
