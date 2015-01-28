package package_2_exos;

import java.util.Scanner;

/**
 * Created by ipi on 27/01/2015.
 */
public class Exercice0050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir une saison");
        String saison = sc.nextLine();
        switch (saison) {
            case "été":
                System.out.println("C'est l'été");
                break;
            case "printemps":
                System.out.println("C'est le printemps");
                break;
            case "hiver":
                System.out.println("C'est l'hiver");
                break;
            case "automne":
                System.out.println("C'est l'automne");
                break;
            default:
                System.out.println("Cette saison n'existe pas");
        }
    }
}
