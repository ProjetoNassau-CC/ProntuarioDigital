package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;
import prontuario.Dentista;
import prontuario.Recepcionista;

public class CrudFuncionarios {
	
	
Recepcionista recepcionista = new Recepcionista();


public void inserirDentista(Dentista d) {
	Conexao conex = new Conexao();
	
	conex.conexao();
	try {
		String sql = "INSERT INTO funcionario(nome,email,celular,datanasc,cpf,rg,rua,bairro,cep,cidade,uf,numero,complemento,funcao,cro,ramal) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = conex.con.prepareStatement(sql);
		stmt.setString(1, d.getNome());
			stmt.setString(2, d.getEmail());
			stmt.setString(3, d.getCel());
			stmt.setString(4, d.getData_nascimento());
			stmt.setString(5, d.getCpf());
			stmt.setString(6, d.getRg());
			stmt.setString(7, d.getEndereco().getRua());
			stmt.setString(8,	d.getEndereco().getBairro());
			stmt.setString(9, d.getEndereco().getCep());
			stmt.setString(10, d.getEndereco().getCidade());
			stmt.setString(11, d.getEndereco().getUf());
			stmt.setString(12, d.getEndereco().getNumero());
			stmt.setString(13, d.getEndereco().getComplemento());
			stmt.setString(14, d.getFuncao());
			stmt.setInt(15, d.getCro());
			stmt.setString(16, "");
			stmt.execute();
			System.out.println("cadastrado com sucesso");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public void inserirRecepcionista(Recepcionista r) {
	Conexao conex = new Conexao();
	
	conex.conexao();
	try {
		String sql = "INSERT INTO funcionario(nome,email,celular,datanasc,cpf,rg,rua,bairro,cep,cidade,uf,numero,complemento,funcao,cro,ramal) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = conex.con.prepareStatement(sql);
		stmt.setString(1, r.getNome());
			stmt.setString(2, r.getEmail());
			stmt.setString(3, r.getCel());
			stmt.setString(4, r.getData_nascimento());
			stmt.setString(5, r.getCpf());
			stmt.setString(6, r.getRg());
			stmt.setString(7, r.getEndereco().getRua());
			stmt.setString(8,	r.getEndereco().getBairro());
			stmt.setString(9, r.getEndereco().getCep());
			stmt.setString(10, r.getEndereco().getCidade());
			stmt.setString(11, r.getEndereco().getUf());
			stmt.setString(12, r.getEndereco().getNumero());
			stmt.setString(13, r.getEndereco().getComplemento());
			stmt.setString(14, r.getFuncao());
			stmt.setInt(15, 0);
			stmt.setString(16, r.getRamal());
			stmt.execute();
			System.out.println("cadastrado com sucesso");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
