package com.company;

public class Tank {
	private float l;

	public Tank(float l) {
		this.l = l;
	}

	public float getL() {
		return this.l;
	}

	public void consume(float l) {
		this.l -= l;
	}

	public void refuel(float l) {
		this.l += l;
	}

}
