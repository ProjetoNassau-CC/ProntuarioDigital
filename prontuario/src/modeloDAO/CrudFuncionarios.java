package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;
import prontuario.Dentista;
import prontuario.Endereco;
import prontuario.Recepcionista;

public class CrudFuncionarios {
	
	
Recepcionista recepcionista = new Recepcionista();
PreparedStatement stmt;

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
			stmt.setString(14, "Dentista");
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
			stmt.setString(14, "Recepcionista");
			stmt.setInt(15, 0);
			stmt.setString(16, r.getRamal());
			stmt.execute();
			System.out.println("cadastrado com sucesso");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public Recepcionista consultaRecepcionista(String cpf) {
	try {
	Conexao conex = new Conexao();
	conex.conexao();
	Recepcionista recepcionista = new Recepcionista();
	Endereco endRecepcionista = new Endereco();
	String sql = "select * from funcionario where cpf = ? and funcao = ?";
	PreparedStatement stmt = conex.con.prepareStatement(sql);
	stmt.setString(1,cpf);
	stmt.setString(2, "Recepcionista");

	
	ResultSet rs = stmt.executeQuery();
	//verifica se a consulta encontrou um funcionario com o CPF informado.
	if(rs.next()) { 
		recepcionista.setCodigo(rs.getInt("codigo"));
		recepcionista.setNome(rs.getString("nome"));
		recepcionista.setEmail(rs.getString("email"));
		recepcionista.setCel(rs.getString("celular"));
		recepcionista.setData_nascimento(rs.getString("datanasc"));
		recepcionista.setCpf(rs.getString("cpf"));
		recepcionista.setRg(rs.getString("rg"));
		endRecepcionista.setRua(rs.getString("rua"));
		endRecepcionista.setBairro(rs.getString("bairro"));
		endRecepcionista.setCep(rs.getString("cep"));
		endRecepcionista.setCidade(rs.getString("cidade"));
		endRecepcionista.setUf(rs.getString("uf"));
		endRecepcionista.setNumero(rs.getString("numero"));
		endRecepcionista.setComplemento(rs.getString("complemento"));
		recepcionista.setEndereco(endRecepcionista);
		recepcionista.setFuncao(rs.getString("funcao"));
		recepcionista.setRamal(rs.getString("ramal"));
		return recepcionista;
	}else {
		System.out.println("dados informados n?o pertence a um Recepcionista");
		
	}
	
	
}catch (Exception e) {
}
	return null;
}

public Dentista consultaDentista(String cpf) {
	try {
	Conexao conex = new Conexao();
	conex.conexao();
	Dentista dentista = new Dentista();
	Endereco endDentista = new Endereco();
	String sql = "select * from funcionario where cpf = ? and funcao = ?";
	PreparedStatement stmt = conex.con.prepareStatement(sql);
	stmt.setString(1,cpf);
	stmt.setString(2, "Dentista");

	
	ResultSet rs = stmt.executeQuery();
	//verifica se a consulta encontrou um funcionario com o CPF informado.
	if(rs.next()) { 
		dentista.setCodigo(rs.getInt("codigo"));
		dentista.setNome(rs.getString("nome"));
		dentista.setEmail(rs.getString("email"));
		dentista.setCel(rs.getString("celular"));
		dentista.setData_nascimento(rs.getString("datanasc"));
		dentista.setCpf(rs.getString("cpf"));
		dentista.setRg(rs.getString("rg"));
		endDentista.setRua(rs.getString("rua"));
		endDentista.setBairro(rs.getString("bairro"));
		endDentista.setCep(rs.getString("cep"));
		endDentista.setCidade(rs.getString("cidade"));
		endDentista.setUf(rs.getString("uf"));
		endDentista.setNumero(rs.getString("numero"));
		endDentista.setComplemento(rs.getString("complemento"));
		dentista.setEndereco(endDentista);
		dentista.setFuncao(rs.getString("funcao"));
		dentista.setCro(rs.getInt("cro"));
		return dentista;
	}else {
		System.out.println("dados informado o cpf n?o pertence a um dentista");
		
	}
	
	
}catch (Exception e) {
}
	return null;
}

public void removerRecepcionista(Recepcionista recepcionista) {
	Conexao conex = new Conexao();
	conex.conexao();
	String sql = "delete from funcionario where  cpf = ? and funcao = ?";
	String consultaFuncao = "select * from funcionario where cpf = ? and funcao = ?";
	PreparedStatement stm;
	try {
		stm = conex.con.prepareStatement(consultaFuncao);
		stm.setString(1,recepcionista.getCpf());
		stm.setString(2,"Recepcionista");
		ResultSet rs = stm.executeQuery();
		if(rs.next()) { 
			recepcionista.setCpf(rs.getString("cpf"));
			recepcionista.setFuncao(rs.getString("funcao"));
			PreparedStatement stmt = conex.con.prepareStatement(sql);
			stmt.setString(1,recepcionista.getCpf());
			stmt.setString(2,"Recepcionista");
			stmt.executeUpdate();
			System.out.println("excluido com sucesso");
		} else {
			System.out.println(" Dados Informados n?o pertence ao recepcionista");
		}
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
}


public void removerDentista(Dentista dentista) {
	Conexao conex = new Conexao();
	conex.conexao();
	String sql = "delete from funcionario where  cpf = ? and funcao = ?";
	String consultaFuncao = "select * from funcionario where cpf = ? and funcao = ?";
	PreparedStatement stm;
	try {
		stm = conex.con.prepareStatement(consultaFuncao);
		stm.setString(1,dentista.getCpf());
		stm.setString(2,"Dentista");
		ResultSet rs = stm.executeQuery();
		if(rs.next()) { 
			dentista.setCpf(rs.getString("cpf"));
			dentista.setFuncao(rs.getString("funcao"));
			PreparedStatement stmt = conex.con.prepareStatement(sql);
			stmt.setString(1,dentista.getCpf());
			stmt.setString(2,"Dentista");
			stmt.executeUpdate();
			System.out.println("excluido com sucesso");
		} else {
			System.out.println(" Dados Informados n?o pertence ao Dentista");
		}
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
}

public void EditarDentista(Dentista dentista) {
	Conexao conex = new Conexao();
	conex.conexao();
	
	String sql = "update funcionario set nome = ?, email =?, celular = ?,datanasc = ?,cpf = ?,rg = ?, cro =?, rua = ?, bairro = ?, cep = ?, cidade = ?, uf =?, numero = ?, complemento = ? where codigo = ?;";
	String consultaFuncao = "select * from funcionario where codigo = ? and funcao = ?";
	PreparedStatement stm;
	try {
		stm = conex.con.prepareStatement(consultaFuncao);
		stm.setInt(1,dentista.getCodigo());
		stm.setString(2,"Dentista");
		ResultSet rs = stm.executeQuery();
		if(rs.next()) { 
			dentista.setCodigo(rs.getInt("codigo"));
			dentista.setFuncao(rs.getString("funcao"));
		PreparedStatement stmt = conex.con.prepareStatement(sql);
		stmt.setString(1, dentista.getNome());
		stmt.setString(2, dentista.getEmail());
		stmt.setString(3, dentista.getCel());
		stmt.setString(4, dentista.getData_nascimento());
		stmt.setString(5, dentista.getCpf());
		stmt.setString(6, dentista.getRg());
		stmt.setInt(7, dentista.getCro());
		stmt.setString(8,dentista.getEndereco().getRua());
		stmt.setString(9,dentista.getEndereco().getBairro());
		stmt.setString(10,dentista.getEndereco().getCep());
		stmt.setString(11,dentista.getEndereco().getCidade());
		stmt.setString(12,dentista.getEndereco().getUf());
		stmt.setString(13,dentista.getEndereco().getNumero());
		stmt.setString(14,dentista.getEndereco().getComplemento());
		stmt.setInt(15, dentista.getCodigo());
		stmt.executeLargeUpdate();
		System.out.println("dados alterados com sucesso");
		}else {
			System.out.println("Cpf informado n?o pertence a um dentista");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void EditarRecepcionista(Recepcionista recepcionista) {
	Conexao conex = new Conexao();
	conex.conexao();
	
	String sql = "update funcionario set nome = ?, email =?, celular = ?,datanasc = ?,cpf = ?,rg = ?, ramal =?, rua = ?, bairro = ?, cep = ?, cidade = ?, uf =?, numero = ?, complemento = ? where codigo = ?;";
	String consultaFuncao = "select * from funcionario where codigo = ? and funcao = ?";
	PreparedStatement stm;
	try {
		stm = conex.con.prepareStatement(consultaFuncao);
		stm.setInt(1,recepcionista.getCodigo());
		stm.setString(2,"Recepcionista");
		ResultSet rs = stm.executeQuery();
		if(rs.next()) { 
			recepcionista.setCodigo(rs.getInt("codigo"));
			recepcionista.setFuncao(rs.getString("funcao"));
		PreparedStatement stmt = conex.con.prepareStatement(sql);
		stmt.setString(1, recepcionista.getNome());
		stmt.setString(2, recepcionista.getEmail());
		stmt.setString(3, recepcionista.getCel());
		stmt.setString(4, recepcionista.getData_nascimento());
		stmt.setString(5, recepcionista.getCpf());
		stmt.setString(6, recepcionista.getRg());
		stmt.setString(7, recepcionista.getRamal());
		stmt.setString(8,recepcionista.getEndereco().getRua());
		stmt.setString(9,recepcionista.getEndereco().getBairro());
		stmt.setString(10,recepcionista.getEndereco().getCep());
		stmt.setString(11,recepcionista.getEndereco().getCidade());
		stmt.setString(12,recepcionista.getEndereco().getUf());
		stmt.setString(13,recepcionista.getEndereco().getNumero());
		stmt.setString(14,recepcionista.getEndereco().getComplemento());
		stmt.setInt(15, recepcionista.getCodigo());
		stmt.executeLargeUpdate();
		System.out.println("dados alterados com sucesso");
		}else {
			System.out.println("Cpf informado n?o pertence a um Recepcionista");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}

