package package_6_PersistenceExos;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by ipi on 04/02/2015.
 */
public class Exercice0750 {
    public static void main(String[] args) {
        ResultSet lesLignesRecuperees = recupererDepuisMySql();

        if (lesLignesRecuperees != null) {
            ecrireDansSQLServer(lesLignesRecuperees);
        }
    }

    public static void ecrireDansSQLServer(ResultSet lesLignesRecuperees) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conDBtennismen = DriverManager.getConnection("jdbc:sqlserver://S23POSTE19;database=BDTest", "sa", "batterie");
            String reqTousLesTennismen;

            while (lesLignesRecuperees.next()) {
                reqTousLesTennismen =
                        "INSERT INTO tennismen (id, nom, prenom, age) VALUES (" +
                                lesLignesRecuperees.getInt(1)  + ", '" +
                                lesLignesRecuperees.getString(2)  + "', '" +
                                lesLignesRecuperees.getString(3)  + "', " +
                                lesLignesRecuperees.getInt(4) +
                        ");";
                Statement statement = conDBtennismen.createStatement();
                statement.executeUpdate(reqTousLesTennismen);
            }
        } catch (Exception e) {
            System.out.println("Problème connexion base de donnee " + e.getMessage());
        }
    }

    public static ResultSet recupererDepuisMySql() {
        ResultSet lesLignesRecuperees = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conDBtennismen = DriverManager.getConnection("jdbc:mysql://localhost/BDTest", "root", "");
            String reqTousLesTennismen = "SELECT * FROM tennismen";
            Statement statement = conDBtennismen.createStatement();
            lesLignesRecuperees =  statement.executeQuery(reqTousLesTennismen);
        } catch (Exception e) {
            System.out.println("Problème connexion base de donnee " + e.getMessage());
        }

        return lesLignesRecuperees;
    }
}
