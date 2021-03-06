package empresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
//		ArrayList faz parte das Collections, bem como a LinkedList e o HashMap.
		ArrayList<String> pessoas = new ArrayList<String>();
		
		pessoas.add("Matheus");
		pessoas.add("Giovanna");
		pessoas.add("Mariana");
		pessoas.add("Fernanda");
		
		System.out.println("Ordem de Entrada:");
		System.out.println(pessoas);
		System.out.println("");
		
		System.out.println("Ordem Alfabetica:");
		Collections.sort(pessoas);
		System.out.println(pessoas);
		System.out.println("");
		
		System.out.println("Ordem Aleatória:");
		Collections.shuffle(pessoas);
		System.out.println(pessoas);
		System.out.println("");
		
//		-------------------------------------------------------------------------------
//		O HashMap é composto por dois valores, um para a chave e outro para o atriburo
		HashMap<String, String> capitais = new HashMap<String, String>();
		capitais.put("Brasil", "Brasília");
		capitais.put("Argentina", "Buenos Aires");
		capitais.put("Paraguai", "Assunção");
		capitais.put("Uruguai", "Montevidéu");
		
		System.out.println("HashMap inteiro:");
		System.out.println(capitais);
		System.out.println("");
		
		System.out.println("Pegando um Atributo Específico no HashMap:");
		System.out.println(capitais.get("Uruguai"));
		
//		-------------------------------------------------------------------------------
//		Exercício para somar todos os valores de um Array, HashSet e HashMap.
		ArrayList<Integer> lista = new ArrayList<Integer>();
		HashSet<Integer> conjunto = new HashSet<Integer>();
		HashMap<String, Integer> mapa = new HashMap<String, Integer>();
		
//		Forma Tradicional com um for passando por todos os elementos e somando-os.
		int soma = 0;
		for(int i = 0; i < lista.size(); i++) {
			soma += lista.get(i);
		}
		soma = 0;
		
//		Forma com um ForEach
		for(int item : lista) {
			soma += item;
		}
		soma = 0;
		
//		Forma utilizando o Iterator.
//		Note que usando o Iterator podemos reaproveitar o while, mudando somente a forma com que os dados
//		serão enviados, seja com um Mapa, um Conjunto, ou uma Lista.
		
//		Iterator ite = mapa.entrySet().iterator();
//		Iterator ite = conjunto.iterator();
		Iterator ite = lista.iterator();
		
//		hasNext() retorna um booleano.
		while(ite.hasNext()) {
//			Para somarmos precisamos fazer um typecast (int) para informar qual o tipo de dado que estamos tratando.
			soma += (int)ite.next();
		}
	}

}
