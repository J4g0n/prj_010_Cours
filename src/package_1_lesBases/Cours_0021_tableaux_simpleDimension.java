package package_1_lesBases;

public class Cours_0021_tableaux_simpleDimension {

	// méthode main
	public static void main(String[] args) {
		/*	
		 	=============================
		 	déclaration un tableau simple avec initialisation
		 	: dans ce cas : pas besoin de donner le nbre d'éléments
		 	Java calcule qu'il y a 5 éléments
		 	==============================
		 */
		String [] lstnoms1={"dupont","durand","lefaure","Jacquet","benarfa"};
		// j'affiche le 1er élément du tableau
		System.out.println("nom : "+lstnoms1[0]);
		// j'affiche le dernier élément du tableau
		System.out.println("nom : "+lstnoms1[4]);
		/*	
	 	=============================
	 	déclaration un tableau simple sans initialisation
	 	: dans ce cas : il faut préciser le nbre d'éléments du tableau
	 	==============================
		*/
		String [] lstnoms2=new String[5];
		// ... quelques lignes plus loin : je remplis le tableau
		lstnoms2[0]="James";
		lstnoms2[1]="Neymar";
		lstnoms2[2]="Douglas";
		lstnoms2[3]="Pierret";
		lstnoms2[4]="Pan";
		// j'affiche le 3ème élément du tableau
		System.out.println("nom : "+lstnoms2[2]);
	}
}
