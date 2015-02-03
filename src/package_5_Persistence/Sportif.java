package package_5_Persistence;
import java.io.Serializable;
	/*	
	 * 	==================================
	 * 	Une classe dont les objets sont � s�rialiser
	 * 	impl�mente l'interface Serializable
	 * 	==================================
	 */
public class Sportif implements Serializable {
	// attributs
		private String nom;
		private String prenom;
		private int taille;
		// constructeur
		public Sportif(String nom, String prenom, int taille) {
			this.nom = nom;
			this.taille = taille;
			this.prenom = prenom;
		}
		// getteur
		public String getNom() {
		return nom;
		}
		// setteur
		public void setNom(String nom) {
		this.nom = nom;
		}
		// getteur
		public int getTaille() {
		return taille;
		}
		// setteur
		public void setTaille(int taille) {
		this.taille = taille;
		}
		// getteur
		public String getPrenom() {
		return prenom;
		}
		// setteur
		public void setPrenom(String prenom) {
		this.prenom = prenom;
		}


}
