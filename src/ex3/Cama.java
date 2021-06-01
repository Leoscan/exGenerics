package ex3;

public class Cama extends ProdutoX {
	private String caracteristica;
	
	public Cama(int cod, String nome, String cor, String caracteristicas) {
		super(cod, nome, cor);
		setCaracteristica(caracteristicas);
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cama [caracteristica=");
		builder.append(caracteristica);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
}
