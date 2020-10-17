package com.company;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);


	public static void main(String[] args) {
		String name, surname;
		int age;

		name = scan.nextLine();
		surname = scan.nextLine();
		age = scan.nextInt();

		Man person = new Man();

		person.setName(name);
		person.setSurname(surname);
		person.setAge(age);

		person.writeInfo();


	}
}
