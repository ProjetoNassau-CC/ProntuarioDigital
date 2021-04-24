package prontuario;


public class Dentista extends Funcionario {
	
	private int cro;

	public Dentista(int codigo, String nome, String email, String tel, String cel,
			String data_nascimento, String cpf, String rg,  Endereco endereco, int cro) {
		super(codigo, nome, email, tel, cel, data_nascimento, cpf, rg,  endereco);
	
		this.cro = cro;		
	}	
	
	public Dentista() {	
	}	
	
	public int getCro() {
		return cro;
	}

	public void setCro(int cro) {
		this.cro = cro;			

	}
	public String toString() {
		return 	"                          Dentista\n" 
				+ "\nCodigo: " + getCodigo() 
				+ "\nCRO: "+ getCro() 
				+ "\nNome: " + getNome() 
				+ "\nEmail: " + getEmail() 
				+ "\nTelefone: "	+ getTel() 
				+ "\nCelular: " + getCel() 
				+ "\nData de nascimento: "	+ getData_nascimento() 
				+ "\nCpf: " + getCpf() 
				+ "\nRg: " 
				+ getRg() + getEndereco();
	}	

}

