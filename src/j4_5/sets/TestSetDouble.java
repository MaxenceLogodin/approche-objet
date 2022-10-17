package j4_5.sets;

import java.util.HashSet;

public class TestSetDouble {
	public static void main(String[] args) {
		HashSet<Double> hash = new HashSet<Double>();
			hash.add(1.5);
			hash.add(8.25);
			hash.add(-7.32);
			hash.add(13.3);
			hash.add(-12.45);
			hash.add(48.5);
			hash.add(0.01);
		
		double max=0;
		double min=0;
		for(double hashTemp : hash) {
			if(max<hashTemp){
				max=hashTemp;
			}
			if(min>hashTemp){
				min=hashTemp;
			}
		}
		System.out.println("valeur max : "+max);
		hash.remove(min);
		System.out.println(hash);
	}
}