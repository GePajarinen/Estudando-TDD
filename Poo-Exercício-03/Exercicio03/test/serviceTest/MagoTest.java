package serviceTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import models.Mago;

public class MagoTest {
	
	private Mago mago;
	
	@Before
	public void setUp() {
		
		List<String> magiasMago = new ArrayList<String>();
		magiasMago.add("Varinha mágica");
		mago = new Mago("Sininho", 1, 1, 1, 1, 1, 1, magiasMago);
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
	 * this.setMana(this.getMana()+10);
	     this.setInteligencia(this.getInteligencia()+10);*/
	@Test
	public void testandoLevelUPMago() throws Exception {
		mago.lvlUp();
		
		assertEquals(2, mago.getVida());
		assertEquals(11, mago.getXp(), 0.0001);
		assertEquals(12, mago.getMana());
		assertEquals(12, mago.getInteligencia());
		assertEquals(2, mago.getForca());
		
		mago.lvlUp();
		
		assertEquals(3, mago.getVida());
		assertEquals(21, mago.getXp(), 0.0001);
		assertEquals(23, mago.getMana());
		assertEquals(23, mago.getInteligencia());
		assertEquals(3, mago.getForca());
		
	}

}
