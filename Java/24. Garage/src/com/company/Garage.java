package com.company;

public class Garage {
	private Car carsList[];
	private Motorbike motorbikesList[];
	private int contCars = 0;
	private int contMotorbike = 0;
	private int priceCars;
	private int priceMotorbike;
	private float maxHeight;

	public Garage (int nCars, int nMotorbikes, int priceCars, int priceMotorbike, float maxHeight) {
		this.carsList = new Car[nCars];
		this.motorbikesList = new Motorbike[nMotorbikes];
		this.priceCars = priceCars;
		this.priceMotorbike = priceMotorbike;
		this.maxHeight = maxHeight;
	}

	public String addVeichle(Car car) {
		if (car.getHeight() >= maxHeight)
			return "L'auto é troppo alta";

		if (contCars < carsList.length) {
			carsList[contCars] = car;
			contCars++;
			return "L'auto é entrata nel parcheggio";
		}
		else
			return "Non c'é abbastanza spazio per poter far entrare l'auto";

	}

	public String addVeichle(Motorbike moto) {
		if (contMotorbike < motorbikesList.length) {
			motorbikesList[contMotorbike] = moto;
			contMotorbike++;
			return "La moto é entrata nel parcheggio";
		}
		else
			return "Non c'é abbastanza spazio per poter far entrare la moto";
	}

	public String removeVehicle(String plate, Data today) {
		for (int i = 0; i < contCars; i++) {
			if (carsList[i].getPlate().equals(plate)) {
				int payed = (today.getDifference(carsList[i].getEnteredDay()) + 1) * priceCars;

				for (int j = i; j < contCars; j++) {
					carsList[i] = carsList[j];
				}
				contCars--;

				return "Il proprietario dell'auto ha pagato " + payed + " euro\n";
			}
		}

		for (int i = 0; i < contMotorbike; i++) {
			if (motorbikesList[i].getPlate().equals(plate)) {
				int payed = (today.getDifference(motorbikesList[i].getEnteredDay()) + 1) * priceMotorbike;

				for (int j = i; j < contMotorbike; j++) {
					motorbikesList[i] = motorbikesList[j];
				}
				contMotorbike--;

				return "Il proprietario del motociclo ha pagato " + payed + " euro\n";
			}
		}

		return "Non esiste nessun veicolo con questa targa";
	}

	public String toString() {
		String msg = "lista Automobili:\n";
		for (int i = 0; i < contCars; i++) {
			msg += carsList[i].toString();
		}

		msg += "lista Moto:\n";
		for (int i = 0; i < contMotorbike; i++) {
			msg += motorbikesList[i].toString();
		}

		return msg;
	}
}
