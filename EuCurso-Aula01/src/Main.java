import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*int variavel = 10;
		String variavel2 = "java";
		double variavel3 = 10.5;
		float variavel4 = 10.5f;		
		boolean variavel5 = true;*/		
		
		Scanner sc = new Scanner(System.in);
		String nome = "Maria";
		String nome2 = "Maria";
		
		int x = 0, y;
		
//		System.out.println("Digite um nome: ");
//		nome = sc.next();
//		
//		System.out.println("Digite outro nome: ");
//		nome2 = sc.next();
		
//		System.out.println("Digite um número: ");
//		x = sc.nextInt();
//		
//		System.out.println("Digite outro número: ");
//		y = sc.nextInt();
//		
//		if(x > y) {
//			System.out.println("Entrou no primeiro bloco.");
//		}else if(x == 3){
//			System.out.println("Entrou no segundo bloco.");
//		}else {
//			System.out.println("Entrou no terceiro bloco.");
//		}
		
		System.out.println(nome);
		System.out.println(nome2);
		//if (nome == nome2) {
		//SEMPRE USAR EQUALS PARA COMPARAR VARIÁVEIS DO TIPO OBJETO
//		if(nome.equals(nome2)) {
//			System.out.println("Os nomes são iguais.");
//		}
		
//		System.out.println("Digite um número: ");
//		x = sc.nextInt();		
//		switch(x) {
//			case 1:
//				System.out.println("O número impresso foi 1.");
//				break;
//			case 2:
//				System.out.println("O número impresso foi 2.");
//				break;
//			case 3:
//				System.out.println("O número impresso foi 3.");
//				break;
//			case 4:
//				System.out.println("O número impresso foi 4.");
//				break;
//				default:
//					System.out.println("O número digitado não está entre as opções.");
//					break;
//		}

//		while(x != 0) {
//			System.out.println("X é igual a: " + x);
//			x = sc.nextInt();
//		}
		
//		do {
//			System.out.println("X é igual a: " + x);
//			x = sc.nextInt();
//		}while(x != 0);
//		
//		System.out.println("Saiu do laço.");
		
//		int[] arrays = new int[7];
//		arrays[0] = 10;
//		arrays[1] = 20;
//		arrays[2] = 30;
//		arrays[3] = 40;
//		arrays[4] = 50;
		
		String[] array = { "Maria", "João", "Henrique"};
		
		String[] novoArray = new String[array.length + 3];
		
		
		for(int contador = 0; contador < novoArray.length; contador++) {
			System.out.println(novoArray[contador]);
		}
		
		
		
		
		
		
		
	}

}
