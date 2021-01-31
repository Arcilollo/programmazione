package com.company;

public class Non_food extends Product{
	private String material;

	public Non_food(String name, int id, float price, String material) {
		super(name, id, price);
		this.material = material;
	}

	public void discount() {
		if (material.equals("Carta") || material.equals("Vetro") || material.equals("Plastica"))
			price = (price / 100) * (100 - 10);
	}
}
