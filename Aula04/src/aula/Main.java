package aula;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Item item1 = new Item("Xis", 25.00);
		Item item2 = new Item("Folhado", 5);
		Item item3 = new Item("Refrigerante", 10.0);
		Item item4 = new Item("Suco", 15);
		Item item5 = new Item("Alaminuta", 25);
		
		Pedido pedido1 = new Pedido();
		
		pedido1.adicionarItem(item1);
		pedido1.adicionarItem(item3);
		pedido1.adicionarItem(item5);
		pedido1.adicionarItem(item5);

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// EXERCICIO: CRIAR UM MÉTODO NA CLASSE PEDIDO PARA REMOVER UM ITEM
		
		pedido1.removeItem(item5);
		pedido1.removeItem(item1);
		
		pedido1.setStatus(StatusPedido.FINALIZADO);
		
		System.out.println(pedido1);
		
	}

}
