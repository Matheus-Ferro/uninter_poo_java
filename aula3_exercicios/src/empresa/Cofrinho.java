package empresa;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> moedas = new ArrayList<Moeda>();
	private int totalMoedas;
	private int total5;
	private int total10;
	private int total25;
	private int total50;
	private int total100;
	private double totalReais;

	public void add(Moeda m) {
		moedas.add(m);
	}
	
	public void calcularTotal() {
		for(Moeda m : moedas) {
			totalReais += m.getValor();
			this.totalMoedas += 1;
			if(m.getValor() == 0.05) {
				total5 += 1;
			}else if(m.getValor() == 0.10) {
				total10 += 1;
			}else if(m.getValor() == 0.25) {
				total25 += 1;
			}else if(m.getValor() == 0.50) {
				total50 += 1;
			}else if(m.getValor() == 1) {
				total100 += 1;
			}
		}
	}

	public void info() {
		calcularTotal();
		System.out.println("Moedas de R$ 0,05: " + total5);
		System.out.println("Moedas de R$ 0,10: " + total10);
		System.out.println("Moedas de R$ 0,25: " + total25);
		System.out.println("Moedas de R$ 0,50: " + total50);
		System.out.println("Moedas de R$ 1,00: " + total100);
		System.out.println("Total de Moedas: " + totalMoedas);
		System.out.printf("Total em R$: %.2f \n", totalReais);
	}
	
}
