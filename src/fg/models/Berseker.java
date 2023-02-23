package fg.models;

public interface Berseker {

	// méthode d'instance pour une compétence d'attaque
	int attaquer(Personnage adversaire);

    static int spell(Personnage adversaire, Personnage lanceur, int degat, String spellName) { 
    	System.out.println("____ sortilege appele : " + spellName + " !");
		int ptsVieRestant = adversaire.ptsVie - degat;
		lanceur.ptsAction -= 1;
		System.out.println( 
				lanceur.getNom() + " a inflige a " + adversaire.getNom() + 
				" une attaque a " + degat + " de degats \n " +
				adversaire.getNom() + " a " + ptsVieRestant + " HP \n" + 
				lanceur.getNom() + " a " + lanceur.getptsAction() + " point(s) d'action restant(s) \n");
		adversaire.ptsVie = ptsVieRestant;
		return ptsVieRestant;
    }
}
