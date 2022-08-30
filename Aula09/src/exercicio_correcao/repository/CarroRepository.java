package exercicio_correcao.repository;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import exercicio_correcao.model.Carro;

public class CarroRepository {
	
private Map<String, Carro> carrosDB;
	
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

}
