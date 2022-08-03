package exercicios;

public class Notas {
	private Aluno aluno;
	private double nota1;
	private double nota2;
	private double nota3;
	
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
		
	public Notas(Aluno aluno) {
		this.aluno = aluno;
	}

	public double getNota1() {
		return nota1;
	}
	
	public double getNota2() {
		return nota2;
	}

	public double getNota3() {
		return nota3;
	}
	
	public double somarNotas() {
		double soma = nota1 + nota2 + nota3;
		return soma;
	}
	
//	public String verificaNotas() {		
//		if(this.somarNotas() > 100) {
//			return "Soma das notas é maior que 100.";
//		}
//		
//		
//	}

	public void adicionarNota(double nota, int nrNota) {
		switch(nrNota) {
		case 1:
			if(somarNotas() > 100) {
				System.out.println("Soma das notas é maior que 100.");
			} else {
				this.nota1 = nota;
			}
			break;
		}
	}
	
	
}
