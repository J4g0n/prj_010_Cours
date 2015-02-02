package package_4_POOexos.Exercice0570;

import java.util.Date;

public class Exercice0570 {
    public static void main (String [] args) {
        Grade grade = new Grade('c', "depanneur", 15/100);
        Employe employe = new Employe(3, "Clément Polin", grade, "01/03/2009");
        Intervention [] interventions = new Intervention[500];
        interventions[0] = new Intervention(4, new Date(2015, 1, 5), 2, 10.99, employe);
        interventions[1] = new Intervention(5, new Date(2015, 1, 7), 4, 9.15, employe);
        interventions[2] = new Intervention(6, new Date(2015, 1, 12), 1, 13.50, employe);
        Client client = new Client(1, "Simon Andreux", "5 rue des bois", "51100", "Bétheny", 100);
        Contrat contrat = new Contrat(2, "24/12/2014", client, 172.37, interventions, 3);


    }
}
