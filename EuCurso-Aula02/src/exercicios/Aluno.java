package exercicios;

public class Aluno {
	String nome;
	double[] notas = new double[3];
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
//	public Aluno(String nome, double nota) {
//		this.nome = nome;
//		this.notas[0] = nota;
//	}
//	
//	public Aluno(String nome, double[] notas) {
//		this.nome = nome;
//		this.notas = notas;
//	}
		
	public void adicionaNota(double nota) {
		for(int i = 0; i < notas.length; i++) {
			if(this.notas[i] == 0) {
				if (i < 2 && nota > 30) {
					this.notas[i] = 30;
					break;
				} else if (i == 2 && nota > 40) {
					this.notas[i] = 40;
					break;
				} else {
				this.notas[i] = nota;
				break;			
				}
			}
		}
	}
	
	public String resultadoAluno() {
		double soma = 0, maior = 0, menor = 0;
		for (int i = 0; i < notas.length; i++) {
			soma += this.notas[i];
			if (i == 0) {
				maior = notas[i];
				menor = notas[i];
			}else {
				if(notas[i] > maior) {
					maior = notas[i];
				}
				if(notas[i] < menor) {
					menor = notas[i];
				}
			}
		}		
		return "O(A) aluno(a) " + this.nome +
				" ficou com média " + (soma/3) +
				". Sua maior nota foi " + maior +
				" e a menor nota foi " + menor + ".";
	}
	
}
