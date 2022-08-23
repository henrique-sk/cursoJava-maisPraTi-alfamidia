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
		Aluno aluno03 = new Aluno("Carolina Bezerra", 85212, "Rua Teodoro, 6");
		Aluno aluno04 = new Aluno("Antonio Gomes", 48842, "Rua Potiguá, 56");
		Aluno aluno05 = new Aluno("Gisele Castilhos", 49742, "Rua Pompéia, 885");
		Aluno aluno06 = new Aluno("Pedro Rodrigues", 48231, "Rua 3, 86");
		
		Professor professor01 = new Professor("Alberto da Silva", "Matemática");
		Professor professor02 = new Professor("Jéssica Tavares", "Física");
		Professor professor03 = new Professor("Amélia Dorneles", "Química");
		
		Turma turma01 = new Turma(professor02);
		Turma turma02 = new Turma(professor01);
		Turma turma03 = new Turma(professor03);
		turma01.adicionarAluno(aluno01);
		turma01.adicionarAluno(aluno02);
		turma01.adicionarAluno(aluno05);
		turma01.adicionarAluno(aluno06);
		turma02.adicionarAluno(aluno03);
		turma02.adicionarAluno(aluno04);
		turma02.adicionarAluno(aluno06);
		turma03.adicionarAluno(aluno01);
		turma03.adicionarAluno(aluno02);
		turma03.adicionarAluno(aluno05);
		
		System.out.println(turma01.mostrarTurma());
		System.out.println(turma02.mostrarTurma());
		System.out.println(turma03.mostrarTurma());
		
	}

}
