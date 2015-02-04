package CorrectionsExos.ExosPOO;
	/*	
	===================================
	* 	java POO 	: 	correction
	* 	Auteur			:	Choua�b LAGHLAM
	* 	===================================
		Ajouter des getteurs et setteurs � classe Point
		et modifier coordonn�es
	====================================
	*/
public class Ex00510 {

	public static void main(String[] args) {
		Point p=new Point('X', 45, 156);
		//acc�s interdit aux attributs
		//p.ordonnee;
		
		p.setOrdonnee(78);
		p.setAbscisse(21);
		
		System.out.println(p.getAbscisse()+", "+p.getOrdonnee());
		
	}

}
