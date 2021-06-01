package ex3;

public class Mochila {
	private double preco;
	private int quantidade;
	
	
	public Mochila(double preco, int quantidade) {
		setPreco(preco);
		setQuantidade(quantidade);
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mochila [preco=");
		builder.append(preco);
		builder.append(", quantidade=");
		builder.append(quantidade);
		builder.append("]");
		return builder.toString();
	}
	
	
}
