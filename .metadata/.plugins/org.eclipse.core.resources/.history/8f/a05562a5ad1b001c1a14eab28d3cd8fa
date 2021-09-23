package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

Connection conexao;
	
	
	
	
	public Conexao(){
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			 conexao = DriverManager.getConnection("jdbc:mysql://localhost/prontuariodigital","root", "moraes18");
			
			
			System.out.println("conexao realizada com sucesso");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
