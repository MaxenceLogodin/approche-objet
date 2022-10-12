package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {
	
	public static void main(String[] args) {
		
		
		String chaine = "Durand;Marcel;2 523.5";
		
		
		System.out.println("Premier caractère: " + chaine.charAt(0));
		
		System.out.println("Longueur de la chaine : "+ chaine.length());
		
		System.out.println("Premier ';' de la chaine : "+ chaine.indexOf(';'));
		
		System.out.println("Nom de famille avec substring : "+ chaine.substring(0,chaine.indexOf(';')));
		
		String nomDeFamile = chaine.substring(0,chaine.indexOf(';'));
		
		System.out.println("Nom de famille en majuscule : "+nomDeFamile.toUpperCase());
		
		System.out.println("Nom de famille en miniscule : "+nomDeFamile.toLowerCase());
		
		String[] tabChaine = chaine.split(";");
		tabChaine[2] = tabChaine[2].replaceAll("\\s", "");
				
		for (String string : tabChaine) {
			System.out.println(string);
			
		}
		
		
		Salarie salarie1 = new Salarie(tabChaine[0], tabChaine[1], Double.parseDouble(tabChaine[2]));
		
	}
	
	
	

}
