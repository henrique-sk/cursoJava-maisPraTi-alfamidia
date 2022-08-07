package exercicio1;

public class Main {

	public static void main(String[] args) {
//		>>> Exexcício 1 <<<
//		Crie uma classe Aluno com os campos nome, matrícula e notas[3].
//		Essa classe deve ser encapsulada e no momento de adicionar uma nova nota,
//		ela deve verificar se o somatório será maior que 100, caso for. Deixe uma
//		mensagem que não foi possível e peça para adicionar novamente uma nota.

		Aluno aluno01 = new Aluno("Raul", 65);
		aluno01.adicionarNota(25);
		aluno01.adicionarNota(35);
		aluno01.adicionarNota(20);
		
		
		System.out.println(aluno01);
		
		

	}

}
