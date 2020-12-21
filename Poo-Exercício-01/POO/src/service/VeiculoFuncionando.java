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
		
		int totalDeLitros = veiculo.getLitrosCombustivel() + litros;
		
		if (totalDeLitros > 60){
			System.out.format("\nSeu tanque está com %dL dos 60L de capacidade.\nVocê pode abastecer no máximo %dL.\n", 
					veiculo.getLitrosCombustivel(), 60 - veiculo.getLitrosCombustivel());
		}
		else{
			veiculo.setLitrosCombustivel(totalDeLitros);
			System.out.format("\nOk. Agora seu tanque está com %dL dos 60L da capacidade.\n", totalDeLitros);
		}
	}
	

	public void frear(Veiculo veiculo){
		//frear(): a cada chamada do método diminui a velocidade em 20. Não aceitar
		//a chamada do método se o veiculo estiver parado.
		
		if (!veiculo.getIsLigado()){
			System.out.println("\nO carro está desligado.");
		}
		else{
			if (veiculo.getVelocidade() <= 0){
				System.out.format("\nO carro está parado.\n");
			}
			else{
				veiculo.setVelocidade(veiculo.getVelocidade()-20);
				System.out.format("\nReduzindo a velocidade para %d Km/h.\n", veiculo.getVelocidade());
			}
		}
	}
		
	
	public void pintar(Veiculo veiculo, String cor){
		System.out.format("\nSeu carro era da cor %s.\n" , veiculo.getCor());
		veiculo.setCor(cor);
		System.out.format("Agora seu carro é da cor %s.\n", veiculo.getCor());
	}
	
	
	public void ligar(Veiculo veiculo){
		//ligar(): Verifica se o veículo já se encontra ligado, caso não, liga o carro.

		if(!veiculo.getIsLigado()){
			veiculo.setIsLigado(true);
			System.out.println("\nLigando o carro ... \n");
		}
		else{
			System.out.println("\nO carro já está ligado.\n");
		}
	}
	
	public void desligar(Veiculo veiculo){
		//Verifica se o veículo já se encontra desligado. Não permitir que desligue o veículo com (velocidade > 0).
		
		if(!veiculo.getIsLigado()){
			System.out.println("\nO carro já está desligado.\n");
		}
		else{
			if(veiculo.getVelocidade() <= 0){
				System.out.println("\nDesligando o carro...\n");
			}
			else if(veiculo.getVelocidade() > 0){
				do {
					frear(veiculo);
				}
				while(veiculo.getVelocidade() > 0);
				
				desligar(veiculo);
			}
		}	
	}
}
	

