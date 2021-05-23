package com.company;

public class Car extends Vehicle {
	private float height;

	public Car(String plate, float height, Data enteredDay) {
		super(plate, enteredDay);
		this.height = height;
	}

	public float getHeight() {
		return height;
	}
}
