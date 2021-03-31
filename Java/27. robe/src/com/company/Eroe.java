package com.company;

public class Eroe implements Umano {
	protected int vita, danno;
	private boolean isDead;

	public Eroe() {
		vita = 10;
		danno = 3;
	}

	public void combatti(Vampiro v) {
		v.subisciDanno(3);
		if (vita <= 0)
			isDead = true;
	}

	public void subisciDanno(int danno) {
		vita -= danno;
		if (vita <= 0)
			isDead = true;
	}

	public int getDanno() {
		return danno;
	}

	public String getVita() {
		if (!isDead)
			return "vita rimanente come eroe: " + vita + "\n";
		else
			return "l'eroe é morto\n";
	}
}
