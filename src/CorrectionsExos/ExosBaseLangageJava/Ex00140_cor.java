package CorrectionsExos.ExosBaseLangageJava;

public class Ex00140_cor {

	/*	
	 	===================================
	 * 	java Les Bases 	: 	correction
	 * 	Auteur			:	Choua�b LAGHLAM
	 * 	===================================
	 * 	trier un tableau d'entiers par m�thode d'insertion
	 *	===================================
	 */
	public static void main(String[] args) {
		// D�clarer le tableau
		int[] tableau = new int[10];
		// remplir tableau non tri�
		tableau[0] = 20;
		tableau[1] = 5;
		tableau[2] = 3;
		tableau[3] = -7;
		tableau[4] = 0;
		tableau[5] = 14;
		tableau[6] = 56;
		tableau[7] = 8;
		tableau[8] = 19;
		tableau[9] = 15;
		// affichage tableau avant tri
		System.out.println("Tableau avant tri");
		afficher(tableau);
		// appel m�thode de tri
		trier(tableau);
		// affichage tableau apr�s tri
		System.out.println("Tableau apr�s tri");
		afficher(tableau);
	}	// fin main
	//
	//	m�thode afficher
	//
	public static void afficher (int[] t)
	{
		for(int k=0;k<t.length;k++)
		{
			System.out.print(t[k]+" 	");
		}
		System.out.println("");
	}
	//
	//	tri
	//
	public static void trier(int[] tableau) {
		int i, j, cle;
		
		for (i = 1; i < tableau.length; i++) {
			cle = tableau[i];
			j = i;
			while ((j >= 1) && (tableau[j - 1] > cle)) {
				tableau[j]  = tableau[j - 1] ;
				j = j - 1;
			}
			tableau[j] = cle;
		}
	}
	
}
