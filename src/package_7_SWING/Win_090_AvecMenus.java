package package_7_SWING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Win_090_AvecMenus extends JFrame {
    JMenuBar menuBar;

    JMenu menuFichier;
    JMenu menuAccueil;
    JMenu menuInsertion;

    JMenuItem menuFichierEnregistrer,
              menuFichierEnregistrerSous,
              menuFichierQuitter;

    JMenuItem menuAccueilTableau;

    JMenuItem menuInsertionImage;

    public Win_090_AvecMenus() throws HeadlessException {
        super();
        JPanel panneauPrincipal; // Panneau ou panel

        menuBar = new JMenuBar();

        menuFichier = new JMenu("Fichier");
        menuAccueil = new JMenu("Accueil");
        menuInsertion = new JMenu("Insertion");

        menuFichierEnregistrer = new JMenuItem("Enregistrer");
        menuFichierEnregistrerSous = new JMenuItem("Enregistrer Sous");
        menuFichierQuitter = new JMenuItem("Quitter");
        menuAccueilTableau = new JMenuItem("Tableau");
        menuInsertionImage = new JMenuItem("Insertion");

        // ajout des actions au menu
        menuFichierQuitter.addActionListener(new ActionListener() {
            // Réagir au clic gauche sur le bouton
            @Override
            public void actionPerformed(ActionEvent e) {
                // Traitement à faire lors du clic gauche
                int reponse = JOptionPane.showConfirmDialog(
                        null,
                        "Voulez-vous vraiment quitter?",
                        "Quitter",
                        JOptionPane.WARNING_MESSAGE);

                if (reponse == JOptionPane.OK_OPTION) {
                    System.exit(0);
                }
            }
        });

        // attacher les options aux menus
        menuFichier.add(menuFichierEnregistrer);
        menuFichier.add(menuFichierEnregistrerSous);
        menuFichier.add(menuFichierQuitter);

        menuAccueil.add(menuAccueilTableau);

        menuInsertion.add(menuInsertionImage);

        // attacher les menus à la barre de menu
        menuBar.add(menuFichier);
        menuBar.add(menuAccueil);
        menuBar.add(menuInsertion);

        // attacher la barre de menu à la fenetre
        this.setJMenuBar(menuBar);
        // creer panneau
        panneauPrincipal = new JPanel();
        panneauPrincipal.setBackground(Color.BLACK);

        this.setSize(400, 200); // largeur, hauteur
        this.setResizable(true); // redimensionnable ou pas
    }
}
