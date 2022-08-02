package aula;

public class Main {

	public static void main(String[] args) {
		
		Professor professor01 = new Professor("Cristiano", "JAVA");
		
		Aluno aluno01 = new Aluno("José", professor01);
		Aluno aluno02 = new Aluno("Mario", professor01);
		Aluno aluno03 = new Aluno("Ana", professor01);
		Aluno aluno04 = new Aluno("Miguel", professor01);
		Aluno aluno05 = new Aluno("Lorena", professor01);
		
		professor01.adicionarAluno(aluno01);
		professor01.adicionarAluno(aluno02);
		professor01.adicionarAluno(aluno03);
		professor01.adicionarAluno(aluno04);
		professor01.adicionarAluno(aluno05);
		
		System.out.println(professor01.verAlunos());
		
//		aluno01.adicionarNota(20, 1);
//		aluno01.adicionarNota(30, 2);
//		aluno01.adicionarNota(40, 3);
		
//		System.out.println(aluno01);
		
//		aluno01.adicionarNota(30, 1);
//		aluno01.setNota1(200);
		
//		System.out.println(aluno01.getNota1());
		
		// antes do static
//		Calculadora calculadora = new Calculadora();		
//		System.out.println(calculadora.divide(10, 2));
		
//		System.out.println(Calculadora.divide(10, 2));
//		
//		System.out.println(Calculadora.PI);
	}

}
