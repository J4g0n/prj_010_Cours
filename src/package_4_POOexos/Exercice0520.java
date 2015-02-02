package package_4_POOexos;

/**
 * Created by ipi on 30/01/2015.
 */
public class Exercice0520 {
    public static double addition(double x, double y) {
        return x + y;
    }

    public static double soustraction(double x, double y) {
        return x - y;
    }

    public static double multiplication(double x, double y) {
        return x * y;
    }

    public static double division(double x, double y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Division par 0");
        }
        return x / y;
    }

    public static double racineCarree(double x) throws ArithmeticException {
        if (x < 0) {
            throw new ArithmeticException("Square root can't be applied to negative numbers ");
        }
        return Math.sqrt(x);
    }
}
