package CorrectionsExos.ExosPOO;
		/*	
		===================================
		* 	java POO 	: 	correction
		* 	Auteur			:	Choua�b LAGHLAM
		* 	===================================
			Classe Point
		====================================
		 */
public class Point {
	// attributs
	private char nom;
	private double abscisse;
	private double ordonnee;
	// constructeur
	public Point(char nom, double abscisse, double ordonnee) {
		super();
		this.setNom(nom);
		this.setAbscisse(abscisse);
		this.setOrdonnee(ordonnee);
	}
	// m�thodes
	public void affiche()
	{
		System.out.println(this.abscisse+";"+this.ordonnee);
	}
	
	public void translate(double plusX, double plusY)
	{
		this.abscisse+=plusX;
		this.ordonnee+=plusY;
	}
	// getteurs + setteurs 
	public char getNom() {
		return nom;
	}

	public void setNom(char nom) {
		this.nom = nom;
	}

	public double getAbscisse() {
		return abscisse;
	}

	public void setAbscisse(double abscisse) {
		this.abscisse = abscisse;
	}

	public double getOrdonnee() {
		return ordonnee;
	}

	public void setOrdonnee(double ordonnee) {
		this.ordonnee = ordonnee;
	}
	
	
}
