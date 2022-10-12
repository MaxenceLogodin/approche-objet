package fr.diginamic.entites;

public class Theatre {
	
	public String nom;
	public int capaciteMax;
	public int totalInscrits;
	public double recetteTotale;
	
	public Theatre() {
		nom = "Theatre inconnu";
		capaciteMax = 200;
		totalInscrits = 0;
		recetteTotale= 0;
	}
	
	public Theatre(String nom, int capaciteMax, int totalInscrits, double recetteTotale) {
		super();
		this.nom = nom;
		this.capaciteMax = capaciteMax;
		this.totalInscrits = totalInscrits;
		this.recetteTotale = recetteTotale;
	}

	public void inscrire(int nbClient, double prixPlace) {
		
		if ( totalInscrits+nbClient < capaciteMax ) {
			totalInscrits +=nbClient;
			recetteTotale += nbClient*prixPlace;
			
		} else {
			System.err.println("Capacite max atteinte");
		}
	}
	
		

	@Override
	public String toString() {
		return "Theatre [totalInscrits=" + totalInscrits + ", recetteTotale=" + recetteTotale + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapaciteMax() {
		return capaciteMax;
	}

	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

	public int getTotalInscrits() {
		return totalInscrits;
	}

	public void setTotalInscrits(int totalInscrits) {
		this.totalInscrits = totalInscrits;
	}

	public double getRecetteTotale() {
		return recetteTotale;
	}

	public void setRecetteTotale(double recetteTotale) {
		this.recetteTotale = recetteTotale;
	}

	
	
	

}
