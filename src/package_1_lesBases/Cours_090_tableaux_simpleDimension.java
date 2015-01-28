package package_1_lesBases;

public class Cours_090_tableaux_simpleDimension {

	// m�thode main
	public static void main(String[] args) {
		/*	
		 	=============================
		 	d�claration un tableau simple avec initialisation
		 	: dans ce cas : pas besoin de donner le nbre d'�l�ments
		 	Java calcule qu'il y a 5 �l�ments
		 	==============================
		 */
		String [] lstnoms1={"dupont","durand","lefaure","Jacquet","benarfa"};
		// j'affiche le 1er �l�ment du tableau
		System.out.println("nom : "+lstnoms1[0]);
		// j'affiche le dernier �l�ment du tableau
		System.out.println("nom : "+lstnoms1[4]);
		/*	
	 	=============================
	 	d�claration un tableau simple sans initialisation
	 	: dans ce cas : il faut pr�ciser le nbre d'�l�ments du tableau
	 	==============================
		*/
		String [] lstnoms2=new String[5];
		// ... quelques lignes plus loin : je remplis le tableau
		lstnoms2[0]="James";
		lstnoms2[1]="Neymar";
		lstnoms2[2]="Douglas";
		lstnoms2[3]="Pierret";
		lstnoms2[4]="Pan";
		// j'affiche le 3�me �l�ment du tableau
		System.out.println("nom : "+lstnoms2[2]);
	}
}
