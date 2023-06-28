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
		return "Numero chiamato: " + numeroChiamata + ", Durata chiamata: " + durataChiamata + " minuti";
	}
}

