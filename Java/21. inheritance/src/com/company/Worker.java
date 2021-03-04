package com.company;

public class Worker extends Person {
	private int salary;

	public Worker(String name, String surname, String gender, int age, int salary) {
		super(name, surname, gender, age);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public String toString() {
		String msg = "Il mio nome é: " + getName() + " " + getSurname() + "\n";
		msg += "Ho " + getAge() + " anni\n";
		msg += "Sono " + getGender() + "\n";
		msg += "Il mio salario é: " + getSalary() + " euro\n";
		return msg;
	}
}
