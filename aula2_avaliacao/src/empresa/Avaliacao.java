package empresa;

public class Avaliacao {
	Avaliacao(double d, double e, double f) {
		System.out.printf("Média Aritmética: %.2f \n", this.mediaAritmetica(d,e,f));
		System.out.printf("Média Ponderada: %.2f \n", this.mediaPonderada(d,e,f));
		System.out.println("");
	}
	
	double mediaAritmetica(double d, double e, double f) {
		return (d+e+f) / 3;
	}
	double mediaPonderada(double d, double e, double f) {
		return (d*2 + e*3 + f*4) / 9 ;
	}
	
}
