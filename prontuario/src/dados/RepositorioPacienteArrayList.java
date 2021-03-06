package dados;

import java.util.ArrayList;
import java.util.List;

import prontuario.Paciente;
import prontuario.RepositorioPaciente;

public class RepositorioPacienteArrayList implements RepositorioPaciente{
	private List<Paciente> DadosPaciente;
		
	public RepositorioPacienteArrayList() {		
		DadosPaciente = new ArrayList<Paciente>();
	}
	
	@Override
	public void inserir(Paciente pac) {
		DadosPaciente.add((Paciente) pac);
	}
	
	@Override
	public Paciente procurar(String cpf) {
		Paciente resultado = null;
		for(Paciente ProcurarPac : DadosPaciente) {
			if(ProcurarPac.getCpf().equals(cpf)) {
				resultado = ProcurarPac;
			}
		}		
		return resultado;
	}

	@Override
	public void remover(String cpf) {			
		String mensagem = "\nN?o foi possivel remover, CPF n?o encontrado!";
		
		Paciente resultado = null;
		for(Paciente p : DadosPaciente) {
			if(p.getCpf().equals(cpf)) {				
				resultado = p;
			    mensagem = p.getNome() + " Foi Removido com Sucesso!";									
			}			
		}
		
		if(resultado != null) {
			DadosPaciente.remove(resultado);				
		} 					
		System.out.println(mensagem);		
	}
	
	public List<Paciente> DadosPaciente(){
		return this.DadosPaciente;		
	}
}