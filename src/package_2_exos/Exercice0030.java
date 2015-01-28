package package_2_exos;

import java.util.Scanner;

/**
 * Created by ipi on 27/01/2015.
 */
public class Exercice0030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un nombre");
        double n = sc.nextDouble();
        double sqrt;

        while (n != 0) {
            sqrt = Math.sqrt(n);
            System.out.println(n + " a pour racine carré " + sqrt);
            System.out.println("Saisir un nombre");
            n = sc.nextDouble();
        }

        System.out.println("Fin du programme");
    }
}