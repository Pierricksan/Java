package fg.models;

public class Guerrier extends Personnage {

	
	public Guerrier(String nom, String prenom, int ptsVie, int ptsMana) {
		super(nom, prenom, ptsVie, ptsMana);
	}

	public void afficherStats() {
		System.out.println("Je suis un Guerrier");
		super.stats();
		
	};
	
	@Override
	public void cri() {
		super.cri();
		System.out.println("Je serai votre bouclier ! Pour Demacia ");
		
 }
}
