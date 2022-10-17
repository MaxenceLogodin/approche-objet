package j4_5.sets;

import java.util.HashSet;

public class TestSetString {
	public static void main(String[] args) {
		HashSet<String> hash = new HashSet<>();
			hash.add("USA");
			hash.add("France");
			hash.add("Allemagne");
			hash.add("UK");
			hash.add("Italie");
			hash.add("Japon");
			hash.add("Chine");
			hash.add("Russie");
			hash.add("Inde");
		
		String motLong="";
		for(String hashTemp : hash) {
			if(motLong.length()<hashTemp.length()){
				motLong=hashTemp;
			}
		}
		hash.remove(motLong);
		System.out.println(hash);
	}
}