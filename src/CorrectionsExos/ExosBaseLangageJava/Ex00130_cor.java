package CorrectionsExos.ExosBaseLangageJava;

import java.util.Scanner;

public class Ex00130_cor {

	/*	=========================================
	 * java Les Bases 	: 	correction
	 * 	Auteur			:	Choua�b LAGHLAM
	 * 	=========================================
	 * 	B�n�fice r�alis�
	 * 	=========================================
	 */
	public static void main(String[] args) {
		System.out.println("Tapez un code :");
		Scanner codeScan=new Scanner(System.in);
		String code=codeScan.nextLine();
		
		System.out.println("Tapez prix de vente :");
		Scanner prixScan=new Scanner(System.in);
		double prix=prixScan.nextDouble();
		
		System.out.println("Tapez quantit� :");
		Scanner quantiteScan=new Scanner(System.in);
		int quantite=quantiteScan.nextInt();
		
		System.out.println("B�n�fice : "+calculBenefice(code, prix, quantite));
		
	}
	public static double calculBenefice(String code, double prixVente, int quantite)
	{
		String codeAUnchar="";
		String codeADeuxchar="";
		String codeATroischar="";
		if(code.length()>0)
			codeAUnchar=code.substring(0,1);
		if(code.length()>1)
			codeADeuxchar=code.substring(0,2);
		if(code.length()>2)
			codeATroischar=code.substring(0,3);
		double benefice=0;
		int marge=6;
		
		if(codeAUnchar.equals("B"))
		{
			if(codeADeuxchar.equals("BZ"))
			{
				marge=10;
			}
			else
			{
				marge=7;
			}
			
		}
		else
		{
			if(codeADeuxchar.equals("AE") ||codeADeuxchar.equals("AR") 
						|| codeADeuxchar.equals("AT"))
			{
				if(codeATroischar.equals("AEP"))
				{
					marge=5;
				}
				else
				{
					marge=8;
				}
			}
		}
		benefice=((prixVente*quantite)*marge)/100;
		
		return benefice;
	}
}
