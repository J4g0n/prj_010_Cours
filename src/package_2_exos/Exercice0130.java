package package_2_exos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ipi on 30/01/2015.
 */
public class Exercice0130 {
    public static void main (String [] args) {
        String codeProduit;
        double prixDeVente;
        int qteVendu;
        double benefice;

        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un code produit");
        codeProduit = sc.nextLine();
        System.out.println("Saisir le prix de vente");
        prixDeVente = sc.nextDouble();
        System.out.println("Saisir la quantité vendu");
        qteVendu = sc.nextInt();

        benefice = calculBenefice(codeProduit, prixDeVente, qteVendu);

        System.out.println("Le bénéfice réalisé est de: " + benefice);
    }

    public static double calculBenefice(String codeProduit, double prixDeVente, int qteVendu) {
        double marge = 0;
        if (codeProduit.startsWith("AE")) {
            if (codeProduit.startsWith("AEP")) {
                marge = 5;
            } else {
                marge = 8;
            }
        } else if (codeProduit.startsWith("AR") || codeProduit.startsWith("AT")) {
            marge = 8;
        } else if (codeProduit.startsWith("B")) {
            if (codeProduit.startsWith("BZ")) {
                marge = 10;
            } else {
                marge = 7;
            }
        } else {
            marge = 6;
        }

        return ((double)qteVendu * prixDeVente) * (marge / 100);
    }
}
