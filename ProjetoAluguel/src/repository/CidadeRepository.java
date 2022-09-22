package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CidadeRepository {
	
	Connection conn;
	
	public CidadeRepository() {
		ConexaoBD bd = new ConexaoBD();
		
		try {
			this.conn = bd.getConnection();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void listarCidades() {
		String sql = "Select * from cidades";
		try {
			PreparedStatement ps = this.conn.prepareStatement(sql);
			ResultSet result = ps.executeQuery(); // para executar a consulta especificada
			
			while(result.next()) { // .next é um boolean
				Integer codIbge = result.getInt("cod_ibge");
				String nome = result.getString("nome");
				String uf = result.getString("uf");
				
				System.out.println(codIbge + " - " + nome + "/" + uf);
			}
		} catch (SQLException e) {
			System.out.println(e);
//			e.printStackTrace();
		}
		
	}

}
