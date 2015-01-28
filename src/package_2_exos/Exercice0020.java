package package_2_exos;

import java.io.Console;
import java.util.Scanner;

/**
 * Created by ipi on 27/01/2015.
 */
public class Exercice0020 {
    public static void main (String [] args) {
        String nom = "Moi";
        String password = "Super";
        String login;
        String pw;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre nom");
        login = sc.nextLine();
        System.out.println("Entrez votre mot de passe");
        pw = sc.nextLine();
        if (login.equals(nom) && pw.equals(password)) {
            System.out.println("Bravo");
        } else {
            System.out.println("Mauvais mot de passe");
        }
    }
}

