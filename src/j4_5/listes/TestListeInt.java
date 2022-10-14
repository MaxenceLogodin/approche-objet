package j4_5.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TestListeInt {

	public static void main(String[] args) {
		
		ArrayList<Integer> listeEntier = new ArrayList<>();
		listeEntier.addAll(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
		
		for (Integer integer : listeEntier) {
			System.out.println(integer);
		}
		
		System.out.println("Taille de liste : "+listeEntier.size());
		
		
		int max= listeEntier.get(0) ;
		for (int i = 1; i < listeEntier.size(); i++) {
			if (listeEntier.get(i) > max) {
				max = listeEntier.get(i);
			}
		}
		System.out.println("Valeur max dans listeEntier : "+max);
		
//		int minIndex = 0 ;
//		int minValeur = listeEntier.get(0);
//		for (int i = 0; i < listeEntier.size(); i++) {
//			if (listeEntier.get(i) < minValeur) {
//				minValeur = listeEntier.get(i);
//				minIndex = i;
//			}
//		}
//		System.out.println("Index valeur min : "+minIndex);
//		listeEntier.remove(minIndex);
//		
//		for (Integer integer : listeEntier) {
//			System.out.println(integer);
//		}
		
		for (int i = 0; i < listeEntier.size(); i++) {
			if (listeEntier.get(i) < 0) {
				listeEntier.set(i, -listeEntier.get(i) );
			}
		}
		
		for (Integer integer : listeEntier) {
			System.out.println(integer);
		}
		
		
		
		
	}

}
