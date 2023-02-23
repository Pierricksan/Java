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
		System.out.println("Avec moi vous ne mourrez pas !");
	}

	@Override
	public void soigner() {
		// TODO Auto-generated method stub
		
	}
	
	
}
