package com.company;

public class Lawnmower extends Machine {
	private int wheels;

	public Lawnmower(int orderCode, int serialCode, int wheels) {
		super(orderCode, serialCode);
		this.wheels = wheels;
	}

	public int getWheels() {
		return wheels;
	}

	public String toString() {
		String msg = "";
		msg += "Numero ordinazione: " + orderCode + "\n";
		msg += "Codice seriale: " + serialCode + "\n";
		msg += "Ruote: " + wheels + "\n";
		return msg;
	}
}
