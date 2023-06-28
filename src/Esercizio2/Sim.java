package Esercizio2;

import java.util.Random;
public class Sim {
	private String numeroTelefono;
	private Chiamata[] chiamate = new Chiamata[5];

	public Sim(String _numeroTelefono, int _credito) {
		this.numeroTelefono = _numeroTelefono;

	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public Chiamata[] getLastChiamate() {

		chiamate[0] = new Chiamata(generateRandomPhoneNumber(), generateRandomDuration());
		chiamate[1] = new Chiamata(generateRandomPhoneNumber(), generateRandomDuration());
		chiamate[2] = new Chiamata(generateRandomPhoneNumber(), generateRandomDuration());
		chiamate[3] = new Chiamata(generateRandomPhoneNumber(), generateRandomDuration());
		chiamate[4] = new Chiamata(generateRandomPhoneNumber(), generateRandomDuration());
		return chiamate;
	}

	private String generateRandomPhoneNumber() {
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			int digit = random.nextInt(10);
			sb.append(digit);
		}
		return sb.toString();
	}

	private double generateRandomDuration() {
		Random random = new Random();
		return random.nextInt(60) + random.nextDouble();
	}


}
