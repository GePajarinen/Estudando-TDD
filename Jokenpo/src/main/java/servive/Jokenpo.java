package servive;


import models.Jogador;
import models.Juiz;

public class Jokenpo {
	
	public static void main(String[] args) {
		
		
			String jogador1 = new Jogador().jogando();
			String jogador2 = new Jogador().jogando();
			
			System.out.println("JOGADOR 1: " + jogador1);
			System.out.println("JOGADOR 2: " +jogador2);
			
			Juiz juiz = new Juiz();
			String resultado = juiz.comparar(jogador1, jogador2);
			System.out.println("GANHADOR: " + resultado);

		
		
	}
	
	
}
