package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void combatti(Personaggio attaccante, Personaggio nemico) {
		nemico.subisciDanno(attaccante.getDanno());
		attaccante.subisciDanno(nemico.getDanno());
	}

	public static void main(String[] args) {
		Random r = new Random();
		boolean luna = r.nextBoolean();

		Eroe e = new Eroe();
		Licantropo l = new Licantropo(luna);
		Vampiro v = new Vampiro();

		if (luna)
			System.out.println("La luna é piena");
		else
			System.out.println("La luna non é piena");
		System.out.println("Con quale personaggio vuoi giocare?");
		System.out.println("1. Eroe");
		System.out.println("2. Licantropo");
		System.out.println("3. Vampiro");
		int r1 = sc.nextInt();

		int r2, dead = 0;
		do {
			System.out.println("Con quale personaggio vuoi affrontare?");
			if (r1 != 1)
				System.out.println("1. Eroe");
			if (r1 != 2)
				System.out.println("2. Licantropo");
			if (r1 != 3)
				System.out.println("3. Vampiro");
			System.out.println("0. Esci");
			r2 = sc.nextInt();

			switch (r1) {
				case 1:
					switch (r2) {
						case 1:
							break;
						case 2:
							combatti(e, l);
							break;
						case 3:
							combatti(e, v);
							break;
					}
					System.out.println("Hai inflitto: " + e.getDanno() + " di danno\n");
					break;
				case 2:
					switch (r2) {
						case 1:
							combatti(l, e);
							break;
						case 2:
							break;
						case 3:
							combatti(l, v);
							break;
					}
					System.out.println("Hai inflitto: " + l.getDanno() + " di danno\n");
					break;
				case 3:
					switch (r2) {
						case 1:
							combatti(v, e);
							break;
						case 2:
							combatti(v, l);
							break;
						case 3:
							break;
					}
					System.out.println("Hai inflitto: " + v.getDanno() + " di danno\n");
					break;
			}

			System.out.println(e.getVita());
			System.out.println(l.getVita());
			System.out.println(v.getVita());

		} while (r2 != 0 || dead != 0);

	}
}
