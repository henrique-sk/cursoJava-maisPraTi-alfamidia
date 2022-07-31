package aulas;

import java.util.Scanner;

public class A3_imc1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        System.out.println(("Entre com o peso em Kg: "));
        float peso = entrada.nextFloat();

        System.out.println(("Entre com a altura em metros: "));
        float altura = entrada.nextFloat();

        float imc = peso / (altura * altura);
        System.out.println("O IMC é: " + imc);

        String classificacao = "";
        if (imc < 18.5) classificacao = "Magreza";
        else if (imc < 24.9) classificacao = "Normal";
        else if (imc < 29.9) classificacao = "Sobrepeso";
        else if (imc < 39.9) classificacao = "Obesidade";
        else classificacao = "Obesidade Grave";

        System.out.println("A classificação é: " + classificacao);

	}

}
