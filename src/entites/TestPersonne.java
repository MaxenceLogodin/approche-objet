package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdressePostale adresse1 = new AdressePostale();
		adresse1.numeroDeRue = 4;
		adresse1.libelleDeRueString = "Boulevard Boulay Paty";
		adresse1.codePostale = 44100;
		adresse1.villeString = "Nantes";
		
		AdressePostale adresse2 = new AdressePostale();
		adresse2.numeroDeRue = 62;
		adresse2.libelleDeRueString = "Boulevard Gabriel Lauriol";
		adresse2.codePostale = 44300;
		adresse2.villeString = "Nantes";
		
		
		
		Personne p1 = new Personne();
		p1.nom = "Doe";
		p1.prenom = "John";
		p1.adressePostale = adresse1;
		
		
		Personne p2 = new Personne();
		p2.nom = "Doe";
		p2.prenom = "Jane";
		p2.adressePostale = adresse2;
		
		
	}

}
