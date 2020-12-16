package com.company;

public class Tank {
	private float litri;

	public Tank(float litri) {
		this.litri = litri;
	}

	public void addLitri(float litri) {
		this.litri += litri;
	}

	public float getLitri() {
		return litri;
	}

}
