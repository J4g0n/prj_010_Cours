package package_8_ExercicesSWING.Exercice_0920;


import javax.swing.*;
import java.util.ArrayList;

public class Exercice_0920 {
    public static void main (String [] args) {
        int n = 0, nb = 0, result = 0;

        while (true) {
            String resultat = JOptionPane.showInputDialog(null, "Saisir un nombre entre 0 et 20: ");

            try {
                nb = Integer.parseInt(resultat);
            } catch (NumberFormatException e) {
                System.out.println("Erreur lors du parsing de la chaine, celle-ci ne correspond pas à un entier" + e.getMessage());
                JOptionPane.showMessageDialog(null, "Vous devez entrer un nombre valide", "Erreur parsing", JOptionPane.WARNING_MESSAGE);
                nb = -1;
            }

            if (nb < 0 || nb > 20) {
                JOptionPane.showMessageDialog(null, "Vous devez entrer un nombre entre 0 et 20", "Erreur", JOptionPane.WARNING_MESSAGE);
            } else {
                result += nb;
                n++;
            }

            int choix = JOptionPane.showConfirmDialog(null, "Voulez-vous continuer?");

            if (choix == JOptionPane.NO_OPTION) {
                break;
            }
        }

        JOptionPane.showMessageDialog(null, "La moyenne des " + n + " élèves est de " + result / n + " / 20.");
    }
}
