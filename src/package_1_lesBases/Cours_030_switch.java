package package_1_lesBases;

public class Cours_030_switch {

	public static void main(String[] args) {
		// tester avec switch
		/*int moyenne = 13;
		switch (moyenne) {
			case 0:
				System.out.println("C'est la catastrophe");
				break;
			case 10: 
				System.out.println("Passable");
				break;
			case 20:
				System.out.println("Excellent");
				break;
			default: 
				System.out.println("Encourageant");
		}
		System.out.println("Impression bulletin");*/
		
		String moment = "jour";
		
		switch (moment) {
			case "jour": 
				System.out.println("Je me balade");
				break;
			case "soir": 
				System.out.println("Je vais au ciné");
				break;
			case "nuit": 
				System.out.println("Je dors");
				break;
			default: 
		}
	}

}
