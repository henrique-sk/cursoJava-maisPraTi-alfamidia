package com.company;

import imc.Imc;

public class Main {

	public static void main(String[] args) {
//		double peso = 80;
//		double altura = 1.80;
//		
//		double imc = ( peso / (altura*altura));
//		System.out.println("O IMC é " + imc);
		
		Imc imc1 = new Imc(80, 1.80);
		imc1.calculaImc();
		System.out.println("O IMC é " + imc1.imc);
	}

}
