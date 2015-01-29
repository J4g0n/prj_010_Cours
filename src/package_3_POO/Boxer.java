package package_3_POO;

/**
 * Created by ipi on 29/01/2015.
 */
public class Boxer {
    private String nom;
    private int age;

    public Boxer(String n, int a) {
        age = a;
        nom = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String s) {
        nom = s;
    }

    public void frapper() {
        System.out.println("Je frappe");
    }

    public void bouger() {
        System.out.println("Je bouge");
    }

    public boolean verifierNom() {
        char [] acceptedChar = "azertyuiopmlkjhgfdsqwxcvbnAZERTYUIOPMLKJHGFDSQWXCVBN".toCharArray();
        char [] nomTab = nom.toCharArray();
        boolean result = true;
        boolean tmpBool;
        char tmpChar;
        int i,j;

        for (i = 0; i < nomTab.length; i++) {
            tmpChar = nomTab[i];
            tmpBool = false;

            for (j = 0; j < acceptedChar.length; j++) {
                if (tmpChar == acceptedChar[j]) {
                    tmpBool = true;
                    break;
                }
            }

            result &= tmpBool;
        }

        return result;
    }
}
