package com.company;

public class Book {
	private String auth;
	private String name;
	private float price;
	private int pages;
	private int year;

	public int getYear() {
		return year;
	}

	public Book (String a, String n, float p, int pa, int y) {
		this.auth = a;
		this.name = n;
		this.price = p;
		this.pages = pa;
		this.year = y;
	}

	public String getBookInfo() {
		return this.auth + ", " + this.name + ", " + this.price + ", " + this.pages + ", " + this.year;
	}

	public float getSalePrice(int scount) {
		return (this.price / 100) * (100 - scount);
	}

}
