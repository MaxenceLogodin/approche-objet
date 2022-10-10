package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	double taux = 1.2;

	public CompteTaux(int numeroDeCompte, double soldeDeCompte, double taux) {
		super(numeroDeCompte, soldeDeCompte);
		this.taux = taux;
	}
	
	
	public String toString() {
		return super.toString()+"\n"+"taux : "+taux;
	}

}
