package com.company;

import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Inserisci la capacitá di auto: ");
		int maxCar = scan.nextInt();
		System.out.print("Inserisci la capacitá di motocicli: ");
		int maxBike = scan.nextInt();
		System.out.print("Inserisci il prezzo per le auto: ");
		int priceCar = scan.nextInt();
		System.out.print("Inserisci il prezzo per i motocicli: ");
		int priceBike = scan.nextInt();
		System.out.print("Inserisci l'altezza massima del veicolo: ");
		float maxHeight = scan.nextFloat();

		Garage g1 = new Garage(maxCar, maxBike, priceCar, priceBike, maxHeight);

		System.out.print("Inserisci giorno: ");
		int day = scan.nextInt();
		System.out.print("Inserisci mese: ");
		int month = scan.nextInt();
		System.out.print("Inserisci anno: ");
		int year = scan.nextInt();

		Data today = new Data(day, month, year);

		System.out.println(today.getDay());
		System.out.println(today.getMonth());
		System.out.println(today.getYear());

		int r;
		do {
			System.out.println("Oggi é il giorno " + today.toString() + ". Cosa vuoi fare?");
			System.out.println("1. Aggiungi un veicolo");
			System.out.println("2. Rimuovi un veicolo");
			System.out.println("3. Visualizza lista veicoli");
			System.out.println("4. Vai avanti di un giorno");
			System.out.println("0. Esci");
			r = scan.nextInt();

			switch (r) {
				case 1:
					System.out.println("1. Aggiungi un'auto");
					System.out.println("2. Aggiungi una moto");
					int r1 = scan.nextInt();

					System.out.print("Inserisci la targa: ");
					String plate = scan.next();

					switch (r1) {
						case 1:
							System.out.print("Inserisci l'altezza dell'auto: ");
							float height1 = scan.nextFloat();
							System.out.println(g1.addVeichle(new Car(plate, height1, new Data(today.getDay(), today.getMonth(), today.getYear()))));
							break;
						case 2:
							System.out.println(g1.addVeichle(new Motorbike(plate, new Data(today.getDay(), today.getMonth(), today.getYear()))));
							break;
					}

					break;
				case 2:
					System.out.print("Inserisci la targa del veicolo da rimuovere: ");
					String plate1 = scan.next();

					System.out.println(g1.removeVehicle(plate1, today));
					break;
				case 3:
					System.out.println(g1.toString());
					break;
				case 4:
					today.nextDay();
					break;
			}
		} while (r != 0);
	}
}
