package fg.models;

public class Personnage {

	public String nom, prenom;
	public int ptsVie, ptsMana;
	
	
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public int getPtsVie() {
		return ptsVie;
	}

	public int getPtsMana() {
		return ptsMana;
	}

	public Personnage(String nom, String prenom, int ptsVie, int ptsMana) {
		this.nom = nom;
		this.prenom = prenom;
		this.ptsVie = ptsVie; 
		this.ptsMana = ptsMana; 
	}
	public void stats() {
		System.out.println(
				"Je suis " + nom + " " + prenom 
				+ " et je possede " 
				+ ptsVie 
				+ " points de vie ainsi que "
				+ ptsMana 
				+ " points de mana ");
	}
	public void cri(){
		System.out.println("Merci de m'avoir invoque !");
	}
	
}
