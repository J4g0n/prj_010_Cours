package CorrectionsExos.ExosBaseLangageJava;
import java.util.Scanner;
public class Ex00040_cor {
	/*	
	 	===================================
	 * 	java Les Bases 	: 	correction
	 * 	Auteur			:	Choua�b LAGHLAM
	 * 	===================================
	 * 	calculer la s�rie harmonique
	 *	===================================
	 */
	
	public static void main(String[] args) {
		int nt ;          // nombre de termes de la serie harmonique
    	float som ;       // pour la somme de la serie
    	int i ;
    	Scanner saisie=new Scanner(System.in);
    // saisie nbre de termes
	do
 	 	{ 
			System.out.print ("combien de termes : ") ;
    		nt = saisie.nextInt() ;
  		}while (nt<1);
	// calcul de la somme des termes
	for (i=1, som=0 ; i<=nt ; i++) 
	{
		System.out.println ("terme " + i + " : "+(float)1/i) ;
		som  +=  (float) 1/i;
	}
	// affichage de la somme
    System.out.println ("Somme des " + nt + " premiers termes = " + som) ;
    	
	}

}
