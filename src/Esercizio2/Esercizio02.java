package Esercizio2;



public class Esercizio02 {
	public static void main(String[] args) {
		Sim sim1 = new Sim("3249876543", 0, "Sante", "Calderisi");
		Sim sim2 = new Sim("3265784932", 0, "Erika", "Quitadamo");
		Sim sim3 = new Sim("3456729018", 0, "Laura", "Zazzera");
		System.out.println("La lista delle ultime chiamate del numero " + sim1.getNumeroTelefono() + " di "
				+ sim1.getNomeUtente() + " " + sim1.getCognomeUtente() + " è:\n");
		for (int i = 0; i < sim1.getLastChiamate().length; i++) {
			System.out.println(sim1.getLastChiamate()[i]);
		}
		System.out.println("\n\n");
		System.out.println("La lista delle ultime chiamate del numero " + sim2.getNumeroTelefono() + " di "
				+ sim2.getNomeUtente() + " " + sim2.getCognomeUtente() + " è:\n");
		for (int i = 0; i < sim2.getLastChiamate().length; i++) {
			System.out.println(sim2.getLastChiamate()[i]);
		}
		System.out.println("\n\n");
		System.out.println("La lista delle ultime chiamate del numero " + sim3.getNumeroTelefono() + " di "
				+ sim3.getNomeUtente() + " " + sim3.getCognomeUtente() + " è:\n");
		for (int i = 0; i < sim3.getLastChiamate().length; i++) {
			System.out.println(sim3.getLastChiamate()[i]);
		}
	}
}