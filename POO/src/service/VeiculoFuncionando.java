package service;

import models.Veiculo;

public class VeiculoFuncionando {

	
	public void acelerar(Veiculo veiculo){
		veiculo.setVelocidade(veiculo.getVelocidade() + 20);
	}
	
	
	public void abastecer(Veiculo veiculo, int litros){
		//OBS: O limite do tanque de combust�vel � de 60 litros, validar para n�o ultrapassar.
			//System.out.println("Quantos litros vai abastecer?"); //Se fosse perguntar ao usu�rio
		//int litrosAbastece = sc.nextInt();
		int litrosAbastece = litros;
		
		int totalDeLitros = veiculo.getLitrosCombustivel() + litrosAbastece;
			if (totalDeLitros > 60){
			System.out.format("\nSeu tanque est� com %dL dos 60L de capacidade.\nVoc� pode abastecer no m�ximo %dL.\n", veiculo.getLitrosCombustivel(), 60 - veiculo.getLitrosCombustivel());
		}
		else{
			System.out.format("\nOk. Agora seu tanque est� com %dL dos 60L da capacidade.\n", totalDeLitros);
			//#Dava pra fazer um lance de porcentagem
		}
	}
	

	public void frear(Veiculo veiculo){
		//frear(): a cada chamada do m�todo diminui a velocidade em 20. N�o aceitar
		//a chamada do m�todo se o veiculo estiver parado.
		
		Boolean ligado = veiculo.getIsLigado();
		
		veiculo.setVelocidade(veiculo.getVelocidade()-20);
		int velocidadeFinal = veiculo.getVelocidade()-20;
		//System.out.println("VELOCIDADE FINAL"+ velocidadeFinal); //Para testar	
		
		if (ligado == false){
			System.out.println("\nO carro est� desligado.");
		}
		else{
			if (velocidadeFinal <= 0){
				System.out.format("\nO carro est� parado.\n");
			}
			else{
				System.out.format("\nReduzindo a velocidade para %d Km/h.\n", velocidadeFinal);
			}
		}
	}
		
	
	public void pintar(Veiculo veiculo, String cor){
		//recebe uma cor como par�metro e altera o atributo.
		String corVelha = veiculo.getCor();
		veiculo.setCor(cor);
		String corNova = veiculo.getCor();
			System.out.format("\nSeu carro era da cor %s.\nAgora seu carro � da cor %s.\n", corVelha, corNova);
		//#Quero ver formatacao visual pra essa parte
		
	}
	
	
	public void ligar(Veiculo veiculo){
		//ligar(): Verifica se o ve�culo j� se encontra ligado, caso n�o, liga o carro.
		boolean ligado = veiculo.getIsLigado();
			if(ligado == false){
			System.out.println("\nLigando o carro ... \n");
			veiculo.setIsLigado(true);
		}
		else{
			System.out.println("\nO carro j� est� ligado.\n");
		}
		
	}
	
	public void desligar(Veiculo veiculo){
		//Verifica se o ve�culo j� se encontra desligado. N�o permitir que desligue o ve�culo com (velocidade > 0).
		boolean ligado = veiculo.getIsLigado();
		int velocidade = veiculo.getVelocidade();
			if(ligado == false){
			System.out.println("\nO carro j� est� desligado.\n");
		}
		else{
			if(velocidade <= 0){
				System.out.println("\nDesligando o carro...\n");
			}
			else if(velocidade > 0){
				frear(veiculo);
				desligar(veiculo);
			}
		}	
	}
}
	

