package CorrectionsExos.ExosBaseLangageJava;

import java.util.Scanner;

public class Ex00080_cor {
	/*	
 	===================================
	 * 	java Les Bases 	: 	correction
	 * 	Auteur			:	Choua�b LAGHLAM
	 * 	===================================
	 * 	Tableau des carr�s
	 *	===================================
	 */
	public static void main(String[] args) {
		// d�claration de variables
		int car[] ;			// 	un tableau pour stocker les carr�s
	    int n ;				//	nbre de carr�s � calculer
	    // saisie
	    Scanner saisie=new Scanner(System.in);
	    System.out.print ("combien de valeurs : ") ;
	    n = saisie.nextInt();
	    car = new int[n] ;		// on fixe le nombre d'�l�ments du tableau
	    // on calcule les carr�s et on les stoce
	    for (int i=0 ; i<n ; i++)
	      car[i] = (2*i+1)*(2*i+1) ;
	    // on affiche le contenu du tableaux des carr�s
	    for (int i=0 ; i<n ; i++)
	      System.out.println ((2*i+1) + " a pour carre " + car[i]) ;
	}

}
