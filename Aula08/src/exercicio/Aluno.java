package exercicio;

public class Aluno {
	private String nome;
	private int matricula;
	private String endereco;
	
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public Aluno(String nome, int matricula, String endereco) {
		this.nome = nome;
		this.matricula = matricula;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", endereco=" + endereco + "]";
	}

}
