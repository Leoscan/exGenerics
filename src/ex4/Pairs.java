package ex4;

import java.util.ArrayList;
import java.util.Iterator;

public class Pairs <K,V>{
	

	private ArrayList<Pair<K, V>> ListaDPairs = new ArrayList<>();
	


	public boolean addPair(Pair<K, V> p1) {
		int med = 0;
		
		if(ListaDPairs.isEmpty()) {
			ListaDPairs.add(p1);	
			return true;
		} else {
			for (Iterator iterator = ListaDPairs.iterator(); iterator.hasNext();) {	
				Pair<K, V> pair = (Pair<K, V>) iterator.next();
					if(Util.compare(p1, pair)) {
						med++;
					}
			}
			if (med > 0) {
				return false;
			} else {
				ListaDPairs.add(p1);
				return true;
			}
		}
		
	}
	
	public Pair<K, V> buscaKey(K KeyV1){
		for (Iterator iterator = ListaDPairs.iterator(); iterator.hasNext();) {	
			Pair<K, V> pair = (Pair<K, V>) iterator.next();
			if(pair.getKey().equals(KeyV1)) {
				return pair;
			} 
		}
		return null;
	}
	
	
	
	
}
