package collections;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class AlunoBD {

	Map<Integer, Aluno> alunos;
	
	public AlunoBD() {
		this.alunos = new TreeMap<>();
	}
	
	public void salvar(Aluno aluno) {
		this.alunos.put(aluno.matricula, aluno);
	}
	
	public Aluno buscarPorMatricula(Integer matricula) {
		return this.alunos.get(matricula);
	}
	
	public List<Aluno> buscarTodos(){
		return this.alunos.values()
				.stream().collect(Collectors.toList());
	}
	
	public void excluirPoratricula(Integer matricula) {
		this.alunos.remove(matricula);
	}

}
