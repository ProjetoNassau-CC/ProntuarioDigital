package prontuario;

import java.util.Locale;
import java.util.Scanner;

import conexao.Conexao;
import dados.RepositorioAgendaArrayList;
import dados.RepositorioDentistaArrayList;
import dados.RepositorioPacienteArrayList;
import dados.RepositorioRecepcionistaArrayList;
import modeloDAO.CrudAgenda;
import modeloDAO.CrudFuncionarios;
import modeloDAO.CrudPaciente;
import modeloDAO.CrudUsuario;

public class OdontoSmile {

	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		int opcao1,  opcaoBuscar;
		int opcaoInserir, opcaoRemover, opcaoAgendamento;

		RepositorioFuncionario repDentista = new RepositorioDentistaArrayList();
		RepositorioFuncionario repRecepcionista = new RepositorioRecepcionistaArrayList();
		RepositorioPaciente repPac = new RepositorioPacienteArrayList();
		RepositorioAgenda repAgenda = new RepositorioAgendaArrayList();
		CrudFuncionarios crud = new CrudFuncionarios();
		CrudPaciente crudp = new CrudPaciente();
		CrudUsuario crudu = new CrudUsuario();
		CrudAgenda cruda = new CrudAgenda();
		Paciente pac = new Paciente();
		
		TelaLogin();
		
		do {
		//Menu Principal
		System.out.println(
				  "\n=========================================================="
				+ "\n=-=-=-=-=-=-=-=-=-= Painel de Controle =-=-=-=-=-=-=-=-=-=\n"
				+ "\n1- Cadastros"
				+ "\n2- Agendamento"					
				+ "\n3- Relatórios - Individuais"
				+ "\n4- Exclusão"
				+ "\n0- Finalizar");
		System.out.print("\nO que deseja fazer? ");
		opcao1 = input.nextInt();	
		
		switch(opcao1) {
		//case principal
		case 1:
		do {	
			System.out.println("\n=========================================================="
					+ "\n=-=-=-=-=-=-=-=-=-=-=Odonto Smile =-=-=-=-=-=-=-=-=-=\n"
					+ "\n==========================================================" );
		System.out.println(" 1- Dentista");
		System.out.println(" 2- Recepcionista");
		System.out.println(" 3- Paciente");
		System.out.println(" 4- Usuário");
		System.out.println(" 0- voltar");
		System.out.println("Opção desejada:");
		opcaoInserir = input.nextInt();
		switch(opcaoInserir) {
		
		case 1:
			System.out.println(	
					  "\n========================================================="
					+ "\n=-=-=-=-=-=-=-=-=-=-= Odonto Smile =-=-=-=-=-=-=-=-=-=-=\n"
					+ "\n=-=-=-=-=-=-=-=-=-= Inserir Dentista =-=-=-=-=-=-=-=-=-=\n"
					+ "\n=========================================================" );
			inserirFuncionarioDentista();
			//repDentista = CaseDentista(repDentista);	
		break;
		case 2:
			System.out.println(	
					  "\n========================================================="
					+ "\n=-=-=-=-=-=-=-=-=-=-= =-=Odonto Smile =-=-=-=-=-=-=-=-=-\n"
					+ "\n=-=-=-=-=-=-=-=-=-= Inserir Recepcionista =-=-=-=-=-=-=-\n"
					+ "\n=========================================================" );
			inserirFuncionarioRecepcionista();
			//repRecepcionista = CaseRecepcionista(repRecepcionista);
			break;
		case 3:
			System.out.println(	
					  "\n========================================================="
					+ "\n=-=-=-=-=-=-=-=-=-=-=-Odonto Smile =-=-=-=-=-=-=-=-=-=-=\n"
					+ "\n=-=-=-=-=-=-=-=-=-= Inserir Paciente =-=-=-=-=-=-=-=-=-=\n"
					+ "\n=========================================================" );
			inserirPaciente();
			//repPac = CasePaciente(repPac);
			break;
		case 4: 
			System.out.println(	
					  "\n========================================================="
					+ "\n=-=-=-=-=-=-=-=-=-=-=-Odonto Smile =-=-=-=-=-=-=-=-=-=-=\n"
					+ "\n=-=-=-=-=-=-=-=-=-= Inserir Usuário =-=-=-=-=-=-=-=-=-=-\n"
					+ "\n=========================================================" );
			inserirUsuario() ;
			break;
			
		}
		
		}while(opcaoInserir!= 0);
		break;
		
		//case principal
		case 2: 
			do {
				System.out.println("\n=========================================================="
					+ "\n=-=-=-=-=-=-=-=-=-=-=Odonto Smile =-=-=-=-=-=-=-=-=-=\n"
					+ "\n==========================================================" );
		System.out.println(" 1-  Marcar  Agendamento");
		System.out.println(" 2-  Buscar Agendamento");
		System.out.println(" 3-  Editar Agendamento");
		System.out.println(" 4-  Excluir Agendamento");
		System.out.println(" 0- voltar");
		System.out.println("Opção desejada: ");
		opcaoAgendamento = input.nextInt();
		switch(opcaoAgendamento) {
		
		case 1:
			System.out.println(	
					  "\n========================================================="
					+ "\n=-=-=-=-=-=-=-=-=-=-= Odonto Smile =-=-=-=-=-=-=-=-=-=-\n"
					+ "\n=-=-=-=-=-=-=-=-=-= Marcar Consulta =-=-=-=-=-=-=-=-=-=\n"
					+ "\n=========================================================" );  
		marcarAgendamento();

		break;
		case 2:
			System.out.println(	
					  "\n========================================================="
					+ "\n=-=-=-=-=-=-=-=-=-=-= Odonto Smile =-=-=-=-=-=-=-=-=-=-\n"
					+ "\n=-=-=-=-=-=-=-=-=-= Buscar Consulta =-=-=-=-=-=-=-=-=-=\n"
					+ "\n=========================================================" );
			System.out.println("cpf do paciente: ");
			String opcaocpf = input.next();
			System.out.println(cruda.BuscarAgendamento(opcaocpf));
			break;
		case 3:
			System.out.println(	
					  "\n========================================================="
					+ "\n=-=-=-=-=-=-=-=-=-=-= Odonto Smile =-=-=-=-=-=-=-=-=-=-\n"
					+ "\n=-=-=-=-=-=-=-=-=-= Editar Consulta =-=-=-=-=-=-=-=-=-=\n"
					+ "\n=========================================================" );
			EditarAgendamento();
			break;
		case 4: 
			System.out.println(	
					  "\n========================================================="
					+ "\n=-=-=-=-=-=-=-=-=-=-= Odonto Smile =-=-=-=-=-=-=-=-=-=-\n"
					+ "\n=-=-=-=-=-=-=-=-=-= Remover Consulta =-=-=-=-=-=-=-=-=-=\n"
					+ "\n=========================================================" );
			Agenda agenda = new Agenda();
			System.out.println("Cpf do Paciente: ");
			agenda.setCpf(input.next());
			cruda.removerAgenda(agenda);
			break;
			
		}
		
		}while(opcaoAgendamento!= 0);
			
			break;
		
		
		//case principal
		case 3:
			do {
				System.out.println("\n=========================================================="
						+ "\n=-=-=-=-=-=-=-=-=-=-=Odonto Smile =-=-=-=-=-=-=-=-=-=\n"
						+ "\n==========================================================" );
			System.out.println(" 1-  Buscar Dentista");
			System.out.println(" 2-  Buscar Recepcionista");
			System.out.println(" 3-  Buscar Paciente");
			System.out.println(" 4-  Buscar Usuário");
			System.out.println(" 5-  Editar Dentista");
			System.out.println(" 6-  Editar Recepcionista");
			System.out.println(" 7-  Editar Paciente");
			System.out.println(" 8-  Editar Usuário");
			System.out.println(" 0- voltar");
			System.out.println("Opção desejada:");
			opcaoBuscar = input.nextInt();
			switch(opcaoBuscar) {
			case 1:
				System.out.println(	
						  "\n=========================================================="
						+ "\n=-=-=-=-=-=-=-=-=-= Odonto Smile =-=-=-=-=-=-=-=-=-=-=-\n"
						+ "\n=-=-=-=-=-=-=-=-=-= Buscar Dentista =-=-=-=-=-=-=-=-=-=\n"
						+ "\n==========================================================" );      
				
					System.out.print("Cpf: ");
					String BuscaDentista = input.next();
					System.out.println(crud.consultaDentista(BuscaDentista));	
					//  metodo via lista;
					
						/*System.out.print("Cpf: ");
						String BuscaFunc = input.next();
						if(repDentista.procurar(BuscaFunc) != null) {
							System.out.println("==========================================================\n");	
							System.out.println(repDentista.procurar(BuscaFunc).toString());		
						} else {
							System.out.println("\nBusca incompleta, CPF não encontrado!");
						}*/
			break;
			case 2:
				System.out.println(	
						  "\n=========================================================="
						+ "\n=-=-=-=-=-=-=-=-=-=-=-=Odonto Smile =-=-=-=-=-=-=-=-=-=-=-=-\n"
						+ "\n=-=-=-=-=-=-=-=-=-= Buscar Recepcionista =-=-=-=-=-=-=-=-=-=\n"
						+ "\n==========================================================" );
				System.out.print("Cpf: ");
				String BuscaRecepcionista = input.next();	
				System.out.println(crud.consultaRecepcionista(BuscaRecepcionista));
				//metodo lista
				/*if(repRecepcionista.procurar(BuscaRecepcionista) != null) {
					System.out.println(repRecepcionista.procurar(BuscaRecepcionista).toString());
				} else {
					System.out.println("\nBusca incompleta, CPF não encontrado!");
				}*/
				
				break;
			case 3:
				System.out.println(	
						  "\n=========================================================="
						+ "\n=-=-=-=-=-=-=-=-=-=-=Odonto Smile =-=-=-=-=-=-=-=-=-=-=\n"
						+ "\n=-=-=-=-=-=-=-=-=-= Buscar Paciente =-=-=-=-=-=-=-=-=-=\n"
						+ "\n==========================================================" );
				Paciente paci = new Paciente();
				System.out.print("Cpf do Paciente: ");
			String buscaPaci = input.next();
				//crudp.consultapac(buscaPaci);
				crudp.consultapac(buscaPaci);
				
				
				/*
				   if(repPac.procurar(BuscaPaciente) != null) {
                        System.out.println(repPac.procurar(BuscaPaciente).toString());
                    } else {
                        System.out.println("\nBusca incompleta, CPF n�o encontrado!");
                    }*/
				
		
				break;
			case 4: 
				System.out.println(	
						  "\n=========================================================="
						+ "\n=-=-=-=-=-=-=-=-=-=-=Odonto Smile =-=-=-=-=-=-=-=-=-=\n"
						+ "\n=-=-=-=-=-=-=-=-=-= Buscar Usuário =-=-=-=-=-=-=-=-=-=\n"
						+ "\n==========================================================" );
				Usuario usu = new Usuario();
				System.out.print("Nome do Usuário: ");
				String buscausuario = input.next();
				crudu.consultaUsuario(buscausuario);
				break;
				// case principal
			case 5: 
				System.out.println(	
						  "\n=========================================================="
						+ "\n=-=-=-=-=-=-=-=-=-=-=Odonto Smile =-=-=-=-=-=-=-=-=-=-=\n"
						+ "\n=-=-=-=-=-=-=-=-=-= Editar Dentista =-=-=-=-=-=-=-=-=-=\n"
						+ "\n==========================================================" );
				EditarDentista();
				break;
			case 6:
				System.out.println(	
						  "\n=========================================================="
						+ "\n=-=-=-=-=-=-=-=-=-=-=-=-=Odonto Smile-=-=-=-=-=-=-=-=-=-=-=-\n"
						+ "\n=-=-=-=-=-=-=-=-=-= Editar Recepcionista =-=-=-=-=-=-=-=-=-=\n"
						+ "\n==========================================================" );
				EditarRecepcionista();
				break;
			case 7:
				System.out.println(	
						  "\n=========================================================="
						+ "\n=-=-=-=-=-=-=-=-=-=-=Odonto Smile-=-=-=-=-=-=-=-=-=-=-=\n"
						+ "\n=-=-=-=-=-=-=-=-=-= Editar Paciente =-=-=-=-=-=-=-=-=-=\n"
						+ "\n==========================================================" );
				EditarPaciente();
				break;
			case 8:
				System.out.println(	
						  "\n=========================================================="
						+ "\n=-=-=-=-=-=-=-=-=-=-=Odonto Smile-=-=-=-=-=-=-=-=-=-=-=\n"
						+ "\n=-=-=-=-=-=-=-=-=-= Editar Usuário =-=-=-=-=-=-=-=-=-=-\n"
						+ "\n==========================================================" );
				Editarusuario();
			
			}
			}while(opcaoBuscar != 0);
			
			break;
		
			
			//case principal
		case 4:
			do {
			System.out.println("\n=========================================================="
					+ "\n=-=-=-=-=-=-=-=-=-=-=Odonto Smile =-=-=-=-=-=-=-=-=-=\n"
					+ "\n==========================================================" );
			System.out.println(" 1-  Remover Dentista");
			System.out.println(" 2-  Remover Recepcionista");
			System.out.println(" 3-  Remover Paciente");
			System.out.println(" 4-  Remover Usuário");
			System.out.println(" 0- voltar");
			System.out.println("Opção desejada:");
			opcaoRemover = input.nextInt();
			switch(opcaoRemover) {
			case 1:
				System.out.println(	
						  "\n=========================================================="
						+ "\n=-=-=-=-=-=-=-=-=-= Odonto Smile =-=-=-=-=-=-=-=-=-=-=-=\n"
						+ "\n=-=-=-=-=-=-=-=-=-= Remover Dentista =-=-=-=-=-=-=-=-=-=\n"
						+ "\n==========================================================" );      
				Dentista dent = new Dentista();
				System.out.print("Cpf: ");	
				((Dentista) dent).setCpf(input.next());
				crud.removerDentista(dent);
			break;
			case 2:
				System.out.println(	
						  "\n=========================================================="
						+ "\n=-=-=-=-=-=-=-=-=-=-=-=Odonto Smile =-=-=-=-=-=-=-=-=-=-=-=-=\n"
						+ "\n=-=-=-=-=-=-=-=-=-= Remover Recepcionista =-=-=-=-=-=-=-=-=-=\n"
						+ "\n==========================================================" );
				Recepcionista rec = new Recepcionista();
				System.out.print("Cpf: ");		
				((Recepcionista) rec).setCpf(input.next());
				crud.removerRecepcionista(rec);
				
				break;
			case 3:
				System.out.println(	
						  "\n=========================================================="
						+ "\n=-=-=-=-=-=-=-=-=-=-=-=Odonto Smile =-=-=-=-=-=-=-=-=-=-\n"
						+ "\n=-=-=-=-=-=-=-=-=-= Remover Paciente =-=-=-=-=-=-=-=-=-=\n"
						+ "\n==========================================================" );
						System.out.print("Cpf do Paciente: ");
							pac.setCpf( input.next());
							crudp.removerPaciente(pac);	
				break;
			case 4: 
				System.out.println(	
						  "\n=========================================================="
						+ "\n=-=-=-=-=-=-=-=-=-=-=Odonto Smile =-=-=-=-=-=-=-=-=-=-=\n"
						+ "\n=-=-=-=-=-=-=-=-=-= Remover usuário =-=-=-=-=-=-=-=-=-=\n"
						+ "\n==========================================================" );
				Usuario usu = new Usuario();
				System.out.print("Usuário: ");
				usu.setNomeUsuario( input.next());
				crudu.removerUsuario(usu);	
				break;
			
			
			
			}
			}while(opcaoRemover != 0);
			break;
		
		
		
		
		
		
		
	
		
		}
		}while(opcao1 != 0);		
		input.close();
	}	
	
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	
	
	
	// metodos
public static void Editarusuario() {
		
		
		CrudUsuario crudu = new CrudUsuario();
		Usuario usua = new Usuario();

	
		input.nextLine();
		System.out.print("usuario: ");
		usua.setNomeUsuario(input.nextLine());
		
		System.out.print("Senha: ");		
		usua.setSenhaUsuario(input.nextLine());
		
		System.out.print("tipo: ");	
		usua.setTipoUsuario(input.nextLine());
		
		System.out.print("codigo: ");	
		usua.setCodigoUsuario(input.nextInt());
		crudu.EditarUsuario(usua);

	}
	public static void inserirUsuario() {
		CrudUsuario crudu = new CrudUsuario();
		Usuario usuario = new Usuario();
	
		
		input.nextLine();
		System.out.print("usuario: ");
		usuario.setNomeUsuario(input.nextLine());
		
		System.out.print("Senha: ");		
		usuario.setSenhaUsuario(input.nextLine());
		
		System.out.print("tipo de Usuário: ");	
		usuario.setTipoUsuario(input.nextLine());
		crudu.SalvarUsuario(usuario);
		
	}
	public static void TelaLogin(){
		Conexao conex = new Conexao();
		conex.conexao();
		CrudUsuario crudu = new CrudUsuario();
		Usuario usu = new Usuario();
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
	
	public static void marcarAgendamento() {
		
		Agenda age = new Agenda();
	
		CrudAgenda cruda = new CrudAgenda();

		input.nextLine();
		System.out.print("Nome do Paciente: ");
		age.setNome_paciente(input.nextLine());
		
		System.out.print("cpf: ");		
		age.setCpf(input.nextLine());
		
		System.out.print("Dentista: ");	
		age.setNome_dentista(input.nextLine());
		
		System.out.print("Plano: ");
		age.setPlano_tratamento(input.nextLine());
		
		System.out.print("Tratamento: ");	
		age.setTratamento_dente(input.nextLine());
		
		System.out.print("Data de Inclusão: ");
		age.setData_inclusao(input.nextLine());
		
		System.out.print("Data de Agendamento: ");
		age.setData_agenda(input.nextLine());				
		
		System.out.print("Status:  ");
		age.setStatus(input.nextLine());	
		cruda.inserirAgenda(age);
	
	}
public static void EditarAgendamento() {
		
		
		CrudAgenda cruda = new CrudAgenda();
		Agenda  agenda = new Agenda();
		
	
		input.nextLine();
		System.out.print("Nome do Paciente: ");
		agenda.setNome_paciente(input.nextLine());
		
		System.out.print("Dentista: ");
		agenda.setNome_dentista(input.nextLine());
		
		System.out.print("Plano: ");		
		agenda.setPlano_tratamento(input.nextLine());
		
		System.out.print("Tratamento: ");	
		agenda.setTratamento_dente(input.nextLine());
		
		System.out.print("Data de Agendamento: ");
		agenda.setData_agenda(input.nextLine());
		
		System.out.print("Status: ");	
		agenda.setStatus(input.nextLine());
		
		
		System.out.print("Cpf: ");	
		agenda.setCpf(input.next());

		cruda.EditarAgenda(agenda);
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
	
	
	

