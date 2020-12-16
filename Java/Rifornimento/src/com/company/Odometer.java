package com.company;

public class Odometer {
	private float km;

	public Odometer() {
		this.km = 0;
	}

	public void addKm(float incremento) {
		km += incremento;
	}

	public float getKm() {
		return km;
	}
}
