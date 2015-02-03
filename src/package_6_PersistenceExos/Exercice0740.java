package package_6_PersistenceExos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by ipi on 03/02/2015.
 */
public class Exercice0740 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conDBChanteurs = DriverManager.getConnection("jdbc:mysql://localhost/BDTest", "root", "");
            String reqTousLesChanteurs = "SELECT * FROM tennismen";
            Statement statement = conDBChanteurs.createStatement();
            ResultSet lesLignesRecuperees =  statement.executeQuery(reqTousLesChanteurs);
            while (lesLignesRecuperees.next()) {
                System.out.println("Chanteur nom: " + lesLignesRecuperees.getString(1));
                System.out.println("Chanteur prenom: " + lesLignesRecuperees.getString(2));
                System.out.println("Chanteur annee: " + lesLignesRecuperees.getInt(3) + "\n");
            }
            System.out.println("OK");
        } catch (Exception e) {
            System.out.println("Problème connexion base de donnee " + e.getMessage());
        }
    }
}
