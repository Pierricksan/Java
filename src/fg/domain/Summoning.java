package fg.domain;

import fg.models.*;

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
		
		Guerrier Garen = new Guerrier("Humain", "Garen", "Demacia", 200, 10);
		Guerrier Darius = new Guerrier("Humain", "Darius", "Noxus", 300, 10);
		
		Garen.attaquer(Darius);
		Darius.stats();
		Garen.stats();
	
	}
}
