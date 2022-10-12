package Essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		
		CalculMoyenne b = new CalculMoyenne();
		b.ajout(12);
		b.ajout(13);
		b.ajout(14);
		
		System.out.println(b.calcul());
		
		
		
		CalculMoyenne c = new CalculMoyenne();
		c.ajout(12);
		c.ajout(13);
		c.ajout(14);
		c.ajout(15);
		c.ajout(16);
		c.ajout(17);
		c.ajout(18);
		c.ajout(19);
		c.ajout(0);
		c.ajout(8);
		
		
		System.out.println(c.calcul());
		
		
	}

}
