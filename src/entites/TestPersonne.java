package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdressePostale adresse1 = new AdressePostale(4, "Boulevard Boulay Paty", 44100, "Nantes");

		AdressePostale adresse2 = new AdressePostale(62, "Boulevard Gabriel Lauriol", 44300, "Nantes");

		Personne p1 = new Personne("Doe", "John", adresse1);
		

		Personne p2 = new Personne("Doe", "Jane", adresse2);
		
		

	}

}
