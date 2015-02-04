	package CorrectionsExos.ExosBaseLangageJava;

import java.util.Scanner;

public class Ex00020_cor {
	/*	
 	===================================
 * 	java Les Bases 	: 	correction
 * 	Auteur			:	Choua�b LAGHLAM
 * 	===================================
 * 	saisie identifiants
 *	===================================
 */
	public static void main(String[] args) {
		String nom;
	   	String login;
	   	Scanner ent=new Scanner(System.in);
	   	// demander user et mot de passe
	   	System.out.println ("Votre nom :");
	   	nom=ent.nextLine();
	   	System.out.println ("Votre login :");
	   	login=ent.nextLine();
	   	// test
	   	if(nom.equals("Paul") && login.equals("1234"))
	   	{
	   		System.out.println ("Vous pouvez entrer");
	   	}
	   	else
	   	{
	   		System.out.println ("Circulez s.v.p");
	   	}

		
	}

}
