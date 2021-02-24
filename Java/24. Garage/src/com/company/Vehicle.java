package com.company;

public class Vehicle {
	protected String plate;
	protected int enteredDay;

	public Vehicle (String plate, int enteredDay) {
		this.plate = plate;
		this.enteredDay = enteredDay;
	}

	public String getPlate() {
		return plate;
	}

	public int getEnteredDay() {
		return enteredDay;
	}

	public String toString() {
		String msg = "Targa: " + plate + "\n";
		msg += "Giorno di entrata: " + enteredDay + "\n";
		msg += "\n";
		return msg;
	}
}
