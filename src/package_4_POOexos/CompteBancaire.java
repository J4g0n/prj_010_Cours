package package_4_POOexos;

/**
 * Created by ipi on 30/01/2015.
 */
public class CompteBancaire {
    private String numeroCompte;
    private String dateCreation;
    private String typeCompte;
    private double tauxRemuneration = -1;


    public CompteBancaire(String numeroCompte, String dateCreation, String typeCompte) {
        this.numeroCompte = numeroCompte;
        this.dateCreation = dateCreation;
        this.typeCompte = typeCompte;
    }

    public CompteBancaire(String numeroCompte, String dateCreation, String typeCompte, double tauxRemuneration) {
        this.numeroCompte = numeroCompte;
        this.dateCreation = dateCreation;
        this.typeCompte = typeCompte;
        this.tauxRemuneration = tauxRemuneration;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }

    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    public void affiche() {
        System.out.println("Numero compte: " + numeroCompte);
        System.out.println("Date de création: " + dateCreation);
        System.out.println("Type du compte: " + typeCompte);
        if (tauxRemuneration > 0) {
            System.out.println("Taux de rémunération: " + tauxRemuneration);
        }
    }

    public void finalize() {
        System.out.println("Je suis le desctructeur de la classe compte bancaire");
    }
}
