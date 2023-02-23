package fg.models;

public class Soigneur extends Personnage implements Healer {


	public Soigneur(String race, String nom, String prenom, int ptsVie, int ptsAction) {
		super(race, nom, prenom, ptsVie, ptsAction);
		
	}
	
	public void afficherStats() {
		System.out.println("Je suis un Soigneur");
		super.stats();
		
	};

	@Override
	public void cri() {
		super.cri();
		System.out.println(" Vous avez besoin d'un pansement ?");
	}

	@Override
	public int soigner(Personnage lanceur) {
		System.out.println(nom + " : 'GUERISON !' ");
		int soin = 45;
		int ptsVieHealed = lanceur.ptsVie + soin;
		ptsAction -= 1;
		System.out.println(
				nom + " s'est soigne de " + soin + " points de vie et a maintenant " 
				+ ptsVieHealed + " points de vie \n" + 
				nom + " a " + ptsAction + " point(s) d'action restant(s) \n");
		lanceur.ptsVie = ptsVieHealed;
		return ptsVieHealed;
	};
}
