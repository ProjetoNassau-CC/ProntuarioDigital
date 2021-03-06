package prontuario;

public class Usuario {

	
	private int codigoUsuario;
	private String nomeUsuario;
	private String senhaUsuario;
	private String tipoUsuario;

	
	public Usuario() {
		
	}
	public Usuario(int codigoUsuario, String nomeUsuario, String senhaUsuario, String tipoUsuario) {
		this.codigoUsuario = codigoUsuario;
		this.nomeUsuario = nomeUsuario;
		this.senhaUsuario = senhaUsuario;
		this.tipoUsuario = tipoUsuario;
	}
	public int getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	public String toString() {
		return  "                          Paciente\n" 
				+  "\nCodigo: " + codigoUsuario
				+ "\nUsuario: " + nomeUsuario 
				+ "\nTipo: " + tipoUsuario + "\n";
	};
	
	
	
}
