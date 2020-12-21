package service;
import java.util.ArrayList;
import java.util.List;

import models.Livro;
import models.Loja;
import models.VideoGame;


public class Exercicio02 {
	
	public static void main (String[] args){
		
		LojaService ls = new LojaService();
	
	
	    Livro livro1 = new Livro("Humilhados e ofendidos", 12.5, 20, "Dostoievsky", "romance", 10); 
	    Livro livro2 = new Livro("Eterno Marido", 10.0, 10, "Dostoievsky", "romance", 5);  
	    Livro livro3 = new Livro("Tudo bem? Aprenda o Portugês do Brasil", 80.0, 30, "Glaucia", "educativo", 5);
	    
	    VideoGame game1 = new VideoGame("Video Game", 300.0, 2, "PSP", "XX", false);
	    VideoGame game2 = new VideoGame("Video Game", 150.0, 2, "Nitendo", "XX", true);

	    List<Livro> livros = new ArrayList<>();
	    livros.add(livro1);
	    livros.add(livro2);
	    livros.add(livro3);

	    List<VideoGame> games = new ArrayList<>();
	    games.add(game1);
	    games.add(game2);

	    System.out.format("\nImposto do livro '%s' é: %.1fR$\n", livro1.getNome() ,livro1.calcularImposto());//Romance
	    System.out.format("Imposto do livro '%s' é: %.1fR$\n", livro3.getNome() ,livro3.calcularImposto()); //Educativo

	    System.out.format("\nImposto do vídeo game '%s' é: %.1fR$\n", game1.getMarca() ,game1.calcularImposto());//Romance
	    System.out.format("Imposto do vídeo game '%s' é: %.1fR$\n", game2.getMarca() ,game2.calcularImposto());

	    Loja loja1 = new Loja("Submarino", "1234567890", livros, games);

	    ls.listaDeLivros(loja1);
	    ls.listaDeVideoGames(loja1);

	    ls.calcularPatrimonio(loja1);

	}
}

