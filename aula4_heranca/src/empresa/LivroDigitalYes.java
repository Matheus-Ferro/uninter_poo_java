// Exemplo de como usar herança.
package empresa;

// extends faz com que a classe atual seja uma extensão da outra, ou seja, herda seus
// atributos e métodos. Nesse exemplo a classe LivroDigital é filha da classe Livro,
// herdando atributos da mesma.
// Os objetos que instanciarem LivroDigital também estarão instanciando Livro.
public class LivroDigitalYes extends Livro{

//	Note que o construtor da classe filha tem que honrar no mínimo 1 contrutor da classe
//	mãe, para isso utilizamos o método super() dentro do construtor, esse método invoca
//	o construtor da classe mãe e passa os atributos para o mesmo.
	LivroDigitalYes(String autor, String titulo) {
		super(autor, titulo);

	}

	public String linkDownload;
	public int tamanhoMB;
	
//	Note que se eu declarar um método que já exista na classe mãe, vou estar sobrescrevendo
//	o método da mesma.
	public float imposto() {
		return super.imposto() + 2;
	}
	
	public float tamanhoPorPagina() {
		return tamanhoMB/(float)paginas;
	}
	
//	Note que se eu quiser me referir a um método ou atributo que exista em ambas as classes, 
//	e não expecificar com super. ou this. automaticamente vou estar me referindo ao da classe filha.
//	super. se refere à classe mãe.
//	this. se refere à classe filha.
	public void imprimirImposto(){
		System.out.println("Imposto Livro Físico: " + super.imposto());
		System.out.println("Imposto Livro Digital: " + this.imposto());
	}
	
}
