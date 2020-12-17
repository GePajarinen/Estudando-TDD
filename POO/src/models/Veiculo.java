package models;

public class Veiculo {
	//Atributos
	private String marca, modelo, placa, cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel, velocidade;
	private Double preco;

	
	public Veiculo(String mrc, String mdl, String plc, String c,
float k, boolean isLig, int ltro, int veloc, Double p){
	
	this.marca = mrc;
	this.modelo = mdl; 
	this.placa = plc; 
	this.cor = c;
	this.km = k;
	this.isLigado = isLig;
	this.litrosCombustivel = ltro; 
	this.velocidade = veloc;
	this.preco = p;
	}

	//MARCA
	public void setMarca(String marca){
		this.marca = marca;
	}
	public String getMarca(){
		return marca;
	}

	//MODELO
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	public String getModelo(){
		return modelo;
	}
	
	//PLACA
	public void setPlaca(String placa){
		this.placa = placa;
	}
	public String getPlaca(){
		return placa;
	}
	
	//COR
	public void setCor(String cor){
		this.cor = cor;
	}
	public String getCor(){
		return cor;
	}
	
	//KM
	public void setKm(Float km){
		this.km = km;
	}
	public float getKm(){
		return km;
	}
	
	//ESTA LIGADO
	public void setIsLigado(Boolean isLigado){
		this.isLigado = isLigado;
	}
	public boolean getIsLigado(){
		return isLigado;
	}
	
	//LITROS COMBUSTIVEL
	public void setLitrosCombustivel(int litrosCombustivel){
		this.litrosCombustivel = litrosCombustivel;
	}
	public int getLitrosCombustivel(){
		return litrosCombustivel;
	}
	
	// VELOCIDADE
	public void setVelocidade(int velocidade){
		this.velocidade = velocidade;
	}
	public int getVelocidade(){
		return velocidade;
	}
	
	//PRECO
	public void setPreco(Double preco){
		this.preco = preco;
	}
	public double getPreco(){
		return preco;
	}
	
	

}