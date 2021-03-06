package empresa;

public class Nota {
	private double nota1;
	private double nota2;
	private final int aprovacao = 7;
	private int faltas;
	
	public Nota() {}
	public Nota(double nota1, double nota2, int faltas) {
		setNota1(nota1);
		setNota2(nota2);
		setFaltas(faltas);
	}
	
	public void setNota1(double nota) {
		if(nota < 0 || nota > 10) {
			System.out.println("Nota inválida, por favor insira uma nota de 0 a 10");
			return;
		}
		this.nota1 = nota;
	}
	
	public void setNota2(double nota) {
		if(nota < 0 || nota > 10) {
			System.out.println("Nota inválida, por favor insira uma nota de 0 a 10");
			return;
		}
		this.nota2 = nota;
	}
	
	public void setFaltas(int faltas){
		this.faltas = faltas;
	}
	
	public double getNota1() {
		return nota1;
	}
	
	public double getNota2() {
		return nota2;
	}
	
	public int getFaltas() {
		return faltas;
	}
	
	public void resultado() {
		
		double media = (nota1 + nota2) / 2;
		System.out.println("Media: " + media);
		if(faltas > 7) {
			System.out.println("Status: Reprovado por Faltas");
		}else if(media < 4) {
			System.out.println("Status: Reprovado");
		}else if(media < aprovacao) {
			System.out.println("Status: Exame Final");
		}else {
			System.out.println("Status: Aprovado");
		}
	}
}
