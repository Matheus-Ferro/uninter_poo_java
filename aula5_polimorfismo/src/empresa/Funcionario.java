package empresa;

/* Note que utilizei a palavra reservada abstract na criação da classe, dessa forma eu crio uma classe abstrata
 * que em suma não permite que se instancie esta classe, mas somente suas filhas, isso é útil em projetos grandes
 * para deixar claro o que pode e não pode ser instanciado.
 * Em suma, esta classe serve só como base para suas classes filhas.*/
public abstract class Funcionario {
	private String nome;
	
	public Funcionario(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract float pagamento();
}
