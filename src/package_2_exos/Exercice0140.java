package package_2_exos;

/**
 * Created by ipi on 30/01/2015.
 */
public class Exercice0140 {
    static int [] tableau = { 18, 1, 16, 11, 5, 4, 14, 3, 2, 15, 7, 13, 17, 9, 20, 6, 12, 8, 10, 19 };

    public static void main (String [] args) {
        triRapide(0, tableau.length-1);
        afficheTableau();
    }

    public static void afficheTableau() {
        int i;

        for (i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + "\t");
        }
        System.out.println("");
    }

    public static int [] swap(int pivot, int fin) {
        int tmp = tableau[pivot];
        tableau[pivot] = tableau[fin];
        tableau[fin] = tmp;
        return tableau;
    }

    public static int partition(int dbt, int fin, int pivot) {
        int i, j;

        swap(pivot, fin);
        for (i = dbt, j = dbt; i < fin; i++) {
            if (tableau[i] <= tableau[fin]) {
                swap(i, j);
                j++;
            }
        }
        swap(fin, j);

        return j;
    }

    public static void triRapide(int dbt, int fin) {
        int pivot;
        if (dbt < fin) {
            pivot = dbt;
            pivot = partition(dbt, fin, pivot);
            triRapide(dbt, pivot - 1);
            triRapide(pivot + 1, fin);
        }
    }
}
