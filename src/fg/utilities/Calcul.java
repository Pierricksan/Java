package fg.utilities;
import java.util.Random;

public class Calcul {

	public static int NbrRandom(int max) {
		// sélectionne un nombre entier aléatoire entre 0 et max 
		Random r = new Random();		
        return r.nextInt(max);

	}
	
}
