package serviceTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import models.Guerreiro;

public class GuerreiroTest {
	
	private Guerreiro guerreiro;
	
	@Before
	public void setUp() {
		
		List<String> habilidadesGuerreiro = new ArrayList<String>();
		habilidadesGuerreiro.add("Martela o martelão");
		guerreiro = new Guerreiro("Thor", 1, 1, 1, 1, 1, 1, habilidadesGuerreiro);
	}
	
	
	/*
	 * String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> magias
	 * this.setForca(this.getForca()+1);
        this.setInteligencia(this.getInteligencia()+1);
        this.setLevel(this.getLevel()+1);
        this.setMana(this.getMana()+1);
        this.setVida(this.getVida()+1);
        this.setXp(this.xp+10);
    }
	 *  this.setVida(this.getVida()+10);
	     this.setForca(this.getForca()+10);*/
	
	@Test
	public void testandoLevelUPGuerreiro() throws Exception {
		guerreiro.lvlUp();
		
		assertEquals(12, guerreiro.getVida());
		assertEquals(11, guerreiro.getXp(), 0.0001);
		assertEquals(2, guerreiro.getMana());
		assertEquals(2, guerreiro.getInteligencia());
		assertEquals(12, guerreiro.getForca());
		
		guerreiro.lvlUp();
		
		assertEquals(23, guerreiro.getVida());
		assertEquals(21, guerreiro.getXp(), 0.0001);
		assertEquals(3, guerreiro.getMana());
		assertEquals(3, guerreiro.getInteligencia());
		assertEquals(23, guerreiro.getForca());
	}
	
	@Test
	public void testandoAprenderHabilidade() throws Exception {
		guerreiro.aprenderHabilidade("Dança do Tigrão");
		
		assertTrue(guerreiro.getHabilidades().contains("Dança do Tigrão"));
		assertEquals(2, guerreiro.getHabilidades().size());
	}
	
	@Test
	public void testandoAlistagemDeHabilidades() throws Exception {
		String s1 = "Martela o martelão | ";
		
		assertEquals(s1, guerreiro.listaDeHabilidades());
	}
	
	@Test
	public void tesntandoOAttack() throws Exception {
		assertTrue(guerreiro.attack()!=0);
	}


}
