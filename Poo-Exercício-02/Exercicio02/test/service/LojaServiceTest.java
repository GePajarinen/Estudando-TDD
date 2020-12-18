package service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import models.Livro;
import models.Loja;
import models.VideoGame;

public class LojaServiceTest {
	
	private Loja loja;
	private LojaService ls = new LojaService();
	
	@Before
	public void setUp() {
		List<Livro> livros = new ArrayList();
		livros.add(new Livro("Humilhados e ofendidos", 12.5, 20, "Dostoievsky", "romance", 10));
		livros.add(new Livro("Eterno Marido", 10.0, 10, "Dostoievsky", "romance", 5));
		
		List<VideoGame> games = new ArrayList();
		games.add(new VideoGame("Video Game", 300.0, 2, "PSP", "XX", false));
		games.add(new VideoGame("Video Game", 150.0, 2, "Nitendo", "XX", true));

		
		//System.out.println(livros.size());
		loja = new Loja("Submarino", "1234567890", livros, games);
	}
	
	@Test
	public void deveListarOsLivrosDaLoja() throws Exception {
		ls.listaDeLivros(loja);

		assertEquals(2, loja.getLivros().size());
	}
	
	@Test
	public void quandoAListaDeLivrosDaLojaEstaVazia() throws Exception {
		loja.setLivros(new ArrayList());
		
		ls.listaDeLivros(loja);
		
		assertEquals("A loja %s ainda não disponibiliza de livros.",
				"A loja %s ainda não disponibiliza de livros.");
	}
	
	@Test
	public void listandoAListaDeVideoGamesDaLoja() throws Exception {
		ls.listaDeVideoGames(loja);
		
		assertEquals(2, loja.getVideoGames().size());
	}
	
	@Test
	public void quandoAListaDeVideoGamesDaLojaEstaVazia() throws Exception {
		loja.setVideoGames(new ArrayList());
		
		ls.listaDeVideoGames(loja);
		
		assertEquals("A loja Submarino ainda não disponibiliza de vídeo games.", 
				"A loja Submarino ainda não disponibiliza de vídeo games.");
	}
	
	@Test
	public void calculandoTotalDeLivrosPatrimonioDaLoja() throws Exception {
		assertEquals(350.0, ls.calculandoTotalDeLivros(loja.getLivros()) ,0.0001);
	}
	
	@Test
	public void calculandoTotalDeVideoGamesPatrimonioDaLoja() throws Exception {
		assertEquals(900.0, ls.calculandoTotalDeVideoGames(loja.getVideoGames()) ,0.0001);
	}
	
	@Test
	public void calculandoOPatrimonioTotalDaLoja() throws Exception {
		
		ls.calcularPatrimonio(loja);
		
		assertEquals("Patrimônio da Submarino é de 1250.00R$",
				"Patrimônio da Submarino é de 1250.00R$");
	}

}
