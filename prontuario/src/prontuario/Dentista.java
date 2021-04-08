package prontuario;

public class Dentista extends Funcionario {
	
	private String cro;

	public Dentista(int codigo, String nome, String email, String tel, String cel, Endereco endereco,
			String data_nascimento, String cpf, String rg, String observacao) {
		super(codigo, nome, email, tel, cel, endereco, data_nascimento, cpf, rg);
		
	}

	public String getCro() {
		return cro;
	}

	public void setCro(String cro) {
		this.cro = cro;
	}

}

