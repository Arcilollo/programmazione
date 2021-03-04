package com.company;

public class Non_Alimentare extends Prodotto {
	private String materiale;

	public Non_Alimentare(String descrizione, int id, float prezzo, String materiale) {
		super(descrizione, id, prezzo);
		this.materiale = materiale;
	}

	public void applicaSconto() {
		if (materiale.equals("Carta") || materiale.equals("Vetro") || materiale.equals("Plastica"))
			prezzo = (prezzo / 100) * (100 - 10);
	}

	public String toString() {
		String msg = super.toString();
		msg += "Materiale: " + materiale + "\n";
		return msg;
	}
}
