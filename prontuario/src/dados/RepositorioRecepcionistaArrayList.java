package dados;

import java.util.ArrayList;
import java.util.List;

import prontuario.Funcionario;
import prontuario.Recepcionista;
import prontuario.RepositorioFuncionario;

public class RepositorioRecepcionistaArrayList implements RepositorioFuncionario{
	private List<Recepcionista> DadosRecepcionista;
		
	public RepositorioRecepcionistaArrayList() {		
		DadosRecepcionista = new ArrayList<Recepcionista>();
	}
	
	@Override
	public void inserir(Funcionario func) {
		DadosRecepcionista.add((Recepcionista) func);
	}
	
	@Override
	public Funcionario procurar(String cpf) {
		Funcionario resultado = null;
		for(Funcionario ProcurarRecep : DadosRecepcionista) {
			if(ProcurarRecep.getCpf().equals(cpf)) {
				resultado = ProcurarRecep;
			}
		}
		return resultado;
	}

	@Override
	public void remover(String cpf) {			
		String mensagem = "\nNão foi possivel remover, CPF não encontrado!";
		
		Funcionario resultado = null;
		for(Funcionario RemoverRecep : DadosRecepcionista) {
			if(RemoverRecep.getCpf().equals(cpf)) {				
				resultado = RemoverRecep;
			    mensagem = RemoverRecep.getNome() + " Foi Removido com Sucesso!";									
			}			
		}
		if(resultado != null) {
			DadosRecepcionista.remove(resultado);				
		} 					
		System.out.println(mensagem);		
	}
	
	public List<Recepcionista> DadosRecepcionista(){
		return this.DadosRecepcionista;
	}
}