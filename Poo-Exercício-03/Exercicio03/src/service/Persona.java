package service;

import models.Guerreiro;
import models.Mago;

public class Persona {
	
	
    
    //Imprimir Mago 
    public void personaMago(Mago p) {
	    System.out.format("\n --- Classe: MAGO ---\n");
	    System.out.format("Nome: %s\n", p.getNome());
	    System.out.format("Vida: %d\n", p.getVida());
	    System.out.format("Mana: %d\n",p.getMana());
	    System.out.format("Inteligência: %d\n",p.getInteligencia());
	    System.out.format("Força: %d\n",p.getForca());
	    System.out.format("Level: %d\n",p.getLevel());
	    System.out.format("Xp: %.2f\n",p.getXp());
	    System.out.println(p.listaDeMagias());
    }
    
    //Imprimir Guerreiro
    public void personaGuerreiro(Guerreiro p) {
	    System.out.format("\n --- Classe: GUERREIRO ---\n");
	    System.out.format("Nome: %s\n", p.getNome());
	    System.out.format("Vida: %d\n", p.getVida());
	    System.out.format("Mana: %d\n",p.getMana());
	    System.out.format("Inteligência: %d\n",p.getInteligencia());
	    System.out.format("Força: %d\n",p.getForca());
	    System.out.format("Level: %d\n",p.getLevel());
	    System.out.format("Xp: %.2f\n",p.getXp());
	    System.out.println(p.listaDeHabilidades());
    }
}
