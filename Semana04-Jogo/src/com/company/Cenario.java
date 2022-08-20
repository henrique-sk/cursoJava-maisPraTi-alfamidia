package com.company;

public class Cenario {
	int[][] mapa;

	public Cenario() {
		this.mapa = new int[10][10];
	}
	
	public void desenhaLinha(int[] linha) {
		String strLinha = "";
		for (int celula : linha) {
			strLinha += (celula + " ");
		}		
		System.out.println(strLinha);		
	}
	
	public void desenhaCenario() {
		for (int[] linha : this.mapa) {
			this.desenhaLinha(linha);
		}
	}
	
	
//	public int[][] getPosicoes() {
//		return posicoes;
//	}
//	public void setPosicoes() {
//		for (int row = 0; row < 10; row++) {
//			for (int column = 0; column < 10; column++) {
//				this.posicoes[row][column] = 0;
//			}
//		}
//		
//	}
}
