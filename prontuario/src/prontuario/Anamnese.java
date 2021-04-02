package prontuario;

import java.util.ArrayList;

public class Anamnese {
	private Boolean problemaAnestesia;
	private Boolean problemaHemorragia;
	private Boolean febreReumatica;
	private Boolean	problemaRenal;
	private Boolean problemaRespitorio;
	private Boolean problemaArticularReumatico;
	private Boolean problemaCardiaco;
	private Boolean problemaGastrico;
	private String antecedenteFamiliar;
	private ArrayList<String> alergia;
	
	public Anamnese(Boolean problemaAnestesia, Boolean problemaHemorragia, Boolean febreReumatica,
			Boolean problemaRenal, Boolean problemaRespitorio, Boolean problemaArticularReumatico,
			Boolean problemaCardiaco, Boolean problemaGastrico, String antecedenteFamiliar, ArrayList<String> alergia) {
		this.problemaAnestesia = problemaAnestesia;
		this.problemaHemorragia = problemaHemorragia;
		this.febreReumatica = febreReumatica;
		this.problemaRenal = problemaRenal;
		this.problemaRespitorio = problemaRespitorio;
		this.problemaArticularReumatico = problemaArticularReumatico;
		this.problemaCardiaco = problemaCardiaco;
		this.problemaGastrico = problemaGastrico;
		this.antecedenteFamiliar = antecedenteFamiliar;
		this.alergia = alergia;
	}

	public Boolean getProblemaAnestesia() {
		return problemaAnestesia;
	}

	public void setProblemaAnestesia(Boolean problemaAnestesia) {
		this.problemaAnestesia = problemaAnestesia;
	}

	public Boolean getProblemaHemorragia() {
		return problemaHemorragia;
	}

	public void setProblemaHemorragia(Boolean problemaHemorragia) {
		this.problemaHemorragia = problemaHemorragia;
	}

	public Boolean getFebreReumatica() {
		return febreReumatica;
	}

	public void setFebreReumatica(Boolean febreReumatica) {
		this.febreReumatica = febreReumatica;
	}

	public Boolean getProblemaRenal() {
		return problemaRenal;
	}

	public void setProblemaRenal(Boolean problemaRenal) {
		this.problemaRenal = problemaRenal;
	}

	public Boolean getProblemaRespitorio() {
		return problemaRespitorio;
	}

	public void setProblemaRespitorio(Boolean problemaRespitorio) {
		this.problemaRespitorio = problemaRespitorio;
	}

	public Boolean getProblemaArticularReumatico() {
		return problemaArticularReumatico;
	}

	public void setProblemaArticularReumatico(Boolean problemaArticularReumatico) {
		this.problemaArticularReumatico = problemaArticularReumatico;
	}

	public Boolean getProblemaCardiaco() {
		return problemaCardiaco;
	}

	public void setProblemaCardiaco(Boolean problemaCardiaco) {
		this.problemaCardiaco = problemaCardiaco;
	}

	public Boolean getProblemaGastrico() {
		return problemaGastrico;
	}

	public void setProblemaGastrico(Boolean problemaGastrico) {
		this.problemaGastrico = problemaGastrico;
	}

	public String getAntecedenteFamiliar() {
		return antecedenteFamiliar;
	}

	public void setAntecedenteFamiliar(String antecedenteFamiliar) {
		this.antecedenteFamiliar = antecedenteFamiliar;
	}

	public ArrayList<String> getAlergia() {
		return alergia;
	}

	public void setAlergia(ArrayList<String> alergia) {
		this.alergia = alergia;
	}
}

