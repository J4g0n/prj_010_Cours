package package_4_POOexos.Exercice0580;

/**
 * Created by ipi on 02/02/2015.
 */
public class Navire {
    private int noLloyds;
    private String nomNavire;
    private String libelleFret;
    private int qteFret;

    public Navire(int noLloyds, String nomNavire, String libelleFret, int qteFret) {
        this.noLloyds = noLloyds;
        this.nomNavire = nomNavire;
        this.libelleFret = libelleFret;
        this.qteFret = qteFret;
    }

    public int getNoLloyds() {
        return noLloyds;
    }

    public void setNoLloyds(int noLloyds) {
        this.noLloyds = noLloyds;
    }

    public String getNomNavire() {
        return nomNavire;
    }

    public void setNomNavire(String nomNavire) {
        this.nomNavire = nomNavire;
    }

    public String getLibelleFret() {
        return libelleFret;
    }

    public void setLibelleFret(String libelleFret) {
        this.libelleFret = libelleFret;
    }

    public int getQteFret() {
        return qteFret;
    }

    public void setQteFret(int qteFret) {
        this.qteFret = qteFret;
    }

    public int obtenirQteFret() {
        return getQteFret();
    }

    public void decharger(int quantite) {
        if (quantite > qteFret) {
            setQteFret(getQteFret() - quantite);
        }
    }

    public boolean estDecharge() {
        if (getQteFret() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
