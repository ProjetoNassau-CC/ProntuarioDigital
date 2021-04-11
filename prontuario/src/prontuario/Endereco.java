package prontuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Endereco {
	Scanner input = new Scanner(System.in);
	
	private String rua;
	private String bairro;
	private String cep;
	private String cidade;
	private String uf;
	private String numero;
	private String complemento;
	
	public Endereco(String rua, String bairro, String cep, String cidade, String uf, String numero,
			String complemento) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
		this.numero = numero;
		this.complemento = complemento;
	}
	
	public Endereco() {		
		
	}

	ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
	
	public void dadosEndereco() {
		Endereco e = new Endereco();
		System.out.print("Rua: ");
		e.setRua(input.next());	
		
		System.out.print("Bairro: ");
		e.setBairro(input.next());	
		
		System.out.print("CEP: ");
		e.setCep(input.next());	
		
		System.out.print("Cidade: ");
		e.setCidade(input.next());	
		
		System.out.print("UF: ");
		e.setUf(input.next());	
		
		System.out.print("Numero: ");
		e.setNumero(input.next());	
		
		System.out.print("Complemento: ");
		e.setComplemento(input.next());	
		

	
	}
	

	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String toString() {
		return "\nRua: " + getRua() + "\nBairro: " + getBairro() + "\nCep: " + getCep() + "\nCidade:" + getCidade() 
				+ "\nUf: " + getUf() + "\nNumero: " + getNumero() + "\nComplemento: " + getComplemento();
	}
	
	
}
