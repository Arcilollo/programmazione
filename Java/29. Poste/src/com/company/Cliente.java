package com.company;

public class Cliente {

	private final String nome;
	private final String cognome;
	private final int saldo;

	public Cliente(String nome, String cognome, int saldo) {
		this.nome = nome;
		this.cognome = cognome;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	@Override
	public String toString() {
		return nome + " " + cognome + " " + saldo;
	}
}
