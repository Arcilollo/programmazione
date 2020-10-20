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

		int r;
		do {
			System.out.println("1. Deposita");
			System.out.println("2. Preleva");
			System.out.println("3, Visualizza saldo");
			System.out.println("0. Esci");
			r = scan.nextInt();

			switch (r) {
				case 1:
					account.addMoney(scan.nextInt());
					break;
				case 2:
					account.removeMoney(scan.nextInt());
					break;
				case 3:
					System.out.println("Il tuo saldo è: " + account.getMoney());
					break;
			}
		} while (r != 0);

	}

}
