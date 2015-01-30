package package_2_exos;

import java.util.List;

public class Exercice0070 {
    static int nombreDeRendu = 0;

    public static void main(String[] args) {
        int total = 30; // donné en centimes
        rendu1euro(total, 0);
        System.out.println("\n\n\nNombre total rendus: " + nombreDeRendu);
    }

    public static void rendreNcentimes(int total, int step, int nbCentimes) {
        System.out.print((step + 1) + ". Rendre " + nbCentimes + " centimes\t");
        rendu1euro(total - nbCentimes, step + 1);
    }

    public static void rendre2centimes(int total, int step) {
        rendreNcentimes(total, step, 2);
    }

    public static void rendre5centimes(int total, int step) {
        rendreNcentimes(total, step, 5);
    }

    public static void rendre10centimes(int total, int step) {
        rendreNcentimes(total, step, 10);
    }

    public static void rendu1euro(int total, int step) {
        if (total < 0) {
            System.out.print("Rendu impossible");
            return ;
        }

        if (total == 0) {
            nombreDeRendu++;
            System.out.print("Rendu valide");
        }

        if (total >= 10) {
            spaces(step);
            rendre10centimes(total, step);
        }
        if (total >= 5) {
            spaces(step);
            rendre5centimes(total, step);
        }
        if (total >= 2) {
            spaces(step);
            rendre2centimes(total, step);
        }
    }

    public static void spaces(int spaces) {
        int i;
        System.out.print("\n");
        for (i = 0; i < spaces; i++) {
            System.out.print("\t");
        }
    }
}
