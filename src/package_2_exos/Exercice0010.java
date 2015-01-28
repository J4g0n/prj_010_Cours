package package_2_exos;

/**
 * Created by ipi on 27/01/2015.
 */
public class Exercice0010 {
    public static void main (String [] args) {
        int i, n = 20;
        for(i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println( i + "est un multiple de 2");
            }
            if (i % 3 == 0) {
                System.out.println( i + "est un multiple de 3");
            }
            if (i % 5 == 0) {
                System.out.println( i + "est un multiple de 5");
            }
        }
    }
}
