package package_4_POOexos.Exercice0580;

/**
 * Created by ipi on 02/02/2015.
 */
public class Stockage {
    private int capaDispo;
    private int capaciteMax;

    public Stockage(int capaDispo, int capaciteMax) {
        this.capaDispo = capaDispo;
        this.capaciteMax = capaciteMax;
    }

    public int getCapaDispo() {
        return capaDispo;
    }

    public void setCapaDispo(int capaDispo) {
        this.capaDispo = capaDispo;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public int obtenirCapaDispo() {
        return getCapaDispo();
    }

    public void  stocker(int qte) {
        int nouvelleQte = getCapaDispo() - qte;
        if (nouvelleQte >= 0) {
            setCapaDispo(nouvelleQte);
        }
    }

    public boolean estVide() {
        return getCapaDispo() == 0;
    }

    public boolean estRempli() {
        return getCapaDispo() == getCapaciteMax();
    }
}
