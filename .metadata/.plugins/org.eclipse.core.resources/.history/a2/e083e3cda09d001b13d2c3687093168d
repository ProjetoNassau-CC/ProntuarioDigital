package prontuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Ficha_tecnica {
	Scanner input = new Scanner(System.in);
	
	private int codigo;
	private Paciente paciente;
	private String nome_dentista;
	private String data_consulta;
	private Anamnese perguntas;
	private String plano_tratamento;
	private String data_tratamento;
	private String gera_orcamento;

	public Ficha_tecnica(int codigo, Paciente paciente, String nome_dentista, String data_consulta, Anamnese perguntas,
			String plano_tratamento, String data_tratamento, String gera_orcamento) {
		this.codigo = codigo;
		this.paciente = paciente;
		this.nome_dentista = nome_dentista;
		this.data_consulta = data_consulta;
		this.perguntas = perguntas;
		this.plano_tratamento = plano_tratamento;
		this.data_tratamento = data_tratamento;
		this.gera_orcamento = gera_orcamento;
	}	
	
	public Ficha_tecnica() {
		
	}

	ArrayList<Ficha_tecnica> fichatecnica = new ArrayList<Ficha_tecnica>();
	
	public void dadosFichaTecnica() {			
		Dentista dentista = new Dentista();		
		Ficha_tecnica ficha = new Ficha_tecnica();
		
		System.out.println("\n==========================================================");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXX Ficha Técnica XXXXXXXXXXXXXXXXXXXXX\n");	

		System.out.print("Nome do dentista: ");
		dentista.setNome(input.next());
		
		System.out.print("Data da consulta (xx/xx/xxxx): ");
		setData_consulta(input.next());
		
		System.out.print("Data do tratamento (xx/xx/xxxx): ");
		setData_tratamento(input.next());
		
		System.out.print("Plano do tratamento: ");
		setPlano_tratamento(input.next());
		
		System.out.print("Digite o orçamento: R$");
		setGera_orcamento(input.next());	
		
		fichatecnica.add(ficha);
		
	}
	
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
