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
		String msg = "Targa: " + plate + "<br>";
		msg += "Giorno di entrata: " + enteredDay + "<br>";
		msg += "<br>";
		return msg;
	}
}
