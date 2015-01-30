package package_2_exos;

import java.util.List;

public class Exercice0070 {
    static int centimes2 = 2;
    static int centimes5 = 5;
    static int centimes10 = 10;
    static int nombreDeRendu = 0;
    static int [] finalResults;

    public static void main(String[] args) {
        int total = 20; // donné en centimes
        rendu1euro(total, 0);
        System.out.println("\n\n\nNombre total rendus" + nombreDeRendu);
    }


    /*public static int [][] rendu1euro(int [] renduPrecedent, int total) {
        int i, j;
        int n = 3;
        int [][] rendu10cents = rendu10centimes();
        int [][] results = new int[3*n][];
        int [][] tmpResults;
        int renduPrec = 0;
        if (renduPrecedent != null) {
            renduPrec = renduPrecedent.length;
        }
        int [][] clones = new int[n][renduPrec + n];

        if (total <= 0) {
            finalResults = renduPrecedent;
            return results;
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < renduPrec; j++) {
                clones[i][j] = renduPrecedent[j];
            }
            for (j = 0; j < n; j++) {
                clones[i][renduPrec + j] = rendu10cents[i][j];
            }

            tmpResults = rendu1euro(renduPrecedent, total - 10);

            for(j = 0; j < n; j++) {
                results[3*i+j] = tmpResults[i];
            }
        }

        return results;
    }*/

    public static void rendre2centimes(int total, int step) {
        System.out.print(step + ". Rendre 2 centimes\t");
        rendu1euro(total - 2, step + 1);
    }

    public static void rendre5centimes(int total, int step) {
        System.out.print(step + ". Rendre 5 centimes\t");
        rendu1euro(total - 5, step + 1);
    }

    public static void rendre10centimes(int total, int step) {
        System.out.print(step + ". Rendre 10 centimes\t");
        rendu1euro(total - 10, step + 1);
    }

    public static void rendu1euro(int total, int step) {
        if (total < 0) {
            System.out.println("Rendu impossible");
            return ;
        }

        if (total == 0) {
            nombreDeRendu++;
            System.out.print("Rendu valide");
        }

        if (total >= 10) {
            spaces(step);
            rendre10centimes(total, step);
            spaces(step);
            rendre5centimes(total, step);
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
