package Esercizio2;



public class Esercizio02 {
	public static void main(String[] args) {
		Sim sim1 = new Sim("32498765430", 0);
		Sim sim2 = new Sim("3265784932", 0);
		System.out.println("La lista delle ultime chiamate del numero " + sim1.getNumeroTelefono() + " è:\n");
		for (int i = 0; i < sim1.getLastChiamate().length; i++) {
			System.out.println(sim1.getLastChiamate()[i]);
		}
		System.out.println("\n\n");
		System.out.println("La lista delle ultime chiamate del numero " + sim2.getNumeroTelefono() + " è:\n");
		for (int i = 0; i < sim2.getLastChiamate().length; i++) {
			System.out.println(sim2.getLastChiamate()[i]);
		}
		
	}
}