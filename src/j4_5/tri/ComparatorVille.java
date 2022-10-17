package j4_5.tri;

import java.util.Comparator;

import j4_5.listes.Ville;
public class ComparatorVille implements Comparator<Ville> {
	@Override
	public int compare(Ville v1, Ville v2) {
		return v1.getNom().compareTo(v2.getNom());//tri par nom de ville
	}
}