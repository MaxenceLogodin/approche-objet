package j4_5.maps;

import java.util.HashMap;
import java.util.Map;

public class CreationMap {
	public static void main(String[] args) {
		//Q1
		HashMap<String, Double> map = new HashMap<>();
		map.put("Paul",1750D);
		map.put("Hicham",1825D);
		map.put("Yu",1825D);
		map.put("Ingrid",2015D);
		map.put("Chantal",2418D);
		
		//Q2
		System.out.println(map.size());
	}
}