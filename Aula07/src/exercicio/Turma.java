package exercicio;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private Professor professor;
	List<Aluno> alunos = new ArrayList<Aluno>();
	
	public Turma(Professor professor) {
		this.professor = professor;
	}
	
	public String retornaAlunos() {
		String nomes = "";
		for(Aluno aluno : this.alunos) {
			if (aluno != null) {
				nomes += aluno.getMatricula() + " - " +
			aluno.getNome() + "\n";
			}
		}
		return nomes;
	}
	
	public void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public String mostrarTurma() {
		return "------------------------------------------------------------" +
				"\nTurma de "  + professor.getDisciplina() +
				" do(a) professor(a) " + professor.getNome() + ":" +
				"\n------------------------------------------------------------" +
				"\nMatrícula - Nome" +
				"\n------------------------------------------------------------" +
				"\n" + this.retornaAlunos() +
				"============================================================";
	}	
	
}
