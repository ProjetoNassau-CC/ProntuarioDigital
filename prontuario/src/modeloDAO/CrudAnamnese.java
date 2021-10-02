package modeloDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;
import prontuario.Anamnese;
import prontuario.Paciente;

public class CrudAnamnese {
	/*
	public void inserirAnamnese(Anamnese anamnese) {
		Conexao conex = new Conexao();
		
		conex.conexao();
			Paciente  paciente = new Paciente();
			
			
			String sql = "INSERT INTO anamnese (nome,cpf,anestesia,hemoragia,febrereumatica,renal,respiratorio,cardiaco,gastrico,articulacao,antecedentesFamiliares,arlegia) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
			String consultaFuncao = "select * from paciente where cpf = ?";
			PreparedStatement stm;
		
			try {
				stm = conex.con.prepareStatement(consultaFuncao);
				stm.setString(1,paciente.getCpf());
			
				ResultSet rs = stm.executeQuery();
				if(rs.next()) { 
					paciente.setCpf(rs.getString("cpf"));
					paciente.setNome(rs.getString("nome"));
			PreparedStatement stmt = conex.con.prepareStatement(sql);
				stmt.setString(1,paciente.getNome());	
				stmt.setString(2,paciente.getCpf());
				stmt.setString(3, anamnese.getProblemaAnestesia());
				stmt.setString(4, anamnese.getProblemaHemorragia());
				stmt.setString(5, anamnese.getFebreReumatica());
				stmt.setString(6, anamnese.getProblemaRenal());
				stmt.setString(7, anamnese.getProblemaRespitorio());
				stmt.setString(8, anamnese.getProblemaCardiaco());
				stmt.setString(9, anamnese.getProblemaGastrico());
				stmt.setString(10,	anamnese.getProblemaArticular());
				stmt.setString(11, anamnese.getAntecedenteFamiliar());
				stmt.setString(12, anamnese.getAlergia());
				stmt.execute();
				System.out.println("cadastrado com sucesso");
				
				} else {
					System.out.println("Para fazer a Anamnese o paciente deve estar cadastrado no sistema!");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
*/
}
