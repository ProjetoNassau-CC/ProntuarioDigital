package prontuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Dentista extends Funcionario {
	Scanner sc = new Scanner(System.in);
	
	private String cro;


	public Dentista(int codigo, String Cro, String nome, String email, String tel, String cel,
			String data_nascimento, String cpf, String rg,  Endereco endereco) {
		super(codigo, nome, email, tel, cel, data_nascimento, cpf, rg,  endereco);
		
	}
	
	ArrayList<Dentista> dentistas = new ArrayList();
	public void CadastrarDentista(){
		Dentista dent = new Dentista();
		Endereco end = new Endereco();


		System.out.println("\n==========================================================");
		System.out.println("XXXXXXXXXXXXXXXXXXXX Dados do Dentista XXXXXXXXXXXXXXXXXXX");	
		System.out.println("==========================================================\n");
		
		System.out.print("Codigo:");
		int codigo1 = sc.nextInt();
		System.out.print("Nome:");
		sc.nextLine();
		String nome1 =sc.nextLine();
		System.out.print("Email:");
		String email1 = sc.next();
		System.out.print("Telefone:");
		String tel1= sc.next();
		System.out.print("celular:");
		String cel1 = sc.next();
		System.out.print("Data de nascimento:");
		String data_nasc1 = sc.next();
		System.out.print("CPF:");
		String cpf1 = sc.next();
		System.out.print("RG:");
		String rg1 = sc.next();
		System.out.print("Rua: ");
		sc.nextLine();
		end.setRua(sc.nextLine());	
		System.out.print("Bairro: ");
		end.setBairro(sc.nextLine());	
		
		System.out.print("CEP: ");
		end.setCep(sc.next());	
		
		System.out.print("Cidade: ");
		end.setCidade(sc.next());	
		
		System.out.print("UF: ");
		end.setUf(sc.next());	
		
		System.out.print("Numero: ");
		end.setNumero(sc.next());	
		
		System.out.print("Complemento: ");
		end.setComplemento(sc.next());
		
		
		System.out.print("CRO:");
		String cro = sc.next();
		
		Dentista Dentistas = new Dentista(codigo1,nome1,email1,tel1,cel1,data_nasc1,cpf1,rg1,cro, end);
		dentistas.add(Dentistas);
		
		
	}
	
	public  void BuscarDentista() {
		
		System.out.println("\nDigite o CPF para Buscar: ");
		String buscarCpfd = sc.next();
		for (Dentista d : dentistas) {
			if(d.getCpf().equals(buscarCpfd)) {
				System.out.println("\nNome: " +d.getNome() + "\nEmail: " +d.getEmail() +"\nTelefone: " + d.getTel() 
				+"\nCelular: " + d.getCel() +"\nData de Nascimento: " + d.getData_nascimento() 
				+"\nCpf: " + d.getCpf() +"\nRg: " + d.getRg());
			}
		}
			
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

