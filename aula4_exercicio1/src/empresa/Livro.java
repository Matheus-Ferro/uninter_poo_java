package empresa;

public class Livro {
	private String titulo;
	private Autor autor;
	private String genero;
	private int edicao;
	
	public Livro() {}
	public Livro(String titulo, Autor autor, String genero, int edicao) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.edicao = edicao;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	
	public void info() {
		System.out.println("---Livro---");
		System.out.println("Título: " + titulo);
		System.out.println("Gênero: " + genero);
		System.out.println("Edição: " + edicao);
		autor.info();
	}
}
