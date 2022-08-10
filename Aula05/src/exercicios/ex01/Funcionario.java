package exercicios.ex01;

// >>> Exexcício 1 <<<
// Cria uma classe do tipo Funcionario, com os campos: nome, função e cargo.
// Crie uma lista e adicione 10 objetos do tipo Funcionario dentro dela.
// Depois exiba no console todas informações de cada objeto

public class Funcionario {
	private String nome;
	private String funcao;
	private String cargo;
	
	public Funcionario(String nome, String funcao, String cargo) {
		super();
		this.nome = nome;
		this.funcao = funcao;
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Funcionário: " + nome +
				"\nFuncao: " + funcao +
				" Cargo: " + cargo + ".\n";
	}

}
