package com.company;

public class Licantropo implements Mostro, Umano{
	private boolean isUomo, isDead;
	protected int forzaUmano, forzaMostro;

	public Licantropo(boolean luna)
	{
		isUomo = !luna;
		if (luna) {
			forzaMostro = 15;
			forzaUmano = 0;
		}
		else {
			forzaUmano = 10;
			forzaMostro = 0;
		}
	}

	public String getForza () {
		return "Forza rimanente come umano: " + forzaUmano + "\nForza rimanente come mostro: " + forzaMostro;
	}

	public void azzanna() {
		if (!isUomo) {
			forzaMostro = forzaMostro - 2;
			if (forzaMostro <= 0)
				isDead = true;
		}
	}

	public void combatti () {
		if (isUomo) {
			forzaUmano = forzaUmano - 3;
			if (forzaUmano <= 0)
				isDead = true;
		}
	}

}
