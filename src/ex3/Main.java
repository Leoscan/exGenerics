package ex3;

public class Main {

	public static void main(String[] args) {
		Cadeira c1 = new Cadeira(1, "Cadeira Decor", "Azul", "Plastico");
		Cama c2 = new Cama(2, "Cama Solteiro", "Branca", "Molas individuais");
		Mochila c3 = new Mochila(89.90, 1);
		
		Pedido p = new Pedido();
		
		System.out.println(p.addLista(c1));
		System.out.println(p.addLista(c2));

		//mochila não extends ProdutoX
		//System.out.println(p.addLista(c3));
		
		System.out.println(p.getListaProdutos());

	}

}
