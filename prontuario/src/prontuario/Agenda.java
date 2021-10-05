package prontuario;

public class Agenda {
	
	private String nome_dentista;
	private String nome_paciente;
	private String cpf;
	private String plano_tratamento;
	private String tratamento_dente;
	private String data_inclusao;
	private String data_agenda;
	private String status;
	public Agenda() {

		this.nome_dentista = null;
		this.nome_paciente = null;
		this.cpf = null;
		this.plano_tratamento = null;
		this.tratamento_dente = null;
		this.data_inclusao = null;
		this.data_agenda = null;
		this.status = null;
	
	}
		
	public Agenda(String nome_dentista, String nome_paciente, String cpf, String plano_tratamento,
			String tratamento_dente, String data_inclusao, String data_agenda, String status) {
	
		this.nome_dentista = nome_dentista;
		this.nome_paciente = nome_paciente;	
		this.cpf = cpf;
		this.plano_tratamento = plano_tratamento;
		this.tratamento_dente = tratamento_dente;
		this.data_inclusao = data_inclusao;
		this.data_agenda = data_agenda;
		this.status = status;
	}

	public void setNome_dentista(String nome_dentista) {
		this.nome_dentista = nome_dentista;
	}
	public String getPlano_tratamento() {
		return plano_tratamento;
	}
	public String getNome_paciente() {
		return nome_paciente;
	}
	public void setNome_paciente(String nome_paciente) {
		this.nome_paciente = nome_paciente;
	}	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome_dentista() {
		return nome_dentista;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


	public String toString() {
		return  "\n                        Agendamento\n"
				+ "\nNome do paciente: " + nome_paciente	
				+ "\nCPF: " + cpf 
				+ "\nNome do dentista: " + nome_dentista
				+ "\nPlano de tratamento: " + plano_tratamento
				+ "\nTratamento do dente: " + tratamento_dente
				+ "\nData de inclusao: " + data_inclusao
				+ "\nData do agendamento: " + data_agenda
				+ "\nStatus: " + status;
	}	
	

}
