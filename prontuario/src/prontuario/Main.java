package prontuario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        Paciente pac = new Paciente();
        Login login = new Login();


        login.telaLogin();

        do {

            System.out.println("\n1- Cadastrar Dentista"
            		+ "\n2- Cadastrar Paciente"
            		+ "\n3- Buscar"
            		+ "\n4- "
            		+ "\n0- Finalizar \n");
            System.out.print("O que deseja fazer? ");
            opcao = sc.nextInt();

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
                
                break;

            }

        }while(opcao != 0);

        sc.close();
    }

}