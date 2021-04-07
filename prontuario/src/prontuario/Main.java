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
			System.out.println("Espero v�-lo novamente mais tarde! Bye.");	
		default:
			System.out.println("Op��o Inv�lida");
		}
		
		sc.close();
	}

	
	public static void MenuGeral() 
	{
		System.out.println("--------------------------------------");
		System.out.println("		MENU");
		System.out.println("--------------------------------------");
		System.out.println("Escolha uma op��o");
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
			System.out.println("------------------ Informa��es Pessoais ------------------");
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
			System.out.print("Endere�o: ");
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
			System.out.println("------------------    [0-n�o ou 1-sim]   ------------------");
			
			System.out.print("Problema com Anestesia? ");
			probAnestesia = sc.nextInt();
			System.out.print("Problema de Febre Reum�tica ?");
			febreReumatica = sc.nextInt();
			System.out.print("Problema Card�aco? ");
			probCardiaco = sc.nextInt();
			System.out.print("Problema G�strico? ");
			probGastrico = sc.nextInt();
			System.out.print("Problema de Hemorragia? ");
			probHemorragia = sc.nextInt();
			System.out.print("Problema Renal? ");
			probRenal = sc.nextInt();
			System.out.print("Problema Respirat�rio? ");
			probRespiratorio = sc.nextInt();
			System.out.print("Problema com Articula��o? ");
			probArticularReumatico = sc.nextInt();
			System.out.print("Antecedentes Familiar? (Doen�as, etc...) Se sim, Quais? ");
			antecedenciaFamiliar = sc.nextLine();
			System.out.print("Alergias? ");
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
			System.out.println("------------------ Ficha T�cnica ------------------");
			System.out.print("Nome do dentista: ");
			nome = sc.nextLine();
			System.out.print("Data da consulta (xx/xx/xxxx): ");
			nome = sc.nextLine();
			System.out.print("Data do tratamento (xx/xx/xxxx): ");
			nome = sc.nextLine();
			System.out.print("Plano do tratamento: ");
			nome = sc.nextLine();
			System.out.print("Digite o or�amento: R$");
			nome = sc.nextLine();
			
			
			System.out.println("Deseja cadastrar mais algu�m? [1-sim] ou [2-n�o]");
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
