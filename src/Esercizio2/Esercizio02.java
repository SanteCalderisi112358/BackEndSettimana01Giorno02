package Esercizio2;



public class Esercizio02 {
	public static void main(String[] args) {
		Sim sim1 = new Sim("32498765430", 0);

		for (int i = 0; i < sim1.getLastChiamate().length; i++) {
			System.out.println(sim1.getLastChiamate()[i]);
		}
		
		
	}
}