package model;

public class Conta {
	protected String titular;
	protected double saldo;
	// para constante é uma boa prática usar uppercase
	protected final double LIMITE_EMPRESTIMO = 1000;
	protected final double JUROS = 10;
	
	public Conta(String titular, double valor) {
		this.titular = titular;
		saldo = valor;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimiteEmprestimo() {
		return LIMITE_EMPRESTIMO;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		if(this.saldo - valor >= 0) {
			saldo -= valor;
		}else if((this.saldo + valor) < this.LIMITE_EMPRESTIMO){
			this.saldo -= valor + (valor * (JUROS / 100));
		}
	}

	@Override
	public String toString() {
		return "Conta [titular=" + titular +
				", saldo=" + saldo +
				", limiteEmprestimo=" + LIMITE_EMPRESTIMO + "]";
	}
	
	

}
