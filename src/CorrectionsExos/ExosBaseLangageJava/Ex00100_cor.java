package CorrectionsExos.ExosBaseLangageJava;

import java.util.Scanner;

public class Ex00100_cor {
	//	variables globales : attributs de classe
	final static double tarifBase=75.00;
	//	=================================
	//	Saisie de notes et calcul de la moyenne
	//	================================
	public static void main(String[] args) {
		// d�claration de variables
	    int [] tabNotes;
	    int nbreNotes;
	    double moyenne;
	    // saisie nbre de notes
	    Scanner ent=new Scanner(System.in);
	    System.out.print ("combien de notes avez vous ?");
	    nbreNotes = ent.nextInt();
	    // redimensionner le tableau
	    tabNotes=new int[nbreNotes];
	    // boucle de saisie des notes
	    for(int i=0;i<nbreNotes;i++)
	    {
	    	System.out.print ("note "+(i+1));
	    	tabNotes[i]= ent.nextInt();
	    }
	    // appel de la m�thode qui calculer combien il faut payer
	    moyenne=calMoyenne(tabNotes);
	    //
	    System.out.println("Moyenne : "+moyenne);
	}
	public static double calMoyenne(int [] lstNotes) {
		double moy=0;
		for(int k=0;k<lstNotes.length;k++)
		{
			moy=moy+lstNotes[k];
		}
		moy=moy/lstNotes.length;
		return moy;
	}
}
