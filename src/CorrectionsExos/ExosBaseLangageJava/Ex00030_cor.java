 package CorrectionsExos.ExosBaseLangageJava;

import java.util.Scanner;

public class Ex00030_cor {
	/*	
	 	===================================
	 * 	java Les Bases 	: 	correction
	 * 	Auteur			:	Choua�b LAGHLAM
	 * 	===================================
	 * 	calcul racine carr�e
	 *	===================================
	 */
	public static void main(String[] args) {
		double unNombre ;
		//
		Scanner saisie=new Scanner(System.in);
		do
		{ 
			System.out.print ("donnez un nombre positif : ") ;
		    	unNombre = saisie.nextDouble() ;
			if (unNombre < 0) { 
					System.out.println ("svp positif ") ;
		                    continue ;	// passer � l'it�ration suivante
		      }
		      if (unNombre>0) 
				System.out.println ("sa racine carree est : " + Math.sqrt (unNombre)) ;
		      if (unNombre==0) 
		    	  	break ;			// forcer la sortie de la boucle
		 }while (true) ;
		System.out.println ("A bient�t");

	}

}
