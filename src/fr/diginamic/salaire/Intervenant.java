package fr.diginamic.salaire;

public abstract class Intervenant {
	
	public String nom;
	public String prenom;
	public String status;
	
	


	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public abstract double getSalaire();
	public abstract String getStatus();
	
	public void afficheDonnees() {
		System.out.println("Intervenant [nom=" + nom + ", prenom=" + prenom + ", status=" + getStatus() + ", salaire=" + getSalaire() + "]");
	}

	
	
	
	
	
}
