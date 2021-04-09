package prontuario;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Ficha_tecnica> dados = new ArrayList<Ficha_tecnica>();
		int opcao;
		
		do {
			MenuGeral();
			System.out.print("O que gostaria de fazer? ");
			opcao = Integer.parseInt(sc.nextLine());
		
			switch(opcao) {
				case 1:
					int resp;
					String nome, email, telefone, cpf, rg, dtNascimento, observacao, logradouro, numero, bairro, cep, cidade, uf, complemento;
					String antecedenciaFamiliar, nomeDentista, dataConsulta, dataTratamento, planoTratamento, orcamento;
					int febreReumatica, probAnestesia, probArticularReumatico, probCardiaco, probGastrico, probHemorragia, probRenal, probRespiratorio;
					int intAlergia, codigoPaciente;
					ArrayList<String> alergia = new ArrayList<String>();
					System.out.println("------------------ Informações Pessoais ------------------");
					System.out.print("Código Paciente: ");
					codigoPaciente = Integer.parseInt(sc.nextLine());
					System.out.print("Nome: ");
					nome = sc.nextLine();
					System.out.print("Telefone: ");
					telefone = sc.nextLine();
					System.out.print("Email: ");
					email = sc.nextLine();
					System.out.print("CPF: ");
					cpf = sc.nextLine();
					System.out.print("RG: ");
					rg = sc.nextLine();
					System.out.print("Data de nascimento (xx/xx/xxxx): ");
					dtNascimento = sc.nextLine();
					System.out.print("Logradouro: ");
					logradouro = sc.nextLine();
					System.out.print("Endereço: ");
					numero = sc.nextLine();
					System.out.print("Cmplemento: ");
					complemento = sc.nextLine();
					System.out.print("Bairro: ");
					bairro = sc.nextLine();
					System.out.print("Cidade: ");
					cidade = sc.nextLine();
					System.out.print("UF: ");
					uf = sc.nextLine();
					System.out.print("CEP: ");
					cep = sc.nextLine();
					System.out.println("");
					
					System.out.println("------------------ Entrevista (Anamnese) ------------------");
					System.out.println("----------------- Digite [0-sim ou 1-não] -----------------");
					System.out.print("Problema com Anestesia? ");
					probAnestesia = Integer.parseInt(sc.nextLine());
					System.out.print("Problema de Febre Reumática? ");
					febreReumatica = Integer.parseInt(sc.nextLine());
					System.out.print("Problema Cardíaco? ");
					probCardiaco = Integer.parseInt(sc.nextLine());
					System.out.print("Problema Gástrico? ");
					probGastrico = Integer.parseInt(sc.nextLine());
					System.out.print("Problema de Hemorragia? ");
					probHemorragia = Integer.parseInt(sc.nextLine());
					System.out.print("Problema Renal? ");
					probRenal = Integer.parseInt(sc.nextLine());
					System.out.print("Problema Respiratório? ");
					probRespiratorio = Integer.parseInt(sc.nextLine());
					System.out.print("Problema com Articulação? ");
					probArticularReumatico = Integer.parseInt(sc.nextLine());
					System.out.print("Antecedentes Familiar? (Doenças, etc...) Se sim, Quais? ");
					antecedenciaFamiliar = sc.nextLine();
					System.out.print("Alergias? ");
					intAlergia = Integer.parseInt(sc.nextLine());
					if (intAlergia == 0) 
					{
						String resposta;
						do {
							System.out.print("Informe a alergia (Digite uma por vez e 0 para sair): ");
							resposta = sc.nextLine().trim();
							if (resposta.equals("0")) { alergia.add(resposta); }
						} while (!resposta.equals("0"));
						
					}
					
					System.out.println("");
					System.out.println("------------------ Ficha Técnica ------------------");
					System.out.print("Nome do dentista: ");
					nomeDentista = sc.nextLine();
					System.out.print("Data da consulta (xx/xx/xxxx): ");
					dataConsulta = sc.nextLine();
					System.out.print("Data do tratamento (xx/xx/xxxx): ");
					dataTratamento = sc.nextLine();
					System.out.print("Plano do tratamento: ");
					planoTratamento = sc.nextLine();
					System.out.print("Digite o orçamento: R$");
					orcamento = sc.nextLine();
					
					String codigoFicha = LocalDateTime.now().toString().replace("-", "").replace(".", "").replace(":", "");
					Endereco endereco = new Endereco(logradouro, bairro, cep, cidade, uf, numero, complemento);
					Paciente paciente = new Paciente(codigoPaciente, nome, email, telefone, telefone, endereco, 
							dtNascimento, cpf, rg);
					Anamnese perguntas = new Anamnese(probAnestesia, probHemorragia, febreReumatica, probRenal, probRespiratorio, 
							probArticularReumatico, probCardiaco, probGastrico, antecedenciaFamiliar, alergia);
					Ficha_tecnica ficha = new Ficha_tecnica(codigoFicha, paciente, nomeDentista, dataConsulta, perguntas, planoTratamento,
							dataTratamento, orcamento);
					dados.add(ficha);
					break;	
				case 2:
					System.out.print("CPF: ");
					String cpf_consulta = sc.nextLine();
					for(Ficha_tecnica ficha_consulta : dados) 
					{
						if (ficha_consulta.getPaciente().getCpf().equals(cpf_consulta)) 
						{
							System.out.println(ficha_consulta);
							
						}
					}
					break;	
				case 3:
					System.out.println("Espero vê-lo novamente mais tarde! Bye.");	
					break;
				default:
					System.out.println("--------------------------------------");
					System.out.println("Opção Inválida");
					System.out.println("--------------------------------------");
			}
		} while(opcao != 3);
		
		sc.close();
	}

	
	public static void MenuGeral() 
	{
		System.out.println("--------------------------------------");
		System.out.println("		MENU");
		System.out.println("--------------------------------------");
		System.out.println("Escolha uma opção");
		System.out.println("1 - Cadastrar Paciente");
		System.out.println("2 - Consulta Paciente");
		System.out.println("3 - Sair");
		System.out.println("--------------------------------------");
		System.out.print("-> ");

	}
	
}
