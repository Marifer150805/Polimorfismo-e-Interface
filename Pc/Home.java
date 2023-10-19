package Pc;

public class Home implements Computador {
	
	public Home (String ligar, String reniciar, String desligar, String carregandoSistema) {
		
	}
	@Override 
	public void ligar() {
		System.out.println("Ligando.");
	}
	public void reniciar() {
		System.out.println("Reniciando.");
	}
	public void desligar() {
		System.out.println("Desligando.");
	}
	public void carregandoSistema() {
		System.out.println("Carregando Sistema.");
	}
}