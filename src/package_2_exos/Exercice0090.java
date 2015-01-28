package package_2_exos;

import java.util.Scanner;

/**
 * Created by ipi on 27/01/2015.
 */
public class Exercice0090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double montantTTC;
        double tauxTVA = 19.6;
        System.out.println("Saisir le nombre de jours");
        int nbJours = sc.nextInt();
        System.out.println("Saisir le nombre de kilometre parcourus du trajet");
        double kilometrage = sc.nextDouble();

        double prixAuJour = calculerPrixAuJour((double)nbJours);
        double prixAuxKilometre = calculerPrixAuKilometre(kilometrage);
        double prixTotal = prixAuJour + prixAuxKilometre;
        montantTTC = calculTTC(prixTotal, tauxTVA);

        System.out.println("Cela vous a couté " + montantTTC);
    }

    public static double calculerPrixAuJour (double nombreJours) {
        return nombreJours * 75;
    }

    public static double calculerPrixAuKilometre (double montantHT) {
        if (montantHT < 100) {
            return 0;
        }
        else if (montantHT < 300) {
            return (montantHT - 100) * 0.5;
        }
        else {
            return ((montantHT - 100) * 0.5) + ((montantHT - 200) * 0.3);
        }
    }

    public static double calculTTC (double montantHT, double tauxTVA) {
        return montantHT * (1 + (tauxTVA / 100));
    }
}
