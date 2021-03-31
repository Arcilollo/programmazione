package com.company;

public class Licantropo implements Mostro, Umano {
	private boolean isUomo, isDead;
	protected int vita, danno;

	public Licantropo(boolean luna) {
		isUomo = !luna;
		if (luna) {
			vita = 15;
			danno = 2;
		}
		else {
			vita = 10;
			danno = 3;
		}
	}

	public boolean isUomo() {
		return isUomo;
	}

	public void subisciDanno(int danno) {
		vita -= danno;
		if (vita <= 0)
			isDead = true;
	}

	public String getVita() {
		if (isUomo && !isDead)
			return "Vita rimanente come licantropo uomo: " + vita + "\n";
		else if (!isUomo && !isDead)
			return "Vita rimanente come licantropo mostro: " + vita + "\n";
		else
			return "Il licantropo é morto\n";
	}

	public void azzanna(Eroe e) {
		if (!isUomo) {
			e.subisciDanno(2);
			if (vita <= 0)
				isDead = true;
		}
	}

	public void combatti(Vampiro v) {
		if (isUomo) {
			v.subisciDanno(2);
			if (vita <= 0)
				isDead = true;
		}
	}

	public int getDanno() {
		return danno;
	}
}
