package package_8_ExercicesSWING.Exercice_0930;

import javax.swing.*;
import javax.swing.text.html.HTMLDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.*;

public class Win_0930_10 extends JFrame {
    private JPanel jPanel;
    private JComboBox<String> listePays;
    private JComboBox<String> listeVille;
    Map<String, Set<String>> paysVilleMap = new HashMap<String, Set<String>>();

    public Win_0930_10() throws HeadlessException {
        remplirMap();

        jPanel = new JPanel();

        Set<String> pays = paysVilleMap.keySet();
        listePays = new JComboBox<String>();
        for (String p: pays) {
            listePays.addItem(p);
        }
        listePays.addActionListener(handleSelectionVille());

        listeVille = new JComboBox<String>();

        jPanel.add(listePays);
        jPanel.add(listeVille);

        this.setContentPane(jPanel);
        this.setTitle("Choix ville par pays");
        this.setSize(1000, 600); // largeur, hauteur
        this.setResizable(true); // redimensionnable ou pas
    }

    private void remplirMap() {
        String [] villesFrance = { "Paris", "Lyon", "Marseille" };
        String [] villesAllemagne = { "Berlin", "Hambourg", "Munich" };
        String [] villesAngleterre = { "Londres", "Brighton", "Manchester" };
        paysVilleMap.put("France", new TreeSet(Arrays.asList(villesFrance)));
        paysVilleMap.put("Allemagne", new TreeSet(Arrays.asList(villesAllemagne)));
        paysVilleMap.put("Angleterre", new TreeSet(Arrays.asList(villesAngleterre)));
    }

    private Set<String> selectionnerVilles(String nomPays) {
        return paysVilleMap.get(nomPays);
    }

    private ActionListener handleSelectionVille() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                JComboBox comboBox = (JComboBox) event.getSource();

                String selected = (String) comboBox.getSelectedItem();
                System.out.println("Selected Item  = " + selected);

                Set<String> villes = selectionnerVilles(selected);
                listeVille.removeAllItems();
                for (String ville: villes) {
                    listeVille.addItem(ville);
                }
            }
        };
    }
}
