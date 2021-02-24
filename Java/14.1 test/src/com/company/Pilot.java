package com.company;

public class Pilot {
	private String name;
	private String surname;
	private int workYears;
	private int flightDone;

	public Pilot (String name, String surname, int workYears, int flightDone) {
		this.name = name;
		this.surname = surname;
		this.workYears = workYears;
		this.flightDone = flightDone;
	}

	public String toString () {
		String msg;
		msg = "nome pilota: " + this.name + "\n";
		msg += "cognome pilota: " + this.surname + "\n";
		msg += "Anni di lavoro: " + this.workYears + "\n";
		msg += "Voli fatti: " + this.flightDone + "\n";
		return msg;
	}
}
