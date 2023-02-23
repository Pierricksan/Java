package fg.utilities;

public class Display {

	public static void affichageWelcome(
			String lanceurNom, 
			String lanceurPrenom, 
			String adversaireNom, 
			String adversairePrenom) {
		System.out.println(" ______ BIENVENUE DANS L'ARENE ______ \n vous assistez au plus grand duel de l'histoire \n _________________ \n \n" 
	    		+ adversaireNom + " " + adversairePrenom + "\n	- VS - \n" 
	    		+ lanceurNom + " " + lanceurPrenom 
	    		+ "\n _____  _____ \n"
  	    		);
	};
	
}
