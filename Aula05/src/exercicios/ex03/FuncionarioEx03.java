package exercicios.ex03;

// >>> Exexcício 3 <<<
// Crie uma classe abstrata Funcionário que tenha os campos: nome, valorHora, totalHoras.
// Esta classe também deve ter o método abstrato para retornar o valor total a receber.
// Depois crie algumas classes que estendem a classe Funcionario
// Todas classes filhas devem ter um campo constante com o valor de bonificação e a partir
// deste campo, fazer o cálculo do total a receber.
//
// programador 5% (0.05), contador 3% (0.03), administrador 6% (0.06).

public abstract class FuncionarioEx03 {
	protected String nome;
	protected double valorHora;
	protected double totalHoras;	
	
	public FuncionarioEx03(String nome, double valorHora, double totalHoras) {
		super();
		this.nome = nome;
		this.valorHora = valorHora;
		this.totalHoras = totalHoras;
	}

	public abstract double totalAReceber();

	@Override
	public String toString() {
		return "FuncionarioEx03 [nome=" + nome +
				", valorHora=R$" + valorHora +
				", totalHoras=" + totalHoras +
				", totalAReceber=R$" + totalAReceber() +
				"]";
	}	

}
