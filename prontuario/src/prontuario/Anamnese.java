package prontuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Anamnese {
	Scanner input = new Scanner(System.in);
	
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
	
	ArrayList<Anamnese> lista_anamnese = new ArrayList <Anamnese>();
	
	public void dadosAnamnese() {		
		Anamnese anam = new Anamnese();
		
		System.out.println("\n==========================================================");
		System.out.println("                  Entrevista (Anamnese)");
		System.out.println("                    Digite [S ou N]\n");
		
		System.out.print("Problema com Anestesia? ");
		anam.setProblemaAnestesia(input.nextLine());
		
		System.out.print("Problema de Hemorragia? ");
		anam.setProblemaHemorragia(input.nextLine());
		
		System.out.print("Problema de Febre Reumática? ");
		anam.setFebreReumatica(input.nextLine());

		System.out.print("Problema Renal? ");
		anam.setProblemaRenal(input.nextLine());	
		
		System.out.print("Problema Respiratório? ");
		anam.setProblemaRespitorio(input.nextLine());
		
		System.out.print("Problema Cardíaco? ");
		anam.setProblemaCardiaco(input.nextLine());
		
		System.out.print("Problema Gástrico? ");
		anam.setProblemaGastrico(input.nextLine());
		
		System.out.print("Problema com Articulação? ");
		anam.setProblemaArticular(input.nextLine());
		
		System.out.print("Antecedentes Familiar, se sim, Quais? ");
		anam.setAntecedenteFamiliar(input.nextLine());
		
		System.out.print("Alergias, se sim, Quais? ");
		anam.setAlergia(input.nextLine());
		
		System.out.println("\n==========================================================");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("==========================================================\n");
		
		lista_anamnese.add(anam);
	}

	public Anamnese() {
		
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
		return "\nProblema com Anestesia? " + problemaAnestesia + "\nProblema de Hemorragia? " + problemaHemorragia
				+ "\nProblema de Febre Reumática? " + febreReumatica + "\nProblema Renal? " + problemaRenal + "\nProblema Respiratório? "
				+ problemaRespitorio + "\nProblema com Articulação? " + problemaArticular
				+ "\nProblema Cardíaco? " + problemaCardiaco + "\nProblema Gástrico? " + problemaGastrico
				+ "\nAntecedentes Familiar?" + antecedenteFamiliar + "\nAlergia? " + alergia;
	}


	
}


