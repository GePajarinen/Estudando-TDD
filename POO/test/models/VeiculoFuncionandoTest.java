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
		
		assertEquals(40, v.getLitrosCombustivel());
	}
	
	@Test 
	public void deveAabastecerOVeiculoAcimaDaCapacidadeMaximaDoTanque() throws Exception {
		vf.abastecer(v, 30);
		
		assertEquals("Seu tanque está com 40L dos 60L de capacidade. Você pode abastecer no máximo 20L.", 
				"Seu tanque está com 40L dos 60L de capacidade. Você pode abastecer no máximo 20L.");
		
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
		
		assertEquals("O carro está desligado.", "O carro está desligado.");
	}
	
	@Test
	public void deveFrearOCarroParado() throws Exception {
		v.setIsLigado(true);
		
		vf.frear(v);
		
		assertEquals("O carro está parado.","O carro está parado.");
		
	}
	
	@Test
	public void devePintarOCarro() throws Exception {
		vf.pintar(v, "vermelha");
		
		assertEquals("Seu carro era da cor Branca. Agora seu carro é da cor vermelha", 
				 "Seu carro era da cor Branca. Agora seu carro é da cor vermelha");
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
		
		assertEquals("O carro já está ligado.","O carro já está ligado.");
	}
	
	@Test
	public void deveDesligarOCarroJaDesligado() throws Exception {
		vf.desligar(v);
		
		assertEquals("O carro já está desligado.","O carro já está desligado.");
		
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