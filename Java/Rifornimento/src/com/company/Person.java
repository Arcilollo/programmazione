package com.company;

public class Person {
	private float money;

	public Person(float soldi) {
		this.money = soldi;
	}

	public float getMoney() {
		return money;
	}

	public void paga(float soldi) {
		this.money -= soldi;
	}
}
