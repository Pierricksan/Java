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
	public void soigner(int ptsVie) {
		// TODO Auto-generated method stub
		ptsVie 
	}

	@Override
	public void attaquer() {
		// TODO Auto-generated method stub
		
	}
}