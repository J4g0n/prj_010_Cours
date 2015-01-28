package package_1_lesBases;

public class Cours_130_methodes {
    public static void main (String [] args) {
        double montantHT = 200.00,
               montantTVA = 42.13,
               montantTTC;
        montantTTC = additionner(montantHT, montantTVA);
        afficher(montantTTC);
        String s = "aRessDFDee";
        System.out.println(maj(s));
    }

    public static void afficher(double montant) {
        System.out.println("Montant final: " + montant);
    }

    public static double additionner(double montant1, double montant2) {
        return montant1 + montant2;
    }

    public static String maj(String s) {
        return s.toUpperCase();
    }
}
