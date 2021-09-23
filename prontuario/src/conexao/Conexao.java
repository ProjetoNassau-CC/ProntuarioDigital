package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {

	public Statement stm;
	public ResultSet rs;
	private String driver = "com.mysql.jdbc.Driver";
	private String caminho = "jdbc:mysql://localhost/prontuariodigital";
	private String usuario = "root";
	private String senha = "moraes18";
	public Connection con;
	
	
	public void conexao() {
		try {
		System.setProperty("jdbc.Drivers", driver);
		con = DriverManager.getConnection(caminho, usuario, senha);
		System.out.println("conectado com sucesso");
	} catch(SQLException ex) {
		System.out.println("erro de conexao de banco de dados:  " +  ex);
	}
	}
	public void desconectar() {
		try {
			con.close();
		System.out.println("BD desconectado com sucesso");
		}catch (SQLException ex) {
			System.out.println("erro ao desconectar banco de dados");
		}
	}
	
	/*
	public Conexao(){
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			 conexao = DriverManager.getConnection("jdbc:mysql://localhost/prontuariodigital","root", "moraes18");
			
			
			System.out.println("conexao realizada com sucesso");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
}
