package prontuario;

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

