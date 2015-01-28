package package_1_lesBases;

public class Cours_020_if {
	public static void main(String[] args) {
		// declarer une variable
		/*int note = 9;
		if (note >= 12) {
			System.out.println("Passage en année supérieure");
		} else {
			if (note >= 10) {
				System.out.println("Repasser examen");
			} else {
				System.out.println("Redoublement");
			}
		}*/
		double solde = 1270;
		boolean faciliteDeCaisse = false;
		
		if ((solde > 0) && (faciliteDeCaisse == false)) {
			System.out.println("Paiement boqué");
		} 
	} // fin main
} // fin classe
