package empresa;

public class Aluno {
	private String nome;
	private int matricula;
	private double desconto;
	Curso novoCurso;
	
	public Aluno(String nome, int matricula, double desconto, Curso novoCurso) {
		setNome(nome);
		setMatricula(matricula);
		setDesconto(desconto);
		setNovoCurso(novoCurso);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public Curso getNovoCurso() {
		return novoCurso;
	}

	public void setNovoCurso(Curso novoCurso) {
		this.novoCurso = novoCurso;
	}

	void descrever() {
		System.out.println("Aluno: " + getNome());
		System.out.println("Matrícula: " + getMatricula());
		novoCurso.descrever();
		System.out.println("Desconto: " + getDesconto()*100 + "%");
		System.out.println("Pagamento: R$:" + pagamento());
	}
	
	double pagamento(){
		return novoCurso.getMensalidade() * (1 - getDesconto()) ;
	}

	
}
