package models;

public class VideoGame extends Produto implements Imposto{
    
    private String marca, modelo;
    private boolean isUsado;


    public VideoGame(String n, double p, int q, String mrc, String mdlo, boolean usado){
        super(n,p, q);//reusing parent constructor 
        this.marca = mrc;
		this.modelo = mdlo; 
		this.isUsado = usado; 
	}

    @Override
    public double calcularImposto() {
    	//1. Se o vídeo game for usado, calcular imposto de 25% sobre o preço do videogame.
    	//2. Se o vídeo game não for usado, calcular imposto de 45% sobre o preço do videogame.
		if(this.isUsado){
			return this.getPreco()* 0.25;
		}
		else{
			return this.getPreco()* 0.45;
		}
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
	
	public void setIsUsado(Boolean isUsado){
		this.isUsado = isUsado;
	}
	public Boolean getIsUsado(){
		return isUsado;
	}

    
}
