package com.company;

import java.util.Random;

public class Pecas {
	public int x;
	public int y;
	
	private boolean vivo;
	
	public boolean isVivo() {
		return vivo;
	}

	public Pecas() {
		Random aleatorio = new Random();
		this.x = aleatorio.nextInt(10);
		this.y = aleatorio.nextInt(10);
		this.vivo = true;
	}
	
	public double disparo(int x, int y) {
		double distancia = Math.sqrt( Math.pow((x-this.x),2) +
				Math.pow((y-this.y),2));
		if (distancia == 0) this.vivo = false;
		return distancia;
	}

}
