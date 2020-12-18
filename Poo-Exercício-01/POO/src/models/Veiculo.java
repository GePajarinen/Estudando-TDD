package models;

public class Veiculo {

	private String marca, modelo, placa, cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel, velocidade;
	private Double preco;


	public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, Double preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
		this.preco = preco;
	}
	
	
	public void setMarca(String marca){
		this.marca = marca;
	}
	public String getMarca(){
		return marca;
	}

	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	public String getModelo(){
		return modelo;
	}
	
	public void setPlaca(String placa){
		this.placa = placa;
	}
	public String getPlaca(){
		return placa;
	}
	
	public void setCor(String cor){
		this.cor = cor;
	}
	public String getCor(){
		return cor;
	}
	
	public void setKm(Float km){
		this.km = km;
	}
	public float getKm(){
		return km;
	}
	
	public void setIsLigado(Boolean isLigado){
		this.isLigado = isLigado;
	}
	public boolean getIsLigado(){
		return isLigado;
	}
	
	public void setLitrosCombustivel(int litrosCombustivel){
		this.litrosCombustivel = litrosCombustivel;
	}
	public int getLitrosCombustivel(){
		return litrosCombustivel;
	}
	
	public void setVelocidade(int velocidade){
		this.velocidade = velocidade;
	}
	public int getVelocidade(){
		return velocidade;
	}
	
	public void setPreco(Double preco){
		this.preco = preco;
	}
	public double getPreco(){
		return preco;
	}

}