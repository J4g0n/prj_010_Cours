package package_7_SWING;

import javax.swing.*;
import java.awt.*;


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

        menuBar = new JMenuBar();

        menuFichier = new JMenu("Fichier");
        menuAccueil = new JMenu("Accueil");
        menuInsertion = new JMenu("Insertion");

        menuFichierEnregistrer = new JMenuItem("Enregistrer");
        menuFichierEnregistrerSous = new JMenuItem("Enregistrer Sous");
        menuFichierQuitter = new JMenuItem("Quitter");
        menuAccueilTableau = new JMenuItem("Tableau");
        menuInsertionImage = new JMenuItem("Insertion");

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

        this.setSize(400, 200); // largeur, hauteur
        this.setResizable(true); // redimensionnable ou pas
    }
}
