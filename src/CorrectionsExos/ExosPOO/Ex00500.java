package CorrectionsExos.ExosPOO;

public class Ex00500 {
	/*	
		===================================
	 * 	java POO 	: 	correction
	 * 	Auteur			:	Choua�b LAGHLAM
	 * 	===================================
		Repr�senter un point g�om�trique par un objer
		====================================
 */
	public static void main(String[] args) {
		Point p=new Point('P',4,45);
		p.affiche();
		p.translate(4, -4.5);
		p.affiche();
	}

}
