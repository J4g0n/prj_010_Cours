package package_1_lesBases;

public class Cours_080_conversions {

	// m�thode main
	public static void main(String[] args) {
		// d�clarations de variables
		int a=120;
		double b=0;
		double c=128.13;
		int z;
		String q="123";
		String s="blabla";
		char h='A';
		// conversion implicite : accept� par la machine virtuelle
		b=a;	// je mets un entier dans un d�cimal : pas de perte de donn�es
		//
		//z=c;	// cette conversion est refus�e : car on tente de mette un d�cimal
				// dans un entier : que faire des d�cimales ?
				// type mismatch en anglais
		z=(int)c;	// conversion explicite : le d�veloppeur demande � convertir
					// dans un entier et donc assume de perdre les d�cimales.
		z=Integer.parseInt(q);	// conversion explicite de cha�ne en int
								// �a marchera car la cha�ne contient un entier
		//z=Integer.parseInt(s);	// conversion explicite de cha�ne en int
								// � l'ex�cution : �a plante : car s ne contient
								// pas un num�rique
	}
}
