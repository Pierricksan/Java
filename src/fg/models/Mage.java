package fg.models;

public class Mage extends Personnage implements Berseker, Healer{

	
	public Mage(String race, String nom, String prenom, int ptsVie, int ptsAction) {
		super(race, nom, prenom, ptsVie, ptsAction);
		// TODO Auto-generated constructor stub
	}

	public void afficherStats() {
		System.out.println("Je suis un Mage");
		super.stats();
		
	};
	
	@Override
	public void cri() {
		super.cri();
		System.out.println("Par la magie nous vaincrons !");
	}

	@Override
	public int soigner(Personnage lanceur) {
		System.out.println(" sortilege utilise : 'Avec moi vous ne mourrez pas !' ");
		int soin = 30;
		int ptsVieHealed = lanceur.ptsVie + soin;
		ptsAction -= 1;
		System.out.println(
				nom + " s'est soigne de " + soin + " points de vie et elle/il a maintenant " 
						+ ptsVieHealed + " points de vie \n" + 
						nom + " a " + ptsAction + " point(s) d'action restant(s) \n");
		lanceur.ptsVie = ptsVieHealed;
		return ptsVieHealed;
	};

	@Override
	public int attaquer(Personnage adversaire) {
		System.out.println(" sortilege utilise : EXPLOSION ! ");
		int attaque = 80;
		int ptsVieRestant = adversaire.ptsVie - attaque;
		ptsAction -= 1;
		System.out.println( 
				nom + " a inflige a " + adversaire.getNom() + 
				" une attaque a " + attaque + " de dégats \n " +
				adversaire.getNom() + " a " + ptsVieRestant + " HP \n" + 
				nom + " a " + ptsAction + " point(s) d'action restant(s) \n");
		adversaire.ptsVie = ptsVieRestant;
		return ptsVieRestant;
	};
	
}