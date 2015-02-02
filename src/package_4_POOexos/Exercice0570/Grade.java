package package_4_POOexos.Exercice0570;

/**
 * Created by ipi on 02/02/2015.
 */
public class Grade {
    private char code;
    private String libelle;
    private double taux;

    public Grade(char code, String libelle, double taux) {
        this.code = code;
        this.libelle = libelle;
        this.taux = taux;
    }

    public char getCode() {
        return code;
    }

    public void setCode(char code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public double tauxHoraire() {
        return 0;
    }

    public void finalize() {

    }
}
