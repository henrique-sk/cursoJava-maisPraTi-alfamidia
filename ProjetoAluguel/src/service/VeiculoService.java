package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exception.SistemaException;
import model.Cliente;
import model.Veiculo;
import model.Vendedor;
import model.Veiculo.Status;
import model.Veiculo.Tipo;
import repository.Repository;
import repository.VeiculoRepository;
//import repository.VeiculoRepository;

public class VeiculoService {

	Scanner sc;
	Repository<Veiculo> repository = new Repository<>();
	
	VeiculoRepository veiculoRepository = new VeiculoRepository();
	
	public VeiculoService(Scanner sc) {
		this.sc = sc;
		
//		repository.salvar(new Veiculo("I30", "Hyundai", "Preto", "IXI9076", "carro", 135));
//		repository.salvar(new Veiculo("HB20", "Hyundai", "Branco", "IXI4523", "carro", 145));
//		repository.salvar(new Veiculo("CG 150", "Honda", "Preto", "IXI7076", "moto", 60));
	}
	
	public void cadastrarVeiculo() {		
		System.out.println("Digite o modelo do veículo: ");
		String modelo = sc.nextLine();
		
		System.out.println("Digite a marca do veículo: ");
		String marca = sc.nextLine();
		
		System.out.println("Digite a cor do veículo: ");
		String cor = sc.nextLine();
		
		System.out.println("Digite a placa do veículo: ");
		String placa = sc.nextLine();

		System.out.println("Digite o segmento do veículo: ");
		String tipo = sc.nextLine();
		
		System.out.println("Digite o valor da locação do veículo: ");
		double valor = sc.nextDouble();
		
		Veiculo veiculo = new Veiculo(modelo, marca, cor, placa, tipo, valor);
		
		this.repository.salvar(veiculo);
		
		System.out.println("Você cadastrou o veículo!!");
	}
	
	public void buscarTodosVeiculosLivres() {
		
		List<Veiculo> todosVeiculos = this.veiculoRepository.buscarOnde("STATUS = 'LIVRE'");
		
		todosVeiculos.forEach(v -> System.out.println(v));
		
	}
	
	public Veiculo alugarVeiculoPorID(int id) throws SistemaException {
		
		Veiculo veiculo = this.veiculoRepository.buscarPorID(id);
		
		if(veiculo == null) {
			throw new SistemaException("Veículo não encontrado!");
		}
		
		veiculo.setStatus(Status.ALUGADO);
		
//		this.repository.salvar(veiculo);
		try {
			PreparedStatement ps = this.repository.prepararSQL("UPDATE veiculos SET status = 'ALUGADO' where id = ?");
			ps.setInt(1, id);
			
			ps.execute(); // somente execute para alterar algo
		} catch (SQLException e) {
			System.out.println("Erro ao atualizar veículo: " + e.getMessage());
//			e.printStackTrace();
		}
		
		return veiculo;
	}
	
	public Veiculo devolverVeiculo(Cliente cliente, int id) throws SistemaException {
		
		Veiculo veiculo = this.veiculoRepository.buscarPorID(id);
		
		if(veiculo == null) {
			throw new SistemaException("Veículo não encontrado!");
		}
		
		// para essa comparação (equals) poder acontecer foi criado um método equals na classe Veiculo
		if(!cliente.getVeiculos().contains(veiculo)) {
			throw new SistemaException("Você não possui este veículo!");
		}
		
		veiculo.setStatus(Status.LIVRE);
		this.veiculoRepository.atualizar(veiculo);
		
		return veiculo;
	}
	
}
