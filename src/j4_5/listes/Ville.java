package j4_5.listes;

import java.util.ArrayList;

public class Ville {
	
	public String nom;
	public int nbHabitant;
	public Ville(String nom, int nbHabitant) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}
	public Ville() {
		nom = "Nom indéfini";
		nbHabitant=0;
	}
	
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitant=" + nbHabitant + "]";
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
	
	
	
	
	
	
	public static void main(String[] args) {
		ArrayList<Ville> listVilles = new ArrayList();
		listVilles.add(new Ville("Nice", 343000));
		listVilles.add(new Ville("Carcasonne", 47800));
		listVilles.add(new Ville("Narbonne", 53400));
		listVilles.add(new Ville("Lyon", 484000));
		listVilles.add(new Ville("Foix", 9700));
		listVilles.add(new Ville("Pau", 77200));
		listVilles.add(new Ville("Marseille", 850700));
		listVilles.add(new Ville("Tarbes", 40600));
		
		
		
		
		//Affiche ville plus peuplé
		Ville villePlusPeuple = new Ville();
		
		for (Ville ville : listVilles) {
			if (ville.nbHabitant>villePlusPeuple.nbHabitant) {
				villePlusPeuple.nbHabitant =ville.nbHabitant;
				villePlusPeuple.nom =ville.nom;
			}
		}
		
		System.out.println("Ville La plus peuplé : " + villePlusPeuple);

		
		
		//Suppr ville moins peuplé
		Ville villeMoinsPeuple = new Ville(listVilles.get(0).nom, listVilles.get(0).nbHabitant);
		int indexVille=0;
		
		for (int i = 1; i < listVilles.size(); i++) {
			if (listVilles.get(i).nbHabitant<villeMoinsPeuple.nbHabitant) {
				villeMoinsPeuple.nbHabitant =listVilles.get(i).nbHabitant;
				villeMoinsPeuple.nom =listVilles.get(i).nom;
				indexVille = i;
			}
		}

		System.out.println("Ville La moins Peulple : "+villeMoinsPeuple);
		
		listVilles.remove(indexVille);
		
		
		
		// Modif Nom ville <100000 en Maj
		for (int i = 0; i < listVilles.size(); i++) {
			if (listVilles.get(i).nbHabitant>100000) {
				listVilles.get(i).setNom( listVilles.get(i).nom.toUpperCase() );
			}
		}
		
		
		//Affiche liste ville finale
		for (Ville ville : listVilles) {
			System.out.println(ville);
		}
		
		
	}
	
}
