	package CorrectionsExos.ExosBaseLangageJava;

public class Ex00010_cor {
	/*	
 		===================================
	 * 	java Les Bases 	: 	correction
	 * 	Auteur			:	Choua�b LAGHLAM
	 * 	===================================
	//	D�terminer nature 10 premiers nbres entiers : pair ? 
	//	multiple de 3 ? multiple de 5
	//	====================================
	 */
	public static void main(String[] args) {
	
	int n=0 ;
   	do
    { 	if (n%2==0)
		 { 
    		System.out.println (n + " est pair");
         }
      	if (n%3==0)
      	{ 
      		System.out.println (n + " est multiple de 3");
        }
      	if (n%5==0) 
      	{ 	
      		System.out.println (n + " est multiple de 5");
      	}
  
    } while (++n<=20) ;
	} // end main
}	// end class
