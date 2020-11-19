package com.company;

public class Engine {
	private int isOn;
	private int kml;

	public Engine(int kml) {
		this.isOn = 0;
		this.kml = kml;
	}

	public int getIsOn() {
		return isOn;
	}

	public void setIsOn(int a) {
		this.isOn = a;
	}

	public int getKml() {
		return this.kml;
	}

	public void setKml(int kml) {
		this.kml = kml;
	}
}
