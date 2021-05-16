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
		return inizio + "\t- " + fine + "\t- " + nome;
	}

}
