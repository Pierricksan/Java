package fg.domain;

import fg.models.*;

import java.util.Random;
import java.util.random.*;

public class Summoning {

	public static void main(String[] args) {

	    Personnage[] tab = new Personnage[5];
		tab[0] = new Guerrier("Humain", "Garen", "Demacia", 800, 10);
		tab[1] = new Guerrier("Humain", "Darius", "Noxus", 800, 10);
		tab[2] = new Mage("Slime", "Saint", "Slime-sama", 2000, 10); 
		tab[3] = new Mage("Ninja", "Uzumaki", "Naruto", 1000, 10);
		tab[4] = new Soigneur("Chevre", "Soraka", "La banane", 3000, 10);
		
		Random r = new Random();
		
	    Personnage adversaire = tab[r.nextInt(5)];
	    Personnage lanceur = tab[r.nextInt(5)];

	    while( lanceur == adversaire) {
	    	adversaire = tab[r.nextInt(5)];  
	    } 

	    int tour = 0;
	    
	    while (((lanceur.getPtsVie() > 0) && (adversaire.getPtsVie() > 0))) {
	    		    	
	    	tour = tour + 1;
	    	System.out.println("TOUR " + tour + "\nPour ce tour : ");
	    	System.out.println(" ---- Attaquant  : " + lanceur.getNom());
		    System.out.println(" ---- Defenseur : " + adversaire.getNom());
	    	
		    if (lanceur.getptsAction() == 0) {
	    		System.out.println(lanceur.getNom() + " " + lanceur.getPrenom() + " n'a plus de points d'action, il est trop fatigue !\n"
	    				+ "Il passe son tour !!");
	    	} else { 
	    		
	    		int actionMage = r.nextInt(2) + 1;
	 		    
	 	    	if (lanceur instanceof Mage && actionMage == 1 ) {
	 	    			((Berseker) lanceur).attaquer(adversaire);
	 	    	} else if (lanceur instanceof Mage && actionMage == 2){
	 	    		((Healer) lanceur).soigner(lanceur);
	 	    	} else if (lanceur instanceof Berseker) {
	 		    	((Berseker) lanceur).attaquer(adversaire);
	 		    } 
	 	    	else if (lanceur instanceof Healer) {
	 		    	((Healer) lanceur).soigner(lanceur);
	 		    }
	 	    	
	    	}
	    	
	    	if (adversaire.getPtsVie() <= 0) {
	    		System.out.println(adversaire.getNom() + " " + adversaire.getPrenom() + " a ete vaincu !" );
	    		System.out.println(lanceur.getNom() + " " + lanceur.getPrenom() + " est le grand gagnant !" );
	    		break;
	    	}
	    	
	    	Personnage tmp = adversaire; 
	    	adversaire = lanceur; 
	    	lanceur = tmp;
	    	
	    	if (lanceur.getptsAction() == 0) {
	    		System.out.println("Les 2 joueurs n'ont plus de points d'action !\n"
	    				+ "MATCH NUL !!!");
	    		break;
	    	}
	    }	
	}
}
