package com.company;

import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int money, account_number;
		String man;

		System.out.print("Inserisci il numero del conto: ");
		account_number = scan.nextInt();
		System.out.print("Inserisci il proprietario del conto: ");
		man = scan.next();
		System.out.print("Inserisci il saldo del conto: ");
		money = scan.nextInt();

		Account account = new Account(account_number, man, money);

		int r, input;
		String [] monthName = { "Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre" };
		do {
			System.out.println("il mese di oggi è: " + monthName [account.getMonth() - 1]);
			System.out.println("1. Deposita");
			System.out.println("2. Preleva");
			System.out.println("3. Visualizza saldo");
			System.out.println("4. Prossimo mese");
			if ((account.getIsPayed() == 0) && (account.getMonth() >= 11))
				System.out.println("5. Paga i costi di gestione annuo");
			System.out.println("0. Esci");
			r = scan.nextInt();

			switch (r) {
				case 1:
					input = scan.nextInt();
					account.addMoney(input);
					break;
				case 2:
					input = scan.nextInt();
					account.removeMoney(input);
					break;
				case 3:
					System.out.println("Il tuo saldo è: " + account.getMoney());
					break;
				case 4:
					System.out.println(account.nextMonth());
					break;
				case 5:
					input = 60;
					System.out.println(account.payAnnualCosts(input));
					break;
			}
		} while (r != 0);

	}

}
