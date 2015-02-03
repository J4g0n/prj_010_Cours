package package_6_PersistenceExos;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by ipi on 03/02/2015.
 */
public class Exercice0730 {
    public static void main(String[] args) {
        ecrire();
        int nbVoyelles = lireNbVoyelles();
        System.out.println("Il y a " + nbVoyelles + " voyelles dans ce texte");
    }

    public static int compterVoyelles(String line) {
        char [] charArray = line.toCharArray();
        int i, nbVowels = 0;
        char c;

        for (i = 0; i < charArray.length; i++) {
            c = charArray[i];

            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U' || c == 'y' || c == 'Y') {
                nbVowels++;
            }
        }

        return nbVowels;
    }

    public static int lireNbVoyelles() {
        int nbVoyelles = 0;
        String ligne ;

        try {
            BufferedReader fichier =
                    new BufferedReader(new FileReader("Ressources/article.txt"));

            while ((ligne = fichier.readLine()) != null) {
                nbVoyelles += compterVoyelles(ligne);
            } // fin while

            fichier.close();
        } // fin try
        catch (Exception e) {
            e.printStackTrace();
        } // fin catch

        return nbVoyelles;
    }

    public static void ecrire() {
        Scanner sc = new Scanner(System.in);
        String text;

        try {
            BufferedWriter fichierWrite =
                    new BufferedWriter(new FileWriter("Ressources/article.txt"));

            System.out.println("Entrer quelque chose (appuyer sur quit pour quitter):");
            while (true) {
                text = sc.nextLine();
                if (text.equals("quit")) {
                    break;
                }

                fichierWrite.write( text+ "\n");
            }

            fichierWrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
