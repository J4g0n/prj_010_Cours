package package_4_POOexos.Exercice0570;

import java.util.Date;

/**
 * Created by ipi on 02/02/2015.
 */
public class Contrat {
    private int numero;
    private String date;
    private Client cli;
    private double montantContrat;
    private Intervention [] tabIntervention = new Intervention[500];
    private int nbIntervention;

    public Contrat(int numero, String date, Client cli, double montantContrat, Intervention[] tabIntervention, int nbIntervention) {
        this.numero = numero;
        this.date = date;
        this.cli = cli;
        this.montantContrat = montantContrat;
        this.tabIntervention = tabIntervention;
        this.nbIntervention = nbIntervention;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Client getCli() {
        return cli;
    }

    public void setCli(Client cli) {
        this.cli = cli;
    }

    public double getMontantContrat() {
        return montantContrat;
    }

    public void setMontantContrat(double montantContrat) {
        this.montantContrat = montantContrat;
    }

    public Intervention[] getTabIntervention() {
        return tabIntervention;
    }

    public void setTabIntervention(Intervention[] tabIntervention) {
        this.tabIntervention = tabIntervention;
    }

    public int getNbIntervention() {
        return nbIntervention;
    }

    public void setNbIntervention(int nbIntervention) {
        this.nbIntervention = nbIntervention;
    }

    public double montant() {
        return getMontantContrat();
    }

    public double ecart() {
        Intervention currTab;
        double coutInterventions = 0;
        int i;

        for (i = 0; i < getNbIntervention(); i++) {
            currTab = getTabIntervention()[i];
            coutInterventions += currTab.fraisMo() + currTab.fraisKilometre(getCli().distance());
        }
        return montant() - coutInterventions;
    }

    public void finalize() {

    }
}
