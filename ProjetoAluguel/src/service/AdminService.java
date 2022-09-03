package service;

import java.util.Scanner;

import model.Administrador;
import model.Veiculo;
import repository.AdministradorRepository;
import repository.VeiculoRepository;

public class AdminService {
	
	Scanner sc;
	VeiculoService veiculoService; // injetado de VeiculoService
	AdministradorRepository repository = new AdministradorRepository();
	

	public AdminService(Scanner sc, VeiculoService veiculoService) {
		this.sc = sc;
		this.repository.salvar(new Administrador("admin", "admin@admin.com", "poa", "1111"));
		
		// injetado aqui para saber que tem que usar o mesmo do "Principal"
		// caso contrácrio, cria um novo, sem os mesmos dados que o do "Principal"
		this.veiculoService = veiculoService;
	}
	
	public void confereEntrada(int entrada) {
		sc.nextLine(); // para o bug
		
		if(entrada == 1) {
			veiculoService.cadastrarVeiculo();
		}
	}
	
}
