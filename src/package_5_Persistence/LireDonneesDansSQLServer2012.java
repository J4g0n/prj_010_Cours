package package_5_Persistence;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by ipi on 03/02/2015.
 */
public class LireDonneesDansSQLServer2012 {
    public static void main (String [] args) {
        // Pour utiliser la bd sous SQLServer modifier l'attribut SGDR="MS" dans la classe parametreBD
        // puis vérifier nom serveur et nom bd
        // on utilise une classe ParametreBd pour faciliter l'accès à la base de donnee
        String reqTousLesChanteurs = "SELECT * FROM chanteurs";
        try {
            ResultSet resultatsBD = ParametresBD.executeRequeteSQL(reqTousLesChanteurs);
            while (resultatsBD.next()) {
                // faire traitement adéquat pour chaque ligne de la table récupérée
                System.out.println("Chanteur nom: " + resultatsBD.getString(1));
                System.out.println("Chanteur prenom: " + resultatsBD.getString(2));
                System.out.println("Chanteur annee: " + resultatsBD.getInt(3) + "\n");
                JOptionPane.showMessageDialog(null, resultatsBD.getString(1) + "");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur lors de l'execution de la requete" + e.getMessage());
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erreur sql lors de l'execution de la requete" + e.getMessage());
            e.printStackTrace();
        }

        // Ajouter un chanteur dans la BD
        /*String nomSaisi = "Obispo";
        String prenomSaisi = "Pascal";
        int annee = 1345;
        String resAjoutChanteur =
                "insert into chanteurs (nom, prenom, date) values ('" +
                        nomSaisi + "', '" + prenomSaisi + "', '" + annee + "')";
        try {
            EtatSQL etat = ParametresBD.executeUpdateSQL(resAjoutChanteur);
            System.out.println(etat.getCodeEtat() + " - " + etat.getLibelleEtat());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
    }
}
