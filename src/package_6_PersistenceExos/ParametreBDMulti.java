package package_6_PersistenceExos;

import package_5_Persistence.EtatSQL;

import java.sql.*;

/**
 * Created by ipi on 04/02/2015.
 */
public class ParametreBDMulti {
    public static void main (String [] args) {
        String query = "SELECT * FROM chanteurs;";

        try {
            changeSGBDR("MY");
            ResultSet result = executeRequeteSQL(query);

            while (result.next()) {
                System.out.println("nom chanteur: " + result.getString("nom"));
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur lors de l'execution de la requete" + e.getMessage());
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erreur sql lors de l'execution de la requete" + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("");

        try {
            changeSGBDR("MS");
            ResultSet result = executeRequeteSQL(query);

            while (result.next()) {
                System.out.println("nom chanteur: " + result.getString("nom"));
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur lors de l'execution de la requete" + e.getMessage());
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erreur sql lors de l'execution de la requete" + e.getMessage());
            e.printStackTrace();
        }
    }

    private static String SGBDR="MS";
    private static final String urlMY = "jdbc:mysql://localhost/bd_chanteurs";
    private static final String userMY = "root";
    private static final String passwordMY = "";
    private static final String driverJMY = "com.mysql.jdbc.Driver";

    private static final String urlMS =
            "jdbc:sqlserver://S23POSTE19;database=bdChanteursSS";
    private static final String userMS = "sa";
    private static final String passwordMS = "batterie";
    private static final String driverJMS =
            "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    private static final String urlOR =
            "jdbc:oracle:thin:@localhost:1521:bd_chanteurs";
    private static final String userOR = "root";
    private static final String passwordOR = "";
    private static final String driverJOR =
            "oracle.jdbc.OracleDriver";

    public static String getSGBDR() {
        return SGBDR;
    }

    public static String getDriverJ() {
        switch(getSGBDR())
        {
            case	"MY":			// Mysql
                return driverJMY;
            case	"MS":
                return driverJMS;		// MS SQL Server
            case	"OR":
                return driverJOR;		// Oracle
            default 	:
                return "";
        }
    }

    public static String getUrl() {
        switch(getSGBDR())
        {
            case	"MY":			// Mysql
                return urlMY;
            case	"MS":
                return urlMS;		// MS SQL Server
            case	"OR":
                return urlOR;		// Oracle
            default 	:
                return "";
        }
    }

    public static String getUser() {
        switch(getSGBDR())
        {
            case	"MY":			// Mysql
                return userMY;
            case	"MS":
                return userMS;		// MS SQL Server
            case	"OR":
                return userOR;		// Oracle
            default 	:
                return "";
        }
    }

    public static String getPassword() {
        switch(getSGBDR())
        {
            case	"MY":			// Mysql
                return passwordMY;
            case	"MS":
                return passwordMS;		// MS SQL Server
            case	"OR":
                return passwordOR;		// Oracle
            default 	:
                return "";
        }
    }

    public static void changeSGBDR(String sgbd) {
        switch (sgbd) {
            case "MY":
                SGBDR = sgbd;
                break;
            case "MS":
                SGBDR = sgbd;
                break;
            case "OR":
                SGBDR = sgbd;
                break;
            default:
                System.out.println("This SGBDR is not supported by our application (try 'OR' for oracle, or 'MY' for mysql, or 'MS' for SQLServer");
        }
    }

    public static EtatSQL executeUpdateSQL(String requete) throws ClassNotFoundException{
        try {
            Class.forName(getDriverJ());
            Connection connexion = DriverManager.getConnection(getUrl(), getUser(), getPassword());
            Statement instruction = connexion.createStatement();
            int resultatTemp = instruction.executeUpdate(requete);
            EtatSQL resultatSQL=new EtatSQL("000","table","OK pour : "+requete);
            return resultatSQL;
        }
        catch (Exception e)
        {
            EtatSQL resultatSQL=new EtatSQL("-100","table","KO pour : "+requete);
            return resultatSQL;
        }
    }

    public static ResultSet executeRequeteSQL(String requete) throws ClassNotFoundException{
        try {
            Class.forName(getDriverJ());
            ResultSet resultat = null;
            Connection connexion = DriverManager.getConnection(getUrl()
                    ,getUser(),getPassword());
            Statement instruction = connexion.createStatement();
            ResultSet resultatTemp = instruction.executeQuery(requete);
            resultat = resultatTemp;
            return resultat;
        }
        catch (Exception e) {
            return null;
        }
    }
}
