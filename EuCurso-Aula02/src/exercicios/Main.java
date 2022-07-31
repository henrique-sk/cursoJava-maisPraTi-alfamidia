//01 - Criar uma classe Jogador que tenha as propriedades nome, gols, assistências.
//E os métodos adicionarGol e adicionarAssistencia que receba como
//argumento as quantidades de gols/assistências.
//Também criar dois métodos para ver o número de gols e assistências

//Criar uma classe aluno que receba um nome, nota1, nota2 e nota3, onde o
//somatório das notas podem chegar no máximo 100.
//nota1 (max 30)
//nota2 (max 30)
//nota3 (max 40)
//Cria um método que retorne o nome do aluno, sua média, a maior e menor
//nota

package exercicios;

public class Main {

	public static void main(String[] args) {
		Jogador jogador01 = new Jogador("Romário");
		Jogador jogador02 = new Jogador("Rivaldo");		
		
		jogador01.adicionaGol(1);
		jogador01.adicionaAssistencia(4);
		jogador02.adicionaGol(0);
		jogador02.adicionaAssistencia(2);
		jogador01.adicionaGol(1);

		System.out.println(jogador01.qtdGols() + " " +
				jogador01.qtdAssistencias());
		System.out.println(jogador02.qtdGols() + " " +
				jogador02.qtdAssistencias());
		
		
		Aluno aluno01 = new Aluno("Julio");
		aluno01.adicionaNota(10);
		aluno01.adicionaNota(20);
		aluno01.adicionaNota(30);
		
		// Ex. com nota que excede o max
		Aluno aluno02 = new Aluno("Ana");
		aluno02.adicionaNota(32);
		aluno02.adicionaNota(32);
		aluno02.adicionaNota(42);
		
//		double[] notas = {12, 20, 31.6};
//		Aluno aluno02 = new Aluno("Ana", notas);		
		
		System.out.println(aluno01.resultadoAluno());
		System.out.println(aluno02.resultadoAluno());
		
		
	}

}
