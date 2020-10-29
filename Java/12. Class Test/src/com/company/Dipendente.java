package com.company;

public class Dipendente {
	private int id;
	private String cognome;
	private int stipendio;
	private int livelloProfessionale;
	private String dipartimento;

	public Dipendente(int a, String b, int c, int d, String e) {
		id = a;
		cognome = b;
		stipendio = c;
		livelloProfessionale = d;
		dipartimento = e;
	}

	public int getLivelloProfessionale() {
		return this.livelloProfessionale;
	}

	public void setDipartimento(String a) {
		this.dipartimento = a;
	}

	public int getStipendio() {
		return this.stipendio;
	}

	public String getDipartimento() {
		return this.dipartimento;
	}

	public void addStipendioPerc(int a) {
		this.stipendio = (this.stipendio / 100) * (100 + a);
	}

	public String viewInfo() {
		return this.cognome + " (" + this.id + ")\n" + "Guadagno annuo: " + this.stipendio + "\nLivello Prof. : " + this.livelloProfessionale + "\nDipartimento: " + this.dipartimento;
	}
}
