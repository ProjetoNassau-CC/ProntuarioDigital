package prontuario;

public class Paciente extends Funcionario {

	public Paciente(int codigo, String nome, String email, String tel, String cel, Endereco endereco,
			String data_nascimento, String cpf, String rg) {
		super(codigo, nome, email, tel, cel, endereco, data_nascimento, cpf, rg);
		
	}
	
	@Override
	public String toString() 
	{
		return super.toString();		
	}
}