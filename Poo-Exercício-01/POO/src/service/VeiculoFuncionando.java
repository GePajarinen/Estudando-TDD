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
		
		int totalDeLitros = veiculo.getLitrosCombustivel() + litros;
		
		if (totalDeLitros > 60){
			System.out.format("\nSeu tanque est� com %dL dos 60L de capacidade.\nVoc� pode abastecer no m�ximo %dL.\n", 
					veiculo.getLitrosCombustivel(), 60 - veiculo.getLitrosCombustivel());
		}
		else{
			veiculo.setLitrosCombustivel(totalDeLitros);
			System.out.format("\nOk. Agora seu tanque est� com %dL dos 60L da capacidade.\n", totalDeLitros);
		}
	}
	

	public void frear(Veiculo veiculo){
		//frear(): a cada chamada do m�todo diminui a velocidade em 20. N�o aceitar
		//a chamada do m�todo se o veiculo estiver parado.
		
		if (!veiculo.getIsLigado()){
			System.out.println("\nO carro est� desligado.");
		}
		else{
			if (veiculo.getVelocidade() <= 0){
				System.out.format("\nO carro est� parado.\n");
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
		System.out.format("Agora seu carro � da cor %s.\n", veiculo.getCor());
	}
	
	
	public void ligar(Veiculo veiculo){
		//ligar(): Verifica se o ve�culo j� se encontra ligado, caso n�o, liga o carro.

		if(!veiculo.getIsLigado()){
			veiculo.setIsLigado(true);
			System.out.println("\nLigando o carro ... \n");
		}
		else{
			System.out.println("\nO carro j� est� ligado.\n");
		}
	}
	
	public void desligar(Veiculo veiculo){
		//Verifica se o ve�culo j� se encontra desligado. N�o permitir que desligue o ve�culo com (velocidade > 0).
		
		if(!veiculo.getIsLigado()){
			System.out.println("\nO carro j� est� desligado.\n");
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
	

