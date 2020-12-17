package service;

import models.Veiculo;

public class VeiculoFuncionando {

	
	public void acelerar(Veiculo veiculo){
		veiculo.setVelocidade(veiculo.getVelocidade() + 20);
	}
	
	
	public void abastecer(Veiculo veiculo, int litros){
		//OBS: O limite do tanque de combustível é de 60 litros, validar para não ultrapassar.
			//System.out.println("Quantos litros vai abastecer?"); //Se fosse perguntar ao usuário
		//int litrosAbastece = sc.nextInt();
		int litrosAbastece = litros;
		
		int totalDeLitros = veiculo.getLitrosCombustivel() + litrosAbastece;
			if (totalDeLitros > 60){
			System.out.format("\nSeu tanque está com %dL dos 60L de capacidade.\nVocê pode abastecer no máximo %dL.\n", veiculo.getLitrosCombustivel(), 60 - veiculo.getLitrosCombustivel());
		}
		else{
			System.out.format("\nOk. Agora seu tanque está com %dL dos 60L da capacidade.\n", totalDeLitros);
			//#Dava pra fazer um lance de porcentagem
		}
	}
	

	public void frear(Veiculo veiculo){
		//frear(): a cada chamada do método diminui a velocidade em 20. Não aceitar
		//a chamada do método se o veiculo estiver parado.
		
		Boolean ligado = veiculo.getIsLigado();
		
		veiculo.setVelocidade(veiculo.getVelocidade()-20);
		int velocidadeFinal = veiculo.getVelocidade()-20;
		//System.out.println("VELOCIDADE FINAL"+ velocidadeFinal); //Para testar	
		
		if (ligado == false){
			System.out.println("\nO carro está desligado.");
		}
		else{
			if (velocidadeFinal <= 0){
				System.out.format("\nO carro está parado.\n");
			}
			else{
				System.out.format("\nReduzindo a velocidade para %d Km/h.\n", velocidadeFinal);
			}
		}
	}
		
	
	public void pintar(Veiculo veiculo, String cor){
		//recebe uma cor como parâmetro e altera o atributo.
		String corVelha = veiculo.getCor();
		veiculo.setCor(cor);
		String corNova = veiculo.getCor();
			System.out.format("\nSeu carro era da cor %s.\nAgora seu carro é da cor %s.\n", corVelha, corNova);
		//#Quero ver formatacao visual pra essa parte
		
	}
	
	
	public void ligar(Veiculo veiculo){
		//ligar(): Verifica se o veículo já se encontra ligado, caso não, liga o carro.
		boolean ligado = veiculo.getIsLigado();
			if(ligado == false){
			System.out.println("\nLigando o carro ... \n");
			veiculo.setIsLigado(true);
		}
		else{
			System.out.println("\nO carro já está ligado.\n");
		}
		
	}
	
	public void desligar(Veiculo veiculo){
		//Verifica se o veículo já se encontra desligado. Não permitir que desligue o veículo com (velocidade > 0).
		boolean ligado = veiculo.getIsLigado();
		int velocidade = veiculo.getVelocidade();
			if(ligado == false){
			System.out.println("\nO carro já está desligado.\n");
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
	

