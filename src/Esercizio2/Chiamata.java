package Esercizio2;

public class Chiamata {
	private String numeroChiamata;
	private double durataChiamata;

	public Chiamata(String numeroChiamata, double durataChiamata) {
		this.numeroChiamata = numeroChiamata;
		this.durataChiamata = durataChiamata;
	}



	@Override
	public String toString() {
		int minuti = (int) durataChiamata;
		int secondi = (int) ((durataChiamata - minuti) * 60);

		return "Numero chiamato: " + numeroChiamata + ", Durata chiamata: " + minuti + " minuti e " + secondi
				+ " secondi";
	}

}

