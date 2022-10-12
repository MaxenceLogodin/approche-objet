package Essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		
		
		Salarie salarie = new Salarie("Jhon","Doe",1500);
		salarie.afficheDonnees();
		
		
		Pigiste pigiste = new Pigiste("Jane","Doe",20,100);
		pigiste.afficheDonnees();
		

	}

}
