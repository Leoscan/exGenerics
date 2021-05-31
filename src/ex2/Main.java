package ex2;

public class Main {

	public static void main(String[] args) {
		Produto<Integer> p1 = new Produto<>(10, 75.50, "30/12/2020", "30/12/2021");
		System.out.println(p1);
		
		Produto<String> p2 = new Produto<>("F35", 75.50, "30/12/2020", "30/12/2021");
		System.out.println(p2);
	}

}
