package package_3_POO;

public class AA_TestClasses {
    public static void main(String [] args) {
        Boxer b1 = new Boxer("Ali", 19);
        Boxer b2 = new Boxer("George", 28);

        System.out.println("le nom de Ali est " + b1.verifierNom());
        System.out.println("le nom de George est " + b2.verifierNom());
    }
}
