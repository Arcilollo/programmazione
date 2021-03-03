package com.company;

public class Account {
	int accountCode;
	float money;

	public Account (int accountCode) {
		this.accountCode = accountCode;
		money = 0;
	}

	public int getAccountCode() {
		return accountCode;
	}

	public float getMoney() {
		return money;
	}

	public void addMoney(float money) {
		this.money += money;
	}

	public void removeMoney(float money) {
		this.money -= money;
	}
}
