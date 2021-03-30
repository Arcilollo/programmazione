package com.company;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean luna = false;

		Eroe e = new Eroe();
		Licantropo l = new Licantropo(luna);
		Vampiro v = new Vampiro();

		System.out.println("Con quale personaggio vuoi giocare?");
		System.out.println("1. Eroe");
		System.out.println("2. Licantropo");
		System.out.println("3. Vampiro");
		int r1 = sc.nextInt();

		switch (r1) {
			case 1:		// Eroe
				int s1;
				if (!l.isUomo()) {
					System.out.println("Chi vuoi attaccare?");
					System.out.println("1. Vampiro");
					System.out.println("2. Licantropo");
					s1 = sc.nextInt();
				}
				else
					s1 = 1;

				switch (s1) {
					case 1:
						System.out.println("Quanti attacchi vuoi fare al vampiro?");
						int attacco1 = sc.nextInt();

						for (int i = 0; i < attacco1; i++) {
							e.combatti(v);
						}

						break;
					case 2:
						System.out.println("Quanti attacchi vuoi fare al licantropo?");
						int attacco2 = sc.nextInt();

						for (int i = 0; i < attacco2; i++) {
							e.combatti(v); // no
						}

						break;
				}
				break;


			case 2:		// Licantropo
				if (!l.isUomo()) {
					System.out.println("Quanti attacchi vuoi fare all'eroe?");
					int attacco3 = sc.nextInt();

					for (int i = 0; i < attacco3; i++)
						l.azzanna(e);
				}
				else {
					System.out.println("Quanti attacchi vuoi fare al vampiro?");
					int attacco3 = sc.nextInt();

					for (int i = 0; i < attacco3; i++)
						l.combatti(v);
				}

				break;
			case 3:		// Vampiro
				int s2;
				if (l.isUomo()) {
					System.out.println("Chi vuoi attaccare?");
					System.out.println("1. Eroe");
					System.out.println("2. Licantropo");
					s2 = sc.nextInt();
				}
				else
					s2 = 1;

				switch (s2) {
					case 1:
						System.out.println("Quanti attacchi vuoi fare al eroe?");
						int attacco4 = sc.nextInt();

						for (int i = 0; i < attacco4; i++)
							v.azzanna(e);
						break;
					case 2:
						System.out.println("Quanti attacchi vuoi fare al licantropo?");
						int attacco5 = sc.nextInt();

						for (int i = 0; i < attacco5; i++)
							v.azzanna(e); // no
						break;
				}

				break;
		}

		System.out.println(e.getVita());
		System.out.println(l.getVita());
		System.out.println(v.getVita());
	}
}
