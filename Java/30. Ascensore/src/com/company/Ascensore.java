package com.company;

public class Ascensore {
	private int piano;
	private final int maxPiani;
	private Persona[] persone;
	private int personeCont = 0;

	public Ascensore (int maxPiani, int maxPersone) {
		this.piano = 0;
		this.maxPiani = maxPiani;
		this.persone = new Persona[maxPersone];
	}

	public String inserisciPersona(Persona persona) {
		if (personeCont < persone.length) {
			persone[personeCont] = persona;
			personeCont++;
			return "Persona aggiunta correttamente";
		}

		return "L'ascensore é pieno";
	}

	public int faiUscirePersone() {
		int uscite = 0;
		for (int i = 0; i < personeCont; i++) {
			if (persone[i].getPiano() == piano) {
				for (int j = i; j < personeCont; j++) {
					persone[i] = persone[j];
				}
				personeCont--;
				uscite++;
			}
		}
		return uscite;
	}


	public String vaiAlPiano(int piano) {
		if (piano > maxPiani)
			return "Il piano non esiste";
		else if (piano == this.piano)
			return "Stai giá a questo piano";

		this.piano = piano;

		int nUscite = faiUscirePersone();

		return "Sono uscite " + nUscite + " persone";
	}

	public String elencoPersone() {
		String buffer = "Persone nell'ascensore:";
		for (int i = 0; i < personeCont; i++) {
			buffer += "\n" + persone[i];
		}
		return buffer;
	}

	public String toString() {
		return "L'ascensore sta al piano " + piano + "/" + maxPiani;
	}
}
