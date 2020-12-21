package models;

import static org.junit.Assert.*;

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
	public void deveAcelerarOVeiculo() throws Exception {
		vf.acelerar(v);
		
		assertEquals(20, v.getVelocidade());
	}

	@Test
	public void deveAabastecerOVeiculoMenosOuIgualACapacidadeMaximaDoTanque() throws Exception {
		vf.abastecer(v, 10);
		
		assertEquals(50, v.getLitrosCombustivel());
	}
	
	@Test 
	public void deveAabastecerOVeiculoAcimaDaCapacidadeMaximaDoTanque() throws Exception {
		vf.abastecer(v, 30);
		
		assertEquals(70, v.getLitrosCombustivel()+30);
		
	}
	
	@Test
	public void deveFreiarOCarroQueEstaEmMovimento() throws Exception {
		v.setIsLigado(true);
		v.setVelocidade(50);
		
		vf.frear(v);
		
		assertEquals(30, v.getVelocidade());
	}
	
	@Test
	public void deveFrearComOCarroDesligado() throws Exception {
		vf.frear(v);
		
		assertEquals("O carro est� desligado.", "O carro est� desligado.");
	}
	
	@Test
	public void deveFrearOCarroParado() throws Exception {
		v.setIsLigado(true);
		
		vf.frear(v);
		
		assertEquals("O carro est� parado.","O carro est� parado.");
		
	}
	
	@Test
	public void devePintarOCarro() throws Exception {
		vf.pintar(v, "vermelha");
		
		assertEquals("Seu carro era da cor Branca. Agora seu carro � da cor vermelha", 
				 "Seu carro era da cor Branca. Agora seu carro � da cor vermelha");
	}
	
	@Test
	public void deveLigarOCarroDesligado() throws Exception {
		vf.ligar(v);
		
		assertEquals("Ligando o carro ... ","Ligando o carro ... ");
	}
	
	
	@Test
	public void deveLigarOCarroJaLigado() throws Exception {
		v.setIsLigado(true);
		
		vf.ligar(v);
		
		assertEquals("O carro j� est� ligado.","O carro j� est� ligado.");
	}
	
	@Test
	public void deveDesligarOCarroJaDesligado() throws Exception {
		vf.desligar(v);
		
		assertEquals("O carro j� est� desligado.","O carro j� est� desligado.");
		
	}
	
	@Test
	public void deveDesligarOCarroParado() throws Exception {
		v.setIsLigado(true);
		vf.desligar(v);
		
		assertEquals("Desligando o carro...","Desligando o carro...");
	}
	
	
	@Test
	public void deveDesligarOCarroQueEstaAndando() throws Exception {
		v.setIsLigado(true);
		v.setVelocidade(40);
		
		vf.desligar(v);
		
		assertEquals("Desligando o carro...","Desligando o carro...");
	}
}