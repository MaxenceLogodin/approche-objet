package j4_5.sets;

import java.util.HashSet;

public class TestPays {
	public static void main(String[] args) {
		//TODO Pas fini
		HashSet<Pays> hash = new HashSet<>();
		hash.add(new Pays("USA",334805268,22939*Math.pow(10, 9)));
		hash.add(new Pays("France",65584514,2500*Math.pow(10, 9)));
		hash.add(new Pays("Allemagne",83883587,3567*Math.pow(10, 9)));
		hash.add(new Pays("UK",68497913,3108*Math.pow(10, 9)));
		hash.add(new Pays("Italie",60262779,1782*Math.pow(10, 9)));
		hash.add(new Pays("Japon",125584839,4167*Math.pow(10, 9)));
		hash.add(new Pays("Chine",1448471404,17734*Math.pow(10, 9)));
		hash.add(new Pays("Russie",145805944,1502*Math.pow(10, 9)));
		hash.add(new Pays("Inde",1406631781,2683*Math.pow(10, 9)));
		
		String maxPibHab_Pays="";
		double maxPibHab_PibHab=0;		
		String maxPib_Pays="";
		double maxPib_Pib=0;
		
		for(Pays hashTemp : hash) {
			if(maxPibHab_PibHab<hashTemp.pibHab) {
				maxPibHab_PibHab=hashTemp.pibHab;
				maxPibHab_Pays=hashTemp.nom;
			}
			if(maxPib_Pib<(hashTemp.pibHab*hashTemp.nbHabitant)) {
				maxPib_Pib=(hashTemp.pibHab*hashTemp.nbHabitant);
				maxPib_Pays=hashTemp.nom;
			}
			
		}
		System.out.println("Pays avec le plus grand PIB/hab : "+maxPibHab_Pays);
		System.out.println("Pays avec le plus grand PIB     : "+maxPib_Pays);
		System.out.println(hash);
	}
}