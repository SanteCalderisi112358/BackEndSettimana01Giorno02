package Esercizio1;

import java.util.Scanner;

public class Esercizio01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci il valore del primo lato del primo rettangolo:");
		double lato1 = input.nextDouble();

		System.out.println("Inserisci il valore del secondo lato del primo rettangolo:");
		double lato2 = input.nextDouble();

		Rettangolo rettangolo1 = new Rettangolo(lato1, lato2);
		System.out.println("Il perimetro del primo rettangolo è " + rettangolo1.calcoloPerimetro());
		System.out.println("L'area del primo rettangolo è " + rettangolo1.calcoloArea());
		stampaRettangolo(lato1, lato2);
		System.out.println("Inserisci il valore del primo lato del secondo rettangolo:");
		double lato3 = input.nextDouble();

		System.out.println("Inserisci il valore del secondo lato del secondo rettangolo:");
		double lato4 = input.nextDouble();

		Rettangolo rettangolo2 = new Rettangolo(lato3, lato4);
		System.out.println("Il perimetro del secondo rettangolo è " + rettangolo2.calcoloPerimetro());
		System.out.println("L'area del secondo rettangolo è " + rettangolo2.calcoloArea());
		stampaRettangolo(lato3, lato4);
		stampaDueRettangoli(lato1, lato2, lato3, lato4);
		input.close();
	}

	public static void stampaRettangolo(double lato1, double lato2) {
		System.out.println("Area: " + lato1 * lato2 + "\nPerimetro: " + 2 * (lato1 + lato2));
	}

	public static void stampaDueRettangoli(double lato1, double lato2, double lato3, double lato4) {
		System.out.println(
				"Area primo rettangolo: " + lato1 * lato2 + "\nPerimetro primo rettangolo: " + 2 * (lato1 + lato2)
						+ "\nArea secondo rettangolo: " + lato3 * lato4 + "\nPerimetro secondo rettangolo: "
						+ 2 * (lato3 + lato4) + "\nLa somma delle aree è: " + (lato1 * lato2 + lato3 * lato4)
						+ "\nLa somma dei perimetri è: " + (2 * (lato1 + lato2) + 2 * (lato3 + lato4)));
	}
}
