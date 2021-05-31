package ex2;

public class Produto<T> {
	private T id;
	private double valor;
	private String dataFabricação;
	private String dataVencimento;
	
	public Produto(T id, double valor, String dataFabricação, String dataVencimento) {
		setId(id);
		setValor(valor);
		setDataFabricação(dataFabricação);
		setDataVencimento(dataVencimento);
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataFabricação() {
		return dataFabricação;
	}

	public void setDataFabricação(String dataFabricação) {
		this.dataFabricação = dataFabricação;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("------------------------");
		builder.append("\nID: ");
		builder.append(id);
		builder.append("\nValor: ");
		builder.append(valor);
		builder.append("\nData de Fabricação: ");
		builder.append(dataFabricação);
		builder.append("\nData de Vencimento: ");
		builder.append(dataVencimento);
		builder.append("\n------------------------");
		return builder.toString();
	}
	
	
	

}
