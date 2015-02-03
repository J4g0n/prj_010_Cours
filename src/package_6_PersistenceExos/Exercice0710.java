package package_6_PersistenceExos;

import java.io.*;

public class Exercice0710 {

    /*	==================================
     * 	lecture d'un fichier texte
     * 	==================================
     */
    public static void main(String[] args) {
        try {
            String ligne ;
            int i;

            BufferedReader fichierRead =
                    new BufferedReader(new FileReader("Ressources/clients1.txt"));
            BufferedWriter fichierWrite =
                    new BufferedWriter(new FileWriter("Ressources/clients2.txt"));

            ligne = fichierRead.readLine();
            while (ligne != null) {
                for (i = 0; i < 5; i++) {
                    fichierWrite.write(ligne + ";");
                    ligne = fichierRead.readLine();
                }
                fichierWrite.write("\n");
            }

            fichierWrite.close();
            fichierRead.close();
        } // fin try
        catch (Exception e) {
            e.printStackTrace();
        } // fin catch


    }

}
