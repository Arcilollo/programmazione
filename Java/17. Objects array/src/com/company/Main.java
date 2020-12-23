package com.company;

public class Main {

	public static void main(String[] args) {
		// arrayName.lenght restituisce la lunghezza dell'array

		Class math = new Class("Matematica", 5);
		Student s1 = new Student("Carla", "Conti", 57);
		Student s2 = new Student("Franca", "Cecconi", 57);

		math.addStudent(s1);
		math.addStudent(s2);

		System.out.println(math.toString());
	}
}
