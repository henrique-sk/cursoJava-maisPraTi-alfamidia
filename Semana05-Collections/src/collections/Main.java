package collections;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continua = true;
		AlunoBD alunoBD = new AlunoBD();
		
		do {
			System.out.println("Digite a matrícula do aluno: ");
			int matricula = sc.nextInt();
			
			if(matricula == 0 ) {
				continua = false;
				break;
			}
			sc.nextLine();
			System.out.println("Digite o nome do aluno: ");
			String nome = sc.nextLine();
			
			Aluno aluno = new Aluno(matricula, nome);
			alunoBD.salvar(aluno);
			
		} while(continua);
		
		System.out.println("Todos alunos: " + alunoBD.buscarTodos());
		System.out.println("Aluno por matrícula 2020 " + alunoBD.buscarPorMatricula(2020));
		alunoBD.excluirPoratricula(2020);
		System.out.println("Todos alunos: " + alunoBD.buscarTodos());
	}

}
