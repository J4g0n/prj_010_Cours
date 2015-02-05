package package_7_SWING;

import java.awt.*;

/**
 * Cette classe contient des valeurs constantes pour configurer
 * l'aspect graphique d'une application
 */
public class Parametre_IHM {
    private static final Color couleurFondFenetre = Color.ORANGE;

    private static final String titreAppli = "Gestion de commandes";

    public static Color getCouleurFondFenetre() {
        return couleurFondFenetre;
    }

    public static String getTitreAppli() {
        return titreAppli;
    }
}
