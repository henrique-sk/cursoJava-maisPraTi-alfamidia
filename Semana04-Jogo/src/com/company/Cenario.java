package com.company;

import java.util.Random;

public class Cenario {
	int[][] mapa;
	String[] desenhos;
	Pecas[] inimigos;
	int pecasRestantes;
	int tirosRestantes;

	public Cenario() {
		this.pecasRestantes = 5;
		this.tirosRestantes = 25;
		this.mapa = new int[10][10];
//		this.mapa[1][1] = 1; // testes
//		this.mapa[2][2] = 2;
		this.desenhos = new String[] {".","X","*"};
		this.inimigos = new Pecas[this.pecasRestantes];
		for(int i = 0; i < this.pecasRestantes; i++) {
			this.inimigos[i] = new Pecas();
		}
//		this.desenhos = new String[] {".","X","*","#"};
	}
	
	public void desenhaLinha(int[] linha) {
		String strLinha = "";
		for (int celula : linha) {
			strLinha += (this.desenhos[celula] + " ");
		}		
		System.out.println(strLinha);		
	}
	
	public void desenhaCenario() {
//		this.criaPecas();
		for (int[] linha : this.mapa) {
			this.desenhaLinha(linha);
		}
		
		System.out.println("Peças restantes: " + this.pecasRestantes +
				"\nTiros Restantes: " + this.tirosRestantes);
		
		// mostra as peças no console
//		for(int i = 0; i < 5; i++) {
//			System.out.println((i+1) + "(" + this.inimigos[i].x + "," +
//		this.inimigos[i].y + ")");
//		}
	}
	
	public boolean disparo(int x, int y) {
		this.tirosRestantes--;
		double distancia = 100;
		double dist1;
		
		for(Pecas peca : inimigos) {
			if (peca.isVivo()) {
				dist1 = peca.disparo(x,y);
				if (dist1 == 0) {
					this.pecasRestantes--;
				}
				distancia = (dist1 < distancia) ? dist1 : distancia;
			}
		}
		System.out.println("====================================" +
				"\nDistância é " + distancia +
				"\n====================================");
		
		this.mapa[y][x] = (distancia>0) ? 1 : 2;
		
		return ((this.pecasRestantes > 0) && (this.tirosRestantes > 0));
	}
	
	
	
}
