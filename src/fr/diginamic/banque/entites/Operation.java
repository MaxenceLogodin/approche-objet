package fr.diginamic.banque.entites;

public abstract class Operation {
	
	String date;
	double montant;
	
	
	public Operation(String date, double montant) {
		super();
		this.date = date;
		this.montant = montant;
	}
	
	
	public String toString() {
		return "date de l'opération : "+ date + "\n"+ "montant de l'opération : " + montant+"\n"+"type de l'opération : "+ this.getType();
	}
	
	
	
	
	public abstract String getType();
	
	
}
