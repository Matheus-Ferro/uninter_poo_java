package empresa;

public class Principal {

	public static void main(String[] args) {
//		------------------------------------------------------------------------------------------------------
/*		
		Note que se eu atribuir um objeto a outro desta forma, eu só estou atribuindo o espaço da memória
		ao mesmo, ao passo que se eu alterar o nome de um dos objetos, o outro também será alterado, por
		que na verdade os dois são um só. São como os ponteiros da linguagem C.
		Este exemplo deixou de fazer sentido depois que marquei a classe Funcionario como abstract, desta
		forma ela não pode ser instanciada.
		
		Funcionario f1 = new Funcionario("Matheus"); //0x1001
		Funcionario f2 = f1; //0x1001 

		System.out.println("F1: "+f1.getNome());
		System.out.println("F2: "+f2.getNome());
		
		System.out.println("");
		
		f2.setNome("Giuseppe");
		System.out.println("F1: "+f1.getNome());
		System.out.println("F2: "+f2.getNome());
		
		System.out.println("");
 */
//		------------------------------------------------------------------------------------------------------
//		Exemplo de Polimorfismo
		
		float total = 0;
		
/*		Note que tenho um array da classe Funcionario, mas na hora de instanciar, só estou instanciando classes
		filhas. */
		Funcionario funcionarios[] = {
				new Assalariado("Mario", 3500),
				new Horista("Luigi", 100, 40.5f),
				new Comissionado("Yoshi", 50000, 0.05f)
		};
		
//		Agora note que criei um objeto genérico, no loop abaixo ele vai assumir a forma de 3 classes.
		Funcionario f;
		for(int i = 0; i < funcionarios.length; i++) {
			f = funcionarios[i];
			System.out.println(f.getNome() + " | Salário: R$ " + f.pagamento());
			total += f.pagamento();
		}
		System.out.println("Total: " + total);
		
	}

}
