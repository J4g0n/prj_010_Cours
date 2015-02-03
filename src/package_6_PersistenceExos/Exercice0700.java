package package_6_PersistenceExos;

import java.io.*;

public class Exercice0700 {

    /*	==================================
     * 	lecture d'un fichier texte
     * 	==================================
     */
    public static void main(String[] args) {
        try {
            String ligne ;
            // FileReader permet de r�f�rencer un fichier de donn�es
            // BufferedReader permet de savoir quel flux (buffer) va �tre
            //	utilis� pour utiliser ce fichier
            BufferedReader fichier =
                    new BufferedReader(new FileReader("Ressources/listePresidentsFrancais.txt"));
            // readLine permet de lire une ligne du fichier
            while ((ligne = fichier.readLine()) != null) {
                // on affiche la ligne sur la console
                String [] tabLignes = ligne.split(";");
                System.out.println("Nom: " + tabLignes[0] + " Prenom: " + tabLignes[0]);
            } // fin while
            // on ferme le fichier de donn�es
            fichier.close();
        } // fin try
        catch (Exception e) {
            e.printStackTrace();
        } // fin catch


    }

}
