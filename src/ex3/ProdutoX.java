package ex3;

public class ProdutoX {
	private int cod;
	private String nome;
	private String cor;
	
	public ProdutoX(int cod, String nome, String cor) {
		setCod(cod);
		setNome(nome);
		setCor(cor);
	}
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProdutoX [cod=");
		builder.append(cod);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", cor=");
		builder.append(cor);
		builder.append("]");
		return builder.toString();
	}
	
	
}
