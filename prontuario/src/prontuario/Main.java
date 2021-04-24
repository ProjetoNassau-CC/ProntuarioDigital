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
		
		Ficha_clinica fichaClinica = new Ficha_clinica();
		
		ArrayList<Dentista> DadosDentista = new ArrayList<Dentista>();
		ArrayList<Paciente> DadosPaciente = new ArrayList<Paciente>();		
		ArrayList<Agenda> DadosAgenda = new ArrayList<Agenda>();	
		
		boolean condicao = false;
		
		do {			
			System.out.println("=-=-=-=-=-=-=-=-=-=-= Fa�a seu Login =-=-=-=-=-=-=-=-=-=-=\n");
	
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
		System.out.println("==========================================================\n");
		
		do {
			System.out.println("\n==========================================================");
			System.out.println("=-=-=-=-=-=-=-=-=-= Painel de Controle =-=-=-=-=-=-=-=-=-=");
			System.out.println(
					  "\n1- Registra Funcion�rio"
					+ "\n2- Cadastrar Prontuario"
					+ "\n3- Agendamento"
					+ "\n4- Fazer Busca/Exibir"
					+ "\n0- Finalizar");			
			
			System.out.print("\nO que deseja fazer? ");
			opcao1 = input.nextInt();
			System.out.println("==========================================================\n");					
			
			switch(opcao1) {	
			case 1:				
				Endereco endereco1 = new Endereco();	
				
				System.out.println("\n==========================================================");							
				System.out.println("XXXXXXXXXXXXXXXXX Registrar Funcion�rios XXXXXXXXXXXXXXXXX\n");		
				
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
					
			
				//Adicionando os parametros no objeto
				Dentista dentista = new Dentista(Dentista_codigo, Dentista_nome, Dentista_email, Dentista_tel, 
						Dentista_cel, Dentista_data_nascimento, Dentista_cpf, Dentista_rg, endereco1, Dentista_cro);
				DadosDentista.add(dentista); //Adicionando objeto no ArrayList		
				
				System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				System.out.println("==========================================================\n");
				
				break;
			case 2:						
				Endereco endereco = new Endereco();				
			    Anamnese anamnese = new Anamnese();
			    
			    
				System.out.println("\n==========================================================");
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXX Prontu�rio XXXXXXXXXXXXXXXXXXXXXXX\n");	
				
				
				System.out.println("                      Dados do Paciente\n");				
				
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
				
					
				System.out.println("\n                        Ficha T�cnica\n");	
			
				System.out.print("CPF do dentista: ");
				String BuscarDentista = input.next();			
				for(Dentista d : DadosDentista) {			
					if(d.getCpf().equals(BuscarDentista)) { //Se Cpf do dentista for igual o digitado pelo usuario
					System.out.println("Nome do dentista: " + d.getNome()); //mostrar nome do dentista					
					fichaClinica.setNome_dentista(d.getNome()); //adicionar nome do dentista em fichaClinica
					}
				}
				
				System.out.print("Data da consulta (xx/xx/xxxx): ");
				fichaClinica.setData_consulta(input.next());
				
				System.out.print("Data do tratamento (xx/xx/xxxx): ");
				fichaClinica.setData_tratamento(input.next());
				
				System.out.print("Plano do tratamento: ");
				fichaClinica.setPlano_tratamento(input.next());
				
				System.out.print("Digite o or�amento: R$");
				fichaClinica.setGera_orcamento(input.next());								
				
				Paciente pac;
				
				//Adicionando os parametros no objeto
				pac = new Paciente(Paciente_codigo, Paciente_nome, Paciente_email, Paciente_tel, Paciente_cel, Paciente_data_nascimento, 
						Paciente_cpf, Paciente_rg, endereco, anamnese, fichaClinica);
				
				DadosPaciente.add(pac); //Adicionando objeto no ArrayList
				
				System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				System.out.println("==========================================================\n");
				
				break;				
			
			case 3:
				//Agendamento				
				Agenda agenda = new Agenda();
				
				System.out.println("\n==========================================================");
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXX Agendamento XXXXXXXXXXXXXXXXXXXXXX\n");	
						
				System.out.print("CPF do Paciente: ");
				String BuscarPaciente = input.next();
				System.out.println("==========================================================");
				for(Paciente p : DadosPaciente) {
					if(p.getCpf().equals(BuscarPaciente)) {
						
						System.out.println("N� Prontu�rio: " + p.getCodigo());						
						agenda.setCodigo_ficha(p.getCodigo());
						
						System.out.println("Nome do paciente: " + p.getNome());
						agenda.setNome_paciente(p.getNome());						
						
						System.out.println("Nome do Dentista: " + fichaClinica.getNome_dentista());
						agenda.setNome_dentista(fichaClinica.getNome_dentista());
						
						}						
						
						System.out.print("Plano de tratamento: ");
						agenda.setPlano_tratamento(input.next());
						
						System.out.print("Tratamento dent�rio: ");
						agenda.setTratamento_dente(input.next());
						
						System.out.print("Data de inclus�o: ");
						agenda.setData_inclusao(input.next());
						
						System.out.print("Data do agendamento: ");
						agenda.setData_agenda(input.next());
						
						System.out.print("Concluido? ");
						agenda.setConcluido(input.next());
						
						System.out.print("Cancelado? ");
						agenda.setCancelado(input.next());
						
						System.out.print("Reagendado? ");
						agenda.setReagendado(input.next());		
						
						DadosAgenda.add(agenda); //Adicionando objeto no ArrayList		
						
						System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
						System.out.println("==========================================================\n");
					
				}
				 
				break;
				
			case 4:	
				do {
					System.out.println("\n==========================================================");
					System.out.println("=-=-=-=-=-=-=-=-=-=-=-= Busca/Exibir =-=-=-=-=-=-=-=-=-=-=");
					System.out.print(""
							+ "\n1- Mostrar Dados do Dentista"							
							+ "\n2- Buscar Prontu�rio"
							+ "\n3- Mostrar Todos Prontu�rios"
							+ "\n4- Buscar Agendamento"
							+ "\n5- Mostrar todos Agendamentos"
							+ "\n0- Voltar"
							+ "");
					
					System.out.print("\n\nO que deseja fazer? ");					
					opcao2 = input.nextInt();
					System.out.println("==========================================================\n");	
					
					switch(opcao2){
					
						
					case 1:
						// Mostrar Dados do Dentista
						for (Dentista d : DadosDentista) {		
							System.out.println("\n==========================================================");
							System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
							System.out.println("                Dados de Todos Funcion�rios\n");
							System.out.println(d.toString());
							System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
							System.out.println("==========================================================\n");
						}
						
						break;
					case 2:
						// Buscar Prontu�rio
						System.out.println("Digitar o CPF do paciente para buscar o prontuario");
						System.out.print("\nCPF: ");
						String BuscarPaciente1 = input.next();
						System.out.println("==========================================================\n");
						for (Paciente p : DadosPaciente) {
							if(p.getCpf().equals(BuscarPaciente1)) {
								System.out.println("\n==========================================================");
								System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
								System.out.println("                        Prontu�rio\n");
								System.out.println(p.toString());
								System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
								System.out.println("==========================================================\n");
							}
						}
						break;
					case 3:
						// Mostrar Todos os prontu�rios
						for (Paciente p : DadosPaciente) {		
							System.out.println("\n==========================================================");
							System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
							System.out.println("                   Dados de Todos Pacientes\n");
							System.out.println(p.toString());
							System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
							System.out.println("==========================================================\n");
						}						
						break;
					case 4:
						// Buscar Agendamento
						System.out.println("Digitar o CPF do paciente para buscar o agendamento");
						System.out.print("\nCPF: ");
						String BuscarAgenda = input.next();
						System.out.println("==========================================================\n");
						for(Agenda a : DadosAgenda) { 
							for(Paciente p : DadosPaciente) {
								if(p.getCpf().equals(BuscarAgenda)) {
									if(p.getNome()  == a.getNome_paciente()){
										System.out.println("\n==========================================================");
										System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
										System.out.println("                       Ficha Clinica\n");
										System.out.println(a.toString());
										System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
										System.out.println("==========================================================\n");
									}
								}
							}
						}
						break;
					case 5:
						// Mostrar todos Agendamentos
						for (Agenda a : DadosAgenda) {		
					
							System.out.println("\n==========================================================");
							System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
							System.out.println("                     Todos Agendamento\n");
							System.out.println(a.toString());
							System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
							System.out.println("==========================================================\n");
						}
						break;
					}					
				}while(opcao2 != 0);				
			}	
		
		}while(opcao1 != 0);
				
		input.close();
	}	
}
