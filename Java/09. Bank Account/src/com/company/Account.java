package com.company;

public class Account {
	private int accountNumber;
	private String man;
	private int money;

	public Account (int a, String b, int c) {
		accountNumber = a;
		man = b;
		money = c;
	}

	public int getMoney() {
		return money;
	}

	public void addMoney(int n) {
		this.money += n;
	}

	public void removeMoney(int n) {
		this.money -= n;
	}
}
