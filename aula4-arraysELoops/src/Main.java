import java.util.Scanner;

public class Main {
    public static void calculoImc(float peso, float altura) {
        double[] pesosImc = {18.5, 24.9, 29.9, 39.9, 900000};
        // ou float[] pesosImc = {18.5f, 24.9f, 29.9f, 39.9f, 900000f};
        String[] classificacoesImc = {"Magreza", "Normal", "Sobrepeso", "Obesidade", "Obesidade Grave"};

        float imc = peso / (altura * altura);
        System.out.println("O IMC é: " + imc);

        int i = 0;
        while (imc > pesosImc[i]) {i++;}
        System.out.println("A classificação é: " + classificacoesImc[i]);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o peso em Kg: ");
        float peso = entrada.nextFloat();
        // ou double peso = entrada.nextDouble();
        // e alterar parâmetros de entrada da função calculoImc (double peso, double altura)
        System.out.println("Entre com a altura em metros: ");
        float altura = entrada.nextFloat();
        // double altura = entrada.nextDouble();
        calculoImc(peso,altura);
    }
}