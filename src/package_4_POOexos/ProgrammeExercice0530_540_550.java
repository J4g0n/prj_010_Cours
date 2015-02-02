package package_4_POOexos;

/**
 * Created by ipi on 30/01/2015.
 */
public class ProgrammeExercice0530_540_550 {
    public static void main (String [] args) {
        Exercice0530_0540_0550 c1 = new Exercice0530_0540_0550("1", "24/05/1987", "Courant");
        Exercice0530_0540_0550 c2 = new Exercice0530_0540_0550("2", "25/05/1991", "Epargne", 3.00);

        creerCompte();
        System.gc();
        c1.affiche();
        c2.affiche();
    }

    public static void creerCompte() {
        new Exercice0530_0540_0550("3", "24/05/1987", "Courant");
    }
}
