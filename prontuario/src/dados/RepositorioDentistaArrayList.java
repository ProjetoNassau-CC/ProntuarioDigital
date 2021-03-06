package dados;


import java.util.ArrayList;
import java.util.List;

import prontuario.Dentista;
import prontuario.Funcionario;
import prontuario.RepositorioFuncionario;

public class RepositorioDentistaArrayList implements RepositorioFuncionario{
	private List<Dentista> DadosDentista;
		
	public RepositorioDentistaArrayList() {		
		DadosDentista = new ArrayList<Dentista>();
	}
	
	@Override
	public void inserir(Funcionario func) {
		DadosDentista.add((Dentista) func);
	}
	
	@Override
	public Funcionario procurar(String cpf) {
		Funcionario resultado = null;
		for(Funcionario ProcurarDent : DadosDentista) {
			if(ProcurarDent.getCpf().equals(cpf)) {
				resultado = ProcurarDent;				
			}				
		}			
		return resultado;				
	}

	@Override
	public void remover(String cpf) {			
		String mensagem = "\nN?o foi possivel remover, CPF n?o encontrado!"; 
		
		Funcionario resultado = null;
		for(Funcionario RemoverDent : DadosDentista) {
			if(RemoverDent.getCpf().equals(cpf)) {				
				resultado = RemoverDent;
			    mensagem = RemoverDent.getNome() + " Foi Removido com Sucesso!";									
			}			
		}
		if(resultado != null) {
			DadosDentista.remove(resultado);				
		} 			
		System.out.println(mensagem);		
	}
	
	public List<Dentista> DadosDentista(){
		return this.DadosDentista;
	}
}