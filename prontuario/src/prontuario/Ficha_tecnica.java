package prontuario;

public class Ficha_tecnica {
	private int codigo;
	private String nome_paciente;
	private String nome_dentista;
	private Endereco endereco_paciente;
	private String tel_paciente;
	private String data_consulta;
	private Anamnese perguntas;
	private String plano_tratamento;
	private String data_tratamento;
	private String gera_orcamento;
	
	public Ficha_tecnica(int codigo, String nome_paciente, String nome_dentista, Endereco endereco_paciente,
			String tel_paciente, String data_consulta, Anamnese perguntas, String plano_tratamento,
			String data_tratamento, String gera_orcamento) {
		this.codigo = codigo;
		this.nome_paciente = nome_paciente;
		this.nome_dentista = nome_dentista;
		this.endereco_paciente = endereco_paciente;
		this.tel_paciente = tel_paciente;
		this.data_consulta = data_consulta;
		this.perguntas = perguntas;
		this.plano_tratamento = plano_tratamento;
		this.data_tratamento = data_tratamento;
		this.gera_orcamento = gera_orcamento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome_paciente() {
		return nome_paciente;
	}

	public void setNome_paciente(String nome_paciente) {
		this.nome_paciente = nome_paciente;
	}

	public String getNome_dentista() {
		return nome_dentista;
	}

	public void setNome_dentista(String nome_dentista) {
		this.nome_dentista = nome_dentista;
	}

	public Endereco getEndereco_paciente() {
		return endereco_paciente;
	}

	public void setEndereco_paciente(Endereco endereco_paciente) {
		this.endereco_paciente = endereco_paciente;
	}

	public String getTel_paciente() {
		return tel_paciente;
	}

	public void setTel_paciente(String tel_paciente) {
		this.tel_paciente = tel_paciente;
	}

	public String getData_consulta() {
		return data_consulta;
	}

	public void setData_consulta(String data_consulta) {
		this.data_consulta = data_consulta;
	}

	public Anamnese getPerguntas() {
		return perguntas;
	}

	public void setPerguntas(Anamnese perguntas) {
		this.perguntas = perguntas;
	}

	public String getPlano_tratamento() {
		return plano_tratamento;
	}

	public void setPlano_tratamento(String plano_tratamento) {
		this.plano_tratamento = plano_tratamento;
	}

	public String getData_tratamento() {
		return data_tratamento;
	}

	public void setData_tratamento(String data_tratamento) {
		this.data_tratamento = data_tratamento;
	}

	public String getGera_orcamento() {
		return gera_orcamento;
	}

	public void setGera_orcamento(String gera_orcamento) {
		this.gera_orcamento = gera_orcamento;
	}
}
