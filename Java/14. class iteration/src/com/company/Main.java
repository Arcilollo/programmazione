package com.company;

import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String a = "Roma";
		int b = 2020;
		String c = "boeing";
		int d = 177013;
		String e = "Alitalia";

		Airplane air1 = new Airplane (c, d, e);
		Ticket tick1 = new Ticket(a, b);
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
