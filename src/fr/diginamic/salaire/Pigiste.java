package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
	
	public double nbJourTravailles;
	public double remunerationJournaliere;
	

	@Override
	public double getSalaire() {
		return nbJourTravailles*remunerationJournaliere;
	}


	public Pigiste(String nom, String prenom, double nbJourTravailles, double remunerationJournaliere) {
		super(nom, prenom);
		this.nbJourTravailles = nbJourTravailles;
		this.remunerationJournaliere = remunerationJournaliere;
		this.status = "Pigiste";
	}


	
	
	@Override
	public String getStatus() {
		return status;
	}
	
	
	

}
