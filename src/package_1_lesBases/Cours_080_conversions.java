package package_1_lesBases;

public class Cours_080_conversions {

	// méthode main
	public static void main(String[] args) {
		// déclarations de variables
		int a=120;
		double b=0;
		double c=128.13;
		int z;
		String q="123";
		String s="blabla";
		char h='A';
		// conversion implicite : accepté par la machine virtuelle
		b=a;	// je mets un entier dans un décimal : pas de perte de données
		//
		//z=c;	// cette conversion est refusée : car on tente de mette un décimal
				// dans un entier : que faire des décimales ?
				// type mismatch en anglais
		z=(int)c;	// conversion explicite : le développeur demande à convertir
					// dans un entier et donc assume de perdre les décimales.
		z=Integer.parseInt(q);	// conversion explicite de chaîne en int
								// ça marchera car la chaîne contient un entier
		//z=Integer.parseInt(s);	// conversion explicite de chaîne en int
								// à l'exécution : ça plante : car s ne contient
								// pas un numérique
	}
}
