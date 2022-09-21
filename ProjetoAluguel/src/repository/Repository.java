package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import model.Banco;

// Delimita que esse Repository só poderá ser generalizado por classes que implementarem o Banco
// ou seja, só aceita tipos que implementem Banco
public class Repository<T extends Banco> {
	
	Map<Integer, T> bancoDeDados;
	
//	public Repository() {
//		this.bancoDeDados = new TreeMap<>();
//	}
	
	public void salvar(T t) {
		// se o objeto T extende Banco, temos certeza de que ele tem o método getId
		this.bancoDeDados.put(t.getId(), t);
	}
	
	// Usado o T e não ? pq não queremos que retorne qualquer lista
	// mas sim, uma lista do tipo T conforme foi definido
	public List<T> buscarTodos() {
		return this.bancoDeDados.values().stream().collect(Collectors.toList());
	}
	
	public T buscarPorId(Integer id) {
		return this.bancoDeDados.get(id);
	}
	
	public void removerPorId(Integer id) {
		this.bancoDeDados.remove(id);
	}
	
	// Integração com MySQL
	Connection con;
	
	public Repository() {
		this.bancoDeDados = new TreeMap<>();
		this.con = new ConexaoBD().getConnection();
	}
	
	// recebe um comando sql, trata e retorna resultado da pesquisa
	public PreparedStatement prepararSQL(String sql) throws SQLException {
		PreparedStatement ps = this.con.prepareStatement(sql);
		return ps;
	}
	
	public ResultSet select(String sql) throws SQLException {
		PreparedStatement ps = this.con.prepareStatement(sql);
		ResultSet result = ps.executeQuery();
		
		return result;
	}

}
