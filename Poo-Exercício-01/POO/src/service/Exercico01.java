package service;

import models.Veiculo;

public class Exercico01 {


  public static void main (String[] args){
    //Veiculo(String mrc, String mdl, String plc, String c, float k, boolean isLig, int ltro, int veloc, Double p){
    
	VeiculoFuncionando vf = new VeiculoFuncionando();
	  
    Veiculo novo1 = new Veiculo("Ford", "Fiesta", "1234", "Branca", 60.0f, false, 40, 0, 30000.00); //Colocar f nos floats
    Veiculo novo2 = new Veiculo("Chevrolet", "Agile", "4321", "Vermelha", 70.0f, true, 20, 90, 20000.00);

    System.out.println("\nCARRO NOVO #1");
    vf.acelerar(novo1);
    vf.abastecer(novo1, 30);
    vf.frear(novo1);
    vf.pintar(novo1,"Azul");
    vf.ligar(novo1);
    vf.desligar(novo1);

    System.out.println("\nCARRO NOVO #2");
    vf.acelerar(novo2);
    vf.abastecer(novo2, 20);
    vf.frear(novo2);
    vf.pintar(novo2, "Preta");
    vf.ligar(novo2);
    vf.desligar(novo2); 

  }

}
