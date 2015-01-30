package package_4_POOexos;

/**
 * Created by ipi on 30/01/2015.
 */
public class ProgrammePoint {
    public static void main (String [] args) {
        Point p = new Point("Mon Point", 3, 5);

        p.affiche();
        p.translate(2, 1);
        p.affiche();
    }
}
