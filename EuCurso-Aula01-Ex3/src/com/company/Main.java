//3. Um programa que leia o salário bruto de um funcionário e mostre o
//valor liquido.
//Se o salário for menor que R$1.100, o desconto de INSS é 6%
//Até R$2.500, 8%
//Até R$4.800 10%
//Maior que R$ 4.800 15%

package com.company;

import java.util.Scanner;

public class Main {

	public double liquido(double bruto, double desconto) {
		return bruto - (bruto * (desconto/100));
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o salário bruto? R$ ");
		double bruto = entrada.nextDouble();
		
		if(bruto < 1100) {
			System.out.printf("O salário líquido é %.2f. %n", (main.liquido(bruto, 6)));
		}else if(bruto <= 2500) {
			System.out.printf("O salário líquido é %.2f. %n", (main.liquido(bruto, 8)));
		}else if(bruto <= 4800) {
			System.out.printf("O salário líquido é %.2f. %n", (main.liquido(bruto, 10)));
		}else {
			System.out.printf("O salário líquido é %.2f. %n", (main.liquido(bruto, 15)));
		}		
	}
}