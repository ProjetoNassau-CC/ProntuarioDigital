package prontuario;

public class Funcionario {
	
	private int codigo;
	private String nome;
	private String email;
	private String cel;
	private Endereco endereco;
	private String data_nascimento;
	private String cpf;
	private String rg;
	

	private String funcao;
	
	public Funcionario() {	
		this.codigo = 0;
		this.nome = null;
		this.email = null;
		this.cel = null;
		this.endereco = null;
		this.data_nascimento = null;
		this.cpf = null;	
		this.rg = null;
	}
	
	public Funcionario(int codigo, String nome, String email, String cel,
			String data_nascimento, String cpf,String rg, Endereco endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.cel = cel;
		this.endereco = endereco;
		this.data_nascimento = data_nascimento;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String toString() {
		return  "\nCodigo: " + codigo				
				+ "\nNome: " + nome
				+ "\nEmail: " + email
				+ "\nCelular: " + cel
				+ "\nData de nascimento: "	+ data_nascimento 
				+ "\nCpf: " + cpf
				+ "\nRg: " + rg;
	}
	
}