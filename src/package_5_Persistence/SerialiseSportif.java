package package_5_Persistence;

import java.io.*;

public class SerialiseSportif {
	/*	
	 * 	=================================
	 * 	code qui s�rialise un objet
	 * 	=================================
	 */
	public static void main(String[] args) {
			// cr�er un objet sportif
			Sportif sp = new Sportif("Messi","Lionel",169);
			try {
				// on d�finit le fichier dans lequel on stockera
				// l'objet serialise  : avec la classe FileOutputStream
				FileOutputStream fichier = new FileOutputStream("Ressources/sp.ser");
				// on cr�e un objet de type ObjectOutputStream
				// on lui fournissant le fichier dans lequel s�rialiser
				ObjectOutputStream objASerialiser = new ObjectOutputStream(fichier);
				// on s�rialise grace � la m�thode writeObject
				objASerialiser.writeObject(sp);
				// on vide le tampon dans le fichier
				objASerialiser.flush();
				// on termine l'op�ration par close
				objASerialiser.close();
			} // fin try
			catch (IOException e) {
				e.printStackTrace();
			} // fin catch


	}

}
