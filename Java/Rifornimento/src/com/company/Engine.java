package com.company;

public class Engine {
	private boolean isOn;
	private float consumption;

	public Engine(float consumption) {
		this.isOn = true;
		this.consumption = consumption;
	}

	public void setOn(boolean on) {
		this.isOn = on;
	}

	public boolean getOn() {
		return isOn;
	}

	public float getConsumption() {
		return consumption;
	}
}
