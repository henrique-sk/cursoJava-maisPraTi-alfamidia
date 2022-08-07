package exercicio1;

import java.util.Arrays;

public class Aluno {
	private String nome;
	private int matricula;
	private double[] notas = new double[3];
	
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getNotas() {
		double somarNotas = 0;
		for (int i = 0; i < notas.length; i++) {
			somarNotas += notas[i];
		}
		return somarNotas;
	}

	public void adicionarNota(double nota) {
		
		if(notas[2] != 0) {
			System.out.println("Este aluno já possui 3 notas.");
			return;
		}else if(this.getNotas() + nota > 100) {
			System.out.println("Soma maior que 100. Adiocione uma nota novamente.");
			return;
		}else {
			for(int i = 0; i < notas.length; i++) {
				if(notas[i] == 0) {
					notas[i] = nota;
					break;
				}
			}
		}
	}

	@Override
	public String toString() {
		return "Aluno: " + nome +
				"\nMatricula: " + matricula +
				"\nSoma das notas: " + this.getNotas();
	}

}
