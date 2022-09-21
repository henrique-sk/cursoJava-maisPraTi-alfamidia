import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

import menu.Menu;
import model.Administrador;
import model.Cliente;
import model.Veiculo;
import model.Vendedor;
import repository.CidadeRepository;
import repository.ConexaoBD;
//import repository.AdministradorRepository;
//import repository.ClienteRepository;
//import repository.VeiculoRepository;
//import repository.VendedorRepository;
import service.AdminService;
import service.ClienteService;
import service.VeiculoService;
import service.VendedorService;
import util.Normaliza;
import exception.SistemaException;

public class Principal {

	public static void main(String[] args) throws InterruptedException, SQLException {
		
		// TESTE DE CONEXÃO com localhost
		// pra ver se busca o DB do localhost
//		ConexaoBD sql = new ConexaoBD();
//		
//		Connection con = sql.getConnection();
//		
//		Statement st = con.createStatement();
//		
//		ResultSet rs = st.executeQuery("show databases");
//
//		// enquanto houver um próximo DB, vai buscar
//		while(rs.next()) {
//			System.out.println(rs.getString("database"));
//		}
		//--- até aqui o TESTE DE CONEXÃO ---
		
		// TESTE para listar as cidades
//		CidadeRepository cidade = new CidadeRepository();
//		cidade.listarCidades();
		
		Scanner sc = new Scanner(System.in);
		
		ClienteService clienteService = new ClienteService(sc);
		VeiculoService veiculoService = new VeiculoService(sc);
		VendedorService vendedorService = new VendedorService(sc);
		AdminService adminService = new AdminService(sc, veiculoService, vendedorService);
		
		boolean continua = true;
		do {
			try {
			Menu.menu1();
			int opcao1 = sc.nextInt();
			sc.nextLine();
			
			switch(opcao1) {
			case 1:
				Menu.menu2();
				String email = sc.nextLine();
				Cliente cliente = clienteService.confereEmail(email);
				boolean senhaCorreta = false;
				for(int i = 0; i < 3; i++) {
					System.out.println("Agora digite a sua senha: ");
					String senha = sc.nextLine();
					senhaCorreta = clienteService.conferirSenha(cliente, senha);
					if(!senhaCorreta) {
						System.out.println("Senha incorreta, tente novamente!!");
					}else {
						break;
					}
				}
				if(!senhaCorreta) {
					break;
				}
				
				Menu.menuCliente2();
				int opcao2 = sc.nextInt();
				
				if(opcao2 == 1) {
					System.out.println("Digite o número referente ao carro desejado: ");
					veiculoService.buscarTodosVeiculosLivres();
					int opcaoCarro = sc.nextInt();
					Veiculo veiculo = veiculoService.alugarVeiculoPorID(opcaoCarro);
					clienteService.alugarVeiculo(cliente, veiculo);					
					
					// ESCOLHER VENDEDOR QUE ATENDEU
					System.out.println("Digite o número referente ao vendedor que lhe atendeu: ");
					vendedorService.mostrarTodosVendedores();
					int opcaoVendedor = sc.nextInt();
					vendedorService.salvarVeiculo(veiculo, opcaoVendedor);					
				}else if(opcao2 == 2) {
					if(cliente.getVeiculos().size() <= 0) {
						throw new SistemaException("Você não tem veículos para devolver!");
					}
					System.out.println("Digite o número referente ao carro desejado: ");
					clienteService.buscarCarrosAlugados(cliente);
					
					int opcaoCarro = sc.nextInt();
					
					Veiculo veiculoDevolvido = veiculoService.devolverVeiculo(cliente, opcaoCarro);
					clienteService.removerVeiculo(cliente, veiculoDevolvido);
				}
				
				break;
			case 2:
				Menu.menu2();
				email = sc.nextLine();
				
				Vendedor vendedor = vendedorService.confereEmail(email);
				if(vendedor == null) {
					throw new SistemaException("Vendedor não encontrado!");
				}
				
				senhaCorreta = false;
				for(int i = 0; i < 3; i++) {
					System.out.println("Agora digite a sua senha: ");
					String senha = sc.nextLine();
					senhaCorreta = vendedorService.conferirSenha(vendedor, senha);
					if(!senhaCorreta) {
						System.out.println("Senha incorreta, tente novamente!!");
					}else {
						break;
					}
				}
				if(!senhaCorreta) {
					break;
				}
				
				Menu.menuVendedor1();
				opcao2 = sc.nextInt();
				
				if(opcao2 == 1) {
					vendedorService.mostrarAlugueisVeiculos(vendedor);
				}else if(opcao2 == 2) {
					vendedorService.verSalario(vendedor);
				}else if(opcao2 == 3) {
					vendedorService.verSalarioComComissao(vendedor);
				}
				break;
			case 3:
				Menu.menu2();
				email = sc.nextLine();
				
				Administrador admin = adminService.confereEmail(email);
				
				if(admin == null) {
					throw new SistemaException("Administrador não encontrado!");
				}
				senhaCorreta = false;
				for(int i = 0; i < 3; i++) {
					System.out.println("Agora digite a sua senha: ");
					String senha = sc.nextLine();
					senhaCorreta = adminService.conferirSenha(admin, senha);
					if(!senhaCorreta) {
						System.out.println("Senha incorreta, tente novamente!!");
					}else {
						break;
					}
				}
				if(!senhaCorreta) {
					break;
				}
				
				Menu.menuAdministrador();
				opcao2 = sc.nextInt();
				adminService.confereEntrada(opcao2);
				break;
			case 0:
				continua = false;
				break;
			default:
				System.out.println("Alternativa inválida. Tente novamente!!!");
				break;
			}			
			
			} catch(SistemaException e) {
				System.out.println(e.getMessage());				
			}catch(InputMismatchException e) {
				System.out.println("Opção inválida!!");
				sc.nextLine();
			}finally {
				Thread.sleep(1500l); // congela a tela por 1,5 seg
			}
		} while (continua);
		
	}

}
