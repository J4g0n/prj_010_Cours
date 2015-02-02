package package_4_POOexos.Exercice0570;

import java.util.Date;

/**
 * Created by ipi on 02/02/2015.
 */
public class Client {
    private int numero;
    private String nom;
    private String adresse;
    private String codepos;
    private String chaine;
    private int nbkm;

    public Client(int numero, String nom, String adresse, String codepos, String chaine, int nbkm) {
        this.numero = numero;
        this.nom = nom;
        this.adresse = adresse;
        this.codepos = codepos;
        this.chaine = chaine;
        this.nbkm = nbkm;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodepos() {
        return codepos;
    }

    public void setCodepos(String codepos) {
        this.codepos = codepos;
    }

    public String getChaine() {
        return chaine;
    }

    public void setChaine(String chaine) {
        this.chaine = chaine;
    }

    public int getNbkm() {
        return nbkm;
    }

    public void setNbkm(int nbkm) {
        this.nbkm = nbkm;
    }

    public double distance() {
        return getNbkm();
    }

    public void finalize() {

    }
}
