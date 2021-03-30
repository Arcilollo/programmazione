package com.company;

public class Vampiro implements Mostro{
	protected int vita;
	private boolean isDead;

	public Vampiro() {
		vita = 15;
	}

	public void azzanna(Eroe e) {
		e.subisciDanno(2);
		if (vita <= 0)
			isDead = true;
	}

	public void subisciDanno(int danno) {
		vita -= danno;
		if (vita <= 0)
			isDead = true;
	}

	public String getVita() {
		if (!isDead)
			return "Vita rimanente come vampiro: " + vita + "\n";
		else
			return "il vampiro é morto\n";
	}
}
