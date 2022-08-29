package exercicio.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import exercicio.model.Carro;

public class CarroRepository {
	
	public Map<String, Carro> carrosDB;
	
	public CarroRepository() {
		this.carrosDB = new TreeMap<>();
	}
	
	public List<Carro> buscarTodos() {
		return this.carrosDB.values().stream().collect(Collectors.toList());
	}

	public void salvar(Carro carro) {
		this.carrosDB.put(carro.getPlaca(), carro);
	}
	
	public void remover(String placa) {
		this.carrosDB.remove(placa);
	}
	
	public Carro buscarPorPlaca(String placa) {
		return this.carrosDB.get(placa);
	}
	
//	public Carro buscarPorPlaca(String placa) {
//		return this.carrosDB.get(carro.getMarca());
//	}
//	
	public List<Carro> buscarPorMarca(String marca) {
		List<Carro> porMarcas = new ArrayList<Carro>();
		for (Carro carro : carrosDB.values()) {
			if (marca.equals(carro.getMarca())) {
				porMarcas.add(carro);
			}
		}
		return porMarcas.stream().collect(Collectors.toList());
		
	}
	
}
