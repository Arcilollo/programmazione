package com.company;

public class Car {
	private Engine engine;
	private Odometer odometer;
	private Tank tank;

	public Car(Engine engine, Odometer odometer, Tank tank) {
		this.engine = engine;
		this.odometer = odometer;
		this.tank = tank;
	}

	public void turnOn() {
		engine.setIsOn(1);
	}

	public int getIsOn() {
		return engine.getIsOn();
	}

	public void turnOff() {
		engine.setIsOn(0);
	}

	public void refuel(float l) {
		tank.refuel(l);
	}

	public void setKml(int kml) {
		engine.setKml(kml);
	}

	public String toString() {
		String msg = "Litri: " + tank.getL() + "\n";
		msg += "Km percosi: " + odometer.getKm() + "\n";
		return msg;
	}

	public void travel(int km) {
		odometer.addKm(km);
		tank.consume(km / engine.getKml());
	}

	public int getKm() {
		return odometer.getKm();
	}

}
