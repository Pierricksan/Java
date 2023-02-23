package fg.utilities;

import fg.models.Personnage;

public class Display {

	public static void affichageWelcome(Personnage lanceur, Personnage adversaire) {
		System.out.println(" ______ BIENVENUE DANS L'ARENE ______ \n vous assistez au plus grand duel de l'histoire \n _________________ \n \n" 
	    		+ adversaire.getNom() + " " + adversaire.getPrenom() + "\n	- VS - \n" 
	    		+ lanceur.getNom() + " " + lanceur.getPrenom()
	    		+ "\n _____  _____ \n"
  	    		);
	};
}
