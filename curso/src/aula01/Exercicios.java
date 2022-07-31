package aula01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
//		---------------------------------------------------------------------		
//		1. Escreva um programa para ler 2 valores e escrever o
//		maior deles
		double val1, val2;
		System.out.println("Entre com o primeiro valor: ");
		val1 = entrada.nextDouble();
		System.out.println("Entre com o segundo valor: ");
		val2 = entrada.nextDouble();
		
		System.out.println("O maior valor é: " + (val1 > val2 ? val1 : val2) + ".");
		
//		---------------------------------------------------------------------		
//		2. As maçãs custam R$ 0,30 cada se forem compradas menos
//		do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze.
//		Escreva um programa que leia o número de maçãs compradas,
//		calcule e escreva o valor total da compra.		
		System.out.println("Quantas maçãs quer comprar? ");
		int qtd = entrada.nextInt();
		
		if(qtd < 12) {
			System.out.printf("O valor total da compra é R$ %.2f. %n", (qtd * 0.3));
		}else {
			System.out.printf("O valor total da compra é R$ %.2f. %n", (qtd * 0.25));
		}
		
//		---------------------------------------------------------------------	
//		3. Um programa que leia o salário bruto de um funcionário e mostre o
//		valor liquido.
//		Se o salário for menor que R$1.100, o desconto de INSS é 6%
//		Até R$2.500, 8%
//		Até R$4.800 10%
//		Maior que R$ 4.800 15%
		System.out.println("Qual o salário bruto? R$ ");
		double bruto = entrada.nextDouble();
		
		if(bruto < 1100) {
			System.out.printf("O salário líquido é R$ %.2f. %n", (bruto - (bruto * 6/100)));
		}else if(bruto <= 2500) {
			System.out.printf("O salário líquido é %.2f. %n", (bruto - (bruto * 8/100)));
		}else if(bruto <= 4800) {
			System.out.printf("O salário líquido é %.2f. %n", (bruto - (bruto * 10/100)));
		}else {
			System.out.printf("O salário líquido é %.2f. %n", (bruto - (bruto * 15/100)));
		}
		
//		---------------------------------------------------------------------
//		4. Escreva um algoritmo que calcule a média aritmética das 3 notas dos
//		alunos de uma classe. O algoritmo deverá ler, além das notas, o código
//		do aluno e deverá ser encerrado quando o código for igual a zero.		
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
        
//		---------------------------------------------------------------------
//      5. Escreva um algoritmo que leia 10 valores e encontre o maior e o
//      menor deles. Mostre o resultado.
        double valor = 0, maior = 0, menor = 0;
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i+1) + "° valor: ");
			valor = entrada.nextDouble();
			if(i == 0) {
				maior = valor;
				menor = valor;
			}else {
				if(valor > maior) {
					maior = valor;
				}
				if(valor < menor) {
					menor = valor;
				}
			}
		}
		System.out.println("O maior valor é " + maior + " e o menor valor é " + menor + ".");

	}

}
