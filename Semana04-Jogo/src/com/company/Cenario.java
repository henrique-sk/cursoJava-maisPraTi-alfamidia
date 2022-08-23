package com.company;

public class Cenario {
	int[][] mapa;
	String[] desenhos;

	public Cenario() {
		this.mapa = new int[10][10];
		this.mapa[1][1] = 1;
		this.mapa[2][2] = 2;
		this.desenhos = new String[] {".","X","*"};
	}
	
	public void desenhaLinha(int[] linha) {
		String strLinha = "";
		for (int celula : linha) {
			strLinha += (this.desenhos[celula] + " ");
		}		
		System.out.println(strLinha);		
	}
	
	public void desenhaCenario() {
		for (int[] linha : this.mapa) {
			this.desenhaLinha(linha);
		}
	}
	
	public void disparo(int x, int y) {
		this.mapa[y][x] = 1;
	}
	
	
}
