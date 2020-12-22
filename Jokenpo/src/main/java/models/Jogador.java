package models;

public class Jogador {
	
	private int escolha = 1 + (int)(Math.random()*3);
	
	public String jogando() {
		
		switch (escolha)
		{
		     case 1:
		    	 return "Papel";
		     case 2:
		    	 return "Pedra";
		     case 3:
		    	 return "Tesoura";
		} 
		
		return "Ok";
		
	}
	
	public int getEscolha() {
		return escolha;
	}

	public void setEscolha(int escolha) {
		this.escolha = escolha;
	}
	
}
