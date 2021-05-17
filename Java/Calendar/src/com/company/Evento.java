package com.company;

public class Evento {
	private String nome;
	private Data inizio;
	private Data fine;

	public Evento(String nome, Data inizio, Data fine) {
		this.nome = nome;
		this.inizio = inizio;
		this.fine = fine;
	}

	public String getNome() {
		return nome;
	}

	public Data getInizio() {
		return inizio;
	}

	@Override
	public String toString() {
		String moreTab = "";
		if (inizio.toString().length() + fine.toString().length() < 20)
			moreTab = "\t";
		return inizio + " - " + fine + ":\t" + moreTab + nome;
	}

}
