package aula;

import java.util.Objects;

public class Professor {
	private String nome;
	private String materia;
	private Aluno[] alunos = new Aluno[10];
	
	// RCmouse - Source - Generate Constructor using fields
	public Professor(String nome, String materia) {
//		super();
		this.nome = nome;
		this.materia = materia;
	}
	
	public void adicionarAluno(Aluno aluno) {
		for(int i = 0; i < alunos.length; i++) {			
			if(alunos[i] == null) {
				alunos[i] = aluno;
				break;
			}
		}
	}
	
	public String verAlunos() {
		String alunos = "";
		
		for(int i = 0; i < this.alunos.length; i++) {
			if(this.alunos[i] != null) {
				alunos += this.alunos[i].getNome() + ", ";
			}
		}
		return alunos.substring(0, alunos.length() - 2); // retorna sem as últimas 2 posições da string
	}
	
	// RCmouse - Source - Generate get/set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	// RCmouse - Source - Generate toString
	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", materia=" + materia + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(materia, nome);
	}
	
	// RCmouse - Source - hashCode() and equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		return Objects.equals(materia, other.materia) && Objects.equals(nome, other.nome);
	}	
	
}
