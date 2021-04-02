package prontuario;

public class Agenda {
	
	int codigo;
	int codigo_ficha;
	String nome_paciente;
	String nome_dentista;
	String plano_tratamento;
	String tratamento_dente;
	String data_inclusao;
	String data_agenda;
	char concluido;
	char cancelado;
	char reagendado;
	
	
	public Agenda(int codigo, int codigo_ficha, String nome_paciente, String nome_dentista, String plano_tratamento,
			String tratamento_dente, String data_inclusao, String data_agenda, char concluido, char cancelado,
			char reagendado) {
		super();
	
		this.codigo = codigo;
		this.codigo_ficha = codigo_ficha;
		this.nome_paciente = nome_paciente;
		this.nome_dentista = nome_dentista;
		this.plano_tratamento = plano_tratamento;
		this.tratamento_dente = tratamento_dente;
		this.data_inclusao = data_inclusao;
		this.data_agenda = data_agenda;
		this.concluido = concluido;
		this.cancelado = cancelado;
		this.reagendado = reagendado;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCodigo_ficha() {
		return codigo_ficha;
	}
	public void setCodigo_ficha(int codigo_ficha) {
		this.codigo_ficha = codigo_ficha;
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
	public String getPlano_tratamento() {
		return plano_tratamento;
	}
	public void setPlano_tratamento(String plano_tratamento) {
		this.plano_tratamento = plano_tratamento;
	}
	public String getTratamento_dente() {
		return tratamento_dente;
	}
	public void setTratamento_dente(String tratamento_dente) {
		this.tratamento_dente = tratamento_dente;
	}
	public String getData_inclusao() {
		return data_inclusao;
	}
	public void setData_inclusao(String data_inclusao) {
		this.data_inclusao = data_inclusao;
	}
	public String getData_agenda() {
		return data_agenda;
	}
	public void setData_agenda(String data_agenda) {
		this.data_agenda = data_agenda;
	}
	public char getConcluido() {
		return concluido;
	}
	public void setConcluido(char concluido) {
		this.concluido = concluido;
	}
	public char getCancelado() {
		return cancelado;
	}
	public void setCancelado(char cancelado) {
		this.cancelado = cancelado;
	}
	public char getReagendado() {
		return reagendado;
	}
	public void setReagendado(char reagendado) {
		this.reagendado = reagendado;
	}
	

}
