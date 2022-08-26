package exercicio;

import exercicio.model.Carro;
import exercicio.repository.CarroRepository;

public class Main {

	public static void main(String[] args) {
		//CRIAR UMA ESTRUTURA COM MAP PARA SIMULAR UM BANCO DE DADOS
		//CRIE UMA CLASSE CARRO E UMA CLASSE CARROREPOSITORY
		
		// O CARRO DEVE CONTER PLACA, COR, MARCA E MODELO
		
		//AO TENTAR INSERIR UM CARRO COM A MESMA PLACA, DEVERÁ AVISAR QUE NÃO CONSEGUIU POIS JÁ EXISTE
		//E NÃO ATUALIZAR O CARRO
		
		CarroRepository repository = new CarroRepository();
		
		Carro carro1 = new Carro("BRA2E19", "Onyx", "Chevrolet", "prata");
		Carro carro2 = new Carro("TGD8O12", "Uno", "Fiat", "vermelho");
		
		repository.salvar(carro1);
		repository.salvar(carro2);
		System.out.println(repository.buscarTodos());

	}

}
