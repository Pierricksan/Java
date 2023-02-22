package fg.models;

public class Soigneur extends Personnage {


	public Soigneur(String nom, String prenom, int ptsVie, int ptsMana) {
		super(nom, prenom, ptsVie, ptsMana);
		
	}
	
	public void afficherStats() {
		System.out.println("Je suis un Soigneur");
		super.stats();
		
	};

	@Override
	public void cri() {
		super.cri();
		System.out.println("Avec moi vous ne mourrez pas !");
	}
	
	
}
