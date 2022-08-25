package collections;

public class Aluno {
	Integer matricula;
	String nome;
	String email;
	String endereco;
	
	public Aluno(Integer matricula, String nome) {
		this.nome = nome;
		this.matricula = matricula;		
		this.email = nome.replaceAll(" ", ".") +
				matricula + "@alfamidia.com.br";
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula +
				", nome=" + nome +
				", email=" + email +
				", endereco=" + endereco + "]";
	}
	
	

}
