package ex1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		
		Generics<String> g1 = new Generics<>(dateFormat.format(date));
		System.out.println(g1.getStr());
		
		
		Produto televisao = new Produto("TV Samsung", "Televisão");
		Generics<Produto> g2 = new Generics<>(televisao);
		
		System.out.println(g2.getStr());

		Marca samsung = new Marca("Samsung");
		Generics<Marca> g3 = new Generics<>(samsung);
		System.out.println(g3.getStr());
		
	}

}
