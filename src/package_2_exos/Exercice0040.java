package package_2_exos;

import java.util.Scanner;

/**
 * Created by ipi on 27/01/2015.
 */
public class Exercice0040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un nombre");
        int n = sc.nextInt();
        int i;
        double x;
        double result = 0;

        for (i = 1; i <= n; i++) {
            x = 1 / (double)i;
            result = result + x;
        }

        System.out.println("La série harmonique au rang n a pour valeur " + result);
    }
}
