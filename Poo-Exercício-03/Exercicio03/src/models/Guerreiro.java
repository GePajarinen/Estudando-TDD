package models;

import java.util.List;

public class Guerreiro extends Personagem {

	private List<String> habilidades;
	
	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> habilidades) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		this.habilidades = habilidades;
	}
	
	
	
	//LEVEL UP 
	@Override
	public void lvlUp() {
		 super.lvlUp();
	     this.setVida(this.getVida()+10);
	     this.setForca(this.getForca()+10);
	}
	
	//ATTACK
	public int attack(){
        return (this.getForca() * this.getLevel()) + (0 + (int)(Math.random()*300));
    }

	//APRENDER HABILIDADE
	public void aprenderHabilidade(String habilidade) {
		this.getHabilidades().add(habilidade);
	}
	
	//LISTA DE HABILIDADES
    public String listaDeHabilidades(){
        System.out.format("\nLista de Habilidades: ");
  
        //habilidades.forEach(h -> System.out.format("%s | ", h));
        
        String s = "";
        for (String habilidade : habilidades) {
        	s = s+ habilidade + " | ";
        }
        return s;
    }
    
    

	public List<String> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}
	
}
