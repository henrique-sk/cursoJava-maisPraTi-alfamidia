package exercicios_correcao.ex03;

public class Administrador extends Funcionario {
	
	public Administrador(String nome, double valorHora, double totalHoras) {
		super(nome, valorHora, totalHoras);
	}

	private final double BONIFICACAO = 0.06;
		
	@Override
	public double valorAReceber() {
		double bonif = (this.valorHora * this.totalHoras) * BONIFICACAO;
		return (this.valorHora * this.totalHoras) + bonif;
	}

}
