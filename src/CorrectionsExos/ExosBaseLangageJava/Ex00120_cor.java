package CorrectionsExos.ExosBaseLangageJava;

import java.util.Scanner;

public class Ex00120_cor {
	/*	===========================
	 * 	java Les Bases 	: 	correction
	 * 	Auteur			:	Choua�b LAGHLAM
	 * 	===========================
	 * 	calcul frais de port pour une librairie
	 * 	===========================
	 */
	public static void main(String[] args) {
		
		System.out.println("Tapez un montant de comande:");
		Scanner montantScan=new Scanner(System.in);
		double montant=montantScan.nextInt();
		
		System.out.println("Tapez un nombre d'ouvrages:");
		Scanner ouvragesScan=new Scanner(System.in);
		int ouvrages=ouvragesScan.nextInt();
		
		System.out.println("Port � payer en plus du montant de la commande : "
					+portAPayer(montant, ouvrages));
		System.out.println("En tout il faut payer : "+(montant+portAPayer(montant, ouvrages)));
			
	}
	public static double portAPayer(double montantCommande, int nbOuvrages)
	{
		if(nbOuvrages<3)
		{
			return 2.5*nbOuvrages;
		}
		if(nbOuvrages>=3 && nbOuvrages<=5)
		{
			double parOuvr;
			double tenPercent;
			
			parOuvr=2.5*nbOuvrages;
			tenPercent=montantCommande*0.1;
			
			return Math.min(parOuvr, tenPercent);
		}
		return 0;
	}

}
