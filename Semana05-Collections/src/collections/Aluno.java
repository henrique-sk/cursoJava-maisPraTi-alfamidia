package collections;

public class Aluno {
	Integer matricula;
	String nome;
	String email;
	String endereco;
	
	public Aluno(Integer matricula, String nome) {
		this.nome = nome;
		this.matricula = matricula;		
		this.email = matricula + nome.replaceAll(" ", ".") +
				"alfamidia.com.br";
	}

}
