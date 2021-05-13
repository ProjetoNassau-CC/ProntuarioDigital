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
				Funcionario dentista = new Dentista();
				Endereco endDentista = new Endereco();	
				
				System.out.println("\n==========================================================");							
				System.out.println("XXXXXXXXXXXXXXXXX Registrar Funcion�rios XXXXXXXXXXXXXXXXX\n");		
				
				System.out.print("Codigo: ");
				((Dentista) dentista).setCodigo(input.nextInt());
				
				System.out.print("CRO: ");
				((Dentista) dentista).setCro(input.nextInt());
								
				System.out.print("Nome: ");	
				((Dentista) dentista).setNome(input.next());
			
				System.out.print("Email: ");		
				((Dentista) dentista).setEmail(input.next());
			
				System.out.print("Telefone: ");	
				((Dentista) dentista).setTel(input.next());
				
				System.out.print("celular: ");	
				((Dentista) dentista).setCel(input.next());
			
				System.out.print("Data de nascimento: ");
				((Dentista) dentista).setData_nascimento(input.next());
				
				System.out.print("CPF: ");	
				((Dentista) dentista).setCpf(input.next());
				
				System.out.print("RG: ");
				((Dentista) dentista).setRg(input.next());
								
				
				System.out.println("\n                          Endere�o\n");
				
				System.out.print("Rua: ");						
				endDentista.setRua(input.next());	
				
				System.out.print("Bairro: ");
				endDentista.setBairro(input.next());	
				
				System.out.print("CEP: ");
				endDentista.setCep(input.next());	
				
				System.out.print("Cidade: ");
				endDentista.setCidade(input.next());	
				
				System.out.print("UF: ");
				endDentista.setUf(input.next());	
				
				System.out.print("Numero: ");
				endDentista.setNumero(input.next());	
				
				System.out.print("Complemento: ");
				endDentista.setComplemento(input.next());				
					
			
				dentista.setEndereco(endDentista);
				
				DadosDentista.add((Dentista) dentista); //Adicionando objeto no ArrayList		
				
				System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				System.out.println("==========================================================\n");
				
				break;
			case 2:	
				Paciente paciente = new Paciente();
				Endereco endPaciente = new Endereco();				
			    Anamnese anamnese = new Anamnese();
			    Ficha_clinica fichaClinica = new Ficha_clinica();
			    
			    
				System.out.println("\n==========================================================");
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXX Prontu�rio XXXXXXXXXXXXXXXXXXXXXXX\n");	
				
				
				System.out.println("                      Dados do Paciente\n");				
				
				System.out.print("N� Prontu�rio: ");
				paciente.setCodigo(input.nextInt());				
			
				System.out.print("Nome: ");
				paciente.setNome(input.next());
			
				System.out.print("Email: ");
				paciente.setEmail(input.next());
				
				System.out.print("Telefone: ");
				paciente.setTel(input.next());
				
				System.out.print("Celular: ");
				paciente.setCel(input.next());
				
				System.out.print("Data de Nascimento: ");
				paciente.setData_nascimento(input.next());
				
				System.out.print("CPF: ");
				paciente.setCpf(input.next());
				
				System.out.print("RG: ");
				paciente.setRg(input.next());					
				
				System.out.println("\n                          Endere�o\n");
				
				System.out.print("Rua: ");
				endPaciente.setRua(input.next());	
				
				System.out.print("Bairro: ");
				endPaciente.setBairro(input.next());	
				
				System.out.print("CEP: ");
				endPaciente.setCep(input.next());	
				
				System.out.print("Cidade: ");
				endPaciente.setCidade(input.next());	
				
				System.out.print("UF: ");
				endPaciente.setUf(input.next());	
				
				System.out.print("Numero: ");
				endPaciente.setNumero(input.next());	
				
				System.out.print("Complemento: ");
				endPaciente.setComplemento(input.next());		

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
				
					
				System.out.println("\n                        Ficha Clinica\n");	
			
				System.out.print("CPF do dentista: ");
				String BuscarDentista = input.next();					
				for(Dentista buscaDentista : DadosDentista) {			
					if(buscaDentista.getCpf().equals(BuscarDentista)) { //Se Cpf do dentista for igual o digitado pelo usuario
					System.out.println("Nome do dentista: " + buscaDentista.getNome()); //mostrar nome do dentista					
					fichaClinica.setNome_dentista(buscaDentista.getNome()); //adicionar nome do dentista em fichaClinica
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
				
				paciente.setEndereco(endPaciente);
				paciente.setAnamnese(anamnese);
				paciente.setFicha_clinica(fichaClinica);
				
				DadosPaciente.add(paciente); //Adicionando objeto no ArrayList
				
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
						
						System.out.println("Nome do Dentista: " + p.getFicha_clinica().getNome_dentista());
						agenda.setNome_dentista(p.getFicha_clinica().getNome_dentista());
						
						}
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
					
						
					case 1:	// Mostrar Dados do Dentista
						
						System.out.println("\n==========================================================");
						System.out.println("XXXXXXXXXXXXXXX Dados de Todos Funcion�rios XXXXXXXXXXXXXX\n");				
						
						for (Dentista mostrarDentista : DadosDentista) {		
							System.out.println(mostrarDentista.toString());								
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
								System.out.println("XXXXXXXXXXXXXXXXXXXXXXX Prontu�rio XXXXXXXXXXXXXXXXXXXXXXX");
								System.out.println(p.toString());
								System.out.println("==========================================================\n");
							}
						}
						break;
					case 3:	// Mostrar Todos os prontu�rios
						
						System.out.println("\n==========================================================");
						System.out.println("XXXXXXXXXXXXXXXX Dados de Todos Pacientes XXXXXXXXXXXXXXXX");
						
						for (Paciente paciente1 : DadosPaciente) {									
							System.out.println(paciente1.toString());
							System.out.println("==========================================================\n");
						}						
						break;
					case 4:	// Buscar Agendamento
						System.out.println("Digitar o CPF do paciente para buscar o agendamento");
						System.out.print("\nCPF: ");
						String BuscarAgenda = input.next();
						System.out.println("==========================================================\n");
						
						for(Agenda agenda1 : DadosAgenda) { 
							for(Paciente paciente1 : DadosPaciente) {
								if(paciente1.getCpf().equals(BuscarAgenda)) {
									if(paciente1.getNome()  == agenda1.getNome_paciente()){
										System.out.println("\n==========================================================");
										System.out.println("XXXXXXXXXXXXXXXXXXXXXX Ficha Clinica XXXXXXXXXXXXXXXXXXXXXXX\n");
										System.out.println(agenda1.toString());
										System.out.println("==========================================================\n");
									}
								}
							}
						}
						break;
					case 5:	// Mostrar todos Agendamentos
						System.out.println("\n==========================================================");
						System.out.println("XXXXXXXXXXXXXXXXXXX Todos Agendamento XXXXXXXXXXXXXXXXXXXX\n");
						
						for (Agenda a : DadosAgenda) {									
							System.out.println(a.toString());
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
