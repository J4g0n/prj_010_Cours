package package_7_SWING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ipi on 05/02/2015.
 */
public class Win_070_ListenerInterne_clic extends JFrame {
    JLabel lblNom; // Texte non modifiable
    JButton btnQuitter; // Bouton à cliquer
    JPanel panneauPrincipal; // Panneau ou panel
    // constructeur

    public Win_070_ListenerInterne_clic() throws HeadlessException {
        super();
        // on fabrique les composants
        panneauPrincipal = new JPanel();
        lblNom = new JLabel("Hello Everybody");
        btnQuitter = new JButton("Quitter");
        // ajouter un listener au bouton
        btnQuitter.addActionListener(new ActionListener() {
            // Réagir au clic gauche sur le bouton
            @Override
            public void actionPerformed(ActionEvent e) {
                e.getActionCommand();
            }
        });

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
