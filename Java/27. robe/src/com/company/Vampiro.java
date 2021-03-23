package com.company;

public class Vampiro implements Mostro{
	protected int forza;
	private boolean isDead;

	public Vampiro() {
		forza=15;
	}

	public void azzanna() {
		forza =forza-2;
		if (forza <= 0)
			isDead = true;
	}

	public String getForza() {
		return "Forza rimanente come vampiro: " + forza + "\n";
	}
}
