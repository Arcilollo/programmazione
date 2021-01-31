package com.company;

public class Product {
	protected String name;
	protected int id;
	protected float price;

	public Product (String name, int id, float price) {
		this.name = name;
		this.id = id;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public float getPrice() {
		return price;
	}

	public String toString() {
		return "Product{" +
			"name='" + name + '\'' +
			", id=" + id +
			", price=" + price +
			'}';
	}
}
