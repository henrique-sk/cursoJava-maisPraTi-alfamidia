package exercicios.ex03;

public class Administrador extends FuncionarioEx03 {
	protected final double BONUS = 0.06;
	
	public Administrador(String nome, double valorHora, double totalHoras) {
		super(nome, valorHora, totalHoras);
	}

	@Override
	public double totalAReceber() {
		return (valorHora * totalHoras) * (1 + this.BONUS);
	}

}
