package package_4_POOexos;

/**
 * Created by ipi on 30/01/2015.
 */
public class Point {
    private String nom;
    private int abscisse;
    private int ordonnee;

    public Point(String nom, int abscisse, int ordonnee) {
        super();
        this.setNom(nom);
        this.setAbscisse(abscisse);
        this.setOrdonnee(ordonnee);
    }

    public String getNom() {
        System.out.println("nom: " + nom);
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAbscisse() {
        System.out.println("abscisse: " + abscisse);
        return abscisse;
    }

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }

    public int getOrdonnee() {
        System.out.println("ordonnee: " + ordonnee);
        return ordonnee;
    }

    public void setOrdonnee(int ordonnee) {
        this.ordonnee = ordonnee;
    }

    public void affiche() {
        System.out.println("nom: " + nom + "\nabscisse: " + abscisse + "\nordonnee: " + ordonnee);
    }

    public void translate(int x, int y) {
        this.abscisse += x;
        this.ordonnee += y;
    }
}
