package com.company;

public class Main {

	public static void main(String[] args) {
		Person persona = new Person("Mario", "Rossi", "Maschio",57);
		Student student = new Student("Mauro", "De Lugozzi", "Maschio",14, 7);
		Worker worker = new Worker("Carla", "Erre", "Femmina",29, 1300);

		System.out.println(persona.toString());
		System.out.println(student.toString());
		System.out.println(worker.toString());

		student.study();

		System.out.println(student.toString());
	}
}
