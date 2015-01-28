 package package_1_lesBases;

public class Cours_060_BoucledoWhile {

	// méthode main
	public static void main(String[] args) {
		// dire bonjour avec do while
		int i=1;
		do
		{
				System.out.println("Bonjour du do while "+i+" fois");
				// attention : si je n'incrémente pas i : boucle infinie
				i++;
		} while(i<11);
		System.out.println("Suite du traitement");	
	}
}
