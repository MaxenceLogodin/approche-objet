package fr.diginamic.banque.entites;

public class Compte {
	
	int numeroDeCompte;
	double soldeDeCompte;
	
	
	public Compte(int numeroDeCompte, double soldeDeCompte) {
		super();
		this.numeroDeCompte = numeroDeCompte;
		this.soldeDeCompte = soldeDeCompte;
	}
	
	
	public String toString() {
		return "numéro de compte : "+numeroDeCompte + "\n"+ "solde de compte : " + + soldeDeCompte;
	}
	

}
