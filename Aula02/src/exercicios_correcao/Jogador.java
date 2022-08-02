package exercicios_correcao;

public class Jogador {
	String nome;
	int gols;
	int assistencias;
	
	public void adicionarGols(int gols) {
		this.gols = gols;
	}
	
	public void adicionarAssistencias(int assistencias) {
		this.assistencias = assistencias;
	}
	
	public void verGols() {
		System.out.println("O número de gols: " + this.gols);
	}
	
	public void verAssistencias() {
		System.out.println("O número de assistencias: " + this.assistencias);
	}
	
	public boolean equals(Jogador jogador) {
		return this.gols == jogador.gols && this.assistencias == jogador.assistencias && this.nome == jogador.nome;
	}
}
