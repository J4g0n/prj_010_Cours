package package_4_POOexos;

/**
 * Created by ipi on 02/02/2015.
 */
public class Exercice0560 {
    int longueur;
    int largeur;
    int hauteur;
    String materiau;

    static int nbTables;

    public Exercice0560(int longueur, int largeur, int hauteur, String materiau) {
        this.setLongueur(longueur);
        this.setLargeur(largeur);
        this.setHauteur(hauteur);
        this.setMateriau(materiau);
        nbTables++;
    }

    public static int getNbTables() {
        return nbTables;
    }

    public void finalize() {
        nbTables--;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public String getMateriau() {
        return materiau;
    }

    public void setMateriau(String materiau) {
        this.materiau = materiau;
    }
}
