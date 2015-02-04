package package_6_PersistenceExos;

import package_5_Persistence.EtatSQL;
import package_5_Persistence.ParametresBD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;

/**
 * Created by ipi on 04/02/2015.
 */
public class Exercice0770 {
    public static Connection conDB;

    public static void main (String [] args) {
        try {
            String ligne;
            BufferedReader fichier =
                    new BufferedReader(new FileReader("Ressources/Clients.csv"));

            fichier.readLine();
            while ((ligne = fichier.readLine()) != null) {
                String[] tabLignes = ligne.split(";");
                ecrireClientsDansSQLServer(tabLignes);
            } // fin while

            fichier.close();
        } // fin try
        catch (Exception e) {
            e.printStackTrace();
        } // fin catch

        try {
            String ligne;
            BufferedReader fichier =
                    new BufferedReader(new FileReader("Ressources/Commandes.csv"));

            fichier.readLine();
            while ((ligne = fichier.readLine()) != null) {
                String[] tabLignes = ligne.split(";");
                ecrireCommandesDansSQLServer(tabLignes);
            } // fin while

            fichier.close();
        } // fin try
        catch (Exception e) {
            e.printStackTrace();
        } // fin catch
    }

    public static boolean existeClient(String numClient) {
        String reqCompteClient = "SELECT count(*) AS result FROM clients WHERE numClient=" + numClient + ";";
        boolean result = false;
        ResultSet resultatsBD;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conDB = DriverManager.getConnection("jdbc:sqlserver://S23POSTE19;database=GestionCommerciale", "sa", "batterie");
            Statement statement = conDB.createStatement();
            resultatsBD = statement.executeQuery(reqCompteClient);
            if (resultatsBD.next()) {
                result = resultatsBD.getInt("result") == 1;
            } else {
                result = false;
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur lors de l'execution de la requete" + e.getMessage());
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erreur sql lors de l'execution de la requete" + e.getMessage());
            e.printStackTrace();
        }

        return result;
    }

    public static void ecrireCommandesDansSQLServer(String [] lesLignesRecuperees) {
        try {
            if (existeClient(lesLignesRecuperees[0])) {
                System.out.println("Ajouter commande");
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection conDB = DriverManager.getConnection("jdbc:sqlserver://S23POSTE19;database=GestionCommerciale", "sa", "batterie");
                String reqToutesLesCommandes =
                        "INSERT INTO commandes (numCde, numClient, montant, dateCreation) VALUES (" +
                                lesLignesRecuperees[1] + ", '" +
                                lesLignesRecuperees[0] + "', '" +
                                lesLignesRecuperees[2] + "', " +
                                lesLignesRecuperees[3] +
                                ");";
                Statement statement = conDB.createStatement();
                statement.executeUpdate(reqToutesLesCommandes);
            }
        } catch (Exception e) {
            System.out.println("Problème connexion a base de donnee " + e.getMessage());
        }
    }

    public static void ecrireClientsDansSQLServer(String [] lesLignesRecuperees) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conDB = DriverManager.getConnection("jdbc:sqlserver://S23POSTE19;database=GestionCommerciale", "sa", "batterie");
            String reqToutesLesCommandes =
                    "INSERT INTO clients (numClient, nom, adresse, codePostal, ville) VALUES (" +
                            lesLignesRecuperees[0] + ", '" +
                            lesLignesRecuperees[1] + "', '" +
                            lesLignesRecuperees[2] + "', " +
                            lesLignesRecuperees[3] + ", '" +
                            lesLignesRecuperees[4] +
                            "');";
            Statement statement = conDB.createStatement();
            statement.executeUpdate(reqToutesLesCommandes);
        } catch (Exception e) {
            System.out.println("Problème connexion a base de donnee " + e.getMessage());
        }
    }
}
