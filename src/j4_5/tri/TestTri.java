package j4_5.tri;

import java.util.ArrayList;
import java.util.Collections;

import j4_5.listes.Ville;

public class TestTri {
	public static void main(String[] args) {
		ArrayList<Ville> liste = new ArrayList<Ville>();
			liste.add(new Ville("Nice", 343000));
			liste.add(new Ville("Carcasonne", 47800));
			liste.add(new Ville("Narbonne", 53400));
			liste.add(new Ville("Lyon", 484000));
			liste.add(new Ville("Foix", 9700));
			liste.add(new Ville("Pau", 77200));
			liste.add(new Ville("Marseille", 850700));
			liste.add(new Ville("Tarbes", 40600));
		
		Collections.sort(liste);//utilise compareTo
		System.out.println(liste);
		Collections.sort(liste,new ComparatorHabitant());//utilise compare de ComparatorHabitant
		System.out.println(liste);
		Collections.sort(liste,new ComparatorVille());//utilise compare de ComparatorVille
		System.out.println(liste);
	}
}