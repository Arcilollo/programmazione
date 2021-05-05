package com.company;

public class Persona {
	private final String nome;
	private final String cognome;
	private final int piano;

	public Persona (String nome, String cognome, int piano) {
		this.nome = nome;
		this.cognome = cognome;
		this.piano = piano;
	}

	public int getPiano() {
		return piano;
	}

	public String toString() {
		return nome + " " + cognome + ", " + piano;
	}
}
