package service;

import java.util.List;

import models.Livro;
import models.Loja;
import models.VideoGame;

public class LojaService {
 
	
	public void listaDeLivros(Loja loja){
	
		List<Livro> livros = loja.getLivros();
	     
		if(livros.isEmpty()){
	        System.out.format("\nA loja %s ainda n�o disponibiliza de livros.\n", loja.getNome());
	      }
	      else{
		     System.out.format("\nLISTA DE LIVROS DA LOJA %s\n", loja.getNome());
		     for (Livro livro : livros){
		          System.out.println("---------------------");
		          System.out.format("T�tulo: %s\n", livro.getNome());
		          System.out.format("Pre�o: %.2fR$\n",livro.getPreco());
		          System.out.format("Qntde: %d unidades\n",livro.getQtd());
		          System.out.println("---------------------");
	        } 
	      }  
	    }

	
	public void listaDeVideoGames(Loja loja) {
		
		if(loja.getVideoGames().isEmpty()){
		System.out.format("\nA loja %s ainda n�o disponibiliza de v�deo games.\n", loja.getNome());
		}
		else{
			System.out.format("\nLISTA DE V�DEO GAMES DA LOJA %s\n", loja.getNome());
		    for (VideoGame game : loja.getVideoGames()){  
		         System.out.println("---------------------");
		         System.out.format("Marca: %s\n", game.getMarca());
		         System.out.format("Pre�o: %.2fR$\n",game.getPreco());
		         System.out.format("Qntde: %d unidades\n",game.getQtd());
		         System.out.println("---------------------");
	       } 
	     }  
	}
	

	public void calcularPatrimonio(Loja loja) {
	      
		double totalDeLivros = calculandoTotalDeLivros(loja.getLivros());
		double totalDeGames = calculandoTotalDeVideoGames(loja.getVideoGames());
		
	    System.out.format("Patrim�nio da %s � de %.2fR$\n", 
	    		loja.getNome(), 
	    		totalDeLivros+totalDeGames );
	}

	public double calculandoTotalDeLivros(List<Livro> livros) {
		double TotalLivros =0.0;
		for (Livro livro : livros){
	        double precoTotal = livro.getPreco() * livro.getQtd();
	        TotalLivros = TotalLivros + precoTotal;
	      }
		System.out.println(TotalLivros);
		return TotalLivros;
	}
	
	public double calculandoTotalDeVideoGames(List<VideoGame> games) {
		double TotalGames =0.0;
		
		for (VideoGame game : games){
	        double precoTotal = game.getPreco() * game.getQtd();
	        TotalGames = TotalGames + precoTotal;
	      }
		return TotalGames;
	}
	

}
