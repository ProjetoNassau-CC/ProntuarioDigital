package prontuario;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int opcao;
		do {
			Scanner leia = new Scanner(System.in);
			MenuGeral();
			opcao = leia.nextInt();
			System.out.println();
			System.out.println();
			switch (opcao) 
			{
				case 1:
					CadastrarPaciente();
				case 2:
					continue;
				case 3:
					break;
				default:
					System.out.println("Opção Inválida");
			}
		} while (opcao != 3);
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
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = leia.nextLine();
		System.out.print("Digite seu Email: ");
		String email = leia.nextLine();
		System.out.print("Digite seu telefone: ");
		String telefone = leia.nextLine();
	}
}
