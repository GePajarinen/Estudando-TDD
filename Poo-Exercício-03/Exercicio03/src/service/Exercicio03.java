package service;


import java.util.ArrayList;
import java.util.List;

import models.Guerreiro;
import models.Mago;
import models.Personagem;

public class Exercicio03 {
	

	 public static void main (String[] args){
		 
		 Persona persona = new Persona();
		 
		 List<String> magiasMago1 = new ArrayList<String>();
		 magiasMago1.add("Varinha mágica");
		
		 Mago mago1 = new Mago("Sininho", 1, 1, 1, 1, 1, 1, magiasMago1);

		 System.out.println("\n ********* ANTES DO LEVEL UP *********"); 
		 persona.personaMago(mago1);

		    mago1.aprenderMagia("Pedra filosofal");
		    System.out.println("\n"+mago1.getNome()+" ataca com " + mago1.attack() + " power.\n");
		    mago1.lvlUp();

		 System.out.println("\n ********* DEPOIS DO LEVEL UP ********* ");
		 persona.personaMago(mago1);   

		System.out.println("\n\n-----------------\n");
		
		List<String> habilidadesGuerreiro1 = new ArrayList<String>();
		habilidadesGuerreiro1.add("Martela o martelão");
		Guerreiro guerreiro1 = new Guerreiro("Thor", 1, 1, 1, 1, 1, 1, habilidadesGuerreiro1);
		    
		System.out.println("\n ********* ANTES DO LEVEL UP ********* ");
		persona.personaGuerreiro(guerreiro1);
		   
		    guerreiro1.aprenderHabilidade("Lançar raios");
		    System.out.println("\n"+ guerreiro1.getNome()+" ataca com " + guerreiro1.attack() + " power.\n");
		    guerreiro1.lvlUp();

		System.out.println("\n ********* DEPOIS DO LEVEL UP ********* ");
		persona.personaGuerreiro(guerreiro1); 
		
		System.out.println();
		
		//Quantidade de Personagens craidos:
		System.out.println("//Quantidade de Personagens craidos:");
		System.out.println(Personagem.getTotalDePersonagensCriados());
		
		}
	 
}
