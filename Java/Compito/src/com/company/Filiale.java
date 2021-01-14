package com.company;

public class Filiale {
	private String filialeName;
	private Account accounts[];
	private int cont = 0;

	public Filiale(String filialeName, int maxAccounts) {
		this.filialeName = filialeName;
		accounts = new Account[maxAccounts];
	}

	public String addAccount(Account account) {
		String msg;
		if (cont < accounts.length) {
			accounts[cont] = account;
			cont++;
			msg = "CLIENTE REGISTRATO CORRETTAMENTE";
		}
		else {
			msg = "ERRORE NELLA REGISTRAZIONE DEL CLIENTE";
		}

		return msg;
	}

	public String getFilialeName() {
		return filialeName;
	}

	public String toString() {
		String msg = "Lista clienti dentro " + getFilialeName() + "\n";
		for (int i = 0; i < cont; i++) {
			msg += (i+1) + ". " + accounts[i].getId() + "\n";
			msg += "Nome completo: " + accounts[i].getName() + " " + accounts[i].getSurname() + "\n";
			msg += "Saldo attuale: " + accounts[i].getBalance() + "\n\n";
		}

		return msg;
	}
}
