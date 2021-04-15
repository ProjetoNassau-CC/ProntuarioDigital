package prontuario;

import java.util.Locale;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int opcao1;
		int opcao2;	    
	   
		ArrayList<Dentista> DadosDentista = new ArrayList<Dentista>();
		ArrayList<Paciente> DadosPaciente = new ArrayList<Paciente>();		
	
		boolean condicao = false;
		
		do {
			System.out.println("=-=-=-=-=-=-=-=-=-=-= Fa�a seu Loguin =-=-=-=-=-=-=-=-=-=-=");
	
			System.out.print("Login: ");
			String login = input.next();
			
			System.out.print("Senha: ");
			String senha = input.next();
			
			if (login.equals("admin") && senha.equals("1234")) {
				condicao = true;
			}
		
		}while(condicao != true);
			
		System.out.println("\n==========================================================");
		System.out.println("                 Login efetuado com sucesso");
		System.out.print("==========================================================");
		
		do {
			
			System.out.print("\n==========================================================");
			System.out.print("\n      (Obs: registrar primeiro o Dentista(apenas 1)\n");			
			System.out.print(""
					+ "\n1- Dentista Atual"
					+ "\n2- Cadastrar Prontuario"
					+ "\n3- Fazer Busca/Exibir"
					+ "\n4- Finalizar"
					+ "");
			System.out.println("\n==========================================================");
			System.out.print("O que deseja fazer? ");
			opcao1 = input.nextInt();
			System.out.println("==========================================================\n");					
			
			switch(opcao1) {	
			case 1:				
				Endereco endereco1 = new Endereco();

				System.out.println("\n==========================================================");
				System.out.println("XXXXXXXXXXXXXXXXXXXX Dados do Dentista XXXXXXXXXXXXXXXXXXX");	
				System.out.println("==========================================================\n");
				
				System.out.print("                      Dados do Dentista\n");
				
				System.out.print("Codigo: ");
				int Dentista_codigo = input.nextInt();
				
				System.out.print("CRO: ");
				int Dentista_cro = input.nextInt();				
				
				System.out.print("Nome: ");				
				String Dentista_nome = input.next();
				
				System.out.print("Email: ");				
				String Dentista_email = input.next();
				
				System.out.print("Telefone: ");			
				String Dentista_tel = input.next();
				
				System.out.print("celular: ");				
				String Dentista_cel = input.next();
				
				System.out.print("Data de nascimento: ");			
				String Dentista_data_nascimento = input.next();
				
				System.out.print("CPF: ");				
				String Dentista_cpf = input.next();
				
				System.out.print("RG: ");			
				String Dentista_rg = input.next();				
				
				System.out.println("\n                          Endere�o\n");
				
				System.out.print("Rua: ");						
				endereco1.setRua(input.next());	
				
				System.out.print("Bairro: ");
				endereco1.setBairro(input.next());	
				
				System.out.print("CEP: ");
				endereco1.setCep(input.next());	
				
				System.out.print("Cidade: ");
				endereco1.setCidade(input.next());	
				
				System.out.print("UF: ");
				endereco1.setUf(input.next());	
				
				System.out.print("Numero: ");
				endereco1.setNumero(input.next());	
				
				System.out.print("Complemento: ");
				endereco1.setComplemento(input.next());
				
					
				Dentista dentista = new Dentista(Dentista_codigo, Dentista_cro, Dentista_nome, Dentista_email, Dentista_tel, 
						Dentista_cel, Dentista_data_nascimento, Dentista_cpf, Dentista_rg, endereco1);
				DadosDentista.add(dentista);				
				
				break;
			case 2:						
				Endereco endereco = new Endereco();
				Ficha_clinica fichaClinica = new Ficha_clinica();
			    Anamnese anamnese = new Anamnese();
			    Paciente pac;
			    
				System.out.println("\n==========================================================");
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXX Prontu�rio XXXXXXXXXXXXXXXXXXXXXXX");	
				System.out.println("==========================================================\n");
				
				System.out.print("                      Dados do Paciente\n");
				
				//Codigo do Prontuario
				System.out.print("N� Prontu�rio: ");
				int Paciente_codigo = input.nextInt();
			
				System.out.print("Nome: ");
				String Paciente_nome = input.next();
			
				System.out.print("Email: ");
				String Paciente_email = input.next();
				
				System.out.print("Telefone: ");
				String Paciente_tel = input.next();
				
				System.out.print("Celular: ");
				String Paciente_cel = input.next();
				
				System.out.print("Data de Nascimento: ");
				String Paciente_data_nascimento = input.next();
				
				System.out.print("CPF: ");
				String Paciente_cpf = input.next();
				
				System.out.print("RG: ");
				String Paciente_rg = input.next();						
				
				System.out.println("\n                          Endere�o\n");
				
				System.out.print("Rua: ");
				endereco.setRua(input.next());	
				
				System.out.print("Bairro: ");
				endereco.setBairro(input.next());	
				
				System.out.print("CEP: ");
				endereco.setCep(input.next());	
				
				System.out.print("Cidade: ");
				endereco.setCidade(input.next());	
				
				System.out.print("UF: ");
				endereco.setUf(input.next());	
				
				System.out.print("Numero: ");
				endereco.setNumero(input.next());	
				
				System.out.print("Complemento: ");
				endereco.setComplemento(input.next());		

				System.out.println("\n                          Anamnese");
				System.out.println("                       Digite [S ou N]\n");
				
				System.out.print("Problema com Anestesia? ");
				anamnese.setProblemaAnestesia(input.nextLine());
				anamnese.setProblemaAnestesia(input.nextLine());
				
				System.out.print("Problema de Hemorragia? ");
				anamnese.setProblemaHemorragia(input.nextLine());
				
				System.out.print("Problema de Febre Reum�tica? ");
				anamnese.setFebreReumatica(input.nextLine());

				System.out.print("Problema Renal? ");
				anamnese.setProblemaRenal(input.nextLine());	
				
				System.out.print("Problema Respirat�rio? ");
				anamnese.setProblemaRespitorio(input.nextLine());
				
				System.out.print("Problema Card�aco? ");
				anamnese.setProblemaCardiaco(input.nextLine());
				
				System.out.print("Problema G�strico? ");
				anamnese.setProblemaGastrico(input.nextLine());
				
				System.out.print("Problema com Articula��o? ");
				anamnese.setProblemaArticular(input.nextLine());
				
				System.out.print("Antecedentes Familiar, se sim, Quais? ");
				anamnese.setAntecedenteFamiliar(input.nextLine());
				
				System.out.print("Alergias, se sim, Quais? ");
				anamnese.setAlergia(input.nextLine());
				
				System.out.println("\n==========================================================");				
				System.out.println("\n                        Ficha T�cnica\n");	
			
				//Mostrar nome da dentista atual				
				for(Dentista d : DadosDentista) {
			
					System.out.println("Nome do dentista: " + d.getNome());		
					
					fichaClinica.setNome_dentista(d.getNome());
				}
				
				System.out.print("Data da consulta (xx/xx/xxxx): ");
				fichaClinica.setData_consulta(input.next());
				
				System.out.print("Data do tratamento (xx/xx/xxxx): ");
				fichaClinica.setData_tratamento(input.next());
				
				System.out.print("Plano do tratamento: ");
				fichaClinica.setPlano_tratamento(input.next());
				
				System.out.print("Digite o or�amento: R$");
				fichaClinica.setGera_orcamento(input.next());
				
				System.out.println("\n==========================================================");
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				System.out.println("==========================================================\n");
				
				
				
				pac = new Paciente(Paciente_codigo, Paciente_nome, Paciente_email, Paciente_tel, Paciente_cel, Paciente_data_nascimento, 
						Paciente_cpf, Paciente_rg, endereco, anamnese, fichaClinica);
				
				DadosPaciente.add(pac);
				
				break;
				
			case 3:	
				do {
					System.out.print("\n==========================================================");
					System.out.print(""
							+ "\n1- Mostrar Dados do Dentista"							
							+ "\n2- Buscar Prontu�rio"
							+ "\n3- Mostrar Todos Prontu�rios"
							+ "\n0- Voltar"
							+ "");
					System.out.print("\n==========================================================");
					System.out.print("\nO que deseja fazer? ");					
					opcao2 = input.nextInt();
					System.out.print("==========================================================\n");
					
					switch(opcao2){
					
						
					case 1:
						//Mostrar o dentista do dia
						for (Dentista d : DadosDentista) {		
							System.out.println("==========================================================");
							System.out.println(d.toString());
						}
						
						break;
					case 2:
						//Mostrar apenas o prontu�rios escolhido
						System.out.print("Digite o CPF para Buscar: ");
						String BuscarPaciente = input.next();
						System.out.println("==========================================================");
						for (Paciente p : DadosPaciente) {
							if(p.getCpf().equals(BuscarPaciente)) {
								System.out.println("==========================================================");
								System.out.println(p.toString());
							}
						}
						break;
					case 3:
						//Mostrar Todos os prontu�rios
						for (Paciente p : DadosPaciente) {		
							System.out.println("==========================================================");
							System.out.println(p.toString());
						}
						break;
					}
					
				}while(opcao2 != 0);	
				
			case 4:
				//Agenda
				Agenda agenda = new Agenda();
				System.out.println("Agenda");
				System.out.print("Digite o CPF para Buscar: ");
				String BuscarPaciente = input.next();
				System.out.println("==========================================================");
				for(Paciente p : DadosPaciente) {
					if(p.getCpf().equals(BuscarPaciente)) {
						
						System.out.println("N� Prontu�rio: " + p.getCodigo());						
						agenda.setCodigo_ficha(p.getCodigo());
						
						System.out.println("Nome do paciente: " + p.getNome());
						agenda.setNome_paciente(p.getNome());		
						
						System.out.println("Plano de tratamento: ");
						
						System.out.println("Tratamento dent�rio: ");
						
						System.out.println("Data de inclus�o: ");
						
						System.out.println("Data de agendamento: ");
						
						System.out.println("Concluido? ");
						System.out.println("Cancelado? ");
						System.out.println("Reagendado? ");
					}
				}

/*
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
*/
				 
				break;
			
			}	
		
		}while(opcao1 != 0);
				
		input.close();
	}
	
}
