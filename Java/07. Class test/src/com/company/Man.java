package com.company;

class Man {
	public String name;
	public String surname;
	public int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void writeInfo() {
		System.out.println("Nome: " + name);
		System.out.println("Cognome: " + surname);
		System.out.println("Età: " + age);
	}
}
