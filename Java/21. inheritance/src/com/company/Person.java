package com.company;

public class Person {
	private String name;
	private String surname;
	private String gender;
	private int age;

	public Person (String name, String surname, String gender, int age) {
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		String msg = "Il mio nome é: " + getName() + " " + getSurname() + "\n";
		msg += "Sono " + getGender() + "\n";
		msg += "Ho " + getAge() + " anni\n";
		return msg;
	}
}
