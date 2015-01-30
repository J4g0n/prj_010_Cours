package package_2_exos;

import java.util.Scanner;

public class Exercice0120 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un montant");
        double montant = sc.nextDouble();
        System.out.println("Saisir un nombre d'ouvrages");
        int nbOuvrages = sc.nextInt();

        double montantDu = aPayer(montant, nbOuvrages);
        System.out.println("Montant du: " + montantDu);
    }

    public static double aPayer(double montant, int nbOuvrages) {
        if (nbOuvrages < 3) {
            return 2.5 * (double)nbOuvrages + montant;
        }
        if (nbOuvrages <= 5) {
            double m1 = 2.5 * (double)nbOuvrages;
            double m2 = montant * 1.1;
            if (m1 < m2) {
                return m1;
            } else {
                return m2;
            }
        }
        if (nbOuvrages < 10) {
            return 15 + montant;
        }
        else {
            return montant;
        }
    }
}
