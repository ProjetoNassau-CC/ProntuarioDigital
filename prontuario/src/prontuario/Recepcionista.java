package prontuario;

public class Recepcionista extends Funcionario {
	
	private String ramal;

	public Recepcionista() {
		super();
		this.ramal = null;
	}
	
	public Recepcionista(int codigo, String nome, String email, String cel,
			String data_nascimento, String cpf,String rg, String Ramal, Endereco endereco) {
		super(codigo, nome, email, cel, data_nascimento, cpf,rg, endereco);
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}
	
	public String toString() {
		return	super.toString()
				+"\nRamal: " + ramal
				+getEndereco().toString();
	}
	
	

}
