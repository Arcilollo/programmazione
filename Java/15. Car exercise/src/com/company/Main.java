package com.company;

import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Car car = new Car (new Engine(10), new Odometer(), new Tank(100));

		int r;
		do {
			if (car.getIsOn() == 0) {
				System.out.println("1. Cambia consumo del motore");
				System.out.println("2. Accendi il motore");
			}
			else {
				System.out.println("3. Fai rifornimento");
				System.out.println("4. Viaggia");
				System.out.println("5. visualizza dati");
				System.out.println("6. Spegni motore");
			}
			System.out.println("0. Esci");
			r = scan.nextInt();

			switch (r) {
				case 1:
					System.out.println("Inserisci il nuovo consumo in Km/L: ");
					car.setKml(scan.nextInt());
					break;
				case 2:
					car.turnOn();
					break;
				case 3:
					System.out.println("Quanti litri vuoi inserire nel serbatoio?");
					car.refuel(scan.nextFloat());
					break;
				case 4:
					System.out.println("Quanti Km vuoi percorrere?");
					car.travel(scan.nextInt());
					break;
				case 5:
					System.out.println(car.toString());
					break;
				case 6:
					car.turnOff();
					break;
			}

		} while (r != 0);
	}
}
