package exercicios_correcao.ex03;

public class Contador extends Funcionario {
	
	public Contador(String nome, double valorHora, double totalHoras) {
		super(nome, valorHora, totalHoras);
	}
	
	private final double BONIFICACAO = 0.03;
	
	@Override
	public double valorAReceber() {
		double bonif = (this.valorHora * this.totalHoras) * this.BONIFICACAO;
		return (this.valorHora * this.totalHoras) + bonif;
	}

}
