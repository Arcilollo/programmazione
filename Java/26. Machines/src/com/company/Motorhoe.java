package com.company;

public class Motorhoe extends Machine {
	private int wheels;

	public Motorhoe(int orderCode, int serialCode, int wheels) {
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
