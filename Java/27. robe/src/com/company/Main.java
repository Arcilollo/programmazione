package com.company;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Eroe e = new Eroe();
		Licantropo l = new Licantropo(true);
		Vampiro v = new Vampiro();

		System.out.println("1. Eroe");
		System.out.println("2. Licantropo");
		System.out.println("3. Vampiro");
		int r1 = sc.nextInt();

		switch (r1) {
			case 1:
				System.out.print("Inscrisci il numero di attacchi: ");
				int attacco1 = sc.nextInt();

				for (int i = 0; i < attacco1; i++) {
					e.combatti();
				}

				l.combatti();
				l.azzanna();
				v.azzanna();

				break;
			case 2:
				System.out.print("Inscrisci il numero di attacchi: ");
				int attacco2 = sc.nextInt();

				for (int i = 0; i < attacco2; i++) {
					l.combatti();
					l.azzanna();
				}

				e.combatti();
				v.azzanna();

				break;
			case 3:
				System.out.print("Inscrisci il numero di attacchi: ");
				int attacco3 = sc.nextInt();

				for (int i = 0; i < attacco3; i++)
					v.azzanna();

				e.combatti();
				l.combatti();
				l.azzanna();

				break;
		}
		System.out.println(e.getForza());
		System.out.println(l.getForza());
		System.out.println(v.getForza());
	}
}
