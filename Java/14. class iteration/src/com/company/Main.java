package com.company;

import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String location, model, airline;
		int date, id;

		System.out.print("Inserisci la località del biglietto: ");
		location = scan.next();
		System.out.print("Inserisci la data del biglietto: ");
		date = scan.nextInt();
		System.out.print("Inserisci il modello dell'aereo: ");
		model = scan.next();
		System.out.print("Inserisci l'ID dell'aereo: ");
		id = scan.nextInt();
		System.out.print("Inserisci la compagnia aerea: ");
		airline = scan.next();

		Airplane air1 = new Airplane (model, id, airline);
		Ticket tick1 = new Ticket(location, date);
		tick1.setAirplane(air1);

		Ticket tick2 = new Ticket("Parigi", 2020, air1);
		Ticket tick2Copy = new Ticket(tick2.getLocation(), tick2.getDate(), tick2.getAirplane());

		System.out.println(tick1.toString());
		System.out.println(tick2.toString());

		tick2Copy.setAirplane(new Airplane(air1.getModel(), air1.getId(), "CompagniaEpica"));

		System.out.println(tick2.toString());
		System.out.println(tick2Copy.toString());
	}
}
