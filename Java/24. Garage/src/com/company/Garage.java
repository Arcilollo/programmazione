package com.company;

public class Garage {
	private Car cars[];
	private Motorbike motorbikes[];
	private int contCars = 0;
	private int contMotorbike = 0;
	private int priceCars;
	private int priceMotorbike;
	private float maxHeight;

	public Garage (int nCars, int nMotorbikes, int priceCars, int priceMotorbike, float maxHeight) {
		this.cars = new Car[nCars];
		this.motorbikes = new Motorbike[nMotorbikes];
		this.priceCars = priceCars;
		this.priceMotorbike = priceMotorbike;
		this.maxHeight = maxHeight;
	}

	public String addVeichle(Car car) {
		if (car.getHeight() >= maxHeight)
			return "L'auto é troppo alta";

		if (contCars < cars.length) {
			cars[contCars] = car;
			contCars++;
			return "Auto inserita";
		}
		else
			return "Non c'é abbastanza spazio";

	}

	public String addVeichle(Motorbike moto) {
		if (contMotorbike < motorbikes.length) {
			motorbikes[contMotorbike] = moto;
			contMotorbike++;
			return "Moto inserita";
		}
		else
			return "Non c'é abbastanza spazio";
	}

	public String removeVehicle(String plate, Data today) {
		for (int i = 0; i < contCars; i++) {
			if (cars[i].getPlate().equals(plate)) {
				int payed = (today.getDifference(cars[i].getEnteredDay()) + 1) * priceCars;

				for (int j = i; j < contCars; j++) {
					cars[i] = cars[j];
				}
				contCars--;

				return "Il proprietario dell'auto ha pagato " + payed + " euro\n";
			}
		}

		for (int i = 0; i < contMotorbike; i++) {
			if (motorbikes[i].getPlate().equals(plate)) {
				int payed = (today.getDifference(motorbikes[i].getEnteredDay()) + 1) * priceMotorbike;

				for (int j = i; j < contMotorbike; j++) {
					motorbikes[i] = motorbikes[j];
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
			msg += cars[i].toString();
		}

		msg += "lista Moto:\n";
		for (int i = 0; i < contMotorbike; i++) {
			msg += motorbikes[i].toString();
		}

		return msg;
	}
}
