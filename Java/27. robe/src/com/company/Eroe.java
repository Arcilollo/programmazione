package com.company;

public class Eroe implements Umano{
	protected int forza;
	private boolean isDead;

	public Eroe() {
		forza= 10;
	}

	public void combatti() {
		forza=forza-3;
		if (forza <= 0)
			isDead = true;
	}

	public String getForza () {
		return "Forza rimanente come eroe: " + forza + "\n";
	}
}
