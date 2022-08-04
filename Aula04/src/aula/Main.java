package aula;

public class Main {

	public static void main(String[] args) {

		Item item1 = new Item("Xis", 25.00);
		Item item2 = new Item("Folhado", 5);
		Item item3 = new Item("Refrigerante", 10.0);
		Item item4 = new Item("Suco", 15);
		Item item5 = new Item("Alaminuta", 25);
		
		Pedido pedido = new Pedido();
		
		pedido.adicionarItem(item1);
		pedido.adicionarItem(item3);
		pedido.adicionarItem(item5);
		
		System.out.println(pedido);

	}

}
