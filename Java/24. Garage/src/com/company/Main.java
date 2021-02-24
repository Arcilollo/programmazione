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

		Garage g1 = new Garage(maxCar, maxBike, priceCar, priceBike);

		int today = 1;

		int r;
		do {
			System.out.println("Oggi é il giorno " + today + ". Cosa vuoi fare?");
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
							System.out.println(g1.addVeichle(new Car(plate, today)));
							break;
						case 2:
							System.out.println(g1.addVeichle(new Motorbike(plate, today)));
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
					today++;
					break;
			}
		} while (r != 0);
	}
}
