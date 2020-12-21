package models;

public class Supervisor extends Funcionario{

	public Supervisor(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}

	
	@Override
	public double bonificacao() {
		return this.getSalario() + 5000.00;
	}
}
