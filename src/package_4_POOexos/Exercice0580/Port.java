package package_4_POOexos.Exercice0580;

/**
 * Created by ipi on 02/02/2015.
 */
public class Port {
    private Stockage [] tabStock = new Stockage[20];

    public Port(Stockage[] tabStock) {
        this.tabStock = tabStock;
    }

    public Stockage[] getTabStock() {
        return tabStock;
    }

    public void setTabStock(Stockage[] tabStock) {
        this.tabStock = tabStock;
    }

    public Navire dechargement(Navire unNavire) throws Exception {
        int i;

        for (i = 0; i < getTabStock().length && !unNavire.estDecharge(); i++) {
            int qteAStocker = unNavire.getQteFret();
            int capaciteHangard = getTabStock()[i].getCapaDispo();

            if (qteAStocker <= capaciteHangard) {
                unNavire.decharger(qteAStocker);
                getTabStock()[i].stocker(qteAStocker);
            } else {
                unNavire.decharger(capaciteHangard);
                getTabStock()[i].stocker(capaciteHangard);
            }
        }

        if (!unNavire.estDecharge()) {
            throw new Exception("Le port est rempli, il est impossible de décharger complètement ce navire");
        }

        return unNavire;
    }
}
