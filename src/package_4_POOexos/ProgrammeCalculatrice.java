package package_4_POOexos;

/**
 * Created by ipi on 30/01/2015.
 */
public class ProgrammeCalculatrice {
    public static void main (String [] args) {
        double x = 2.3;
        double y = 33.444;

        System.out.println("addition "+Calculatrice.addition(x,y));
        System.out.println("soustraction "+Calculatrice.soustraction(x,y));
        System.out.println("multiplication "+Calculatrice.multiplication(x,y));
        System.out.println("division "+Calculatrice.division(x,y));
        System.out.println("racine carre "+Calculatrice.racineCarree(x));
    }
}
