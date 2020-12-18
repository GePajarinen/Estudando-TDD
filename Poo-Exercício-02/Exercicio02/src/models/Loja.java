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

	  
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}

    
  /*  public void calcularPatrimonio(){
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

    }*/

}
