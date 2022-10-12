package fr.diginamic.salaire;

public class Salarie extends Intervenant{
	
	public Salarie(String nom, String prenom, double salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
		this.status = "Salarié";
	}


	public double salaireMensuel;
	

	@Override
	public double getSalaire() {
		return salaireMensuel;
	}


	


	@Override
	public String getStatus() {
		return status;
	}

	
	
	
}
