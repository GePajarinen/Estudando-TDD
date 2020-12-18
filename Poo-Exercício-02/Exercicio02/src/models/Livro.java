package models;

public class Livro extends Produto implements Imposto{
    	
    private String autor, tema;
    private int qtdPag;


	public Livro(String n, double p, int q, String a, String t, int qP){
        super(n,p, q);//reusing parent constructor 
        this.autor = a;
		this.tema = t; 
		this.qtdPag = qP; 
	}

	
	//1. Se o livro for de tema = “educativo” não se deve cobrar imposto, retornar 0.
	//2. Caso seja de qualquer outro tema, calcular imposto de 10% sobre o preço do livro.
	@Override
	public double calcularImposto() {
		
		if(this.getTema().toLowerCase().contentEquals("educativo")) {
			return 0.0;
			}
		else {
			return this.getPreco()* 0.1;
			}
	}
	
	
	public void setAutor(String autor){
		this.autor = autor;
	}
	public String getAutor(){
		return autor;
	}

	public void setTema(String tema){
		this.tema = tema;
	}
	public String getTema(){
		return tema;
	}
	
	public void setQtdPag(int qtdPag){
		this.qtdPag = qtdPag;
	}
	public int getQtdPag(){
		return qtdPag;
	}

}
