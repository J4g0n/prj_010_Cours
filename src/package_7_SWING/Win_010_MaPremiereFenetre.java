package package_7_SWING;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ipi on 05/02/2015.
 */
// Cette classe hérite de JFrame donc elle devient un fenetre
public class Win_010_MaPremiereFenetre extends JFrame {
    JLabel lblNom; // Texte non modifiable
    JButton btnQuitter; // Bouton à cliquer
    JPanel panneauPrincipal; // Panneau ou panel
    // constructeur

    public Win_010_MaPremiereFenetre() throws HeadlessException {
        super();
        // on fabrique les composants
        panneauPrincipal = new JPanel();
        lblNom = new JLabel("Hello Everybody");
        btnQuitter = new JButton("Quitter");
        // attacher des composants au panneau
        panneauPrincipal.add(lblNom);
        panneauPrincipal.add(btnQuitter);
        // attacher le panneau principal à la fenetre
        this.setContentPane(panneauPrincipal);
        // régler les propriétés de la fenetre
        // modifiables par le développeur
        this.setTitle("Ma première fanete SWING");
        this.setSize(400, 200); // largeur, hauteur
        this.setResizable(true); // redimensionnable ou pas
        this.setLocationRelativeTo(null); // positionnement par rapport à une autre fenetre
        // ... etc
    }
}
