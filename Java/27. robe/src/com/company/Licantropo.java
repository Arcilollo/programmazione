package com.company;

public class Licantropo implements Mostro, Umano{
	private boolean isUomo, isDead;
	protected int vitaUmano, vitaMostro;

	public Licantropo(boolean luna) {
		isUomo = !luna;
		if (luna) {
			vitaMostro = 15;
			vitaUmano = 0;
		}
		else {
			vitaUmano = 10;
			vitaMostro = 0;
		}
	}

	public boolean isUomo() {
		return isUomo;
	}

	public void subisciDanno(int danno) {
		if (isUomo) {
			vitaUmano -= danno;
			if (vitaUmano <= 0)
				isDead = true;
		}
		else {
			vitaMostro -= danno;
			if (vitaMostro <= 0)
				isDead = true;
		}
	}

	public String getVita() {
		if (isUomo && !isDead)
			return "Vita rimanente come umano: " + vitaUmano + "\n";
		else if (!isUomo && !isDead)
			return "Vita rimanente come mostro: " + vitaMostro + "\n";
		else
			return "Il licantropo é morto";
	}

	public void azzanna(Eroe e) {
		e.subisciDanno(2);
		if (!isUomo) {
			if (vitaMostro <= 0)
				isDead = true;
		}
	}

	public void combatti(Vampiro v) {
		v.subisciDanno(2);
		if (isUomo) {
			if (vitaUmano <= 0)
				isDead = true;
		}
	}

}
