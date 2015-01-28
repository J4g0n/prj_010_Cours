package package_2_exos;

import java.util.List;

public class Exercice0070 {
    static int centimes2 = 2;
    static int centimes5 = 5;
    static int centimes10 = 10;
    static int nombreDeRendu = 0;
    static int [] finalResults;

    public static void main(String[] args) {
        int total = 100; // donné en centimes
        rendu1euro(total);
        System.out.println("Nombre total rendus" + nombreDeRendu);
    }

    public static int [] rendu2centimes() {
        int [] centTab = { 2 };
        nombreDeRendu++;
        return centTab;
    }

    public static int [] rendu5centimes() {
        int [] centTab = { 5 };
        nombreDeRendu++;
        return centTab;
    }

    public static int [][] rendu10centimes() {
        int [][] centTab = {{ 5, 5 }, { 2, 2, 2, 2, 2 }, { 10 }};
        nombreDeRendu += 3;
        return centTab;
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

    public static void rendu1euro(int total) {
        if (total == 0) {
            System.out.println("Fin du rendu.");
            nombreDeRendu++;
            return ;
        }
        if (total == 5) {
            System.out.println("Rendre 5");
        }
        if (total == 2) {
            System.out.println("Rendre 2");
        }
        if (total - 2 < 0) {
            System.out.println("Rendu impossible");
        }
        if (total - 5 < 0) {
            System.out.println("Rendre 2");
            rendu1euro(total - 2);
        }
        if (total - 10 < 0) {
            System.out.println("Rendre 5");
            rendu1euro(total - 5);
        }
        else {
            System.out.println("Rendre 10");
            rendu1euro(10);
            rendu1euro(total - 10);
        }
        System.out.println();

    }
}
