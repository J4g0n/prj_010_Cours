package package_8_ExercicesSWING.Exercice_0910;


import javax.swing.*;
import java.awt.*;

public class Exercice_0910 {
    public static void main (String [] args) {
        // Sélecteur de couleur
        String resultat = JOptionPane.showInputDialog(null, "Votre nom: ");
        // Tester choix couleur
        if (resultat != null && !resultat.equals("")) {
            JOptionPane.showMessageDialog(null, "Bonjour " + resultat);
        } else {
            JOptionPane.showMessageDialog(null, "Votre nom est personne!!!");
        }
    }
}
