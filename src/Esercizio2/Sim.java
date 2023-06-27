package Esercizio2;

public class Sim {
	private String numeroTelefono;
	private double credito;
	private Chiamata[] chiamate = new Chiamata[5];

	public Sim(String _numeroTelefono, int _credito) {
		this.numeroTelefono = _numeroTelefono;
		this.credito = _credito;

	}

	public Chiamata[] getLastChiamate() {
		chiamate[0] = new Chiamata("3275498314", 34.5);
		chiamate[1] = new Chiamata("3458932324", 45.6);
		chiamate[2] = new Chiamata("3289547832", 34.5);
		chiamate[3] = new Chiamata("3458695304", 2.5);
		chiamate[4] = new Chiamata("3456895438", 4.53);
		return chiamate;
	}

}
