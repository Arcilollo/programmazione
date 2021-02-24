package com.company;

public class Ticket {
	private String location;
	private int date;
	private Airplane airplane;

	public Ticket (String a, int b, Airplane c) {
		this.location = a;
		this.date = b;
		this.airplane = c;
	}

	public Ticket (String a, int b) {
		this.location = a;
		this.date = b;
		this.airplane = null;
	}

	public String toString() {
		String msg = "Località biglietto: " + this.location + "\n";
		msg += "Data: " + this.date + "\n";
		if (this.airplane != null)
			msg += airplane.toString();
		return msg;
	}

	public String getLocation() {
		return location;
	}

	public int getDate() {
		return date;
	}

	public Airplane getAirplane() {
		return airplane;
	}

	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}
}
