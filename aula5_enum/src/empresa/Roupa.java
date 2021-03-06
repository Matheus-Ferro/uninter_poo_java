package empresa;

/* Enumeradores (enum) são úteis para deixar o código mais legível, basicamente ele atribui um valor numérico
 * para identificar suas opções */
enum Estacao {
	VERAO,
	OUTONO,
	INVERNO,
	PRIMAVERA
}

public class Roupa {
	
	String modelo;
	int tamanho;
	
//	Enumeradores são utilizados como tipo, nesse caso a colecao é do tipo Estacao, que é um enumerador.
	Estacao colecao;
	
	public Roupa(String modelo, int tamanho, Estacao colecao) {
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.colecao = colecao;
	}
	
	public void msg() {
		
/*		Este switch serve para limitar a escolha dentre as opções do enum, e dependendo da opção é exibido
		uma mensagem correspondente. A idéia aqui é usar o nome da opção ao invés de um número que represente
		a opção, como 1- Verão, 2- Outono, e assim por diante, fazendo com que o uso de um enum seja mais legível*/
		switch(colecao) {
		
			case VERAO:
				System.out.println("Arrase na praia!");
				break;
				
			case OUTONO:
				System.out.println("Passe o outono com elegancia!");
				break;
				
			case INVERNO:
				System.out.println("Se agasalhe bem e com estilo!");
				break;
				
			case PRIMAVERA:
				System.out.println("Se vista na estação das flores!");
				break;
				
			default:
				System.out.println("ERRO! COLEÇÃO INVÁLIDA!");
		}
	}
}
