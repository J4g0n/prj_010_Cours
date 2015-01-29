package package_3_POO;

import java.util.ArrayList;

/**
 * Created by ipi on 29/01/2015.
 */
public class Clavier {
    private boolean estDetachable;
    private int largeur;
    private int longueur;
    // aggrégation
    private ArrayList<Touche> lesTouches;

    public Clavier(boolean estDetachable, int largeur, int longueur, ArrayList<Touche> lesTouches) {
        this.estDetachable = estDetachable;
        this.largeur = largeur;
        this.longueur = longueur;
        this.lesTouches = lesTouches;
    }

    public boolean isEstDetachable() {
        return estDetachable;
    }

    public void setEstDetachable(boolean estDetachable) {
        this.estDetachable = estDetachable;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }
}
