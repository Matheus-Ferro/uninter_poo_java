package empresa;

public class IngressoVip extends Ingresso {
	
	public double adicional;
	
	public IngressoVip(String nomeEvento, double valor, double adicional) {
		super(nomeEvento, valor);
		this.adicional = adicional;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.printf("Valor Adicional R$: %.2f \n", adicional);
		System.out.printf("Valor Total R$: %.2f \n", (valor + adicional));
	}
	
}
