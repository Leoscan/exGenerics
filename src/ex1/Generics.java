package ex1;

public class Generics<T> {
	
	private T str;

	
	public Generics(T str) {
		this.str = str;
	}

	public T getStr() { 
		return str; 
	}
	
}
