package ex4;

public class Main {

	public static void main(String[] args) {
		Pair<String, String> p = new Pair<>("Cod1", "String");
		Pair<String, String> p2 = new Pair<>("Cod2", "String2");
		
		Pairs lista = new Pairs();
		
		lista.addPair(p);
		lista.addPair(p2);

	}

}
