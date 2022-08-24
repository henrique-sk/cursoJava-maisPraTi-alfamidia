package com.company;

import java.util.Random;

public class Cenario {
	int[][] mapa;
	String[] desenhos;
	Pecas[] inimigos;

	public Cenario() {
		this.mapa = new int[10][10];
		this.mapa[1][1] = 1;
		this.mapa[2][2] = 2;
		this.desenhos = new String[] {".","X","*","#"};
		this.inimigos = new Pecas[5];
		for(int i = 0; i < 5; i++) {
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
		
		for(int i = 0; i < 5; i++) {
			System.out.println((i+1) + "(" + this.inimigos[i].x + "," +
		this.inimigos[i].y + ")");
		}
	}
	
	public void disparo(int x, int y) {
		double distancia = 100;
		double dist1;
		
		for(Pecas peca : inimigos) {
			dist1 = peca.disparo(x,y);
			distancia = (dist1 < distancia) ? dist1 : distancia;
		}
		System.out.println("Distância é " + distancia);
		this.mapa[y][x] = 1;
	}
	
	
	
}
