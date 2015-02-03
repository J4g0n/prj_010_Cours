package package_6_PersistenceExos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by ipi on 03/02/2015.
 */
public class Exercice0720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date date;
        String quit;

        try {
            BufferedWriter fichierWrite =
                    new BufferedWriter(new FileWriter("Ressources/participants.txt"));

            while (true) {
                System.out.println("Saisir un nom");
                fichierWrite.write(sc.nextLine() + ";");
                System.out.println("Saisir un prenom");
                fichierWrite.write(sc.nextLine() + ";");
                System.out.println("Donner le sexe du participant un nom");
                fichierWrite.write(sc.nextLine() + ";");
                System.out.println("Saisir un age");
                fichierWrite.write(sc.nextLine() + ";");
                System.out.println("Quitter?");
                quit = sc.nextLine();

                date = new Date();
                fichierWrite.write(date.toLocaleString() + ";" + date.getHours() + "\n");

                if (quit.equals("quit")) {
                    break;
                }
            }

            fichierWrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
