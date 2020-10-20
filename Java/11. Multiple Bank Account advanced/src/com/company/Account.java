package com.company;

public class Account {
	private int account_number;
	private String man;
	private int money;
	private int isPayed;
	private int month;
	private int interestsPercent;

	public Account (int a, String b, int c) {
		this.account_number = a;
		this.man = b;
		this.money = c;
		this.isPayed = 0;
		this.month = 1;
		this.interestsPercent = 3;
	}

	public int getMoney() {
		return this.money;
	}

	public int getMonth() {
		return this.month;
	}

	public int getIsPayed() {
		return isPayed;
	}

	public void addMoney(int a) {
		this.money += a;
	}

	public void removeMoney(int a) {
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

	private void interests(int a)
		this.money = this.money + (this.money / 100 * a);
	}

	public String nextMonth() {
		String msg = " ";
		if (this.month == 12) {
			this.month = 1;
			if (this.isPayed == 0) {
				this.removeMoney(60);
				msg = "Le spese di gestione sono state pagate automaticamente.\n";
			}
			else
				this.isPayed = 0;

		}
		else
			this.month++;

		this.interests(this.interestsPercent);
		msg += "Hai ricevuto " + (this.money / 100 * this.interestsPercent) + " euro di interessi.";

		return msg;

	}

}
