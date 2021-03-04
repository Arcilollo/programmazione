package com.company;

public class Repairshop {
	private Machine places[];
	private ReparationList reparationList[];
	private int cPlaces = 0;
	private int cRepair = 0;

	public Repairshop(int maxPlaces) {
		places = new Machine[maxPlaces];
		reparationList = new ReparationList[50];
	}

	public void addMachine(Machine machine) {
		if (cPlaces < places.length) {
			places[cPlaces] = machine;
			cPlaces++;
		}
	}

	public void repairMachine(int serialCode, float cost) {
		for (int i = 0; i < cPlaces; i++) {
			if (places[i].getSerialCode() == serialCode) {
				reparationList[cRepair] = new ReparationList();
				reparationList[cRepair].machine = places[i];
				reparationList[cRepair].cost = cost;
				cRepair++;

				for (int j = i; j < cPlaces; j++) {
					places[i] = places[j];
				}
				cPlaces--;
			}
		}
	}

	public String toString() {
		String msg = "";

		msg += "Lista macchinari in officina: \n";
		for (int i = 0; i < cPlaces; i++) {
			msg += places[i].toString();
		}

		msg += "Lista macchinari riparati: \n";
		for (int i = 0; i < cRepair; i++) {
			msg += reparationList[i].machine.toString();
			msg += "costo riparazione: " + reparationList[i].cost + "\n";
		}

		return msg;
	}

}
