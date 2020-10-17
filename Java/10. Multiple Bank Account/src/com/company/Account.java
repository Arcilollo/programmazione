package com.company;

public class Account {
	private int account_number;
	private String man;
	private int money;

	public Account (int a, String b, int c) {
		this.account_number = a;
		this.man = b;
		this.money = c;
	}

	public int getMoney() {
		return this.money;
	}

	public int getAccount_number() {
		return account_number;
	}

	public void addMoney(int a) {
		this.money += a;
	}

	public void removeMoney(int a) {
		this.money -= a;
	}
}
