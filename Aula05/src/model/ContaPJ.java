package model;

public class ContaPJ extends Conta{
	
	private final double LIMITE_EMPRESTIMO = 5000;
	private final double JUROS = 5;

	// se a classe pai tiver apenas um construtor,
	// a classe filha tb precisa ter um construtor igual
	public ContaPJ(String titular, double valor) {
		super(titular, valor);
		// esse super seria como um "this"
	}
	
	public void sacar(double valor) {
		if(this.saldo - valor >= 0) {
			saldo -= valor;
		}else if((this.saldo + valor) < this.LIMITE_EMPRESTIMO){
			this.saldo -= valor + (valor * (this.JUROS / 100));
		}
	}

	// Sobreposição
	@Override
	public String toString() {
		// não é necessário o uso do "super."
		return "ContaPJ [titular= " + super.titular +
				", saldo= " + super.saldo +
				", limiteEmprestimo= " + this.LIMITE_EMPRESTIMO + "]";
	}
	
}
