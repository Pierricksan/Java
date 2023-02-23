package fg.models;

public class Personnage {

	protected String nom, prenom, race;
	protected int ptsVie, ptsAction;
	
	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}
	
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}
	
	public int getPtsVie() {
		return ptsVie;
	}

	public int getptsAction() {
		return ptsAction;
	}

	public Personnage(String race, String nom, String prenom, int ptsVie, int ptsAction) {
		this.race = race;
		this.nom = nom;
		this.prenom = prenom;
		this.ptsVie = ptsVie; 
		this.ptsAction = ptsAction; 
	}
	public void stats() {
		System.out.println(
				"PtsVie : " + ptsVie + "\n" + 
				
				
				);
	}
	public void cri(){
		System.out.println("Merci de m'avoir invoque !");
	}
	
}
