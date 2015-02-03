package package_4_POOexos.Exercice0570;


public class Employe {
    private int numero;
    private String nom;
    private Grade qualification;
    private String dateEmbauche;

    public Employe(int numero, String nom, Grade qualification, String dateEmbauche) {
        this.numero = numero;
        this.nom = nom;
        this.qualification = qualification;
        this.dateEmbauche = dateEmbauche;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Grade getQualification() {
        return qualification;
    }

    public void setQualification(Grade qualification) {
        this.qualification = qualification;
    }

    public String getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(String dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public double coutHoraire() {
        double tauxHoraire = qualification.getTaux();
        return tauxHoraire * 100;
    }

    public void finalize() {

    }
}
