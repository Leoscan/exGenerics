package ex4;

public class Util {
	public static <K, V> boolean compare(Pair<K, V> p1, Pair <K, V> p2) {
		return p1.getKey().equals(p2.getKey());
	}
}
