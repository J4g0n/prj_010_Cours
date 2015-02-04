package CorrectionsExos.ExosBaseLangageJava;

import java.util.Scanner;

public class Ex00090_cor {
	/*	
 		===================================
	 * 	java Les Bases 	: 	correction
	 * 	Auteur			:	Choua�b LAGHLAM
	 * 	===================================
	 * Location de voitures
	 *	===================================
	 */
	//	variables globales : attributs de classe
	final static double tarifBase=75.00;
	public static void main(String[] args) {
		// d�claration de variables
	    int nbreKmParcourus=0,nbreJoursLocation=0;
	    double tarifAPayer=0,totalHTAPayer=0,totalTTCAPayer=0;
	    // saisie nbre de km parcourus
	    Scanner ent=new Scanner(System.in);
	    System.out.print ("combien de jours de location ?");
	    nbreJoursLocation = ent.nextInt();
	    System.out.print ("combien de km avez vous parcourus ?");
	    nbreKmParcourus = ent.nextInt();
	    // appel de la m�thode qui calculer combien il faut payer
	    totalHTAPayer=APayer(nbreJoursLocation,nbreKmParcourus);
	    // calcul TTC
	    totalTTCAPayer=calculTTC(totalHTAPayer,19.6);
	    //
	    System.out.println("Voici le d�tail de votre facture : ");
	    System.out.println("===================================");
	    System.out.println("nombre de jours de location  :  "+nbreJoursLocation);
	    System.out.println("nombre de km parcourus		 :  "+nbreKmParcourus);
	    System.out.println("Montant HT                   :  "+totalHTAPayer);
	    System.out.println("TVA �                        :  19,60");
	    System.out.println("Montant A Payer              :  "+totalTTCAPayer);
	}
	public static double APayer(int duree,int nbKm) {
		double forfait=duree * tarifBase;
		double combienAPayer=0,depassement1=0,depassement2=0;
		if(nbKm > 300)
		{
			depassement1=200 * 0.5;
			depassement2=(nbKm-300) * 0.3;
			combienAPayer=forfait + depassement1 +  depassement2;	
			String nom;
			char c;
			
		}
		else
		{
			if(nbKm > 200)
			{
				depassement1=(nbKm-100) * 0.5;
				combienAPayer=forfait + depassement1;	
			}
			else
			{
				depassement1=(nbKm-100) * 0.5;
				if(depassement1>0)
				{
					combienAPayer=forfait+depassement1;
				}
				else
				{
					combienAPayer=forfait;
				}
				
			}
		}
		return combienAPayer;
	}
	//
	public static double calculTTC(double HT ,double codeTVA) {
		double TTC=HT + HT * codeTVA/100;
		return TTC;
	}
}
