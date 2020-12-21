package service;

import models.Gerente;
import models.Supervisor;
import models.Vendedor;

public class Exercicio07 {

	public static void main(String[] args) {

		//GERENTE
		Gerente gerente = new Gerente("Camila Dornelas", 35, 6000.00);
		System.out.println("Gerente: " + gerente.getNome() +
				"\nSalário: " + gerente.getSalario() +
				"\nBonificação: " + gerente.bonificacao());
	
		System.out.println();
		
		//SUPERVISOR
		Supervisor supervisor = new Supervisor("Mureil Garcia", 25, 4000.00 );
		System.out.println("Supervisor: " + supervisor.getNome() +
				"\nSalário: " + supervisor.getSalario() +
				"\nBonificação: " + supervisor.bonificacao());
		
		System.out.println();
		
		//VENDEDOR
		Vendedor vendedor = new Vendedor("Natalia Cortes", 18, 2500.00);
		System.out.println("Vendedor: " + vendedor.getNome() +
				"\nSalário: " + vendedor.getSalario() +
				"\nBonificação: " + vendedor.bonificacao());
	
	}
}
