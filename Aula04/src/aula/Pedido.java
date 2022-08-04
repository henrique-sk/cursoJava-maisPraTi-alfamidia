package aula;

import java.util.Arrays;

public class Pedido {
	private Item[] itens = new Item[10];
	private StatusPedido status;
	private double valorTotal;
	
	public Pedido() {
		this.status = StatusPedido.AGUARDANDO;
	}

	public Item[] getItens() {
		return itens;
	}

	public void setItens(Item[] itens) {
		this.itens = itens;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public void adicionarItem(Item item) {
		
		this.setStatus(status.EM_ANDAMENTO);
		for(int i = 0; i < this.itens.length; i++) {
			if(this.itens[i] == null) {
				this.itens[i] = item;
				this.valorTotal += item.getValor();
				break;
			}
		}
	}
	
	public String retornaItens() {
		String itens = "";
		
		for(int i = 0; i < this.itens.length; i++) {
			if (this.itens[i] != null) {
				itens += this.itens[i] + " ,";
			}
		}
		return itens;
	}
	
	
	@Override
	public String toString() {
		return "Pedido [itens=" + this.retornaItens() + "status=" + status + ", valorTotal=" + valorTotal + "]";
	}
	
	
	
}
