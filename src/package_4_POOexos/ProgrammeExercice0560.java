package package_4_POOexos;

/**
 * Created by ipi on 02/02/2015.
 */
public class ProgrammeExercice0560 {
    public static void main (String [] args) {
        Exercice0560 t1 = new Exercice0560(2,3,4,"bois");
        Exercice0560 t2 = new Exercice0560(5,6,7,"fer");
        Exercice0560 t3 = new Exercice0560(7,8,9,"plastique");

        int nbTables = Exercice0560.getNbTables();
        System.out.println("Nombre de tables actuel " + nbTables);

        t1.finalize();

        nbTables = Exercice0560.getNbTables();
        System.out.println("Nombre de tables actuel " + nbTables);
    }
}
