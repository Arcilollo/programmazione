package com.company;

public class Aereo {
	private String modello;
	private String compagniaAerea;
	private float carburante;
	private int nPasseggeri;
	private boolean statoMotore;

	public Aereo(String modello, String compagniaAerea) {
		this.modello = modello;
		this.compagniaAerea = compagniaAerea;
		this.carburante = 0;
		this.nPasseggeri = 0;
		this.statoMotore = false;
	}

	public void accendi() {
		this.statoMotore = true;
	}

	public void spegni() {
		this.statoMotore = false;
	}

	public void rifornisci(float carburante) {
		this.carburante += carburante;
	}

	public void aggiungiPasseggeri(int passeggeri) {
		this.nPasseggeri += passeggeri;
	}

	public void viaggia(float carburanteConsumato) {
		this.carburante -= carburanteConsumato;
	}

	public String toString() {
		return "Aereo{" +
			"modello='" + modello + '\'' +
			", compagniaAerea='" + compagniaAerea + '\'' +
			", carburante=" + carburante +
			", nPasseggeri=" + nPasseggeri +
			", statoMotore=" + statoMotore +
			'}';
	}
}
