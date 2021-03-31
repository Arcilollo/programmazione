package com.company;

public class Vampiro implements Mostro {
	protected int vita, danno;
	private boolean isDead;

	public Vampiro() {
		vita = 15;
		danno = 2;
	}

	public void azzanna(Personaggio p) {
		p.subisciDanno(2);
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

	public boolean isDead() {
		return isDead;
	}

	public String getVita() {
		if (!isDead)
			return "Vita rimanente come vampiro: " + vita + "\n";
		else
			return "il vampiro é morto\n";
	}
}
