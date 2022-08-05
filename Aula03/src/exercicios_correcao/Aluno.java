//		>>> Exexcício 1 <<<
//		Crie uma classe Aluno com os campos nome, matrícula e notas[3].
//		Essa classe deve ser encapsulada e no momento de adicionar uma nova nota,
//		ela deve verificar se o somatório será maior que 100, caso for. Deixe uma
//		mensagem que não foi possível e peça para adicionar novamente uma nota.

package exercicios_correcao;

public class Aluno {
	private String nome;
	private int matricula;
	private double[] notas = new double[3];
	
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
	public double getNotas() {
		
		double somaNotas = 0;
		for(int i = 0; i < notas.length; i++) {
			somaNotas += notas[i];
		}
		return somaNotas;
	}
	
	public void adicionarNota(double nota) {
		
		if(notas[2] != 0) {
			System.out.println("Este aluno já possui as 3 notas.");
			return;
		}else if(this.getNotas() + nota > 100) {
			System.out.println("Não foi possível adicionar esta nova nota. Somatório maior que 100.");
			System.out.println("Adicione uma nota novamente!!");
			return;
		}
		
		for(int i = 0; i < notas.length; i++) {
			if(notas[i] == 0) {
				notas[i] = nota;
				System.out.println("Nota adicionada com sucesso!!");
				break;
			}
		}
		
	}
	
	public double retornaMedia() {
		return this.getNotas() / 3;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\n" +
				"Matrícula: " + this.matricula + "\n" +
				"Somatório das notas: " + this.getNotas() + "\n" +
				"Média: " + this.retornaMedia();
	}
	
	
	
}

