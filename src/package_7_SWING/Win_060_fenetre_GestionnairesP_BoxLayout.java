package package_7_SWING;

import javax.swing.*;
import java.awt.*;

public class Win_060_fenetre_GestionnairesP_BoxLayout extends JFrame{
	/*	==================================
		SWING	:	Gestionnaires de placement BoxLayout
		==================================
	 */
	//
	//	Attributs de la fen�tre
	//
	JPanel panneau;
	JButton btn1,btn2,btn3,btn4,btn5,btn6;
	//
	// constructeur
	//
	public Win_060_fenetre_GestionnairesP_BoxLayout() throws HeadlessException {
		super();
		// 
		panneau=new JPanel();
		btn1=new JButton("1");
		btn2=new JButton("2");
		btn3=new JButton("3");
		btn4=new JButton("4");
		btn5=new JButton("5");
		btn6=new JButton("6");
		//	************************************
		//	pr�ciser le gestionnaire de placement (layout) : ici BoxLayout
		//	************************************
		panneau.setLayout(new BoxLayout(panneau, BoxLayout.X_AXIS));	
		//		************************************
		//		cr�er les boutons manuellement et les ajouter au panneau principal
		//		************************************
		btn1.setPreferredSize(new Dimension(100,100));
		btn2.setPreferredSize(new Dimension(50,50));
		panneau.add(btn1);								// associer objets au panneau
		panneau.add(btn2);
		panneau.add(btn3);
		panneau.add(btn4);
		panneau.add(btn5);
		//panneau.add(btn6);	
		//		***********************************
		// 		associer le panneau � la fen�tre
		//		***********************************
		this.setContentPane(panneau);
		//		***********************************
		// 		r�gler les propri�t�s de la fen�tre
		//		***********************************
		this.setTitle("Gestionnare de placement BoxLayout");	// titre de la fen�tre
		this.setSize(500, 300);						// largeur et hauteur de la fen�tre
		this.setResizable(true);					// emp�cher le redimensionnement de la fen
		this.setLocationRelativeTo(null); 			//On centre la fen�tre sur l'�cran
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // si clique sur croix rouge
	}
}
