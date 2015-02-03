package package_5_Persistence;

import java.io.*;
import java.util.Date;

public class EcritureDansFichierTexte {

	/*	=================================
	 * 	Ecrire dans un fichier texte
	 * 	=================================
	 */
	public static void main(String[] args) {
		try {
			//String ligne ;		
			int nombre = 3450;
			// classe FileWriter : r�f�rence le fichier texte de sortie
			// classe BufferedWriter : le buffer qui permet d'�crire dans le
			//	le fichier  
			BufferedWriter fichier = new BufferedWriter(new FileWriter("Ressources/sortie.txt"));
			// on �crit le buffer dans le fichier
			fichier.write("Salut les terriens");
			// on fait un rc dans le fichier
			fichier.newLine();
			fichier.write("Nous sommes le "+ new Date());
			fichier.write(", le nombre magique est " + nombre);
			// ne pas oublier de terminer le traitement 
			fichier.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}


	}

}
