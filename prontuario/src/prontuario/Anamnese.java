package prontuario;

public class Anamnese {
	
	private String problemaAnestesia;
	private String problemaHemorragia;
	private String febreReumatica;
	private String problemaRenal;
	private String problemaRespitorio;
	private String problemaArticular;
	private String problemaCardiaco;
	private String problemaGastrico;
	private String antecedenteFamiliar;
	private String alergia;
	
	public Anamnese() {
		this.problemaAnestesia = null;
		this.problemaHemorragia = null;
		this.febreReumatica = null;
		this.problemaRenal = null;
		this.problemaRespitorio = null;
		this.problemaArticular = null;
		this.problemaCardiaco = null;
		this.problemaGastrico = null;
		this.antecedenteFamiliar = null;
		this.alergia = null;		
	}
	
	public Anamnese(String problemaAnestesia, String problemaHemorragia, String febreReumatica,
			String problemaRenal, String problemaRespitorio, String problemaArticular,
			String problemaCardiaco, String problemaGastrico, String antecedenteFamiliar, String alergia) {
		this.problemaAnestesia = problemaAnestesia;
		this.problemaHemorragia = problemaHemorragia;
		this.febreReumatica = febreReumatica;
		this.problemaRenal = problemaRenal;
		this.problemaRespitorio = problemaRespitorio;
		this.problemaArticular = problemaArticular;
		this.problemaCardiaco = problemaCardiaco;
		this.problemaGastrico = problemaGastrico;
		this.antecedenteFamiliar = antecedenteFamiliar;
		this.alergia = alergia;
	}

	public String getProblemaAnestesia() {
		return problemaAnestesia;
	}

	public void setProblemaAnestesia(String problemaAnestesia) {
		this.problemaAnestesia = problemaAnestesia;
	}

	public String getProblemaHemorragia() {
		return problemaHemorragia;
	}

	public void setProblemaHemorragia(String problemaHemorragia) {
		this.problemaHemorragia = problemaHemorragia;
	}

	public String getFebreReumatica() {
		return febreReumatica;
	}

	public void setFebreReumatica(String febreReumatica) {
		this.febreReumatica = febreReumatica;
	}

	public String getProblemaRenal() {
		return problemaRenal;
	}

	public void setProblemaRenal(String problemaRenal) {
		this.problemaRenal = problemaRenal;
	}

	public String getProblemaRespitorio() {
		return problemaRespitorio;
	}

	public void setProblemaRespitorio(String problemaRespitorio) {
		this.problemaRespitorio = problemaRespitorio;
	}

	public String getProblemaArticular() {
		return problemaArticular;
	}

	public void setProblemaArticular(String problemaArticular) {
		this.problemaArticular = problemaArticular;
	}

	public String getProblemaCardiaco() {
		return problemaCardiaco;
	}

	public void setProblemaCardiaco(String problemaCardiaco) {
		this.problemaCardiaco = problemaCardiaco;
	}

	public String getProblemaGastrico() {
		return problemaGastrico;
	}

	public void setProblemaGastrico(String problemaGastrico) {
		this.problemaGastrico = problemaGastrico;
	}

	public String getAntecedenteFamiliar() {
		return antecedenteFamiliar;
	}

	public void setAntecedenteFamiliar(String antecedenteFamiliar) {
		this.antecedenteFamiliar = antecedenteFamiliar;
	}

	public String getAlergia() {
		return alergia;
	}

	public void setAlergia(String  alergia) {
		this.alergia = alergia;
	}	
	
	public String toString() {
		return  "\n\n                          Anamnese\n" 
				+ "\nProblema com Anestesia? " + problemaAnestesia
				+ "\nProblema de Hemorragia? " + problemaHemorragia
				+ "\nProblema de Febre Reumática? " + febreReumatica
				+ "\nProblema Renal? " + problemaRenal
				+ "\nProblema Respiratório? " + problemaRespitorio
				+ "\nProblema com Articulação? " + problemaArticular
				+ "\nProblema Cardíaco? " + problemaCardiaco 
				+ "\nProblema Gástrico? " + problemaGastrico
				+ "\nAntecedentes Familiar?" + antecedenteFamiliar
				+ "\nAlergia? " + alergia;
	}
	
}


