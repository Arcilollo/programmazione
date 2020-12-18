package com.company;

public class Book {
	private String name;
	private int pages;
	private int year;
	private float cost;
	private Author author;

	public Book(String name, int pages, int year, float cost, Author author) {
		this.name = name;
		this.pages = pages;
		this.year = year;
		this.cost = cost;
		this.author = author;
	}

	public void sale(float sale) {
		this.cost = this.cost/100 * (100-sale);
	}

	public float getCost() {
		return cost;
	}

	public String toString() {
		String msg = "Nome libro: " + this.name + "\n";
		msg += "Pagine: " + this.pages + "\n";
		msg += "Nome libro: " + this.year + "\n";
		msg += "Costo: " + this.cost + "\n";
		msg += author.toString();
		return msg;
	}

}
