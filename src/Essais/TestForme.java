package Essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Forme;
import fr.diginamic.formes.Rectangle;
import fr.diginamic.formes.Cercle;


public class TestForme {

	public static void main(String[] args) {
		
		
		Cercle cercle1 = new Cercle(5);
		Rectangle rectangle1 = new Rectangle(2, 5);
		Carre carre1 =new Carre(5);
		
		AfficheForme.afficher(cercle1);
		AfficheForme.afficher(rectangle1);
		AfficheForme.afficher(carre1);

	}

}
