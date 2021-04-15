package prontuario;


public class Ficha_clinica {

	private Paciente paciente;
	private String nome_dentista;
	private String data_consulta;	
	private String plano_tratamento;
	private String data_tratamento;
	private String gera_orcamento;

	public Ficha_clinica(Paciente paciente, String nome_dentista, String data_consulta,
			String plano_tratamento, String data_tratamento, String gera_orcamento) {
	
		this.paciente = paciente;
		this.nome_dentista = nome_dentista;
		this.data_consulta = data_consulta;
		this.plano_tratamento = plano_tratamento;
		this.data_tratamento = data_tratamento;
		this.gera_orcamento = gera_orcamento;
	}	
	
	public Ficha_clinica() {		
	}	
	
	public String getNome_dentista() {
		return nome_dentista;
	}

	public void setNome_dentista(String nome_dentista) {
		this.nome_dentista = nome_dentista;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getData_consulta() {
		return data_consulta;
	}

	public void setData_consulta(String data_consulta) {
		this.data_consulta = data_consulta;
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

	Dentista dentista = new Dentista();
	public String toString() {
		return  "\n\n=========================================================="
				+"\n                        Ficha Tecnica\n"			
				+ "\nNome: " + getNome_dentista() 
				+ "\nData da Consulta: " + getData_consulta()
				+ "\nPlano Tratamento: " + getPlano_tratamento() 
				+ "\nData do tratamento: " + getData_tratamento() 
				+ "\nOrçamento: " + getGera_orcamento();
	}
	
	
}
