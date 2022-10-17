package j4_5.maps;

import java.util.HashMap;

public class CreationEtManipulationMap {
	public static void main(String[] args) {
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");

		//Q1
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		//Q2
		mapVilles.forEach((codePostal, prefecture) -> System.out.println(codePostal));
		//Q3
		mapVilles.forEach((codePostal, prefecture) -> System.out.println(prefecture));
		//Q4
		System.out.println("Taille de map : "+mapVilles.size());
	}
}