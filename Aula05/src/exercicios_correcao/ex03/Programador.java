package exercicios_correcao.ex03;

public class Programador extends Funcionario {
	
	public Programador(String nome, double valorHora, double totalHoras) {
		super(nome, valorHora, totalHoras);
	}

	private final double BONIFICACAO = 0.05;
		
	@Override
	public double valorAReceber() {
		double bonif = (this.valorHora * this.totalHoras) * this.BONIFICACAO;
		return (this.valorHora * this.totalHoras) + bonif;
	}

}
