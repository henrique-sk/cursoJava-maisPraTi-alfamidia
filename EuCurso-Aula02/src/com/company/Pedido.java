package com.company;

public class Pedido {
	String[] itens = new String[3];
	double valorTotal;
	
//	public Pedido(String item, double valorItem) {
//		this.item = item;
//		this.valorItem = valorItem;
//	}
	
	// isso é um construtor
	public Pedido() {
		
	}
	
	public Pedido(String item, double valor) {
		this.itens[0] = item;
		this.valorTotal = valor;
	}
	
	public Pedido(String[] itens, double valorTotal) {
		this.itens = itens;
		this.valorTotal = valorTotal;
	}
	
	public void adicionaItem(String item, double valor) {		
		for(int i = 0; i < itens.length; i++) {
			if(this.itens[i] == null) {
				this.itens[i] = item;
				break;
			}			
		}		
		this.valorTotal += valor;
	}
	
	public String retornaItens() {
		String itens = "Itens : {";
		for(int i = 0; i < this.itens.length; i++) {
			if(this.itens[i] != null) {
				itens += this.itens[i] + ", ";
			}			
		}
		return itens.substring(0, itens.length() - 2); // retira últimas duas posições da String
	}
	
	public String retornaPedidoEValor() {
		return this.retornaItens() + "} com o valor total: R$" + this.valorTotal;
	}
	
//	public Pedido(String item) {
//		this.item = item;
//	}
//	
//	public Pedido(double valorItem) {
//		this.valorItem = valorItem;
//	}
//	
//	public double retornaValor() {
//		return valorItem + 10;
//	}
	
	// voide não tem "return"
//	public void alteraItem(String item, double valorItem) {
//		this.item = item;
//		this.valorItem = valorItem;
//	}
	
}
