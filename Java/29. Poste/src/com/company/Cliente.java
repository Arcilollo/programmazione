package com.company;

public class Cliente {

	private final String nome;
	private final String cognome;

	public Cliente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	@Override
	public String toString() {
		return nome + " " + cognome;
	}
}
