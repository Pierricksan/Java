package fg.models;

public class Mage extends Personnage {

	
	public Mage(String nom, String prenom, int ptsVie, int ptsMana) {
		super(nom, prenom, ptsVie, ptsMana);
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
}