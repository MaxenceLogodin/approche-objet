package j4_5.listes;

import java.util.ArrayList;
import java.util.Iterator;

public class CreationListe {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> listeEntier = new ArrayList<Integer>();
		
		for (int i = 1; i <= 100; i++) {
			listeEntier.add(i);
		}
		
		System.out.println(listeEntier.size());
		
		for (Integer integer : listeEntier) {
			System.out.println(integer);
		}
		
	}
	
}
