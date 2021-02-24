package com.company;

public class Airplane {
	private String model;
	private int id;
	private String airline;
	private Pilot pilot;

	public Airplane (String a, int b, String c, Pilot d) {
		this.model = a;
		this.id = b;
		this.airline = c;
		this.pilot = d;
	}

	public Airplane (String a, int b) {
		this.model = a;
		this.id = b;
		this.airline = null;
		this.pilot = null;
	}

	public int getId() {
		return id;
	}

	public String getModel() {
		return model;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String toString() {
		String msg = "ID aereo: " + this.id + "\n";
		msg += "Modello aereo: " + this.model + "\n";
		if (this.airline != null)
			msg += "Compagnia aerea: " + this.airline + "\n";
		if (this.pilot != null)
			msg += pilot.toString();
		return msg;
	}

}
