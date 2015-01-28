package package_2_exos;

import java.util.Scanner;

/**
 * Created by ipi on 27/01/2015.
 */
public class Exercice0060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un nombre");
        int nbLignes = sc.nextInt();
        int i, k, nbEtoiles = 1;

        while(nbLignes != 0) {
            for (i = 0; i < nbLignes; i++) {
                System.out.print(" ");
            }
            for (k = 0; k < nbEtoiles; k++) {
                System.out.print("*");
            }
            System.out.println("");
            nbEtoiles += 2;
            nbLignes--;
        }
    }
}
