package package_4_POOexos;

/**
 * Created by ipi on 30/01/2015.
 */
public class ProgrammeCompteBancaire {
    public static void main (String [] args) {
        CompteBancaire c1 = new CompteBancaire("1", "24/05/1987", "Courant");
        CompteBancaire c2 = new CompteBancaire("2", "25/05/1991", "Epargne", 3.00);

        creerCompte();
        System.gc();
        c1.affiche();
        c2.affiche();
    }

    public static void creerCompte() {
        new CompteBancaire("3", "24/05/1987", "Courant");
    }
}
