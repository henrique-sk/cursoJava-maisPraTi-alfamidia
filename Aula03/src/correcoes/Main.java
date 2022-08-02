package correcoes;

public class Main {

	public static void main(String[] args) {
		
		Jogador jogador01 = new Jogador();
		jogador01.adicionarGols(2);
		jogador01.adicionarAssistencias(1);
		jogador01.nome = "João";
		
		jogador01.verGols();
		jogador01.verAssistencias();
		
		System.out.println();
		Jogador jogador02 = new Jogador();
		jogador02.adicionarGols(2);
		jogador02.adicionarAssistencias(1);
		
		jogador02.verGols();
		jogador02.verAssistencias();
		jogador02.nome = "José";
		
		System.out.println();
		
		// if(jogador01.equals(jogador02)) {
		if(jogador01 == jogador02) {
			System.out.println("São iguais");
		} else {
			System.out.println("Não iguais");
		}
		
		Aluno aluno01 = new Aluno("Maria");
//		aluno01.adicionarNota(25, 1);
		aluno01.adicionarNota(30, 2);
		aluno01.adicionarNota(20, 3);
		
//		aluno01.adicionarNota(35, 1);
		
		aluno01.nota1 = 35; // como é publico ele usa o 35 mesmo sendo
							// acima do limite
		
		System.out.println(aluno01);
		
		System.out.println();
		
		Aluno aluno02 = new Aluno("Mauricio");
		aluno02.adicionarNota(30, 1);
		aluno02.adicionarNota(40, 3);
		
		System.out.println(aluno02);
	}

}
