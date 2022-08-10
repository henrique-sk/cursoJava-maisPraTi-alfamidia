package exercicios_correcao.ex03;

public abstract class Funcionario {
	
	protected String nome;
	protected double valorHora;
	protected double totalHoras;
	
	public Funcionario(String nome, double valorHora, double totalHoras) {
		this.nome = nome;
		this.valorHora = valorHora;
		this.totalHoras = totalHoras;
	}

	public abstract double valorAReceber();
}
