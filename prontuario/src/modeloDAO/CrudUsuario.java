package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;
import prontuario.Dentista;
import prontuario.Endereco;
import prontuario.Paciente;
import prontuario.Usuario;

public class CrudUsuario {

	boolean log ;
	int resultado;
	Conexao conex = new Conexao();
	
	
	
	
	public void SalvarUsuario(Usuario usu) {
		conex.conexao();
		try {
			String sql = "INSERT INTO usuario(usuario,senha,tipo) VALUES (?,?,?)";
			PreparedStatement stmt = conex.con.prepareStatement(sql);
				stmt.setString(1, usu.getNomeUsuario());
				stmt.setString(2, usu.getSenhaUsuario());
				stmt.setString(3, usu.getTipoUsuario());
				stmt.execute();
				System.out.println("Usuario cadastrado com sucesso");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				
			}
		}
		
	public void consultaUsuario(String usuario) {
		try {
		Conexao conex = new Conexao();
		conex.conexao();
		Usuario usu = new Usuario();
	
		String sql = "select * from usuario where usuario = ?";
		PreparedStatement stmt = conex.con.prepareStatement(sql);
		stmt.setString(1,usuario);

		ResultSet rs = stmt.executeQuery();
		//verifica se a consulta encontrou um funcionario com o CPF informado.
		if(rs.next()) { 
			usu.setCodigoUsuario(rs.getInt("codigo"));
			usu.setNomeUsuario(rs.getString("usuario"));
			usu.setTipoUsuario(rs.getString("tipo"));
		
			
			System.out.println(usu.toString());
				
		}else {
			System.out.println("Usuario n?o cadastrado!!");
			
		}
		
		
	}catch (Exception e) {
	}
	}
		
	public void removerUsuario(Usuario usuario) {
		Conexao conex = new Conexao();
		conex.conexao();
		String sql = "delete from usuario where  usuario= ? ";
		String consultaFuncao = "select * from usuario where usuario = ?";
		PreparedStatement stm;
		try {
			stm = conex.con.prepareStatement(consultaFuncao);
			stm.setString(1,usuario.getNomeUsuario());
		
			ResultSet rs = stm.executeQuery();
			if(rs.next()) { 
				usuario.setNomeUsuario(rs.getString("usuario"));
				PreparedStatement stmt = conex.con.prepareStatement(sql);
				stmt.setString(1,usuario.getNomeUsuario());
				stmt.executeUpdate();
				System.out.println("excluido com sucesso");
			} else {
				System.out.println(" N?o ? permitido excluir pois esse usu?rio n?o encontra-se cadastrado no sistema!");
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	public void EditarUsuario(Usuario usuario) {
		Conexao conex = new Conexao();
		conex.conexao();
		
		String sql = "update usuario set usuario = ?, senha =?, tipo = ? where codigo = ?;";
		String consultaFuncao = "select * from usuario where codigo = ?";
		PreparedStatement stm;
		try {
			stm = conex.con.prepareStatement(consultaFuncao);
			stm.setInt(1,usuario.getCodigoUsuario());
	
			ResultSet rs = stm.executeQuery();
			if(rs.next()) { 
				usuario.setCodigoUsuario(rs.getInt("codigo"));

			PreparedStatement stmt = conex.con.prepareStatement(sql);
			stmt.setString(1, usuario.getNomeUsuario());
			stmt.setString(2, usuario.getSenhaUsuario());
			stmt.setString(3, usuario.getTipoUsuario());
			stmt.setInt(4, usuario.getCodigoUsuario());
			stmt.executeLargeUpdate();
			System.out.println("dados alterados com sucesso");
			}else {
				System.out.println("Dados informado n?o encontra-se cadastrado no sistema");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		
		}
	
	
	
	
	
	
	

