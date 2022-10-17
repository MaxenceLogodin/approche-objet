package j4_5.tri;

import java.util.Comparator;
import j4_5.listes.Ville;

public class ComparatorHabitant implements Comparator<Ville> {
	@Override
	public int compare(Ville v1, Ville v2) {
		return v1.getNbHabitant()-v2.getNbHabitant();//tri par habitant
	}
}