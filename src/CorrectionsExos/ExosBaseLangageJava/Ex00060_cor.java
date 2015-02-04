package CorrectionsExos.ExosBaseLangageJava;

import java.util.Scanner;

	public class Ex00060_cor {
	/*	
	 	===================================
	 * 	java Les Bases 	: 	correction
	 * 	Auteur			:	Choua�b LAGHLAM
	 * 	===================================
	 * 	Dessiner un triangle isoc�le
	 *	===================================
	 */	
	public static void main(String[] args) {
		// les maths j'aime pas �a
		int nLignes ;               // nombre total de lignes
	    int numLigne ;              // compteur de ligne
	    int nEspaces ;              // nombre d'espaces precedent une etoile
	    final char cRempli = '*' ;  // caractere de remplissage (ici etoile)
	    int j ;
	    Scanner saisie=new Scanner(System.in);
	    // demander la hauteur du triangle en nbre de lignes
	    System.out.print ("combien de lignes ? ") ;
	    nLignes = saisie.nextInt() ;
	    // boucle pour dessiner les n lignes du triangle
	    for (numLigne=0 ; numLigne<nLignes ; numLigne++)
	    { 	nEspaces = nLignes - numLigne - 1 ;
	      	// boucle pour afficher des espaces avant les �toiles
	    	for (j=0 ; j<nEspaces ; j++)  
	    			System.out.print (' ') ;
	    	// boucle pour afficher des �toiles
	    	for (j=0 ; j<2*numLigne+1 ; j++) 
	    			System.out.print (cRempli) ;
	    	// changer de ligne
	    	System.out.println () ;
	    }
	}
}
