package ex4;

import java.util.ArrayList;

public class Pairs <K,V>{
	

	private ArrayList<Pair<K, V>> ListaDPairs = new ArrayList<>();
	

	@SuppressWarnings("hiding")
	public <K, V> boolean addPair(Pair<K, V> p1) {
		int med = 0;
		System.out.println(p1);
		
			for (Pair<K, V> pair : ListaDPairs) {			
				if(Util.compare(p1, pair)) {
					med++;
				}
			}	
		
		System.out.println(med);
		return true;
	}
}
