package ex3;

import java.util.ArrayList;

public class Pedido <T extends ProdutoX> {
	
	private ArrayList<T> ListaProdutos = new ArrayList<>();

	
	public ArrayList<T> getListaProdutos() {
		return ListaProdutos;
	}

	public void setListaProdutos(ArrayList<T> listaProdutos) {
		ListaProdutos = listaProdutos;
	}
	
	public String addLista(T Produto) {
		
		try {
			ListaProdutos.add(Produto);
			return "Adicionado";
		} catch (Exception e) {
			return "Não é possivel adicionar";
		}
	}

}
