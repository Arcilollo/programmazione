package com.company;

public class Main {

	public static void main(String[] args) {
		Author author = new Author("Juan", "kek");
		Book book = new Book("Telecomunicazioni 1", 57, 2077, 15, author);


		System.out.println(book.toString());
		if (book.getCost() >= 20) {
			book.sale(10);
			System.out.println("Il prezzo scontato è: " + book.getCost());
		}
		else {
			System.out.println("Il libro non può essere scontato");
		}
	}
}
