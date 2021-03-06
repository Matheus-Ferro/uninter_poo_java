package empresa;

public class Horario {
	private int hora = -1;
	private int minuto = -1;
	private int segundo = -1;

	public int getHora() {
		return hora;
	}
	
	public boolean setHora(int hora) {
		if(hora >= 0 && hora <= 23) {
			this.hora = hora;
			return true;
		}
		
		System.out.println("Hora inválida.");
		return false;		
	}

	public int getMinuto() {
		return minuto;
	}

	public boolean setMinuto(int minuto) {
		if(minuto >= 0 && minuto <= 59) {	
			this.minuto = minuto;
			return true;
		}
		
		System.out.println("Minuto Inválido.");
		return false;	
	}

	public int getSegundo() {
		return segundo;
	}

	public boolean setSegundo(int segundo) {
		if(segundo >= 0 && segundo <= 59) {	
			this.segundo = segundo;
			return true;
		}
		
		System.out.println("Segundo Inválido.");
		return false;	
	}
	public void info() {
		if(hora >= 0 && minuto >= 0 && segundo >= 0) {
			System.out.println("Hora marcada para: " + getHora() + ":" + getMinuto() + ":" + getSegundo());
		}
	}
}
