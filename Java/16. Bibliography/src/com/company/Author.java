package com.company;

public class Author {
	private String name;
	private String surname;

	public Author (String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String toString() {
		String msg = "Nome autore: " + this.name + " " + this.surname;
		return msg;
	}

}
