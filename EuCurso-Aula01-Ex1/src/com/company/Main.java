//1. Escreva um programa para ler 2 valores e escrever o
//maior deles

package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		double val1, val2;
		System.out.println("Entre com o primeiro valor: ");
		val1 = entrada.nextDouble();
		System.out.println("Entre com o segundo valor: ");
		val2 = entrada.nextDouble();
		
		System.out.println("O maior valor é: " + (val1 > val2 ? val1 : val2) + ".");
		
//		if (val1 > val2) {
//			System.out.println("O maior é " + val1 + ".");
//		}else {
//			System.out.println("O maior é " + val2 + ".");
//		}
	}
}
