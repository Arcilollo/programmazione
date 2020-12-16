package com.company;

public class Car {
	private Engine engine;
	private Tank tank;
	private Odometer odometer;
	private Person person;

	public Car(Engine motore, Tank serbatoio, Odometer odometer, Person persona) {
		this.engine = motore;
		this.tank = serbatoio;
		this.odometer = odometer;
		this.person = persona;
	}

	public void turnOn() {
		engine.setOn(true);
	}

	public void turnOff() {
		engine.setOn(false);
	}

	public boolean getIsOn() {
		return engine.getOn();
	}

	public void refuel(int litri) {
		this.tank.addLitri(litri);
	}

	public float getMoney() {
		return this.person.getMoney();
	}

	public void pay(float soldi) {
		this.person.paga(soldi);
	}

	public float getLitri() {
		return tank.getLitri();
	}

	public float getConsumption() {
		return engine.getConsumption();
	}

	public void travel(float km) {
		odometer.addKm(km);
		tank.addLitri(-1 * (km / engine.getConsumption()));
	}

	public String toString() {
		String msg = "Litri di benzina: " + tank.getLitri() + "\n";
		msg += "KM percorsi: " + odometer.getKm() + "\n";
		msg += "soldi: " + person.getMoney() + "\n";
		return msg;
	}

}
