package fg.domain;

import fg.models.*;

import java.util.Random;
import java.util.random.*;

public class Summoning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Soigneur healer = new Soigneur("Soraka", "Banane", 2000, 3000);
		Guerrier warrior = new Guerrier("Garen", "Demacia", 6000, 750);
		Mage wizard = new Mage("Veigar", "El Mage", 1100, 6000);
		
		healer.cri();
		healer.afficherStats();
		
		warrior.cri();
		warrior.afficherStats();
		
		wizard.cri();
		wizard.afficherStats();
		
			
		Personnage[] tab = new Personnage[10];
		
		tab[0] = new Guerrier("Xin", "Zhao", 2000, 500);
		tab[1] = new Guerrier("Masse", "Windows", 3200, 300);
		tab[2] = new Guerrier("Maitre", "Yoda", 5600, 500);
		tab[3] = new Guerrier("MarcheCiel","Anakin", 750, 600);
		tab[4] = new Mage("Saint", "Slime", 1100, 6000);
		tab[5] = new Mage("Hatsune", "Miku", 1100, 6500);
		tab[6] = new Mage("Sama", "Hime", 1100, 6800);
		tab[7] = new Mage("Uzumaki", "Naruto", 3200, 10000);
		tab[8] = new Soigneur("Soraka", "Banane", 2500, 3000);
		tab[9] = new Soigneur("Haruno", "Sakura", 2000, 3000);
		
tab[0].attaquer();
		
		for (Personnage element : tab) {
			
			element.stats();
			element.cri();
			
		}
		*/
		
		// généreur 3 chiffres randoms 
		// le premier entre 0 et 4 pour savoir qui attaque  
		// le deuxième entre 0 et 4 pour savoir qui défend 
		// un troisième entre 0 1 pour le mage s'il attaque ou s'il se soigne 
		
		
	    Personnage[] tab = new Personnage[5];
		tab[0] = new Guerrier("Humain", "Garen", "Demacia", 200, 10);
		tab[1] = new Guerrier("Humain", "Darius", "Noxus", 300, 10);
		tab[2] = new Mage("Slime", "Saint", "Slime-sama", 400, 10); 
		tab[3] = new Mage("Ninja", "Uzumaki", "Naruto", 150, 10);
		tab[4] = new Soigneur("Chevre", "Soraka", "La banane", 250, 10);
		
		Random r = new Random();
		
	    Personnage adversaire = tab[r.nextInt(5)];
	    Personnage lanceur = tab[r.nextInt(5)];
	    
	    
	   // System.out.println(lanceur.getNom());
	   //System.out.println(adversaire.getNom());
	    
	    while( lanceur == adversaire) {
	    	adversaire = tab[r.nextInt(5)];  
	  } 
	    int tour = 0;
	    
	    
	    while (((lanceur.getPtsVie() > 0) && (adversaire.getPtsVie() > 0))) {
	    	
	    	tour = tour + 1;
	    	System.out.println("vous etes au tour(s) " + tour + "\nPour ce tour : ");
	    	System.out.println(" ---- le lanceur de l'attaque est  : " + lanceur.getNom());
		    System.out.println(" ---- l'adversaire de l'attaque est : " + adversaire.getNom());
	    	
		    
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

		    Personnage tmp = adversaire; 
	    	adversaire = lanceur; 
	    	lanceur = tmp;
	    	
	    }
	    
	    if (adversaire.getPtsVie() <= 0) {
    		System.out.println("l'adversaire " + 
    				adversaire.getNom() + " " + 
    				adversaire.getPrenom() + 
    				" a ete defait");
    		System.out.println(lanceur.getNom() + " " + lanceur.getPrenom() + " a vaincu !" );
    	} else {
    		System.out.println("le lanceur " + 
    				lanceur.getNom() + " " + 
    				lanceur.getPrenom() + 
    				" a ete defait");
    		System.out.println(adversaire.getNom() + " " + adversaire.getPrenom() + " a vaincu !" );
    	}
	}
}
