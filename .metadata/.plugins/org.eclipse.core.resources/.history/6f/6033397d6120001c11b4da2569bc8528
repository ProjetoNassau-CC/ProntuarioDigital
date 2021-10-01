package prontuario;


public class Dentista extends Funcionario {
	
	private int cro;


	

	public Dentista() {
		super();
		this.cro = 0;
	
	}
	
	public Dentista(int codigo, String nome, String email, String cel,
			String data_nascimento, String cpf, String rg,  Endereco endereco, int cro) {
		super(codigo, nome, email, cel, data_nascimento, cpf,rg, endereco);
	
		this.cro = cro;		
	}	
	
	public int getCro() {
		return cro;
	}

	public void setCro(int cro) {
		this.cro = cro;	
	}
	


	
	public String toString() {
		return 	"                          Dentista\n" 
				+ "\nCRO: "+ cro
				+ super.toString()
				+ getEndereco().toString();
		

	}	

}

