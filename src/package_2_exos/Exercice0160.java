package package_2_exos;

import java.util.Scanner;

/**
 * Created by ipi on 30/01/2015.
 */
public class Exercice0160 {
    public static void main (String [] args) {
        int secretNumber = (int)(Math.random() * 100);
        int yourNumber = -1;

        while (yourNumber != secretNumber) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Saisir un nombre" + secretNumber);
            yourNumber = sc.nextInt();

            if (yourNumber < secretNumber) {
                System.out.println("Trop petit!");
            } else {
                System.out.println("Trop grand!");
            }
        }
        System.out.println("\nBravo tu as trouvé le nombre secret!!");

    }
}
