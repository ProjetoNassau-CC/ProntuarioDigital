package prontuario;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class Login {
	
	private int codigo;
	private String usuario;
	private String senha;
	private int tipo_usuario;
	
	

	public Login(int codigo, String usuario, String senha, int tipo_usuario) {
		super();
		this.codigo = codigo;
		this.usuario = usuario;
		this.senha = senha;
		this.tipo_usuario = tipo_usuario;
	}


	public Login() {
		
	}


	@SuppressWarnings("unlikely-arg-type")
	public void telaLogin() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		ArrayList<String> list = new ArrayList<>();
	
		
		String login1;
		String senha1;
		boolean condicao = false;
		int resp ;
	
	
	
	do {
		System.out.println("__________________________________________________________");
		System.out.println("XXXXXXXXXXXXXXXXXXXXX DADOS DO ADMIN XXXXXXXXXXXXXXXXXXXXX\n");

		System.out.print("Login : ");
		String login = sc.next();
		
		System.out.print("Senha : ");
		String senha = sc.next();
		
	
		list.add(login);
		list.add(senha);
	
		System.out.print("\nSIM = 0 | NAO = 1 \nQuer cadastra outro usuario ?");
		resp = sc.nextInt();
		System.out.println("\n");
	
	}while(resp != 1);
	
	System.out.println("__________________________________________________________");
	System.out.println("XXXXXXXXXXXXXXXXXXXXX FACA SEU LOGIN XXXXXXXXXXXXXXXXXXXXX\n");

	System.out.print("Login : ");
	login1 = sc.next();
	
	System.out.print("Senha : ");
	senha1 = sc.next();
	
	
	if(list.contains(login1) && list.contains(senha1) ) {
		
		System.out.println("\n==========================================================");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");	
		System.out.println("                   logado com sucesso");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");	
		System.out.println("==========================================================");
	}else {
		
		do {
			System.out.println("\n__________________________________________________________");
			 System.out.println("XXXXXXXXXXXXXXXXXXXXX FACA SEU LOGIN XXXXXXXXXXXXXXXXXXXXX");
				
			 System.out.println("_________________DIGITE A SENHA NOVAMENTE_________________");
	
			System.out.println("\n");
			System.out.print("Login : ");
			login1 = sc.next();
			
			System.out.print("Senha : ");
			senha1 = sc.next();
			
			if(list.contains(login1) && list.contains(senha1) ) {
				System.out.println("___________________logado com sucesso_____________________");
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");	
				System.out.println("__________________________________________________________");
				condicao = true;
			}
		
		 
		 
		}while(!condicao);
			
		
		}
		 
	}


	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getTipo_usuario() {
		return tipo_usuario;
	}
	public void setTipo_usuario(int tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}
}

