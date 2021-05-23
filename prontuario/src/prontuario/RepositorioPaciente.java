package prontuario;

public interface RepositorioPaciente {
	
	abstract void inserir(Paciente pac);
	abstract Paciente procurar(String nome);
	abstract void remover(String nome);
}
