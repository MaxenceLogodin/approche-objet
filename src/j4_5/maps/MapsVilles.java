package j4_5.maps;

import j4_5.listes.Ville;
import java.util.HashMap;
import java.util.Iterator;

public class MapsVilles {
	public static void main(String[] args) {
		HashMap <Ville, String> map = new HashMap <>();
		map.put(new Ville ("Reykjavik",2), "Reykjavik");
		map.put(new Ville ("Stockholm",5), "Stockholm");
		
		HashMap <Ville, String> mapTemp = new HashMap <>();
		int minHab_hab = 100000000;
		String minHab_ville="";
		
/*		map.forEach((u,t) -> {
			if(minHab_hab>u.getNbHabitant()) {
				minHab_hab=u.getNbHabitant();
				minHab_ville=u.getVille();
			}
		});
*/
		//TODO fonctionne mais c'est moche
		for(Ville h : map.keySet()) {//Récupérer le + petit
			if(minHab_hab>h.getNbHabitant()) {
				minHab_hab=h.getNbHabitant();
			}
		}
		for(Ville h : map.keySet()) {//si c'est pas le plus petit → inserer dans mapTemp
			if(minHab_hab==h.getNbHabitant()) {
				minHab_hab=h.getNbHabitant();
				minHab_ville=h.getNom();
			}else {
				mapTemp.put(h, h.getNom());
			}
		}
		
		Ville villeSupp = new Ville(minHab_ville,minHab_hab);
		map.remove(villeSupp, minHab_ville);//fonctionne pas
		
		//
		map.clear();
		map.putAll(mapTemp);
		map.forEach((ville,nom) -> System.out.println(nom));
	}
}