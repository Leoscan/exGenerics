package ex1;

public class Marca {
	private String nome;

	public Marca(String nome) {
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nome Marca: ");
		builder.append(nome);
		return builder.toString();
	}
	
	
	
}
