package prontuario;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int opcao;
		
		Paciente pac = new Paciente();
		Login log = new Login();
		
		log.telaLogin();	
		
		do {
				
			
			System.out.println("\n1- xxxxxxx \n2- Cadastrar \n3- Buscar \n0- Finalizar \n");
			System.out.print("Op��o: ");
			opcao = input.nextInt();

			switch(opcao) {	
			case 1:
				
				break;
			case 2:
				pac.CadastrarPaciente();
				break;
				
			case 3:
				pac.Buscar();
				break;
			case 4:
				
					
				
		}	
		
		}while(opcao != 0);
				
		input.close();
	}
	
}
