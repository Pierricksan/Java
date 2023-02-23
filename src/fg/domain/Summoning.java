package fg.domain;

import fg.models.*;
import fg.utilities.Calcul;
import fg.utilities.Display;

import java.util.Random;
import java.util.random.*;


public class Summoning {

	public static void main(String[] args) {
		
		// Initialisation des personnages
	    Personnage[] tab = {
	    		new Guerrier("Humain", "Garen", "Demacia", 600, 10),
	    		new Guerrier("Humain", "Darius", "Noxus", 500, 10),
	    		new Mage("Slime", "Slime", "Sama", 450, 10),
	    		new Mage("Ninja", "Uzumaki", "Naruto", 450, 10),
	    		new Soigneur("Chevre", "Soraka", "La banane", 300, 10)
	    };
		
		// initialisation des valeurs randoms/aléatoires
		// selection pour le premier tour
	    Personnage adversaire = tab[Calcul.NbrRandom(5)];
	    Personnage lanceur = tab[Calcul.NbrRandom(5)];
	    
	    // vérification des adversaires et lanceurs pour l'initialisation
	    while( lanceur == adversaire) {
	    	adversaire = tab[Calcul.NbrRandom(5)];  
	    } 
	    // ANNONCE DEBUT DU JEU 
	    Display.affichageWelcome(lanceur, adversaire);
	    
	    // simulation d'un combat 
	    Simulation.mortalKombat(lanceur, adversaire);
	    
	}
}
