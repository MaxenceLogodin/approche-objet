package entites2;

import entites.AdressePostale;

public class Personne {

	
	
	public String nom;
	public String prenom;
	public AdressePostale adressePostale;
	
	
	

	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}




	public Personne(String nom, String prenom, AdressePostale adressePostale) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adressePostale = adressePostale;
	}
	
	
	public void afficheNomEtPrenomEnMaj() {
		System.out.println(prenom.toUpperCase() +" "+ nom.toUpperCase());
	}




	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}




	public String getPrenom() {
		return prenom;
	}




	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	public AdressePostale getAdressePostale() {
		return adressePostale;
	}




	public void setAdressePostale(AdressePostale adressePostale) {
		this.adressePostale = adressePostale;
	}
	
	
	
	
	
	
	
	
	
}
