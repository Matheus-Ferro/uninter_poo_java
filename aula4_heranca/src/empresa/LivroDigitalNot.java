// Exemplo sem usar herança.
package empresa;

// Note que sem usar herança temos que copiar todo o código da classe Livro
// para esta classe, o que NÃO é uma boa prática, portanto sempre use herança para
// classes parecidas, e só faça as mudanças pontuais na classe filha.
public class LivroDigitalNot {
	public String autor;
	public float custoProducao;
	public float precoVenda;
	public String titulo;
	public int paginas;
	
//	NOVO
	public String linkDownload;
	public int tamanhoMB;
	
	public float lucro() {
		return precoVenda - custoProducao;
	}
	
	public void imprimirTitulo() {
		System.out.println("Titulo: " + titulo);
	}
	
//	MUDOU
	public float imposto() {
		return 0.2f * lucro() + 2;
	}
	
//	NOVO
	public float tamanhoPorPagina() {
		return tamanhoMB/(float)paginas;
	}
}
