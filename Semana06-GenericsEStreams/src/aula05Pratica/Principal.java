package aula05Pratica;

public class Principal {

	public static void main(String[] args) {
		Repository<Professor> profRepository = new Repository<>();
		Repository<Aluno> alunoRepository = new Repository<>();
		
		Professor professor = new Professor("João", "Geografia");
		Professor professor2 = new Professor("Amanda", "Artes");
		profRepository.salvar(professor);
		profRepository.salvar(professor2);
		profRepository.salvar(new Professor("José", "Matemática"));
		profRepository.salvar(new Professor("Maria", "História"));
		
		Aluno aluno = new Aluno("Julia", 38765);
		Aluno aluno2 = new Aluno("Paulo", 39765);
		Aluno aluno3 = new Aluno("Raul", 37765);
		alunoRepository.salvar(aluno);
		alunoRepository.salvar(aluno2);
		alunoRepository.salvar(aluno3);
		
		System.out.println(profRepository.buscarTodos());
		
		profRepository.remover(professor);
		
		System.out.println(profRepository.buscarTodos());
		
		System.out.println(profRepository.buscar(profRepository.buscar(professor2)));
		
		System.out.println(alunoRepository.buscarTodos());
		
		alunoRepository.remover(aluno);
		
		System.out.println(alunoRepository.buscarTodos());
		
	}

}
