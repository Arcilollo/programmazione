package com.company;

public class Account {
	private int account_number;
	private String man;
	private float money;
	private int isPayed;
	private int month;

	public Account (int a, String b, float c) {
		this.account_number = a;
		this.man = b;
		this.money = c;
		this.isPayed = 0;
		this.month = 1;
	}

	public String getMan() {
		return man;
	}

	public int getAccount_number() {
		return account_number;
	}

	public float getMoney() {
		return this.money;
	}

	public int getMonth() {
		return this.month;
	}

	public int getIsPayed() {
		return isPayed;
	}

	public void addMoney(float a) {
		this.money += a;
	}

	public void removeMoney(float a) {
		this.money -= a;
	}

	public String payAnnualCosts(int a) {
		String pay_msg;
		if ((this.getMoney() > a) && (this.isPayed == 0)) {
			this.removeMoney(a);
			this.isPayed = 1;
			pay_msg = "Hai pagato " + a + " euro per la gestione annua del tuo conto.";
		}
		else
			pay_msg = "Non hai abbastanza soldi per pagare i costi di gestione annua del tuo conto";


		return pay_msg;
	}

	private void interests(int a) {
		this.money = this.money + (this.money / 100 * a);
	}

	public String nextMonth(int annual_pay, int interestsPerc) {
		String msg = " ";
		if (this.month == 12) {
			this.month = 1;
			if (this.isPayed == 0) {
				this.removeMoney(annual_pay);
				msg = "Le spese di gestione sono state pagate automaticamente.\n";
			}
			else
				this.isPayed = 0;

		}
		else
			this.month++;

		this.interests(interestsPerc);
		msg += "Hai ricevuto " + (this.money / 100 * interestsPerc) + " euro di interessi.";

		return msg;

	}

}
