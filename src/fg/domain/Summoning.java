package fg.domain;

import fg.models.*;

import java.util.Random;
import java.util.random.*;

public class Summoning {

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
	
	public static void main(String[] args) {
		
		// générer 3 chiffres randoms 
		// le premier entre 0 et 4 pour savoir qui attaque  
		// le deuxième entre 0 et 4 pour savoir qui défend 
		// un troisième entre 0 1 pour le mage s'il attaque ou s'il se soigne 
		
		// Initialisation des personnages
	    Personnage[] tab = {
	    		new Guerrier("Humain", "Garen", "Demacia", 600, 10),
	    		new Guerrier("Humain", "Darius", "Noxus", 500, 10),
	    		new Mage("Slime", "Slime", "Sama", 450, 10),
	    		new Mage("Ninja", "Uzumaki", "Naruto", 450, 10),
	    		new Soigneur("Chevre", "Soraka", "La banane", 300, 10)
	    };
		
		// initialisation des valeurs randoms/aléatoires
		// utilisation d'une class Math random
		Random r = new Random();
		int tour = 0;
		// selection pour le premier tour
	    Personnage adversaire = tab[r.nextInt(5)];
	    Personnage lanceur = tab[r.nextInt(5)];
	    
	    // vérification des adversaires et lanceurs pour l'initialisation
	    while( lanceur == adversaire) {
	    	adversaire = tab[r.nextInt(5)];  
	    } 
	    // ANNONCE DEBUT DU JEU 
	    affichageWelcome(lanceur.getNom(), 
	    				lanceur.getPrenom(),
	    				adversaire.getNom(),
	    				adversaire.getPrenom());
	    
	    // simulation d'un combat 1vs1 avec une boucle while
	    while (((lanceur.getPtsVie() > 0) && (adversaire.getPtsVie() > 0))) {
            tour = tour + 1;
            System.out.println("TOUR " + tour + "\nPour ce tour : ");
            System.out.println(" ---- Attaquant  : " + lanceur.getNom());
            System.out.println(" ---- Defenseur : " + adversaire.getNom());
            // vérification du taux d'énergie 
            
            if (lanceur.getptsAction() == 0) {
                System.out.println(lanceur.getNom() + " " + lanceur.getPrenom() + " n'a plus de points d'action, il est trop fatigue !\n"
                        + "Il passe son tour !!");
            } else { 
            	// simulation d'attaque ou de soin
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
            
         // simulation d'attaque ou de soin
            /*
            switch (lanceur.getClass().getSimpleName()) {
                case "Mage":
                    int actionMage = r.nextInt(2) + 1;
                    if (actionMage == 1) {
                        ((Berseker) lanceur).attaquer(adversaire);
                    } else {
                        ((Healer) lanceur).soigner(lanceur);
                    }
                    break;
                case "Guerrier":
                    ((Berseker) lanceur).attaquer(adversaire);
                    break;
                case "Soigneur":
                    ((Healer) lanceur).soigner(lanceur);
                    break;
                default:
                    System.out.println("Classe inconnue.");
                    break;
            }
            */
            
          
            if (adversaire.getPtsVie() <= 0) {
            	System.out.println("! FINISH HIM ! \n FATALITY " + adversaire.getNom() + " ne se releve pas !");
                System.out.println("\n" + adversaire.getNom() + " " + adversaire.getPrenom() + " a ete vaincu !" );
                System.out.println(lanceur.getNom() + " " + lanceur.getPrenom() + " est le grand gagnant !" );
                break;
            }
            
            // inversion des rôles
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
