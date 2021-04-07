package prontuario;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		do {
			MenuGeral();
			System.out.print("O que gostaria de fazer? ");
			opcao = sc.nextInt();
			
		}while(opcao < 1 || opcao > 3);
		
		switch(opcao) {
		case 1:
			CadastrarPaciente();
			break;		
		case 2:
			break;	
		case 3:
			System.out.println("Espero vê-lo novamente mais tarde! Bye.");	
		default:
			System.out.println("Opção Inválida");
		}
		
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
	
	public static void CadastrarPaciente() 
	{
		List<String> dados = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int resp;
		String nome, email, telefone, cpf, rg, dtNascimento, observacao, logradouro, numero, bairro, cep, cidade, uf, complemento;
		String antecedenciaFamiliar;
		int febreReumatica, probAnestesia, probArticularReumatico, probCardiaco, probGastrico, probHemorragia, probRenal, probRespiratorio;
		int intAlergia;
		ArrayList<String> alergia = new ArrayList<String>();
		do {
			System.out.println("------------------ Informações Pessoais ------------------");
			System.out.print("Digite seu nome: ");
			nome = sc.nextLine();
			System.out.print("Digite seu telefone: ");
			telefone = sc.nextLine();
			System.out.print("Digite seu email: ");
			email = sc.nextLine();
			System.out.print("Digite seu CPF: ");
			cpf = sc.nextLine();
			System.out.print("Digite seu RG: ");
			rg = sc.nextLine();
			System.out.print("Digite sua data de nascimento (xx/xx/xxxx): ");
			dtNascimento = sc.nextLine();
			System.out.print("Caso queira deixar uma observação sobre você. Por favor, informe: ");
			observacao = sc.nextLine();
			System.out.print("Digite o logradouro do seu endereço: ");
			logradouro = sc.nextLine();
			System.out.print("Digite o número do seu endereço: ");
			numero = sc.nextLine();
			System.out.print("Se houver, digite o complemento: ");
			complemento = sc.nextLine();
			System.out.print("Digite o bairro do seu endereço: ");
			bairro = sc.nextLine();
			System.out.print("Digite a cidade do seu endereço: ");
			cidade = sc.nextLine();
			System.out.print("Digite a UF do seu endereço (ex: PE): ");
			uf = sc.nextLine();
			System.out.print("Digite o CEP do seu endereço (apenas números): ");
			cep = sc.nextLine();
			System.out.println("");
			System.out.println("------------------ Entrevista (Anamnese) ------------------");
			System.out.print("Problema com Anestesia? [0-não ou 1-sim]");
			probAnestesia = sc.nextInt();
			System.out.print("Problema de Febre Reumática? [0-não ou 1-sim]");
			febreReumatica = sc.nextInt();
			System.out.print("Problema Cardíaco? [0-não ou 1-sim]");
			probCardiaco = sc.nextInt();
			System.out.print("Problema Gástrico? [0-não ou 1-sim]");
			probGastrico = sc.nextInt();
			System.out.print("Problema de Hemorragia? [0-não ou 1-sim]");
			probHemorragia = sc.nextInt();
			System.out.print("Problema Renal? [0-não ou 1-sim]");
			probRenal = sc.nextInt();
			System.out.print("Problema Respiratório? [0-não ou 1-sim]");
			probRespiratorio = sc.nextInt();
			System.out.print("Problema com Articulação? [0-não ou 1-sim]");
			probArticularReumatico = sc.nextInt();
			System.out.print("Antecedentes Familiar? (Doenças, etc...) Se sim, Quais? ");
			antecedenciaFamiliar = sc.nextLine();
			System.out.print("Alergias? [0-não ou 1-sim]");
			intAlergia = sc.nextInt();
			if (intAlergia != 0) 
			{
				String resposta;
				do {
					System.out.print("Informe a alergia (Digite uma por vez e 0 para sair): ");
					resposta = sc.nextLine();
					if (resposta != "0") { alergia.add(resposta); }
				} while (resposta == "0");
				
			}
			System.out.println("");
			System.out.println("------------------ Ficha Técnica ------------------");
			System.out.print("Digite o nome do dentista: ");
			nome = sc.nextLine();
			System.out.print("Digite a data da consulta (xx/xx/xxxx): ");
			nome = sc.nextLine();
			System.out.print("Digite a data do tratamento (xx/xx/xxxx): ");
			nome = sc.nextLine();
			System.out.print("Digite o plano do tratamento: ");
			nome = sc.nextLine();
			System.out.print("Digite o orçamento: R$");
			nome = sc.nextLine();
			
			
			System.out.println("Deseja cadastrar mais alguém? [1-sim] ou [2-não]");
			resp = sc.nextInt();
		} while(resp != 2);
		
		int[] mylist = {3, 6, 9, 12, 15, 18, 21};
		Object[] arrDados = dados.toArray();
		for(int i=0; i < arrDados.length; i++) {
			for(Integer num: mylist) {
				if (i == num) {
					System.out.println("-------------------------------");
				}
			}
			System.out.println(arrDados[i]);
		}
		
		sc.close();
	}
	
}
