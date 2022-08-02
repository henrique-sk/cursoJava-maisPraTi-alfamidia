package aula;

import java.text.DecimalFormat;

public class Aluno {
	private String nome;
	private double nota1;
	private double nota2;
	private double nota3;
	private Professor professor;
	
	private StatusAluno status;
	
	DecimalFormat df = new DecimalFormat("#,###.00");
			
	public Aluno(String nome, Professor professor) {
		this.nome = nome;
		this.professor = professor;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
//	public void setNota1(double nota1) {
//		if(nota1 > 30) {
//			System.out.println("Erro! Nota maior do que o máximo (30)");
//		}else {
//			this.nota1 = nota1;
//		}		
//	}
	
	public double getNota1() {
		return this.nota1;
	}
	
	public double getNota2() {
		return this.nota2;
	}
	
	public double getNota3() {
		return this.nota3;
	}
	
	public void adicionarNota(double nota, int nrProva) {
		switch(nrProva) {
		case 1:
			if(nota > 30) {
				System.out.println("Erro! Nota maior do que o máximo (30)");
			} else {
				this.nota1  = nota;
			}
			break;
		case 2:
			if(nota > 30) {
				System.out.println("Erro! Nota maior do que o máximo (30)");
			} else {
				this.nota2  = nota;
			}
			break;
		case 3:
			if(nota > 40) {
				System.out.println("Erro! Nota maior do que o máximo (40)");
			} else {
				this.nota3 = nota;
			}
		}
	}
	
	public String toString() {
		return ""
				+ "Nome do aluno: " + this.nome
				+ "\n"
				+ "Média do aluno: " + df.format(this.retornaMedia())
				+ "\n"
				+ "Menor nota do aluno: " + df.format(this.retornaMenorNota())
				+ "\n"
				+ "Maior nota do aluno: " + df.format(this.retornaMaiorNota())
				+ "\n"
				+ "Status do aluno: " + this.status.toString().toLowerCase()
				+ "\n"
				+ "Professor: " + this.professor.getNome();
	}
	
	public double retornaMedia() {
		double media = (nota1 + nota2 + nota3) / 3;
		
		if(media < 15) {
			this.status = StatusAluno.REPROVADO;
		}else if(media < 25) {
			this.status = StatusAluno.EM_RECUPERACAO;
		}else {
			this.status = StatusAluno.APROVADO;
		}		
		return media;
	}
	
	public double retornaMenorNota() {
		if(this.nota1 < this.nota2 && this.nota1 < this.nota3) {
			return this.nota1;
		}else if(this.nota2 < this.nota1 && this.nota2 < this.nota3) {
			return this.nota2;
		}else {
			return this.nota3;
		}
	}
	
	public double retornaMaiorNota() {
		if(this.nota1 > this.nota2 && this.nota1 > this.nota3) {
			return this.nota1;
		}else if(this.nota2 > this.nota1 && this.nota2 > this.nota3) {
			return this.nota2;
		}else {
			return this.nota3;
		}
	}
}
