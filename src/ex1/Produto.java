package ex1;

public class Produto {
	private String nome;
	private String categoria;
	
	public Produto(String nome, String categoria) {
		setNome(nome);
		setCategoria(categoria);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nome Produto: ");
		builder.append(nome);
		builder.append("\nCategoria: ");
		builder.append(categoria);
		return builder.toString();
	}
	
	
	
}
