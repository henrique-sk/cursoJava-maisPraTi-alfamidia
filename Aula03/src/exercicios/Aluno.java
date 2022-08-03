// 1 - Crie uma classe Aluno com os campos nome, matrícula e notas[3].
//Essa classe deve ser encapsulada e no momento de adicionar uma nova nota,
//ela deve verificar se o somatório será maior que 100, caso for. Deixe uma
//mensagem que não foi possível e peça para adicionar novamente uma nota.

package exercicios;

public class Aluno {
	private String nome;
	private int matricula;
	private Notas[] notas = new Notas[3];
	
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
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

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + "]";
	}
	
	
	
	
}

