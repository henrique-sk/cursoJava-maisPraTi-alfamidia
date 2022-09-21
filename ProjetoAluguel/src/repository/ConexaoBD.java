package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
	
	private String hostname;
	
	private String username;
	
	private String password;
	
	private String url;
	
	private Connection conn;
	
	public ConexaoBD() {
		this.hostname = "localhost";
		this.username = "root";
		this.password = "";
		
		this.url = "jdbc:mysql://" + hostname + "/mais_pra_ti";
	}
	
	public Connection getConnection() {
		this.conn = null;
		try {
			this.conn = DriverManager.getConnection(this.url, this.username, this.password);
		} catch(SQLException e) {
			System.out.println("Erro ao fazer conexão: " + e.getMessage());
		}
		
		return conn;		
	}
	
	public void closeConnection() {
		if(conn != null) {
			try {
				conn.close();
			} catch(SQLException e) {
				System.out.println("Erro ao fechar conexão: " + e.getMessage());
			}
		}
	}
	

}
