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

		Account account1 = new Account(account_number, man, money);

		System.out.print("Inserisci il numero del conto: ");
		account_number = scan.nextInt();
		System.out.print("Inserisci il proprietario del conto: ");
		man = scan.next();
		System.out.print("Inserisci il saldo del conto: ");
		money = scan.nextInt();

		Account account2 = new Account(account_number, man, money);

		int r1;
		do {
			System.out.println("1. " + account1.getAccount_number());
			System.out.println("2. " + account2.getAccount_number());
			System.out.println("0. Esci");
			r1 = scan.nextInt();

			switch (r1) {
				case 1:
					int r2;
					do {
						System.out.println("1. Deposita");
						System.out.println("2. Preleva");
						System.out.println("3, Visualizza saldo");
						System.out.println("0. Esci");
						r2 = scan.nextInt();

						switch (r2) {
							case 1:
								account1.addMoney(scan.nextInt());
								break;
							case 2:
								account1.removeMoney(scan.nextInt());
								break;
							case 3:
								System.out.println("Il tuo saldo è: " + account1.getMoney());
								break;
						}
					} while (r2 != 0);
					break;
				case 2:
					int r3;
					do {
						System.out.println("1. Deposita");
						System.out.println("2. Preleva");
						System.out.println("3, Visualizza saldo");
						System.out.println("0. Esci");
						r3 = scan.nextInt();

						switch (r3) {
							case 1:
								account2.addMoney(scan.nextInt());
								break;
							case 2:
								account2.removeMoney(scan.nextInt());
								break;
							case 3:
								System.out.println("Il tuo saldo è: " + account2.getMoney());
								break;
						}
					} while (r3 != 0);
					break;
			}

		} while (r1 != 0);

	}

}
