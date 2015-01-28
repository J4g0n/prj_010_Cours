package package_1_lesBases;

public class Cours_120_exceptionAvecTry {
    public static void main(String[] args) {
        int a = 12, b = 0, c;
        char [] alphabet = new char [26];
        try {
            c = alphabet[27];
            c = a / b;
        } catch (ArithmeticException e) {
            // ici on gère l'exception
            System.out.println("Division par 0 " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            // ici on gère l'exception
            System.out.println("Tableau dépassé " + e.getMessage());
        } finally {
            b = 1;
            c = a / b;
            System.out.println("Fait " + c);
        }
        System.out.println("...et le programme continue");
    }
}