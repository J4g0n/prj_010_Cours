package package_3_POO;

/**
 * Created by ipi on 29/01/2015.
 */
public class Touche {
    private String codeTouche;
    private char caractereRepresente;
    private int positionHorizontale;
    private int positionVerticale;

    public Touche(String codeTouche, char caractereRepresente, int positionHorizontale, int positionVerticale) {
        this.codeTouche = codeTouche;
        this.caractereRepresente = caractereRepresente;
    }

    public String getCodeTouche() {
        return codeTouche;
    }

    public void setCodeTouche(String codeTouche) {
        this.codeTouche = codeTouche;
    }

    public char getCaractereRepresente() {
        return caractereRepresente;
    }

    public void setCaractereRepresente(char caractereRepresente) {
        this.caractereRepresente = caractereRepresente;
    }

    public int getPositionHorizontale() {
        return positionHorizontale;
    }

    public void setPositionHorizontale(int positionHorizontale) {
        this.positionHorizontale = positionHorizontale;
    }

    public int getPositionVerticale() {
        return positionVerticale;
    }

    public void setPositionVerticale(int positionVerticale) {
        this.positionVerticale = positionVerticale;
    }
}
