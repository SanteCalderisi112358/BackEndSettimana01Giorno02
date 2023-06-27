package Esercizio1;

public class Rettangolo {
	private double lato1;
	private double lato2;

	public Rettangolo(double _lato1, double _lato2) {
		this.lato1 = _lato1;
		this.lato2 = _lato2;
	}

	public double calcoloPerimetro() {
		return 2 * (this.lato1 + this.lato2);
	}

	public double calcoloArea() {
		return this.lato1 * this.lato2;
	}
}
