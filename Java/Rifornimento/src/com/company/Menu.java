package com.company;

import java.util.Scanner;

public class Menu {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Engine mt = new Engine(10);
		Tank st = new Tank(50);
		Person person = new Person(170);
		Odometer odometer = new Odometer();
		Car car = new Car(mt, st, odometer, person);

		Tank st_d = new Tank(1000);
		GasStation distributore = new GasStation(st_d, 1);

		int r;
		do {
			System.out.println(car.toString());
			System.out.println(distributore.toString());
			if (car.getIsOn()) {
				System.out.println("1. Spegni il motore per fare rifornimento");
				System.out.println("4. Viaggia fino al prossimo benzinaio");
			}
			if (!car.getIsOn()) {
				System.out.println("2. Rifornisci");
				System.out.println("3. Accendi motore");
			}
			System.out.println("0. Esci");
			r = scan.nextInt();

			switch(r) {
				case 1:
					car.turnOff();
					break;
				case 2:
					int input;
					System.out.print("Quanti litri vuoi rifornire: ");
					input = scan.nextInt();
					if (input/distributore.getCostL() <= car.getMoney()) {
						car.refuel(input);
						distributore.rifornisciVeicolo(input);
						car.pay(input / distributore.getCostL());
					}
					else
						System.out.println("Non hai abbastanza soldi per fare rifornimento");

					break;
				case 3:
					car.turnOn();
					break;
				case 4:
					float inputf;
					System.out.print("Inserisci quanti KM è distante il prossimo benzinaio: ");
					inputf = scan.nextFloat();
					if (inputf / car.getConsumption() <= car.getLitri()) {
						car.travel(inputf);
						distributore = new GasStation(st_d, 1);
					}
					else {
						System.out.println("La benzina non basta");
					}
					break;
			}


		} while (r != 0);
	}
}
