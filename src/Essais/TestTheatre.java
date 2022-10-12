package Essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		
		
		Theatre theatre1 = new Theatre();
		theatre1.inscrire(100, 10);
		theatre1.inscrire(50, 10);
		theatre1.inscrire(30, 10);
		theatre1.inscrire(10, 10);
		theatre1.inscrire(11, 10);
		
		System.out.println(theatre1);
		
	}

}
