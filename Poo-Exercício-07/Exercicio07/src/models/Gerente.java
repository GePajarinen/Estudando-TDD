package models;

public class Gerente extends Funcionario{

	public Gerente(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}

	
	@Override
	public double bonificacao() {
		return this.getSalario() + 10000.00;
	}
}
