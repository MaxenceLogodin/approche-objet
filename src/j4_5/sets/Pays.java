package j4_5.sets;

public class Pays {
	String nom;
	int nbHabitant;
	double pibHab;
	
	public Pays(String nom, int nbHabitant, double pib) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;//en 01/2022
		this.pibHab = pib/nbHabitant;//PIB/hab de 2021 en $US
	}
	@Override
	public String toString() {
		return "Pays:"+nom+", population:"+nbHabitant+", PIB/hab:"+pibHab;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	public double getPibHab() {
		return pibHab;
	}

	public void setPibHab(double pibHab) {
		this.pibHab = pibHab;
	}
	
}