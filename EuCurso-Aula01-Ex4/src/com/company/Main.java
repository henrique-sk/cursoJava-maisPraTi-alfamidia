//4. Escreva um algoritmo que calcule a média aritmética das 3 notas dos
//alunos de uma classe. O algoritmo deverá ler, além das notas, o código
//do aluno e deverá ser encerrado quando o código for igual a zero.

package com.company;

import java.util.Scanner;

import com.company.Main;

public class Main {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int resp = 1;
        while (resp != 0) {
            System.out.println("Qual o código do aluno? (0 para encerrar)");
            resp = entrada.nextInt();
            if (resp != 0) {
            	double notas = 0;
            	for(int i = 0; i < 3; i++) {
            		System.out.println("Digite a " + (i+1) + "ª nota: ");
            		notas = notas + entrada.nextDouble();
            	}
            	double media = notas / 3;
            	System.out.printf("A média do aluno é %.2f. %n", media);            	
            }
        }
	}
}