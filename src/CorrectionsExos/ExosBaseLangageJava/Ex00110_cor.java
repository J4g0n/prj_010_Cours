package CorrectionsExos.ExosBaseLangageJava;

public class Ex00110_cor {
		/*	=========================================
		 * java Les Bases 	: 	correction
		 * 	Auteur			:	Choua�b LAGHLAM
		 * 	=========================================
		 * 	Appel de m�thode avec param�tres manquant
		 * 	=========================================
		 */
	//
	public static void main(String[] args)
	{
		double mtTTC,mtHT,tauxTVA;
		mtTTC=119.6;
		mtHT=100;
		tauxTVA=-1;
		double manquant = calculManquant(mtTTC,mtHT,tauxTVA);
		System.out.println(manquant);
	}
	//
	public static double calculManquant(double TTC,double HT, double TVA)
	{
		double valeur=0;
		//TTC = HT*(1+TVA/100)
		if (TTC == -1)
		{
			valeur = HT*(1+TVA/100);
		}
		else
		{
			if (HT == - 1)
			{
				valeur = TTC/(1+TVA/100);
			}
			else //TVA � -1
			{
				valeur=((TTC/HT)-1)*100;
			}
		}
		return valeur;
	}
}
