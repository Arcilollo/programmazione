package com.company;

import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Filiale f1 = new Filiale("Banca del seme", 2);

		int r;
		do {
			System.out.println("1. Accedi ad un conto corrente");
			System.out.println("2. Registra un conto corrente");
			System.out.println("3. Visualizza lista dei conti correnti");
			System.out.println("0. Esci");
			r = scan.nextInt();

			switch (r) {
				case 1:
					break;
				case 2:
					System.out.print("Inserisci il nome: ");
					String name = scan.next();
					System.out.print("Inserisci il cognome: ");
					String surname = scan.next();
					System.out.print("Inserisci l'ID del conto: ");
					int id = scan.nextInt();
					System.out.println(f1.addAccount(new Account(name,surname,id,0)));
					break;
				case 3:
					System.out.println(f1.toString());
					break;
			}
		} while(r != 0);

	}
}
