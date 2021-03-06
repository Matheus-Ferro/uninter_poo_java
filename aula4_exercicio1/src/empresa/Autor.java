package empresa;

public class Autor {
	private String nome;
	private String email;
	private String nacionalidade;
	
	public Autor() {}
	public Autor(String nome, String email, String nacionalidade) {
		super();
		this.nome = nome;
		this.email = email;
		this.nacionalidade = nacionalidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public void info() {
		System.out.println("---Autor---");
		System.out.println("Autor: " + nome);
		System.out.println("E-mail: " + email);
		System.out.println("Nacionalidade: " + nacionalidade);
	}
	
}
