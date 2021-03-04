package com.company;

public class Alimentare extends Prodotto {
	private Data scadenza;

	public Alimentare(String descrizione, int id, float prezzo, Data scadenza) {
		super(descrizione, id, prezzo);
		this.scadenza = scadenza;
	}

	public void applicaSconto(Data oggi) {
		if (this.scadenza.getDifference(oggi) < 10)
			this.prezzo = (this.prezzo/100) * (100 - 10);
	}

	public String toString() {
		String msg = super.toString();
		msg += "Scadenza: " + scadenza.toString() + "\n";
		return msg;
	}

}
