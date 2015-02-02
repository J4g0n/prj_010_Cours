package package_4_POOexos.Exercice0570;

import java.util.Date;

/**
 * Created by ipi on 02/02/2015.
 */
public class Intervention {
    private int numero;
    private Date date;
    private int duree;
    private double tarifKilometre;
    private Employe technicien;


    public Intervention(int numero, Date date, int duree, double tarifKilometre, Employe technicien) {
        this.numero = numero;
        this.date = date;
        this.duree = duree;
        this.tarifKilometre = tarifKilometre;
        this.technicien = technicien;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public double getTarifKilometre() {
        return tarifKilometre;
    }

    public void setTarifKilometre(double tarifKilometre) {
        this.tarifKilometre = tarifKilometre;
    }

    public Employe getTechnicien() {
        return technicien;
    }

    public void setTechnicien(Employe technicien) {
        this.technicien = technicien;
    }

    public double fraisKilometre(double kilometre) {
        return kilometre * getTarifKilometre();
    }

    public double fraisMo() {
        return (double) duree * getTechnicien().coutHoraire();
    }

    public void finalize() {

    }
}
