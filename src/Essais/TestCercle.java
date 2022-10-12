package Essais;

import fr.diginamic.entites.Cercle;
import utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		
		Cercle cercle1 = CercleFactory.factoryCercle(5);
		Cercle cercle2 = CercleFactory.factoryCercle(10);

		
		System.out.println("Perimetre de cercle 1 : "+ cercle1.perimetre()+"\n"+"Surface du cercle 1 : "+cercle1.surface());
		System.out.println("Perimetre de cercle 2 : "+ cercle2.perimetre()+"\n"+"Surface du cercle 2 : "+cercle2.surface());
		
		
		
		
	}

}
