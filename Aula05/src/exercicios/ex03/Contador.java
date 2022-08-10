package exercicios.ex03;

public class Contador extends FuncionarioEx03 {
	protected final double BONUS = 0.03;
	
	public Contador(String nome, double valorHora, double totalHoras) {
		super(nome, valorHora, totalHoras);
	}

	@Override
	public double totalAReceber() {
		return (valorHora * totalHoras) * (1 + this.BONUS);
	}
}
