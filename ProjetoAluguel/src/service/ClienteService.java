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
import model.Veiculo.Status;
import model.Veiculo.Tipo;
//import repository.ClienteRepository;
import repository.Repository;
import util.Normaliza;

public class ClienteService {
	// tem as dependências injetadas
	Scanner sc;
	Repository<Cliente> repository = new Repository<>();

	public ClienteService(Scanner sc) {
		// injetado, utiliza o mesmo Scanner instanciado no "Principal"
		this.sc = sc;
//		this.repository.salvar(new Cliente("Henrique", "henrique@henrique.com", "Canoas", "123"));
	}

	// se o e-mail não existir, vai cadastrar como novo cliente
	public Cliente confereEmail(String email) {

		List<Cliente> clientesCadastrados = new ArrayList<>();

		try {
			ResultSet result = repository.select("SELECT * FROM clientes");

			while (result.next()) {
				Integer id = result.getInt("id");
				String nome = result.getString("nome");
				String emailR = result.getString("email");
				String senha = result.getString("senha");

				clientesCadastrados.add(new Cliente(id, nome, emailR, senha));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

//		for(Cliente cliente : clientesCadastrados) {
//			if(cliente.getEmail().equals(Normaliza.normalizaEmail(email))) {
//				return cliente;
//			}
//		}
		// Prog FUNCIONAL
		Cliente cliente = clientesCadastrados.stream().filter(c -> c.getEmail().equals(Normaliza.normalizaEmail(email)))
				// ou seja, filtra cada cliente dos clientesCadastrados e verifica se o email
				// fornecido como parâmetro bate com algum já cadastrado
				.findFirst().orElse(null);
		// pega o primeiro que for igual, caso contrário retorna null

		try {
			String sql = "SELECT veiculos.* FROM clientes_veiculos\r\n"
					+ "INNER JOIN veiculos ON veiculos.id = veiculo_id\r\n"
					+ "WHERE cliente_id = ? AND estaAtivo = true;";
			
			PreparedStatement ps = this.repository.prepararSQL(sql);
			ps.setInt(1, cliente.getId());
			
			ResultSet result = ps.executeQuery();
			
			while(result.next()) {
				String modelo = result.getString("modelo");
				String marca = result.getString("marca");
				String placa = result.getString("placa");
				String cor = result.getString("cor");
				int idR = result.getInt("id");
				Status status = Status.valueOf(result.getString("status")); // valueOf converte para ENUM
				Tipo tipo = Tipo.valueOf(result.getString("tipo")); // valueOf converte para ENUM
				double valorLocacao = result.getDouble("valorLocacao");
				
				if(cliente.getVeiculos() == null) {
					cliente.setVeiculos(new ArrayList<>());
				}
				
				cliente.getVeiculos().add(new Veiculo(idR, modelo, marca, cor, placa, tipo, status, valorLocacao));
			}
			
		}catch(SQLException e) {
			System.out.println("Erro ao buscar veículos: " + e.getMessage());
		}
		
		if (cliente != null) {
			return cliente;
		}

		return this.cadastrarCliente(email);
	}

	private Cliente cadastrarCliente(String email) {

		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite sua cidade: ");
		String cidade = sc.nextLine();
		System.out.println("Digite uma senha: ");
		String senha = sc.nextLine();

		Cliente cliente = new Cliente(nome, email, cidade, senha);

		this.repository.salvar(cliente);

		return cliente;
	}

	public boolean conferirSenha(Cliente clienteParam, String senha) {
		Cliente cliente = null;

		try {
			PreparedStatement ps = this.repository.prepararSQL("select * from clientes where id = ?");
			// A "?" vai ser cubstituído pelo parâmetro que vai ser setado
			ps.setInt(1, clienteParam.getId());
			// seta o id que se quer
			// o "1" corresponde ao primeiro "?"

			ResultSet result = ps.executeQuery();

			while (result.next()) {
				Integer id = result.getInt("id");
				String nome = result.getString("nome");
				String emailR = result.getString("email");
				String senhaR = result.getString("senha");
				cliente = new Cliente(id, nome, emailR, senhaR);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cliente.getSenha().equals(senha);
	}

	public void alugarVeiculo(Cliente cliente, Veiculo veiculo) {
		cliente.getVeiculos().add(veiculo);
		
		try {
			PreparedStatement ps = this.repository.prepararSQL(
					"INSERT INTO clientes_veiculos(cliente_id, veiculo_id, estaAtivo) values (?, ?, ?)");
			ps.setInt(1, cliente.getId());
			ps.setInt(2, veiculo.getId());
			ps.setBoolean(3, true);
			
			ps.execute();
		} catch (SQLException e) {
			System.out.println("Erro ao salvar aluguel do veículo: " + e.getMessage());
//			e.printStackTrace();
		}
//		this.repository.salvar(cliente);
	}

	public void buscarCarrosAlugados(Cliente cliente) {
		List<Veiculo> veiculosAlugados = cliente.getVeiculos();

//		for(Veiculo veiculo : veiculosAlugados) {
//			System.out.println(veiculo);
//		}

		veiculosAlugados.forEach(v -> System.out.println(v));
	}

	public void removerVeiculo(Cliente clienteParam, Veiculo veiculoParam) throws SistemaException {
		Cliente cliente = this.repository.buscarPorId(clienteParam.getId());

		if (cliente == null) {
			throw new SistemaException("Cliente não encontrado!");
		}

		cliente.getVeiculos().remove(veiculoParam);

		this.repository.salvar(cliente);

	}

	public Object getVeiculos() {
		// TODO Auto-generated method stub
		return null;
	}

}
