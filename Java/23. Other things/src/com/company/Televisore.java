package com.company;

public class Televisore {
	private String modello;
	private int grandezza;
	private int volume;
	private int canale;
	private boolean statoTelevisore;

	public Televisore(String modello, int grandezza) {
		this.modello = modello;
		this.grandezza = grandezza;
		this.volume = 0;
		this.canale = 0;
	}

	public void accendi() {
		this.statoTelevisore = true;
	}

	public void spegni() {
		this.statoTelevisore = false;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void setCanale(int canale) {
		this.canale = canale;
	}

	@Override
	public String toString() {
		return "Televisore{" +
			"modello='" + modello + '\'' +
			", grandezza=" + grandezza +
			", volume=" + volume +
			", canale=" + canale +
			", statoTelevisore=" + statoTelevisore +
			'}';
	}
}
