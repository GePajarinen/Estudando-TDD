package models;

import java.util.List;

public class Loja {

	private String nome, cnpj;
    private List<Livro> livros;
    private List<VideoGame> videoGames;


	  public Loja (String n, String c, List<Livro> livros, List<VideoGame> videoGames){
		  this.nome = n;
      this.cnpj = c;
      this.livros = livros;
      this.videoGames = videoGames;

	}

    public void setNome(String nome){
		  this.nome = nome;
	  }
	  public String getNome(){
		  return nome;
    }
    
    public void setCnpj(String cnpj){
		  this.cnpj = cnpj;
	  }
	  public String getCnpj(){
		  return cnpj;
    }
  
    public void listaDeLivros(List<Livro> livros){

      if(livros.isEmpty()){
        System.out.format("\nA loja %s ainda não disponibiliza de livros.\n", this.getNome());
      }
      else{

        System.out.format("\nLISTA DE LIVROS DA LOJA %s\n", this.getNome());

        for (Livro obj : this.livros){
          String título = obj.getNome().toString();
          double preco = obj.getPreco();
          int quantidade = obj.getQtd();
          
          System.out.println("---------------------");
          System.out.format("Título: %s\n", título);
          System.out.format("Preço: %.2fR$\n",preco);
          System.out.format("Qntde: %d unidades\n",quantidade);
          System.out.println("---------------------");
      
        } 
      }  
    }
    

    //LISTA DE VIDEOGAMES
    public void listaDeVideoGames(List<VideoGame> videoGames){

      if(videoGames.isEmpty()){
        System.out.format("\nA loja %s ainda não disponibiliza de vídeo games.\n", this.getNome());
      }
      else{

        System.out.format("\nLISTA DE VÍDEO GAMES DA LOJA %s\n", this.getNome());

        for (VideoGame obj : this.videoGames){  
          String marca = obj.getMarca().toString();
          double preco = obj.getPreco();
          int quantidade = obj.getQtd();
          
          System.out.println("---------------------");
          System.out.format("Marca: %s\n", marca);
          System.out.format("Preço: %.2fR$\n",preco);
          System.out.format("Qntde: %d unidades\n",quantidade);
          System.out.println("---------------------");
      
        } 
      }  
    }
    
    public void calcularPatrimonio(){
      double TotalLivros =0.0;
      double TotalGames =0.0;

      for (Livro obj : this.livros){
        double precoTotal = obj.getPreco()*obj.getQtd();
        TotalLivros = TotalLivros + precoTotal;
      }
      //System.out.format("Precototal de livros: %.2fR$\n",TotalLivros);

      for (VideoGame obj : this.videoGames){
        double precoTotal = obj.getPreco()*obj.getQtd();
        TotalGames = TotalGames + precoTotal;
      }
      //System.out.format("Precototal de Video games: %.2fR$\n",TotalGames);

      System.out.format("Patrimônio da %s é de %.2fR$\n", this.getNome(), (TotalLivros + TotalGames));

    }

}
