package model;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Pessoa implements Banco{
	
	// public para poder ser chamada em verSalarioComComissao
	public static final double COMISSAO = 0.1;
	private double salario;
	List<Veiculo> veiculosAlugados;
	
	public Vendedor(String nome, String email, String cidade, String senha, double salario) {
		super(nome, email, cidade, senha);
		this.salario = salario;
		this.veiculosAlugados = new ArrayList<>();
	}		
	
	public Vendedor(int id, String nome, String email, String senha, double salario) {
		super(id, nome, email, senha);
		this.salario = salario;
		this.veiculosAlugados = new ArrayList<>();
	}

	public double getSalario() {
		return this.salario;
	}

	public List<Veiculo> getVeiculosAlugados() {
		return veiculosAlugados;
	}

	public void setVeiculosAlugados(List<Veiculo> veiculosAlugados) {
		this.veiculosAlugados = veiculosAlugados;
	}
	
}
