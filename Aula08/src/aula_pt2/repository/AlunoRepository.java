package aula_pt2.repository;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import aula_pt2.model.Aluno;

public class AlunoRepository {
	
	private Map<Integer, Aluno> alunosDB;
	
	public AlunoRepository() {
		this.alunosDB = new TreeMap<>();
	}
	
	// 4 operações básicas de um Banco de Dados
	// Buscar Todos, Salvar, Remover, Buscar por ID
	public List<Aluno> buscarTodos() {
		return this.alunosDB.values().stream().collect(Collectors.toList());
	}
	
	public void salvar(Aluno aluno) {
		this.alunosDB.put(aluno.getMatricula(), aluno);
	}
	
	public void remover(Integer matricula) {
		this.alunosDB.remove(matricula);
	}
	
	public Aluno buscarPorMatricula(Integer matricula) {
		return this.alunosDB.get(matricula);
	}

}
