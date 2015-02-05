package package_7_SWING;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ipi on 05/02/2015.
 */
public class Win_030_AvecGridLayout extends JFrame{
    JButton btn1,  btn2, btn3, btn4, btn5, btn6; // Bouton à cliquer
    JPanel panneauPrincipal;

    public Win_030_AvecGridLayout() throws HeadlessException {
        super();
        // Construction des composants
        panneauPrincipal = new JPanel();
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");

        // Préciser le gestionnaire de placement
        // ici: aucun
        panneauPrincipal.setLayout(new GridLayout(2, 3));

        // ajouter les composants au panel
        panneauPrincipal.add(btn1);
        panneauPrincipal.add(btn2);
        panneauPrincipal.add(btn3);
        panneauPrincipal.add(btn4);
        panneauPrincipal.add(btn5);
        panneauPrincipal.add(btn6);

        // attacher le panneau à la fenetre
        this.setContentPane(panneauPrincipal);

        this.setTitle("Ma deuxième fenetre SWING");
        this.setSize(400, 200); // largeur, hauteur
        this.setResizable(true); // redimensionnable ou pas
        this.setLocationRelativeTo(null); // positionnement par rapport à une autre fenetre
    }
}
