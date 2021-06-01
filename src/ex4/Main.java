package ex4;

public class Main {

	public static void main(String[] args) {
		Pair<String, String> p1 = new Pair<>("Cod1", "Agua");
		Pair<String, String> p2 = new Pair<>("Cod2", "Cafe");
		Pair<String, String> p3 = new Pair<>("Cod2", "Refrigerante");
		
		Pairs<String, String> lista = new Pairs<>();
		
		System.out.println("Testes ADD:");
		System.out.println(lista.addPair(p1));
		System.out.println(lista.addPair(p2));
		System.out.println(lista.addPair(p3));
		
		System.out.println("\nTestes Busca:");
		System.out.println(lista.buscaKey("Cod2"));
		System.out.println(lista.buscaKey("Cod3"));
		

	}

}
