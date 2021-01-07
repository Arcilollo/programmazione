package com.company;

import java.util.Scanner;

public class Menu {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Quanti libri puó contenere la libreria?");
		int maxBooks = scan.nextInt();
		Bookshelf bookshelf = new Bookshelf(maxBooks);

		int r;
		do {
			System.out.println("1. Aggiungi libro");
			System.out.println("2. Rimuovi libro");
			System.out.println("3. Visualizza elenco libri");
			System.out.println("4  Sconta un libro");
			System.out.println("5. Ordina per titolo");
			System.out.println("6. Ordina per autore");
			System.out.println("0. Esci");
			r = scan.nextInt();

			switch (r) {
				case 1:
					System.out.print("titolo del libro: ");
					String title = scan.next();
					System.out.print("Nome dell'autore: ");
					String author = scan.next();
					System.out.print("Pagine del libro: ");
					int pages = scan.nextInt();
					System.out.print("Costo del libro: ");
					float cost = scan.nextFloat();

					bookshelf.addBook(new Book (title, author, pages, cost));
					break;
				case 2:
					System.out.print("Inserisci il titolo del libro da togliere: ");
					String titleToRemove = scan.next();
					bookshelf.removeBook(titleToRemove);
					break;
				case 3:
					System.out.println(bookshelf.toString());
					break;
				case 4:
					System.out.print("Inserisci il titolo del libro da scontare: ");
					String titleToScount = scan.next();
					System.out.print("Inserisci lo sconto in percentuale: ");
					float scount = scan.nextFloat();
					bookshelf.discountBook(titleToScount, scount);
					break;
				case 5:
					bookshelf.sortByTitle();
					break;
				case 6:
					bookshelf.sortByAuthor();
					break;
			}
		} while (r != 0);

	}
}
