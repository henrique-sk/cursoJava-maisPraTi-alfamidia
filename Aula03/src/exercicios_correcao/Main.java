package exercicios_correcao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		>>> Exexcício 1 <<<
//		Crie uma classe Aluno com os campos nome, matrícula e notas[3].
//		Essa classe deve ser encapsulada e no momento de adicionar uma nova nota,
//		ela deve verificar se o somatório será maior que 100, caso for. Deixe uma
//		mensagem que não foi possível e peça para adicionar novamente uma nota.
		
//		int matricula = 0;
//		
//		do {
//			sc.nextLine(); // dar enter para iniciar
//			System.out.println("Qual o nome do aluno? ");
//			String nome = sc.nextLine();
//			System.out.println("Qual a matrícula do aluno? ");
//			matricula = sc.nextInt();
//			
//			if(matricula == 0) {
//				break;
//			}
//			
//			Aluno aluno = new Aluno(nome, matricula);
//			
//			for (int i = 0; i < 3; i++) {
//				System.out.println("Digite nota " + (i+1) + " do aluno: ");
//				double nota = sc.nextDouble();
//				aluno.adicionarNota(nota);
//			}
//			
//			System.out.println(aluno);
//			System.out.println("=====================");
//			
//			
//		}while(matricula != 0);
		
				
//=====================================================
//		>>> Exercício 2 <<<
//		Crie uma classe Pedido com os campos Itens[10], status e valorTotal[3].
//		Essa classe deverá ter os métodos para adicionar itens, que receberá como
//		parâmetro o item e o valor.
//		Também deverá ter um método para alterar o status do pedido.
		
		Calculadora calculadora = new Calculadora();
		
		System.out.println("SOMA");
		System.out.println(calculadora.somar(15, 10));
		System.out.println();
		System.out.println("SUBTRAÇÃO");
		System.out.println(calculadora.subtrair(15, 10));
		System.out.println();
		System.out.println("MULTIPLICAÇÃO");
		System.out.println(calculadora.multiplicar(15, 10));
		System.out.println();
		System.out.println("DIVISÃO");
		System.out.println(calculadora.dividir(15, 10));
		System.out.println();
				
		
//=====================================================
//		>>> Exercício 3 <<<
//		Crie uma classe Calculadora com os métodos das operações matemáticas
//		estáticos.
//		Soma, Subtração, Multiplicação e Divisão.
//		Use essa classe sem instanciar ela.
		
		
		
		
		
		
	}

}
