package empresa;

public class Ingresso {
	public String nomeEvento;
	public double valor;
	
	public Ingresso(String nomeEvento, double valor) {
		this.nomeEvento = nomeEvento;
		this.valor = valor;
	}
	
	public void info() {
		System.out.println("Evento: " + nomeEvento);
		System.out.printf("Valor do Ingresso R$: %.2f \n", valor);
	}

	
}
