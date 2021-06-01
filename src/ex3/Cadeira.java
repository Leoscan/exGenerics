package ex3;

public class Cadeira extends ProdutoX {
	private String material;
	
	public Cadeira(int cod, String nome, String cor, String material) {
		super(cod, nome, cor);
		setMaterial(material);
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cadeira [material=");
		builder.append(material);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
