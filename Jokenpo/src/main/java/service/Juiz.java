package service;

public class Juiz {
	
	public String jogador1() {
		return "Pedra";
	}
	
	public String jogador2() {
		return "Papel";
	}


	public String comparar() {
		if (jogador1() == jogador2())
			return "Empate";
		else if(jogador1() == "Pedra" && jogador2() == "Tesoura")
			return "Jogador 1";
		else if(jogador1() == "Pedra" && jogador2() == "Papel")
			return "Jogador 2";
		else if(jogador1() == "Tesoura" && jogador2() == "Papel")
			return "Jogador 1";
		else if(jogador1() == "Tesoura" && jogador2() == "Pedra")
			return "Jogador 2";
		else if(jogador1() == "Papel" && jogador2() == "Pedra")
			return "Jogador 1";
		else if(jogador1() == "Papel" && jogador2() == "Tesoura")
			return "Jogador 2";
		return null;
	}
}
