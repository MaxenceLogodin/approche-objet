package j4_5.maps;

import j4_5.listes.Ville;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapsVilles2 {
	public static void main(String[] args) {
		HashMap <String, Ville> map = new HashMap <>();
		map.put("Reykjavik", new Ville ("Reykjavik",2));
		map.put("Stockholm", new Ville ("Stockholm",5));
		
		int minHab_hab = 100000000;
		String minHab_ville="";
		
/*		map.forEach((nom,ville) -> {
			if(minHab_hab>ville.getNbHabitant()) {
				minHab_hab=ville.getNbHabitant();
				minHab_ville=ville.getVille();
			}
		});
*/
		for(Ville h : map.values()) {//si c'est pas le plus petit → inserer dans mapTemp
			if(minHab_hab>=h.getNbHabitant()) {
				minHab_hab=h.getNbHabitant();
				minHab_ville=h.getNom();
			}
		}
		
		map.remove(minHab_ville);
		map.forEach((nom,ville) -> System.out.println(ville));
	}
}