package fg.models;

import java.util.Random;

public class Simulation{

	public static void mortalKombat(Personnage lanceur, Personnage adversaire) {
		
		Random r = new Random();
		
		int tour = 0;
			// début boucle while 
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
	            }
	            
	            // vérification si l'adversaire n'a plus de points de vie
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
	            
	            // vérification du taux d'énergie des combattants
	            if (lanceur.getptsAction() == 0) {
	                System.out.println("Les 2 joueurs n'ont plus de points d'action !\n"
	                        + "MATCH NUL !!!");
	                break;
	            }
	            
	        } // fin boucle while
	}
}
