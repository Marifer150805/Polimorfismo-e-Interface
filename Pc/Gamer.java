package Pc;

public class Gamer implements Computador {
	
	public Gamer (String ligar, String reniciar, String desligar, String carregandoSistema) {
		
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