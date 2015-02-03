package package_5_Persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LireDonneesBDMySql {
	public static void main(String[] args) {
		try {
			// 1) Charger le pilote JDBC en mémoire
			// Class.forName("jdbc:mysql://localhost/bd_chanteurs");
			Class.forName("com.mysql.jdbc.Driver");
			// 2) Se connecter à la base de donnees
			Connection conDBChanteurs = DriverManager.getConnection("jdbc:mysql://localhost/bd_chanteurs", "root", "");
			// 3) Fabriquer la requete sql
			String reqTousLesChanteurs = "SELECT * FROM chanteurs";
			// 4) Exécuter la requete sur la BD
			// 4.1) Fabriquer un objet de type instruction (statement)
			Statement statement = conDBChanteurs.createStatement();
			// 4.2) Récupérer le résultat renvoyé par la BD
			// si requete SELECT, je reçois les lignes de la BD
			// 		je prévois un objet de type ResultSet pour les récupérer
			// si requete INSERT ou UPDATe ou DELETE, je reçois un entier de la BD
			//		nombre de lignes insérées ou modifiées ou supprimées
			ResultSet lesLignesRecuperees =  statement.executeQuery(reqTousLesChanteurs);
			// 4.3) Lire les résultats avec une boucle de lecture des lignes renvoyées par la BD
			// 		si requete select
			while (lesLignesRecuperees.next()) {
				// faire traitement adéquat pour chaque ligne de la table récupérée
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
