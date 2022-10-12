package Essais;

import fr.diginamic.formes.Forme;

public class AfficheForme {
	
	public static void afficher(Forme forme) {
		System.out.println("Perimetre : " + forme.calculerPerimetre() + "\n");
		
		System.out.println("Surface : " + forme.calculerSurface() + "\n");
	}

}
