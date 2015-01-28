package package_2_exos;

import java.util.Scanner;

/**
 * Created by ipi on 27/01/2015.
 */
public class Exercice0100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le nombre de note à entrer");
        int nbNotes = sc.nextInt();
        int i;
        double tmpDbl;
        double [] notes = new double[nbNotes];

        for(i = 0; i < nbNotes; i++) {
            System.out.println("Saisir la " + i + "eme note");
            tmpDbl = sc.nextDouble();
            notes[i] = tmpDbl;
        }

        double moyenne = calMoyenne(notes);
        System.out.println("La moyenne des notes est de " + moyenne);
    }

    public static double calMoyenne(double [] notes) {
        int tablen = notes.length;
        int i;
        double somme = 0;

        for(i = 0; i < tablen; i++) {
            somme += notes[i];
        }

        return somme / (double)tablen;
    }
}
