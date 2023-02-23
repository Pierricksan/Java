package fg.models;

public class Guerrier extends Personnage implements Berseker {

	public Guerrier(String race, String nom, String prenom, int ptsVie, int ptsAction) {
		super(race, nom, prenom, ptsVie, ptsAction);
	}

	public void afficherStats() {
		System.out.println("Je suis un Guerrier");
		super.stats();
	};
	
	@Override
	public int attaquer(Personnage adversaire) {
		System.out.println("prends donc mon Tourbilol");
		int attaque = 125;
		int ptsVieRestant = adversaire.ptsVie - attaque;
		ptsAction -= 1;
		System.out.println( 
				nom + " a inflige a " + adversaire.getNom() + 
				" une attaque a " + attaque + 
				" il lui reste " + ptsVieRestant + 
				nom + " a " + ptsAction + " point(s) d'action restant(s)");
		adversaire.ptsVie = ptsVieRestant;
		return ptsVieRestant;
	};
	

	@Override
	public void cri() {
		super.cri();
		System.out.println("Je serai votre bouclier ! Pour Demacia ");
		
 }

	

}
