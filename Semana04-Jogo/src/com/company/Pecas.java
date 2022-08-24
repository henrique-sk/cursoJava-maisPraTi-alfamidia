package com.company;

import java.util.Random;

public class Pecas {
	public int x;
	public int y;
	
	public Pecas() {
		Random aleatorio = new Random();
		this.x = aleatorio.nextInt(10);
		this.y = aleatorio.nextInt(10);	
	}
	
	public double disparo(int x, int y) {
		double distancia = Math.sqrt( Math.pow((x-this.x),2) +
				Math.pow((y-this.y),2));
		return distancia;
	}

}
