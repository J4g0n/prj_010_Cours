package package_2_exos;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Created by ipi on 27/01/2015.
 */
public class Exercice0080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un nombre");
        int i, nb = sc.nextInt();
        int [] nbTab = new int[nb];

        for (i = 0; i < nb; i++) {
            nbTab[i] = (i+1) * (i+1);
            System.out.println("Le résultat donne pour " + (i+1) + " : " + nbTab[i]);
        }
    }
}
