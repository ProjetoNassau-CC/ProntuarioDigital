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
		this.problemaAnestesia =  problemaAnestesia;
		this.problemaHemorragia =  problemaHemorragia;
		this.febreReumatica =  febreReumatica;
		this.problemaRenal =  problemaRenal;
		this.problemaRespitorio =  problemaRespitorio;
		this.problemaArticularReumatico =  problemaArticularReumatico;
		this.problemaCardiaco =  problemaCardiaco;
		this.problemaGastrico =  problemaGastrico;
		this.antecedenteFamiliar =  antecedenteFamiliar;
		this.alergia =  alergia;
	}
	
	
	public Anamnese(int problemaAnestesia, int problemaHemorragia, int febreReumatica,
			int problemaRenal, int problemaRespitorio, int problemaArticularReumatico,
			int problemaCardiaco, int problemaGastrico, String antecedenteFamiliar, ArrayList<String> alergia) {
		setProblemaAnestesia(problemaAnestesia);
		setProblemaHemorragia(problemaHemorragia);
		setFebreReumatica(febreReumatica);
		setProblemaRenal(problemaRenal);
		setProblemaRespitorio(problemaRespitorio);
		setProblemaArticularReumatico(problemaArticularReumatico);
		setProblemaCardiaco(problemaCardiaco);
		setProblemaGastrico(problemaGastrico);
		this.antecedenteFamiliar =  antecedenteFamiliar;
		this.alergia =  alergia;
	}

	public Boolean getProblemaAnestesia() {
		return problemaAnestesia;
	}

	public void setProblemaAnestesia(int problemaAnestesia) {
		Boolean probAnestesia =  problemaAnestesia ==  0 ? true : false;
		this.problemaAnestesia =  probAnestesia;
	}

	public Boolean getProblemaHemorragia() {
		return problemaHemorragia;
	}

	public void setProblemaHemorragia(int problemaHemorragia) {
		Boolean probHemorragia =  problemaHemorragia ==  0 ? true : false;
		this.problemaHemorragia =  probHemorragia;
	}

	public Boolean getFebreReumatica() {
		return febreReumatica;
	}

	public void setFebreReumatica(int febreReumatica) {
		Boolean febReumatica =  febreReumatica ==  0 ? true : false;
		this.febreReumatica =  febReumatica;
	}

	public Boolean getProblemaRenal() {
		return problemaRenal;
	}

	public void setProblemaRenal(int problemaRenal) {
		Boolean probRenal =  problemaRenal ==  0 ? true : false;
		this.problemaRenal =  probRenal;
	}

	public Boolean getProblemaRespitorio() {
		return problemaRespitorio;
	}

	public void setProblemaRespitorio(int problemaRespitorio) {
		Boolean probRespitorio =  problemaRespitorio ==  0 ? true : false;
		this.problemaRespitorio =  probRespitorio;
	}

	public Boolean getProblemaArticularReumatico() {
		return problemaArticularReumatico;
	}

	public void setProblemaArticularReumatico(int problemaArticularReumatico) {
		Boolean probArticularReumatico =  problemaArticularReumatico ==  0 ? true : false;
		this.problemaArticularReumatico =  probArticularReumatico;
	}

	public Boolean getProblemaCardiaco() {
		return problemaCardiaco;
	}

	public void setProblemaCardiaco(int problemaCardiaco) {
		Boolean probCardiaco =  problemaCardiaco ==  0 ? true : false;
		this.problemaCardiaco =  probCardiaco;
	}

	public Boolean getProblemaGastrico() {
		return problemaGastrico;
	}

	public void setProblemaGastrico(int problemaGastrico) {
		Boolean probGastrico =  problemaGastrico ==  0 ? true : false;
		this.problemaGastrico =  probGastrico;
	}

	public String getAntecedenteFamiliar() {
		return antecedenteFamiliar;
	}

	public void setAntecedenteFamiliar(String antecedenteFamiliar) {
		this.antecedenteFamiliar =  antecedenteFamiliar;
	}

	public String getAlergia() {
		String alergias = "";
		if (alergia.size() > 0) {
			for (String ale : alergia) {
				alergias += ale + "\n"; 
			}
		} else 
		{
			alergias = "Não";
		}
		return alergias;
	}

	public void setAlergia(ArrayList<String> alergia) {
		this.alergia =  alergia;
	}


	@Override
	public String toString() {
		return "Problema Anestesia? " + problemaAnestesia + "\nProblema Hemorragia? " + problemaHemorragia
				+ "\nFebre Reumatica? " + febreReumatica + "\nProblema Renal? " + problemaRenal + "\nProblema Respitorio? "
				+ problemaRespitorio + "\nProblema Articular Reumatico? " + problemaArticularReumatico
				+ "\nProblema Cardíaco? " + problemaCardiaco + "\nProblema Gástrico? " + problemaGastrico
				+ "\nAntecedente Familiar? " + antecedenteFamiliar + "\nAlergias? " + getAlergia() + "\n";
	}
	
	
}

