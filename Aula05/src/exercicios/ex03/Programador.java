package exercicios.ex03;

public class Programador extends FuncionarioEx03 {
	protected final double BONUS = 0.05;
	
	public Programador(String nome, double valorHora, double totalHoras) {
		super(nome, valorHora, totalHoras);
	}

	@Override
	public double totalAReceber() {
		return (valorHora * totalHoras) * (1 + this.BONUS);
	}

}
