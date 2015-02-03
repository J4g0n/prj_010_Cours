package package_5_Persistence;

import java.io.*;

public class DeSerialiseSportif {

	/*	===================================
	 * 	D�s�rialiser un objer
	 * 	===================================
	 */
	public static void main(String[] args) {
		try {
			//
			// on d�finit le fichier dans lequel est stock�
			// l'objet serialise : avec la classe FileInputStream
			FileInputStream fichier = new FileInputStream("Ressources/sp.ser");
			// on cr�e un objet de type ObjectInputStream
			// on lui fournissant le fichier contenant l'objet
			// s�rialis�
			ObjectInputStream objSerialise = new ObjectInputStream(fichier);
			// on appelle la m�thode readObject pour d�serialiser
			// remarquer le cast
			Sportif spo = (Sportif) objSerialise.readObject();
			// on affiche les attributs de l'objet d�serialis�
			System.out.println("Sportif : ");
			System.out.println("nom : "+spo.getNom());
			System.out.println("prenom : "+spo.getPrenom());
			System.out.println("taille : "+spo.getTaille());
		} // fin try
		catch (IOException e) {
			e.printStackTrace();	// afficher le log de l'erreur(l'exception)
		} // fin catch
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // fin catch


	}

}
