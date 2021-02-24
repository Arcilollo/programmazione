package com.company;

public class Treno {
	private String modello;
	private String compagniaFerroviaria;
	private int nPasseggeri;

	public Treno(String modello, String compagniaFerroviaria) {
		this.modello = modello;
		this.compagniaFerroviaria = compagniaFerroviaria;
		this.nPasseggeri = 0;
	}

	public void aggiungiPasseggeri(int passeggeri) {
		this.nPasseggeri += passeggeri;
	}

	public String toString() {
		return "Treno{" +
			"modello='" + modello + '\'' +
			", compagniaAerea='" + compagniaFerroviaria + '\'' +
			", nPasseggeri=" + nPasseggeri +
			'}';
	}

}
