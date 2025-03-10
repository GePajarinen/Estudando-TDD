package models;

import java.util.List;

public class Mago extends Personagem {

	private List<String> magias;
	
	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> magias) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		this.magias = magias;
		
	}
	
	//LEVEL UP
	@Override
	public void lvlUp() {
		 super.lvlUp();
	     this.setMana(this.getMana()+10);
	     this.setInteligencia(this.getInteligencia()+10);
	}
	
	//ATTACK
	public int attack(){
        return (this.getInteligencia() * this.getLevel()) + (0 + (int)(Math.random()*300));
    }
	
	
	//APRENDER MAGIA
	public void aprenderMagia(String magia) {
		this.getMagias().add(magia);
	}
	
	
	//LISTA DE MAGIAS
    public String listaDeMagias(){
        System.out.format("\nLista de Magias: ");

        //magias.forEach(m -> System.out.format("%s | ", m));
        
        String s = "";
        for (String magia : magias) {
        	s = s+ magia + " | ";
        }
        return s;
    }
	
	
	public List<String> getMagias() {
		return magias;
	}
	
	public void setMagia(List<String> magias) {
		this.magias = magias;
	}
	
}
