package prontuario;

import java.util.Locale;
import java.util.Scanner;

import conexao.Conexao;
import dados.RepositorioAgendaArrayList;
import dados.RepositorioDentistaArrayList;
import dados.RepositorioRecepcionistaArrayList;
import modeloDAO.CrudFuncionarios;
import dados.RepositorioPacienteArrayList;
import modeloDAO.CrudPaciente;
public class Main {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		int opcao1;
		int opcao2;

		RepositorioFuncionario repDentista = new RepositorioDentistaArrayList();
		RepositorioFuncionario repRecepcionista = new RepositorioRecepcionistaArrayList();
		RepositorioPaciente repPac = new RepositorioPacienteArrayList();
		RepositorioAgenda repAgenda = new RepositorioAgendaArrayList();
		CrudFuncionarios crud = new CrudFuncionarios();
		CrudPaciente crudp = new CrudPaciente();
		Paciente pac = new Paciente();
		TelaLogin();
		
		do {
		
			System.out.println(
					  "\n=========================================================="
					+ "\n=-=-=-=-=-=-=-=-=-= Painel de Controle =-=-=-=-=-=-=-=-=-=\n"
					+ "\n1- Inserir Dentista"
					+ "\n2- Inserir Recepcionista"					
					+ "\n3- Inserir Prontuario"
					+ "\n4- Inserir Agendamento"
					+ "\n5- Buscar e Remover"
					+ "\n0- Finalizar");			
			
			System.out.print("\nO que deseja fazer? ");
			opcao1 = input.nextInt();				
			
			switch(opcao1) {	
			
			case 1:	//Inserir_Dentista				
				inserirFuncionarioDentista();
				//repDentista = CaseDentista(repDentista);								
				break;
				
			case 2:	//Inserir_Recepcionista	
				inserirFuncionarioRecepcionista();
				//repRecepcionista = CaseRecepcionista(repRecepcionista);				
				break;
				
			case 3: //Inserir_Paciente
				
				inserirPaciente();
				//repPac = CasePaciente(repPac);
				break;
				
			case 4:	//Inserir_Agendamento		
				repAgenda = CaseAgenda(repAgenda);					 
				break;
			case 5:	//Buscar_E_Remover
				do {

					System.out.print(
					  "\n=========================================================="
					+ "\n==-=-=-=-=-=-=-=-=-= Buscar e Remover =-=-=-=-=-=-=-=-=-==\n"
					+ "\n1- Buscar Funcionario"
					+ "\n2- Buscar Prontuario"
					+ "\n3- Buscar Agendadamento"
					+ "\n4- Remover Funcionario"
					+ "\n5- Remover Prontuario"
					+ "\n6- Remover Agendamento"
					+ "\n7- Editar Dados - Dentista"
					+ "\n8- Editar Dados - Recepcionista"
					+ "\n9- Editar Dados - Paciente"
					+ "\n0- Voltar"
					
					+ "\n\nO que deseja fazer? ");					
					opcao2 = input.nextInt();
					System.out.println("==========================================================\n");					
					
					switch(opcao2) {
					
					case 1: //Buscar_Funcionario
						System.out.println(	
								  "\n=========================================================="
								+ "\n=-=-=-=-=-=-=-=-=-= Buscar Funcionario =-=-=-=-=-=-=-=-=-=\n"
								+ "\n         Escolha a função que você quer buscar!"
								+ "\n             Dentista [D]  Recepcionista[R]");
						
						System.out.print("\n\nFunção: ");
						String escolhaBusca = input.next();
						
						if(escolhaBusca.equalsIgnoreCase("d")) {
							System.out.print("Cpf: ");
							String BuscaFunc = input.next();
							System.out.println(crud.consultaDentista(BuscaFunc));
					
							
							/*
							if(repDentista.procurar(BuscaFunc) != null) {
								System.out.println("==========================================================\n");	
								System.out.println(repDentista.procurar(BuscaFunc).toString());		
							} else {
								System.out.println("\nBusca incompleta, CPF não encontrado!");
							}*/
							
						} else if(escolhaBusca.equalsIgnoreCase("r")) {
							System.out.print("Cpf: ");
							String BuscaFunc = input.next();	
							System.out.println(crud.consultaRecepcionista(BuscaFunc));
							/*if(repRecepcionista.procurar(BuscaFunc) != null) {
								System.out.println(repRecepcionista.procurar(BuscaFunc).toString());
							} else {
								System.out.println("\nBusca incompleta, CPF não encontrado!");
							}*/
							
						} else {
							System.out.println("\nFunção não reconhecida!");
						}
						break;
					
							
					case 2: //Buscar_Prontuario						
						Paciente paci = new Paciente();
						System.out.print("Cpf do Paciente: ");
					String buscaPaci = input.next();
						//	paci.setCpf(input.next());
						crudp.consultapac(buscaPaci);
						/*
						   if(repPac.procurar(BuscaPaciente) != null) {
	                            System.out.println(repPac.procurar(BuscaPaciente).toString());
	                        } else {
	                            System.out.println("\nBusca incompleta, CPF n�o encontrado!");
	                        }*/
						
						
						break;
						
					case 3: //Buscar_Agenda			
						System.out.print("Cpf do Paciente: ");
						String BuscaAgenda = input.next();
						System.out.println("\n==========================================================");	
						if(repAgenda.procurar(BuscaAgenda) != null) {
							System.out.println(repAgenda.procurar(BuscaAgenda).toString());
						}else {
							System.out.println("\nBusca incompleta, CPF não encontrado!");
						}
						break;
						
					case 4: //Remover_Funcionario
						System.out.print(	
								  "\n=========================================================="
								+ "\n=-=-=-=-=-=-=-=-=-= Buscar Funcionario =-=-=-=-=-=-=-=-=-=\n"
								+ "\n         Escolha a função que você quer remover!          "
								+ "\n             Dentista [D]  Recepcionista[R]");
						
						System.out.print("\n\nFunção: ");
						String escolhaRemove = input.next();							
					
						Dentista dent = new Dentista();
						Recepcionista rec = new Recepcionista();
						if(escolhaRemove.equalsIgnoreCase("d")) {	
							System.out.print("Cpf: ");	
							
							((Dentista) dent).setCpf(input.next());
							crud.removerDentista(dent);
							
							//String RemoveFunc = input.next();
							//repDentista.remover(RemoveFunc);
							
						} else if(escolhaRemove.equalsIgnoreCase("r")) {							
							System.out.print("Cpf: ");		
							((Recepcionista) rec).setCpf(input.next());
							crud.removerRecepcionista(rec);
							//String RemoveFunc = input.next();
							//repRecepcionista.remover(RemoveFunc);		
							
						}else {
							System.out.println("\nFunção não reconhecida!");
						}
						break;
					
					case 5:	//Remover_Prontuario
						
						System.out.print("Cpf do Paciente: ");
						pac.setCpf( input.next());
							crudp.removerPaciente(pac);	
						//String RemovePac = input.next();
						//repPac.remover(RemovePac);
						break;		
						
					case 6: //Remover_Agenda
						System.out.print("Cpf do Paciente: ");
						String RemoverAgenda = input.next();
						
						repAgenda.remover(RemoverAgenda);
						break;
						
					case 7: 
						EditarDentista();
						break;
					case 8:
						EditarRecepcionista();
						break;
					case 9:
						EditarPaciente();
					}
				}while(opcao2 != 0);
			}
		}while(opcao1 != 0);		
		input.close();
	}	
	
	
	
	
	public static void TelaLogin(){
		boolean condicao = false;
		do {			
			System.out.println("=-=-=-=-=-=-=-=-=-=-= Faça seu Login =-=-=-=-=-=-=-=-=-=-=\n");
	
			System.out.print("Login: ");
			String login = input.next();
			
			System.out.print("Senha: ");
			String senha = input.next();
			
			if (login.equals("admin") && senha.equals("1234")) {
				condicao = true;
				System.out.println("\nLogin efetuado com sucesso!");
			} else {
				System.out.println(
					  "\nSenha ou Login incorreto!" 
					+ "\nPor favor, digite novamente.\n");
			}
		
		}while(condicao != true);			
		
		
	}
	
	
	public static void inserirPaciente() {
		CrudPaciente crudp = new CrudPaciente();
		Paciente paciente = new Paciente();
		Endereco endPaciente = new Endereco();	
		
		input.nextLine();
		System.out.print("Nome: ");
		paciente.setNome(input.nextLine());
		
		System.out.print("Email: ");		
		paciente.setEmail(input.nextLine());
		
		System.out.print("celular: ");	
		paciente.setCel(input.nextLine());
		
		System.out.print("Data de nascimento: ");
		paciente.setData_nascimento(input.nextLine());
		
		System.out.print("CPF: ");	
		paciente.setCpf(input.nextLine());
		
		System.out.print("RG: ");
		paciente.setRg(input.nextLine());
						
		
		System.out.println("\n=================== Endereço ===================\n");
		
		System.out.print("Rua: ");						
		endPaciente.setRua(input.nextLine());	
		
		System.out.print("Bairro: ");
		endPaciente.setBairro(input.nextLine());	
		
		System.out.print("CEP: ");
		endPaciente.setCep(input.nextLine());	
		
		System.out.print("Cidade: ");
		endPaciente.setCidade(input.nextLine());	
		
		System.out.print("UF: ");
		endPaciente.setUf(input.nextLine());	
		
		System.out.print("Numero: ");
		endPaciente.setNumero(input.nextLine());	
		
		System.out.print("Complemento: ");
		endPaciente.setComplemento(input.nextLine());		
		
		paciente.setEndereco(endPaciente);
		crudp.inserirPaciente(paciente);
	
	}
	
	
	public static void EditarPaciente() {
		
		
		CrudPaciente crudp = new CrudPaciente();
		Paciente paciente = new Paciente();
		Endereco endPac = new Endereco();	
		
		
		
		input.nextLine();
		System.out.print("Nome: ");
		paciente.setNome(input.nextLine());
		
		System.out.print("Email: ");		
		paciente.setEmail(input.nextLine());
		
		System.out.print("celular: ");	
		paciente.setCel(input.nextLine());
		
		System.out.print("Data de nascimento: ");
		paciente.setData_nascimento(input.nextLine());
		
		System.out.print("CPF: ");	
		paciente.setCpf(input.nextLine());
		
		
		System.out.print("RG: ");
		paciente.setRg(input.nextLine());
						
	
		
		System.out.println("\n=================== Endereço ===================\n");
		
		System.out.print("Rua: ");						
		endPac.setRua(input.nextLine());	
		
		System.out.print("Bairro: ");
		endPac.setBairro(input.nextLine());	
		
		System.out.print("CEP: ");
		endPac.setCep(input.nextLine());	
		
		System.out.print("Cidade: ");
		endPac.setCidade(input.nextLine());	
		
		System.out.print("UF: ");
		endPac.setUf(input.nextLine());	
		
		System.out.print("Numero: ");
		endPac.setNumero(input.nextLine());	
		
		System.out.print("Complemento: ");
		endPac.setComplemento(input.nextLine());	
		paciente.setEndereco(endPac);
		
		System.out.print("Codigo: ");	
		paciente.setCodigo(input.nextInt());

		crudp.EditarPaciente(paciente);
	}
	
	
	public static void EditarDentista() {
		
	
		CrudFuncionarios crud = new CrudFuncionarios();
		Funcionario dentista = new Dentista();
		Endereco endDentista = new Endereco();	
		
		System.out.print("CRO: ");
		((Dentista) dentista).setCro(input.nextInt());
		
		input.nextLine();
		System.out.print("Nome: ");
		((Dentista) dentista).setNome(input.nextLine());
		
		System.out.print("Email: ");		
		((Dentista) dentista).setEmail(input.nextLine());
		
		System.out.print("celular: ");	
		((Dentista) dentista).setCel(input.nextLine());
		
		System.out.print("Data de nascimento: ");
		((Dentista) dentista).setData_nascimento(input.nextLine());
		
		System.out.print("CPF: ");	
		((Dentista) dentista).setCpf(input.nextLine());
		
		
		System.out.print("RG: ");
		((Dentista) dentista).setRg(input.nextLine());
						
	
		
		System.out.println("\n=================== Endereço ===================\n");
		
		System.out.print("Rua: ");						
		endDentista.setRua(input.nextLine());	
		
		System.out.print("Bairro: ");
		endDentista.setBairro(input.nextLine());	
		
		System.out.print("CEP: ");
		endDentista.setCep(input.nextLine());	
		
		System.out.print("Cidade: ");
		endDentista.setCidade(input.nextLine());	
		
		System.out.print("UF: ");
		endDentista.setUf(input.nextLine());	
		
		System.out.print("Numero: ");
		endDentista.setNumero(input.nextLine());	
		
		System.out.print("Complemento: ");
		endDentista.setComplemento(input.nextLine());	
		dentista.setEndereco(endDentista);
		
		System.out.print("Codigo: ");	
		((Dentista) dentista).setCodigo(input.nextInt());

		crud.EditarDentista((Dentista) dentista);
	}
	public static void inserirFuncionarioRecepcionista() {
		CrudFuncionarios crud = new CrudFuncionarios();
		Funcionario recepcionista = new Recepcionista();
		Endereco endRecepcionista = new Endereco();	
		
		
		input.nextLine();
		System.out.print("Nome: ");
		((Recepcionista) recepcionista ).setNome(input.nextLine());
		
		System.out.print("Email: ");		
		((Recepcionista) recepcionista ).setEmail(input.nextLine());
		
		System.out.print("celular: ");	
		((Recepcionista) recepcionista ).setCel(input.nextLine());
		
		System.out.print("Data de nascimento: ");
		((Recepcionista) recepcionista ).setData_nascimento(input.nextLine());
		
		System.out.print("CPF: ");	
		((Recepcionista) recepcionista ).setCpf(input.nextLine());
		
		System.out.print("RG: ");
		((Recepcionista) recepcionista ).setRg(input.nextLine());
						
		
		System.out.println("\n=================== Endereço ===================\n");
		
		System.out.print("Rua: ");						
		endRecepcionista.setRua(input.nextLine());	
		
		System.out.print("Bairro: ");
		endRecepcionista.setBairro(input.nextLine());	
		
		System.out.print("CEP: ");
		endRecepcionista.setCep(input.nextLine());	
		
		System.out.print("Cidade: ");
		endRecepcionista.setCidade(input.nextLine());	
		
		System.out.print("UF: ");
		endRecepcionista.setUf(input.nextLine());	
		
		System.out.print("Numero: ");
		endRecepcionista.setNumero(input.nextLine());	
		
		System.out.print("Complemento: ");
		endRecepcionista.setComplemento(input.nextLine());
		
		System.out.print("Ramal: ");
		((Recepcionista) recepcionista ).setRamal(input.nextLine());
		
		recepcionista.setEndereco(endRecepcionista);
		crud.inserirRecepcionista((Recepcionista)recepcionista);
		
	}
	
	
	
	
	
	
	public static void EditarRecepcionista() {
		CrudFuncionarios crud = new CrudFuncionarios();
		Funcionario recepcionista = new Recepcionista();
		Endereco endRecepcionista = new Endereco();	
		
		
		input.nextLine();
		System.out.print("Nome: ");
		((Recepcionista) recepcionista ).setNome(input.nextLine());
		
		System.out.print("Email: ");		
		((Recepcionista) recepcionista ).setEmail(input.nextLine());
		
		System.out.print("celular: ");	
		((Recepcionista) recepcionista ).setCel(input.nextLine());
		
		System.out.print("Data de nascimento: ");
		((Recepcionista) recepcionista ).setData_nascimento(input.nextLine());
		
		System.out.print("CPF: ");	
		((Recepcionista) recepcionista ).setCpf(input.nextLine());
		
		System.out.print("RG: ");
		((Recepcionista) recepcionista ).setRg(input.nextLine());
						
		
		System.out.println("\n=================== Endereço ===================\n");
		
		System.out.print("Rua: ");						
		endRecepcionista.setRua(input.nextLine());	
		
		System.out.print("Bairro: ");
		endRecepcionista.setBairro(input.nextLine());	
		
		System.out.print("CEP: ");
		endRecepcionista.setCep(input.nextLine());	
		
		System.out.print("Cidade: ");
		endRecepcionista.setCidade(input.nextLine());	
		
		System.out.print("UF: ");
		endRecepcionista.setUf(input.nextLine());	
		
		System.out.print("Numero: ");
		endRecepcionista.setNumero(input.nextLine());	
		
		System.out.print("Complemento: ");
		endRecepcionista.setComplemento(input.nextLine());
		recepcionista.setEndereco(endRecepcionista);
		
		System.out.print("Ramal: ");
		((Recepcionista) recepcionista ).setRamal(input.nextLine());
		
		System.out.print("Codigo: ");
		((Recepcionista) recepcionista ).setCodigo(input.nextInt());
		
		crud.EditarRecepcionista((Recepcionista)recepcionista);
		
	}
	
	public static void inserirFuncionarioDentista() {
		CrudFuncionarios crud = new CrudFuncionarios();
		Funcionario dentista = new Dentista();
		Endereco endDentista = new Endereco();	
		
		System.out.print("CRO: ");
		((Dentista) dentista).setCro(input.nextInt());
		
		input.nextLine();
		System.out.print("Nome: ");
		((Dentista) dentista).setNome(input.nextLine());
		
		System.out.print("Email: ");		
		((Dentista) dentista).setEmail(input.nextLine());
		
		System.out.print("celular: ");	
		((Dentista) dentista).setCel(input.nextLine());
		
		System.out.print("Data de nascimento: ");
		((Dentista) dentista).setData_nascimento(input.nextLine());
		
		System.out.print("CPF: ");	
		((Dentista) dentista).setCpf(input.nextLine());
		
		System.out.print("RG: ");
		((Dentista) dentista).setRg(input.nextLine());
						
		
		System.out.println("\n=================== Endereço ===================\n");
		
		System.out.print("Rua: ");						
		endDentista.setRua(input.nextLine());	
		
		System.out.print("Bairro: ");
		endDentista.setBairro(input.nextLine());	
		
		System.out.print("CEP: ");
		endDentista.setCep(input.nextLine());	
		
		System.out.print("Cidade: ");
		endDentista.setCidade(input.nextLine());	
		
		System.out.print("UF: ");
		endDentista.setUf(input.nextLine());	
		
		System.out.print("Numero: ");
		endDentista.setNumero(input.nextLine());	
		
		System.out.print("Complemento: ");
		endDentista.setComplemento(input.nextLine());		
		
		dentista.setEndereco(endDentista);
		crud.inserirDentista((Dentista)dentista);
		
	}
	public static RepositorioFuncionario CaseDentista(RepositorioFuncionario repDentista){
		Funcionario dentista = new Dentista();
		Endereco endDentista = new Endereco();				
		System.out.println(
				  "\n=========================================================="
				+ "\n=-=-=-=-=-=-=-=-=-= Registrar Dentista =-=-=-=-=-=-=-=-=-=\n");
		
		System.out.print("Codigo: ");
		((Dentista) dentista).setCodigo(input.nextInt());
		
		System.out.print("CRO: ");
		((Dentista) dentista).setCro(input.nextInt());
		
		input.nextLine();
		System.out.print("Nome: ");
		((Dentista) dentista).setNome(input.nextLine());
		
		System.out.print("Email: ");		
		((Dentista) dentista).setEmail(input.nextLine());
		
		System.out.print("celular: ");	
		((Dentista) dentista).setCel(input.nextLine());
		
		System.out.print("Data de nascimento: ");
		((Dentista) dentista).setData_nascimento(input.nextLine());
		
		System.out.print("CPF: ");	
		((Dentista) dentista).setCpf(input.nextLine());
		
		System.out.print("RG: ");
		((Dentista) dentista).setRg(input.nextLine());
						
		
		System.out.println("\n=================== Endereço ===================\n");
		
		System.out.print("Rua: ");						
		endDentista.setRua(input.nextLine());	
		
		System.out.print("Bairro: ");
		endDentista.setBairro(input.nextLine());	
		
		System.out.print("CEP: ");
		endDentista.setCep(input.nextLine());	
		
		System.out.print("Cidade: ");
		endDentista.setCidade(input.nextLine());	
		
		System.out.print("UF: ");
		endDentista.setUf(input.nextLine());	
		
		System.out.print("Numero: ");
		endDentista.setNumero(input.nextLine());	
		
		System.out.print("Complemento: ");
		endDentista.setComplemento(input.nextLine());	
			
		System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("==========================================================\n");	
		
		dentista.setEndereco(endDentista);				
		repDentista.inserir(dentista);	
		return repDentista;
		
	}

	public static RepositorioFuncionario CaseRecepcionista(RepositorioFuncionario repRecepcionista){
		
		Funcionario recepcionista = new Recepcionista();
		Endereco endRecepcionista = new Endereco();
		
		System.out.println(
				  "\n=========================================================="
				+ "\n=-=-=-=-=-=-=-=-= Registrar Recepcionista =-=-=-=-=-=-=-=-\n");	
		
		System.out.print("Codigo: ");
		((Recepcionista) recepcionista).setCodigo(input.nextInt());				
		
		input.nextLine();
		System.out.print("Nome: ");	
		((Recepcionista) recepcionista).setNome(input.nextLine());
	
		System.out.print("Email: ");		
		((Recepcionista) recepcionista).setEmail(input.nextLine());
					
		System.out.print("celular: ");	
		((Recepcionista) recepcionista).setCel(input.nextLine());
	
		System.out.print("Data de nascimento: ");
		((Recepcionista) recepcionista).setData_nascimento(input.nextLine());
		
		System.out.print("CPF: ");	
		((Recepcionista) recepcionista).setCpf(input.nextLine());
		
		System.out.print("Ramal: ");
		((Recepcionista) recepcionista).setRamal(input.nextLine());
		
		System.out.println("\n                          Endereço\n");
		
		
		System.out.print("Rua: ");						
		endRecepcionista.setRua(input.nextLine());	
		
		System.out.print("Bairro: ");
		endRecepcionista.setBairro(input.nextLine());	
		
		System.out.print("CEP: ");
		endRecepcionista.setCep(input.nextLine());	
		
		System.out.print("Cidade: ");
		endRecepcionista.setCidade(input.nextLine());	
		
		System.out.print("UF: ");
		endRecepcionista.setUf(input.nextLine());	
		
		System.out.print("Numero: ");
		endRecepcionista.setNumero(input.nextLine());	
		
		System.out.print("Complemento: ");
		endRecepcionista.setComplemento(input.nextLine());
		
		System.out.println("==========================================================\n");	
		
		recepcionista.setEndereco(endRecepcionista);
		repRecepcionista.inserir(recepcionista);		
		return repRecepcionista;
	}
	
	public static RepositorioPaciente CasePaciente(RepositorioPaciente repPac){

		Paciente paciente = new Paciente();
		Endereco endPaciente = new Endereco();				
	    Anamnese anamnese = new Anamnese();
	    Ficha_clinica fichaClinica = new Ficha_clinica();
	        
		System.out.println("\n==========================================================");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXX Prontuário XXXXXXXXXXXXXXXXXXXXXXX\n");	
		
		
		System.out.println("                      Dados do Paciente\n");				
		
		System.out.print("Nº Prontuário: ");
		paciente.setCodigo(input.nextInt());	
		
		input.nextLine();
		System.out.print("Nome: ");
		paciente.setNome(input.nextLine());
	
		System.out.print("Email: ");
		paciente.setEmail(input.nextLine());
						
		System.out.print("Celular: ");
		paciente.setCel(input.nextLine());
		
		System.out.print("Data de Nascimento: ");
		paciente.setData_nascimento(input.nextLine());
		
		System.out.print("CPF: ");
		paciente.setCpf(input.nextLine());
		
		System.out.print("RG: ");
		paciente.setRg(input.nextLine());					
		
		System.out.println("\n                          Endereço\n");
		
		System.out.print("Rua: ");
		endPaciente.setRua(input.nextLine());	
		
		System.out.print("Bairro: ");
		endPaciente.setBairro(input.nextLine());	
		
		System.out.print("CEP: ");
		endPaciente.setCep(input.nextLine());	
		
		System.out.print("Cidade: ");
		endPaciente.setCidade(input.nextLine());	
		
		System.out.print("UF: ");
		endPaciente.setUf(input.nextLine());	
		
		System.out.print("Numero: ");
		endPaciente.setNumero(input.nextLine());	
		
		System.out.print("Complemento: ");
		endPaciente.setComplemento(input.nextLine());		

		System.out.println("\n                          Anamnese");
		System.out.println("                       Digite [S ou N]\n");
		
		
		System.out.print("Problema com Anestesia? ");
		anamnese.setProblemaAnestesia(input.nextLine());
		
		System.out.print("Problema de Hemorragia? ");
		anamnese.setProblemaHemorragia(input.nextLine());
		
		System.out.print("Problema de Febre Reumática? ");
		anamnese.setFebreReumatica(input.nextLine());

		System.out.print("Problema Renal? ");
		anamnese.setProblemaRenal(input.nextLine());	
		
		System.out.print("Problema Respiratório? ");
		anamnese.setProblemaRespitorio(input.nextLine());
		
		System.out.print("Problema Cardíaco? ");
		anamnese.setProblemaCardiaco(input.nextLine());
		
		System.out.print("Problema Gástrico? ");
		anamnese.setProblemaGastrico(input.nextLine());
		
		System.out.print("Problema com Articulação? ");
		anamnese.setProblemaArticular(input.nextLine());
		
		System.out.print("Antecedentes Familiar, se sim, Quais? ");
		anamnese.setAntecedenteFamiliar(input.nextLine());
		
		System.out.print("Alergias, se sim, Quais? ");
		anamnese.setAlergia(input.nextLine());
		
		System.out.println("\n                        Ficha Clinica\n");	
		

		System.out.print("Nome do dentista: ");					
		fichaClinica.setNome_dentista(input.nextLine());	
		
		System.out.print("Data da consulta (xx/xx/xxxx): ");
		fichaClinica.setData_consulta(input.nextLine());
		
		System.out.print("Data do tratamento (xx/xx/xxxx): ");
		fichaClinica.setData_tratamento(input.nextLine());
		
		System.out.print("Plano do tratamento: ");
		fichaClinica.setPlano_tratamento(input.nextLine());
		
		System.out.print("Digite o orçamento: R$");
		fichaClinica.setGera_orcamento(input.nextLine());								
		
		System.out.println("==========================================================\n");
		
		paciente.setEndereco(endPaciente);
		paciente.setAnamnese(anamnese);
		paciente.setFicha_clinica(fichaClinica);
		repPac.inserir(paciente);		
		return repPac;
	}

	public static RepositorioAgenda CaseAgenda(RepositorioAgenda repAgenda) {
		
		Agenda agenda = new Agenda();
		
		System.out.println("\n==========================================================");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXX Agendamento XXXXXXXXXXXXXXXXXXXXXX\n");	
		
		input.nextLine();
		System.out.print("Nome do paciente: " );
		agenda.setNome_paciente(input.nextLine());
				
		System.out.print("CPF: ");
		agenda.setCpf(input.nextLine());
						
		System.out.print("Nome do Dentista: ");
		agenda.setNome_dentista(input.nextLine());
				
		System.out.print("Plano de tratamento: ");
		agenda.setPlano_tratamento(input.nextLine());
				
		System.out.print("Tratamento dentário: ");
		agenda.setTratamento_dente(input.nextLine());
			
		System.out.print("Data de inclusão: ");
		agenda.setData_inclusao(input.nextLine());
			
		System.out.print("Data do agendamento: ");
		agenda.setData_agenda(input.nextLine());
		
		System.out.println("(CC) - Concluído | (RD) - Reagendado | (CL) - Cancelado");
		System.out.print("Status do Atendimento: ");
		
		agenda.setStatus(input.nextLine());
		
		if(agenda.getStatus().equalsIgnoreCase("cc")) {
			agenda.setStatus("Concluído");
		}
		else if(agenda.getStatus().equalsIgnoreCase("rd")) {
			agenda.setStatus("Reagendado");
		}else {
			agenda.setStatus("Cancelado");
		}

		System.out.println("==========================================================\n");
		repAgenda.inserir(agenda);
		return repAgenda;
	}
}