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
    }

    public static boolean readChar(char [] charArray,char c) {

    }

    public static double calculBenefice(String codeProduit, double prixDeVente, int qteVendu) {
        double marge = 0;
        if (codeProduit.startsWith("A")) {
            if (codeProduit.startsWith("AE")) {
                if (codeProduit.startsWith("AEP")) {

                } else {

                }
            }
            
        }
    }
}
