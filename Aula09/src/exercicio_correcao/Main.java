package exercicio_correcao;

import java.util.Scanner;

import exercicio_correcao.model.Carro;
import exercicio_correcao.repository.CarroRepository;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		boolean continua = true;
		CarroRepository bd = new CarroRepository();
		
		do {
			System.out.println("Digite a placa do veículo ou 0 para sair: ");
			String placa = sc.nextLine();
			
			if(placa.equals("0")) {
				continua = false;
				break;
			}
			
			Carro carro = bd.buscarPorPlaca(placa);
			
			if(carro != null) {
				System.out.println("Atenção, carro já cadastrado. Tente novamente!!!");
			}else {
				System.out.println("Digite a cor do veículo: ");
				String cor = sc.nextLine();
				
				System.out.println("Digite a marca do veículo: ");
				String marca = sc.nextLine();
				
				System.out.println("Digite o modelo do veículo: ");
				String modelo = sc.nextLine();
				
				bd.salvar(new Carro(placa,cor,marca,modelo));
				
				System.out.println("Veículo salvo com sucesso!!");
			}
			
		}while(continua);
		
		System.out.println("Todos os veículos cadastrados: ");
		System.out.println(bd.buscarTodos());
	}

}
