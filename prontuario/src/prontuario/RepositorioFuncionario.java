package prontuario;

public interface RepositorioFuncionario {
	
	abstract void inserir(Funcionario func);
	abstract Funcionario procurar(String cpf);
	abstract void remover(String cpf);	
}
