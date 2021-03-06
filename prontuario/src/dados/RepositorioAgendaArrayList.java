package dados;


import java.util.ArrayList;
import java.util.List;

import prontuario.Agenda;
import prontuario.RepositorioAgenda;

public class RepositorioAgendaArrayList implements RepositorioAgenda{
	private List<Agenda> DadosAgenda; //
		
	public RepositorioAgendaArrayList() {		
		DadosAgenda = new ArrayList<Agenda>();
	}
	
	@Override
	public void inserir(Agenda agenda) {
		DadosAgenda.add((Agenda) agenda);
	}
	
	@Override
	public Agenda procurar(String cpf) {
		Agenda resultado = null;
		for (Agenda ProcurarAgenda : DadosAgenda) {
			if(ProcurarAgenda.getCpf().equals(cpf)) {
				resultado = ProcurarAgenda;	
			}
		}	
		return resultado;
	}

	@Override
	public void remover(String cpf) {			
		String mensagem = "\nN?o foi possivel remover, CPF n?o encontrado!";
		
		Agenda resultado = null;
		for(Agenda a : DadosAgenda) {
			if(a.getCpf().equals(cpf)) {				
				resultado = a;
			    mensagem = a.getNome_paciente() + " Foi Removido com Sucesso!";									
			}			
		}
		if(resultado != null) {
			DadosAgenda.remove(resultado);				
		} 					
		System.out.println(mensagem);	
	}
	
	public List<Agenda> DadosAgenda(){
		return this.DadosAgenda;
	}
}
