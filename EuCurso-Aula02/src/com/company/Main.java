package com.company;

public class Main {

	public static void main(String[] args) {
		Pedido pedido01 = new Pedido();
		
		pedido01.adicionaItem("Tênis", 500.0);
		pedido01.adicionaItem("Camisa", 100.0);
		pedido01.adicionaItem("Calça", 150.0);
		
		String[] itens = {"Bermuda", "Chinelo", "Boné"};
		Pedido pedido02 = new Pedido(itens, 500.0);
		
		System.out.println(pedido01.retornaPedidoEValor());
		System.out.println(pedido02.retornaPedidoEValor());
		
//		pedido01.item = "Tênis";
//		pedido01.valorItem = 250.0;
//		
//		System.out.println(pedido01.item + " " + pedido01.valorItem);
		
//		Pedido pedido02 = new Pedido("Camisa", 100);
//		Pedido pedido02 = new Pedido(3500);
//		pedido02.item = "Tênis";
//		pedido02.valorItem = 200.0;
		
//		pedido02.alteraItem("camisa", 100);
		
//		System.out.println(pedido01.retornaValor());
//		System.out.println(pedido02.retornaValor());
		
//		int[] arrayInt = new int[2];		
//		System.out.println(arrayInt[0]);		
//		Integer[] arrayString = new Integer[2];		
//		System.out.println(arrayString[0]);
		
//		if(pedido01.equals(pedido02)) {
//			System.out.println("É igual.");
//		}else {
//			System.out.println("É diferente.");
//		}
		
//		System.out.println();
		
		Impressora impressora = new Impressora();
		
		impressora.imprimiNaTela("Bla bla");
		impressora.imprimiNaTela(251);
		impressora.imprimiNaTela(3.6);

	}

}
