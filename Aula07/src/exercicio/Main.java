package exercicio;

public class Main {
	
//	Criar as classes Aluno e Professor e Turma.
//	A classe deve ter os campos: nome, matrícula, endereço. Com nome e
//	matrícula sendo obrigatórios.
//	O professor deve ter os campos: nome, disciplina.
//	A classe Turma deve ter um Professor e uma lista de alunos. É um método
//	para adicionar aluno e outro para mostrar todos os alunos e o professor.
	
	public static void main(String[] args) {
		
		Aluno aluno01 = new Aluno("João Pedro", 45212);
		aluno01.setEndereco("Rua das Camélias, 896");
		Aluno aluno02 = new Aluno("Camila Santino", 48512, "Rua das Amoras, 876");
		System.out.println(aluno01);
		System.out.println(aluno02);
		
	}

}
