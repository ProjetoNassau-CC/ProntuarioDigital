package prontuario;

import java.util.Scanner;

public class Dentista extends Funcionario {
	Scanner input = new Scanner(System.in);
	
	private String cro;


	public Dentista(int codigo, String Cro, String nome, String email, String tel, String cel,
			String data_nascimento, String cpf, String rg,  Endereco endereco) {
		super(codigo, nome, email, tel, cel, data_nascimento, cpf, rg,  endereco);
		
	}
	
	public Dentista() {
	
	}
	
	public void questDentista() {
		
	}
	
	public String getCro() {
		return cro;
	}

	public void setCro(String cro) {
		this.cro = cro;
			

	}
	
	public String toString() {
		return "\n CRO: "+ getCro() + "\nNome: "+ getNome();
	}
	

}

