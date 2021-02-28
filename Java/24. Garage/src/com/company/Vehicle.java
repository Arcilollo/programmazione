package com.company;

public class Vehicle {
	protected String plate;
	protected Data enteredDay;

	public Vehicle (String plate, Data enteredDay) {
		this.plate = plate;
		this.enteredDay = enteredDay;
	}

	public String getPlate() {
		return plate;
	}

	public Data getEnteredDay() {
		return enteredDay;
	}

	public String toString() {
		String msg = "Targa: " + plate + "\n";
		msg += "Giorno di entrata: " + enteredDay + "\n";
		msg += "\n";
		return msg;
	}
}
