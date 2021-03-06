package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;
import prontuario.Agenda;
import prontuario.Dentista;
import prontuario.Endereco;
import prontuario.Paciente;

public class CrudAgenda {

	
	public void removerAgenda(Agenda agenda) {
		Conexao conex = new Conexao();
		conex.conexao();
		String sql = "delete from agenda where  cpf = ? ";
		String consultaFuncao = "select * from agenda where cpf = ?";
		PreparedStatement stm;
		try {
			stm = conex.con.prepareStatement(consultaFuncao);
			stm.setString(1,agenda.getCpf());
		
			ResultSet rs = stm.executeQuery();
			if(rs.next()) { 
				agenda.setCpf(rs.getString("cpf"));
				PreparedStatement stmt = conex.con.prepareStatement(sql);
				stmt.setString(1,agenda.getCpf());
				stmt.executeUpdate();
				System.out.println("excluido com sucesso");
			} else {
				System.out.println(" N?o ? permitido excluir pois esse cpf n?o encontra-se cadastrado no sistema!");
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	
	public void inserirAgenda(Agenda agenda) {
		Conexao conex = new Conexao();
		conex.conexao();
		try {
			String sql = "INSERT INTO agenda(nomePaciente,cpf,nomeDentista,plano,tratamentoDente,Datainclusao,DataAgendada,Situacao) VALUES (?,?,?,?,?,?,?,?)";
			
		
			PreparedStatement stmt = conex.con.prepareStatement(sql);
				
				stmt.setString(1, agenda.getNome_paciente());
				stmt.setString(2, agenda.getCpf());
				stmt.setString(3, agenda.getNome_dentista());
				stmt.setString(4, agenda.getPlano_tratamento());
				stmt.setString(5, agenda.getTratamento_dente());
				stmt.setString(6, agenda.getData_inclusao());
				stmt.setString(7, agenda.getData_agenda());
				stmt.setString(8,	agenda.getStatus());
				stmt.execute();
				System.out.println("Agendamento marcado  com sucesso");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	public void EditarAgenda(Agenda agenda) {
		Conexao conex = new Conexao();
		conex.conexao();
		
		String sql = "update agenda set nomePaciente = ?, nomeDentista = ? ,plano = ?,tratamentoDente= ?,dataAgendada = ?,situacao = ? where cpf = ?;";
		String consultaFuncao = "select * from agenda where cpf = ? ";
		PreparedStatement stm;
		try {
			stm = conex.con.prepareStatement(consultaFuncao);
			stm.setString(1,agenda.getCpf());
			ResultSet rs = stm.executeQuery();
			if(rs.next()) { 
				agenda.setCpf(rs.getString("cpf"));
			PreparedStatement stmt = conex.con.prepareStatement(sql);
			stmt.setString(1, agenda.getNome_paciente());
			stmt.setString(2, agenda.getNome_dentista());
			stmt.setString(3, agenda.getPlano_tratamento());
			stmt.setString(4, agenda.getTratamento_dente());
			stmt.setString(5, agenda.getData_agenda());
			stmt.setString(6, agenda.getStatus());
			stmt.setString(7, agenda.getCpf());
			
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

	public Agenda BuscarAgendamento(String cpf) {
		try {
		Conexao conex = new Conexao();
		conex.conexao();
		Agenda agen = new Agenda();
		Endereco endDentista = new Endereco();
		String sql = "select * from agenda where cpf = ?";
		PreparedStatement stmt = conex.con.prepareStatement(sql);
		stmt.setString(1,cpf);
		ResultSet rs = stmt.executeQuery();
		//verifica se a consulta encontrou um funcionario com o CPF informado.
		if(rs.next()) { 
			agen.setNome_paciente(rs.getString("nomePaciente"));
			agen.setCpf(rs.getString("cpf"));
			agen.setNome_dentista(rs.getString("nomeDentista"));
			agen.setPlano_tratamento(rs.getString("plano"));
			agen.setTratamento_dente(rs.getString("tratamentoDente"));
			agen.setData_inclusao(rs.getString("datainclusao"));
			agen.setData_agenda(rs.getString("dataAgendada"));
			agen.setStatus(rs.getString("situacao"));
			
			return agen;
		}else {
			System.out.println("dados informado n?o tem agendamento no sistema!");
			
		}

		}catch (Exception e) {
		}
			return null;
		}









}
	
	

