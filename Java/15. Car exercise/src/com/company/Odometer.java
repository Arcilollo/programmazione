package com.company;

public class Odometer {
	private int km;

	public Odometer() {
		this.km = 0;
	}

	public void addKm(int incremento) {
		km += incremento;
	}

	public int getKm() {
		return km;
	}
}