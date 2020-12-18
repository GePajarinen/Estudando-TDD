package models;

public class Produto {

	private String nome;
	private double preco;
	private int qtd;


	public Produto(String nome, double preco, int qtd) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}

	public void setPreco(Double preco){
		this.preco = preco;
	}
	public double getPreco(){
		return preco;
	}
	
	public void setQtd(int qtd){
		this.qtd = qtd;
	}
	public int getQtd(){
		return qtd;
	}
}

