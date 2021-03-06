package empresa;

/* Assim como extends é utilizado para se referir à super-classe no conceito de herança, com interfaces utilizamos 
 * implements, e então a classe passará a se utilizar da interface */
public class Gato implements Animal{

//	A anotation @Override serve para garantirmos que o método abaixo está sobrescrevendo seu equivalente da interface
	@Override
	public void emitirSom() {
		System.out.println("Miau!");
	}

	@Override
	public void dormir() {
		System.out.println("ZzZz.");
	}
	
}
