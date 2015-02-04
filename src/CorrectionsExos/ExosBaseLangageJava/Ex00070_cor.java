package CorrectionsExos.ExosBaseLangageJava;

public class Ex00070_cor {
	/*	
	 	===================================
	 * 	java Les Bases 	: 	correction
	 * 	1 euro			:	en pi�ces	
	 * 	Auteur			:	Choua�b LAGHLAM
	 * 	===================================
	 * 	Combinaisons pour un euro
	 *	===================================
	 */
	public static void main(String[] args) {
		int nbe ;        /* compteur du nombre de fa�ons de faire 1 � */
	    int n10 ;        /* nombre de pi�ces de 10 centimes */
	    int n5 ;         /* nombre de pi�ces de 5 centimes */
	    int n2 ;         /* nombre de pi�ces de 2 centimes */

	    nbe = 0 ;
	    // boucle sur les 10 pi�ces de 10 centimes dans un 1 �
	    for (n10=0 ; n10<=10 ; n10++)
	    {
	    	// boucle sur les 20 pi�ces de 5 centimes dans un 1 �
	    	for (n5=0 ; n5<=20 ; n5++)
	    	{
	    		// boucle sur les 50 pi�ces de 2 centimes dans un 1 �	
	    		for (n2=0 ; n2<=50 ; n2++)
	    		{
	    			if ( 2*n2 + 5*n5 + 10*n10 == 100)
	    			{ nbe ++ ;
	    					System.out.print ("1 � = ") ;
	    					if (n2 != 0)    
	    						System.out.print (n2 + " X 2c") ;
	    					if (n5 != 0)  
	    						{ if (n2 != 0) 
	    							System.out.print (" + ") ;
	    						System.out.print (n5 + " X 5c")  ;
	                         }
	    					if (n10 != 0) 
	    						{ if ((n2 != 0) || (n5 != 0)) 
	    							System.out.print (" + ") ;
	                           System.out.print (n10 + " X 10c") ;
	                         }
	    					System.out.println () ;
	    			}
	    		}
	    	  }
	    }
	    System.out.println ("En tout, il y a " + nbe + " facons de faire 1 �") ;
	}

}
