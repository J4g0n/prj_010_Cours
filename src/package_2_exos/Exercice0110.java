package package_2_exos;

public class Exercice0110 {
    public static void main(String[] args) {
        double montantTVA = 40.67;
        double montantHT = -1;
        double montantTTC = 19.55;

        System.out.println("Les entrées sont " + montantTVA + " " + montantHT + " " + montantTTC );
        double result = calculerManquant(montantTVA, montantHT, montantTTC);
        System.out.println("Le résultat donne " + result);
    }

    public static double calculTVA(double ht, double ttc) {
        return ((ttc/ht) - 1) * 100;
    }

    public static double calculHT(double tva, double ttc) {
        return ttc / (1 + (tva/100));
    }

    public static double calculTTC(double ht, double tva) {
        return ht * (1 + (tva/100));
    }

    public static double calculerManquant(double tva, double ht, double ttc) {
        if (tva < 0) {
            return calculTVA(ht, ttc);
        }
        if (ht < 0) {
            return calculHT(tva, ttc);
        }
        if (ttc < 0) {
            return calculTTC(ht, tva);
        }

        return -1;
    }
}