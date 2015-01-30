package package_2_exos;

import java.util.Scanner;

public class Exercice0150 {
    static char [] ascii = new char[256];

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir une phrase");
        char [] phrase = sc.nextLine().toCharArray();
        int i;

        countChars(phrase);

        System.out.println("=======================================================");
        System.out.println("Caractere \t*\tcode ASCII \t*\t nombre occurrences");
        for(i = 0; i < ascii.length; i++) {
            System.out.println("=======================================================");
            System.out.println((char)i + "         \t*\t" + i + "         \t*\t" + (int)ascii[i]);
        }
        System.out.println("=======================================================");
    }

    public static void countChars(char [] phrase) {
        int i;
        for (i = 0; i < phrase.length; i++) {
            ascii[(int) phrase[i]]++;
        }
    }
}
