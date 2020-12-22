package models;

public class Juiz {
	
	private String em = "Empate";
	private String pe = "Pedra";
	private String pa = "Papel";
	private String te = "Tesoura";
	private String j1 = "Jogador 1";
	private String j2 = "Jogador 2";
			
	
	
	public String comparar(String jogador1, String jogador2) {
		
		if (jogador1.equals(jogador2))
			return em;
		return oQueJogouOJogador1(jogador1, jogador2);
	}
	
	
	
	public String oQueJogouOJogador1(String jogador1, String jogador2) {
		if(jogador1.equals(pe)) {
			return jogador1IguaPedra(jogador2);}
		else if(jogador1.equals(te))
			return jogador1IgualTesoura(jogador2);
		else//(jogador1.equals("Papel"))
			return jogador1IguaPapel(jogador2);
	}
	
	
	
	public String jogador1IguaPedra(String jogador2) {
		if(jogador2.equals(te))
			return j1;
		return j2; //jogador 2 PAPEL
	}
	
	public String jogador1IguaPapel(String jogador2) {
		if(jogador2.equals(pe))
			return j1;
		return j2; //Jogador 2 TESOURA
	}
	
	public String jogador1IgualTesoura(String jogador2) {
		if(jogador2.equals(pa))
			return j1;
		return j2; //Jogador 2 PEDRA
	}
}
