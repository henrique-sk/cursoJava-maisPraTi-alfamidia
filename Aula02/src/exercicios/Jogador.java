//01 - Criar uma classe Jogador que tenha as propriedades nome, gols, assistências.
//E os métodos adicionarGol e adicionarAssistencia que receba como
//argumento as quantidades de gols/assistências.
//Também criar dois métodos para ver o número de gols e assistências

package exercicios;

public class Jogador {
	String nome;
	int gols;
	int assistencias;
	
	
	public Jogador(String nome, int gols, int assistencias) {
        this.nome = nome;
        this.gols = gols;
        this.assistencias = assistencias;
    }
	
	public Jogador(String nome) {
		this.nome = nome;
	}
	
	public void adicionaGol(int gol) {
		this.gols += gol;
	}
	
	public void adicionaAssistencia(int assistencia) {
		this.assistencias += assistencia;
	}
	
	public String qtdGols() {
		return "A quantidade de gols do jogador " + this.nome + " é " + this.gols + ".";
	}
	
	public String qtdAssistencias() {
		return "A quantidade de assistências do jogador " + this.nome + " é " + this.assistencias + ".";
	}
}