package exercicio;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private Professor professor;
	List<Aluno> alunos = new ArrayList<Aluno>();
	
	public Turma(Professor professor) {
		this.professor = professor;
	}
	
	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public String toString() {
		return "Turma [professor=" + professor + ", alunos=" + alunos + "]";
	}	

}
