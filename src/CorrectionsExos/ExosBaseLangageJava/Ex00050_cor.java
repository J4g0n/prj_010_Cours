package CorrectionsExos.ExosBaseLangageJava;

import java.util.Scanner;

public class Ex00050_cor {
	/*	
 		===================================
	 * 	java Les Bases 	: 	correction
	 * 	Auteur			:	Choua�b LAGHLAM
	 * 	===================================
	 * 	Quelle saison ?
	 *	===================================
	 */
	public static void main(String[] args) {
		String saison;		// nom de la saison
		char debSaison;		// premi�re lettre du nom de saison
		Scanner saisie=new Scanner(System.in);
		// donnez moi une saison
		System.out.println("Dans quelle saison est on ?");
		saison=saisie.nextLine();
		// je tranforme un cha�ne de caract�re en tableau
		char tbSaison[]=saison.toCharArray();
		// je r�cup�re la premi�re lettre du nom de saison
		debSaison=tbSaison[0];
		switch(debSaison)
		{
			case 'P':
				System.out.println("Les Fleurs bourgeonnent");
				break;
			case 'E':
				System.out.println("Vite le sable et la mer moi vouloir");
				break;	
			case 'A':
				System.out.println("Les feuilles mortent se .....");
				break;	
			case 'H':
				System.out.println("La neige c'est bien mais je g�le");
				break;	
			default:
				System.out.println("Mais quelle saison !!!");
				break;
		}
	}
}
