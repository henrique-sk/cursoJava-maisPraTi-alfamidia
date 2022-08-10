package exercicios_correcao.ex01;

//>>> Exexcício 1 <<<
//Cria uma classe do tipo Funcionario, com os campos: nome, função e cargo.
//Crie uma lista e adicione 10 objetos do tipo Funcionario dentro dela.
//Depois exiba no console todas informações de cada objeto

public class Funcionario {
	private String nome;
	private String funcao;
	private String departamento;
	
	public Funcionario(String nome, String funcao, String cargo) {
		this.nome = nome;
		this.funcao = funcao;
		this.departamento = cargo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getFuncao() {
		return funcao;
	}
	
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public String getCargo() {
		return departamento;
	}
	
	public void setCargo(String cargo) {
		this.departamento = cargo;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", funcao=" + funcao + ", departamento=" + departamento + "]";
	}
	
}
