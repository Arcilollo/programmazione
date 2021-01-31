package com.company;

public class Main {

	public static void main(String[] args) {
		Non_food nf1 = new Non_food("Cacciavite", 177013, 5, "Carta");

		System.out.println(nf1.toString());
		nf1.discount();
		System.out.println(nf1.toString());
	}
}
