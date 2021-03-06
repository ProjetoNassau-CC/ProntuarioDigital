package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;
import prontuario.Anamnese;
import prontuario.Dentista;
import prontuario.Endereco;
import prontuario.Paciente;
import prontuario.Recepcionista;

public class CrudPaciente {
	
	
	public void inserirPaciente(Paciente pac) {
		Conexao conex = new Conexao();
		
		conex.conexao();
		try {
			String sql = "INSERT INTO paciente(nome,email,celular,datanasc,cpf,rg,rua,bairro,cep,cidade,uf,numero,complemento) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = conex.con.prepareStatement(sql);
				stmt.setString(1, pac.getNome());
				stmt.setString(2, pac.getEmail());
				stmt.setString(3, pac.getCel());
				stmt.setString(4, pac.getData_nascimento());
				stmt.setString(5, pac.getCpf());
				stmt.setString(6, pac.getRg());
				stmt.setString(7, pac.getEndereco().getRua());
				stmt.setString(8,	pac.getEndereco().getBairro());
				stmt.setString(9, pac.getEndereco().getCep());
				stmt.setString(10, pac.getEndereco().getCidade());
				stmt.setString(11, pac.getEndereco().getUf());
				stmt.setString(12, pac.getEndereco().getNumero());
				stmt.setString(13, pac.getEndereco().getComplemento());
				stmt.execute();
				System.out.println("cadastrado com sucesso");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	
	public void EditarPaciente(Paciente pac) {
		Conexao conex = new Conexao();
		conex.conexao();
		
		String sql = "update paciente set nome = ?, email =?, celular = ?,datanasc = ?,cpf = ?,rg = ?, rua = ?, bairro = ?, cep = ?, cidade = ?, uf =?, numero = ?, complemento = ? where codigo = ?;";
		String consultaFuncao = "select * from paciente where codigo = ?";
		PreparedStatement stm;
		try {
			stm = conex.con.prepareStatement(consultaFuncao);
			stm.setInt(1,pac.getCodigo());
	
			ResultSet rs = stm.executeQuery();
			if(rs.next()) { 
				pac.setCodigo(rs.getInt("codigo"));

			PreparedStatement stmt = conex.con.prepareStatement(sql);
			stmt.setString(1, pac.getNome());
			stmt.setString(2, pac.getEmail());
			stmt.setString(3, pac.getCel());
			stmt.setString(4, pac.getData_nascimento());
			stmt.setString(5, pac.getCpf());
			stmt.setString(6, pac.getRg());
			stmt.setString(7,pac.getEndereco().getRua());
			stmt.setString(8,pac.getEndereco().getBairro());
			stmt.setString(9,pac.getEndereco().getCep());
			stmt.setString(10,pac.getEndereco().getCidade());
			stmt.setString(11,pac.getEndereco().getUf());
			stmt.setString(12,pac.getEndereco().getNumero());
			stmt.setString(13,pac.getEndereco().getComplemento());
			stmt.setInt(14, pac.getCodigo());
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
	
	
	public void removerPaciente(Paciente paciente) {
		Conexao conex = new Conexao();
		conex.conexao();
		String sql = "delete from paciente where  cpf = ? ";
		String consultaFuncao = "select * from paciente where cpf = ?";
		PreparedStatement stm;
		try {
			stm = conex.con.prepareStatement(consultaFuncao);
			stm.setString(1,paciente.getCpf());
		
			ResultSet rs = stm.executeQuery();
			if(rs.next()) { 
				paciente.setCpf(rs.getString("cpf"));
				PreparedStatement stmt = conex.con.prepareStatement(sql);
				stmt.setString(1,paciente.getCpf());
				stmt.executeUpdate();
				System.out.println("excluido com sucesso");
			} else {
				System.out.println(" N?o ? permitido excluir pois esse cpf nn?o encontra-se cadastrado no sistema!");
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	

	public void consultapac(String cpf) {
		try {
		Conexao conex = new Conexao();
		conex.conexao();
		Paciente paciente = new Paciente();
		Endereco endpaciente = new Endereco();
		String sql = "select * from paciente where cpf = ?";
		PreparedStatement stmt = conex.con.prepareStatement(sql);
		stmt.setString(1,cpf);

		ResultSet rs = stmt.executeQuery();
		//verifica se a consulta encontrou um funcionario com o CPF informado.
		if(rs.next()) { 
			paciente.setCodigo(rs.getInt("codigo"));
			paciente.setNome(rs.getString("nome"));
			paciente.setEmail(rs.getString("email"));
			paciente.setCel(rs.getString("celular"));
			paciente.setData_nascimento(rs.getString("datanasc"));
			paciente.setCpf(rs.getString("cpf"));
			paciente.setRg(rs.getString("rg"));
			endpaciente.setRua(rs.getString("rua"));
			endpaciente.setBairro(rs.getString("bairro"));
			endpaciente.setCep(rs.getString("cep"));
			endpaciente.setCidade(rs.getString("cidade"));
			endpaciente.setUf(rs.getString("uf"));
			endpaciente.setNumero(rs.getString("numero"));
			endpaciente.setComplemento(rs.getString("complemento"));
			paciente.setEndereco(endpaciente);
			System.out.println(paciente.toString());
				
		}else {
			System.out.println("dados informado o cpf n?o pertence a um paciente");
			
		}
		
		
	}catch (Exception e) {
	}
	
		
	}
}
