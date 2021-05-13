package prontuario;

import java.util.Scanner;

public class Paciente {
	Scanner input = new Scanner(System.in);
	
	protected int codigo;
	private String nome;
	private String email;
	private String tel;
	private String cel;	
	private String data_nascimento;
	private String cpf;
	private String rg;
	private Endereco endereco;
	private Anamnese anamnese;
	private Ficha_clinica ficha_clinica ;
	
	public Paciente(int codigo, String nome, String email, String tel, String cel,
			String data_nascimento, String cpf, String rg, Endereco endereco, 
			Anamnese anamnese, Ficha_clinica ficha_clinica ) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.tel = tel;
		this.cel = cel;		
		this.data_nascimento = data_nascimento;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;		
		this.anamnese = anamnese;
		this.ficha_clinica = ficha_clinica ;
	}
	
	public Paciente() {		
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

	public Ficha_clinica getFicha_clinica () {
		return ficha_clinica ;
	}

	public void setFicha_clinica (Ficha_clinica ficha_clinica ) {
		this.ficha_clinica  = ficha_clinica;
	}

	public Anamnese getAnamnese() {
		return anamnese;
	}

	public void setAnamnese(Anamnese anamnese) {
		this.anamnese = anamnese;
	}
	
	public String toString() {
		return  "                          Paciente\n" 
				+  "\nN� Prontu�rio: " + codigo
				+ "\nNome: " + nome 
				+ "\nEmail: " + email
				+ "\nTelefone: " + tel
				+ "\nCelular: " + cel 
				+ "\nData de nascimento: " + data_nascimento
				+ "\nCpf: " + cpf
				+ "\nRg: " + rg
				+ endereco.toString() 
				+ anamnese.toString() 
				+ ficha_clinica.toString();
	}	
}