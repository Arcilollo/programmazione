package com.company;

public class Prodotto {
	protected int id;
	protected String descrizione;
	protected float prezzo;

	public Prodotto(String descrizione, int id, float prezzo) {
		this.id = id;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}

	public float getPrezzo() {
		return this.prezzo;
	}

	public void applicaSconto() {
		this.prezzo = (this.prezzo / 100) * (100 - 5);
	}

	public String toString() {
		String msg = "Id: " + id + "\n";
		msg += "Descrizione: " + descrizione + "\n";
		msg += "Prezzo: " + prezzo + "\n";
		return msg;
	}
}
