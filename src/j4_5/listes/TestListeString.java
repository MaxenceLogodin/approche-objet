package j4_5.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {
		
		ArrayList<String> liste = new ArrayList<>();
		liste.add("Nice");
        liste.add("Carcassonne");
        liste.add("Narbonne");
        liste.add("Lyon");
        liste.add("Foix");
        liste.add("Pau");
        liste.add("Marseille");
        liste.add("Tarbes");
		//(ArrayList<String>) Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");
		
		int longueurNomVille=0;
		int indexNomVillePlusLong=0;
		
		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i).length()>longueurNomVille) {
				longueurNomVille=liste.get(i).length();
				indexNomVillePlusLong = i;
			}
		}
		System.out.println("Index Ville avec nom le plus long : "+indexNomVillePlusLong);
		System.out.println("Longeur du nom le plus long : "+longueurNomVille);
		System.out.println("Nom de la ville avec le plus long nom : " + liste.get(indexNomVillePlusLong));
		
		
		
		
//		Iterator<String> iterator = liste.iterator();
//		while (iterator.hasNext()) {
//			if (iterator.next().charAt(0) == 'N') {
//				iterator.remove();
//			}
//		}
		
		
		for (int i = 0; i < liste.size()-1; i++) {
			if (liste.get(i).charAt(0) == 'N') {
				liste.remove(i--);
			}
		}
		
		for (String string : liste) {
			System.out.println(string);
		}
		
	}

}
