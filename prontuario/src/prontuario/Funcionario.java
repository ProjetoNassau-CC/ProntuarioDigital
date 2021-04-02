package prontuario;

public class Funcionario {
	
	private int codigo;
	private String nome;
	private String email;
	private String tel;
	private String cel;
	private Endereco endereco;
	private String data_nascimento;
	private String cpf;
	private String rg;
	private String observacao;
	
	public Funcionario(int codigo, String nome, String email, String tel, String cel, Endereco endereco,
			String data_nascimento, String cpf, String rg, String observacao) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.tel = tel;
		this.cel = cel;
		this.endereco = endereco;
		this.data_nascimento = data_nascimento;
		this.cpf = cpf;
		this.rg = rg;
		this.observacao = observacao;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
