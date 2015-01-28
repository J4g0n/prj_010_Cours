package package_1_lesBases;

public class Cours_100_tableaux_deuxDimensions {

	// m�thode main
	public static void main(String[] args) {
		/*	
		 	=============================
		 	tableau � deux dimensions :
		 	7 lignes 	:	une ligne par jour de semaine
		 	2 colonnes	:	une colonne pour le n� du jour dans la semaine
		 					une colonne pour temp�rature relev�e
		 	==============================
		 */
		int [][] lsttempSemaines={{1,24},{2,18},{3,19},{4,28},{5,17},{6,21},{7,20}};
		
		// ..
		// quelques lignes plus loin
		//	boucle d'affichage des temp�ratures
		for (int i=0;i<7;i++)
		{
			int numJour=lsttempSemaines[i][0];
			switch(numJour)
			{
			case 1:
				System.out.println("Temp�rature du Lundi : "+
						lsttempSemaines[i][1]);
				break;
			case 2:
				System.out.println("Temp�rature du Mardi : "+
						lsttempSemaines[i][1]);
				break;
			case 3:
				System.out.println("Temp�rature du Mercredi : "+
						lsttempSemaines[i][1]);
				break;
			case 4:
				System.out.println("Temp�rature du Jeudi : "+
						lsttempSemaines[i][1]);
				break;
			case 5:
				System.out.println("Temp�rature du Vendredi : "+
						lsttempSemaines[i][1]);
				break;
			case 6:
				System.out.println("Temp�rature du Samedi : "+
						lsttempSemaines[i][1]);
				break;
			case 7:
				System.out.println("Temp�rature du Dimanche : "+
						lsttempSemaines[i][1]);
				break;
			}
		}
	}
}
