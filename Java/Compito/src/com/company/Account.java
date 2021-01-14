package com.company;

public class Account {
	private String name;
	private String surname;
	private int id;
	private float balance;

	public Account(String name, String surname, int id, float balance) {
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getId() {
		return id;
	}

	public float getBalance() {
		return balance;
	}

	public String deposit(float balance) {
		String msg = "Hai depositato " + balance + " euro\n";
		this.balance += balance;
		return msg;
	}

	public String pick(float balance) {
		String msg;
		if (this.balance < balance) {
			this.balance -= balance;
			msg = "Non hai abbastanza soldi per prelevare\n";
		}
		else {
			msg = "Hai depositato " + balance + " euro\n";
		}

		return msg;
	}

}
