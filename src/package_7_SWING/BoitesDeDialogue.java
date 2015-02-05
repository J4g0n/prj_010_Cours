package package_7_SWING;

import jdk.nashorn.internal.runtime.regexp.joni.exception.JOniException;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ipi on 05/02/2015.
 */
public class BoitesDeDialogue {
    // Interface graphique  avec SWING
    public static void main (String [] args) {
        //JOptionPane.showMessageDialog(null, "Impression terminée", "Facturation", JOptionPane.INFORMATION_MESSAGE);

        /*int reponse = JOptionPane.showConfirmDialog(null, "Voulez-vous quitter l'application?");

        switch (reponse) {
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(null, "Clic sur Oui");
                System.exit(0);
                break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "Clic sur Non");
                break;
            case JOptionPane.CANCEL_OPTION:
                JOptionPane.showMessageDialog(null, "Clic sur Annuler");
                break;
            default:
        }*/

        // Demander saisie à l'utilisateur
        /*String nom = JOptionPane.showInputDialog(null, "Votre nom");
        if (nom != null && !nom.equals("")) {
            JOptionPane.showMessageDialog(null, "Bonjour " + nom);
        } else {
            JOptionPane.showMessageDialog(null, "Ne soyez pas timide");
        }*/

        /*String [] listeVilles = { "Barcelone", "Londres", "Paris" };
        String ville = (String) JOptionPane.showInputDialog(null, "Choisissez une ville", "Agence voyage", JOptionPane.INFORMATION_MESSAGE, null, listeVilles, listeVilles[1]);
        JOptionPane.showMessageDialog(null, "Bon voyage pour " + ville);*/

        // Sélectionner un fichier
        /*String nomFichier, cheminFichier;
        // je crée un objet sélecteur de fichier
        JFileChooser selecteurFichier = new JFileChooser();
        int retour = selecteurFichier.showOpenDialog(null);
        if (retour == JFileChooser.APPROVE_OPTION) {
            nomFichier = selecteurFichier.getSelectedFile().getName();
            cheminFichier = selecteurFichier.getSelectedFile().getAbsolutePath();
            JOptionPane.showMessageDialog(null, "Fichier sélectionné: " + cheminFichier + nomFichier);
        } else {
            JOptionPane.showMessageDialog(null, "Auncun fichier sélectionné");
        }*/

        // Sélecteur de couleur
        Color couleurChoisie = JColorChooser.showDialog(null, "Choix d'une couleur", Color.BLUE);
        // Tester choix couleur
        if (couleurChoisie != null) {
            JOptionPane.showMessageDialog(null, "Couleur choisie");
        } else {
            JOptionPane.showMessageDialog(null, "Aucune couleur choisie");
        }
    }
}
