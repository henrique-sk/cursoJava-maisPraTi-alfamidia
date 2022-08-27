package exercicio;

import java.util.Scanner;

import exercicio.model.Carro;
import exercicio.repository.CarroRepository;

public class Main {

	public static void main(String[] args) {
		//CRIAR UMA ESTRUTURA COM MAP PARA SIMULAR UM BANCO DE DADOS
		//CRIE UMA CLASSE CARRO E UMA CLASSE CARROREPOSITORY
		
		// O CARRO DEVE CONTER PLACA, COR, MARCA E MODELO
		
		//AO TENTAR INSERIR UM CARRO COM A MESMA PLACA, DEVERÁ AVISAR QUE NÃO CONSEGUIU POIS JÁ EXISTE
		//E NÃO ATUALIZAR O CARRO
		
		Scanner sc = new Scanner(System.in);
		boolean continua = true;
		CarroRepository repository = new CarroRepository();
		
		Carro carro1 = new Carro("BRA2E19", "Onyx", "Chevrolet", "prata");
		Carro carro2 = new Carro("TGD8O12", "Uno", "Fiat", "vermelho");
		
		repository.salvar(carro1);
		repository.salvar(carro2);
		System.out.println("Modelo\t\t|\t\tMarca\t\t|\t\tCor\t\t|\t\tPlaca" +
		"\n---------------------------------------------------------------------------------------------------------------------" +
				repository.buscarTodos() +
				"\n=====================================================================================================================");
		
		do {
			System.out.println("Digite a placa do carro (PPP9P99), ou 0 para encerrar: ");
			String placa = sc.nextLine();
			for (Carro carro : repository.buscarTodos()) {
				if (placa.equals(carro.getPlaca())) {
					System.out.println("Já existe um carro com a placa informada."
							+ "\nFavor informar outra placa (PPP9P99), ou 0 para encerrar: ");
					placa = sc.nextLine();
				}
			}
			if(placa.equals("0")) {
				break;
			}
			
			System.out.println("Digite o modelo do carro: ");
			String modelo =  sc.nextLine();

			System.out.println("Digite a marca do carro: ");
			String marca =  sc.nextLine();
			
			System.out.println("Digite a cor do carro: ");
			String cor =  sc.nextLine();			
			
			Carro carro = new Carro(placa, modelo, marca, cor);
			repository.salvar(carro);			
		}while(continua);
		
		System.out.println("Todos carros cadastrados:");
		System.out.println("Modelo\t\t|\t\tMarca\t\t|\t\tCor\t\t|\t\tPlaca" +
		"\n---------------------------------------------------------------------------------------------------------------------" +
						repository.buscarTodos() +
						"\n=====================================================================================================================");
				
		System.out.println("Carro com placa BRA2E19");
		System.out.println(repository.buscarPorPlaca("BRA2E19"));
		System.out.println("===============================");
		
		System.out.println("Removendo carro com placa BRA2E19");
		repository.remover("BRA2E19");
		System.out.println("===============================");
		
		System.out.println("Modelo\t\t|\t\tMarca\t\t|\t\tCor\t\t|\t\tPlaca" +
		"\n---------------------------------------------------------------------------------------------------------------------" +
						repository.buscarTodos() +
						"\n=====================================================================================================================");
					
		sc.close();
	}

}
