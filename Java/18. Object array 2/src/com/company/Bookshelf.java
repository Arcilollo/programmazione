package com.company;

public class Bookshelf {
	private Book books[];
	private int cont = 0;

	public Bookshelf(int maxBooks) {
		this.books = new Book[maxBooks];
	}

	public void addBook(Book b) {
		if (cont < books.length) {
			books[cont] = b;
			cont++;
		}
	}

	public void removeBook(String bookName) {
		boolean found = false;
		int startIndex = 0;
		for (int i = 0; i < cont; i++) {
			if (books[i].getTitle().equals(bookName)) {
				startIndex = i;
				found = true;
			}
		}
		if (found) {
			for (int i = startIndex; i < cont - 1; i++) {
				books[i].setTitle(books[i + 1].getTitle());
				books[i].setAuthor(books[i + 1].getAuthor());
				books[i].setPages(books[i + 1].getPages());
				books[i].setCost(books[i + 1].getCost());
			}
			cont--;
		}
	}

	public void discountBook(String bookName, float scount) {
		boolean found = false;
		int foundIndex = 0;
		for (int i = 0; i < cont; i++) {
			if (books[i].getTitle().equals(bookName)) {
				foundIndex = i;
				found = true;
			}
		}

		if (found) {
			float scountedPrice = (books[foundIndex].getCost() / 100) * (100 - scount);
			books[foundIndex].setCost(scountedPrice);
		}

	}

	public void sortByTitle() {
		for (int i = 0; i < cont; i++)
			for (int j = 0; j < cont; j++) {
				char char1 = books[i].getTitle().charAt(0);
				char char2 = books[j].getTitle().charAt(0);
				if (char1 < char2) {
					String tmp1 = books[i].getTitle();
					String tmp2 = books[i].getAuthor();
					int tmp3 = books[i].getPages();
					float tmp4 = books[i].getCost();

					books[i].setTitle(books[j].getTitle());
					books[i].setAuthor(books[j].getAuthor());
					books[i].setPages(books[j].getPages());
					books[i].setCost(books[j].getCost());

					books[j].setTitle(tmp1);
					books[j].setAuthor(tmp2);
					books[j].setPages(tmp3);
					books[j].setCost(tmp4);
				}
			}
	}

	public void sortByAuthor() {
		for (int i = 0; i < cont; i++)
			for (int j = 0; j < cont; j++) {
				char char1 = books[i].getAuthor().charAt(0);
				char char2 = books[j].getAuthor().charAt(0);
				if (char1 < char2) {
					String tmp1 = books[i].getTitle();
					String tmp2 = books[i].getAuthor();
					int tmp3 = books[i].getPages();
					float tmp4 = books[i].getCost();

					books[i].setTitle(books[j].getTitle());
					books[i].setAuthor(books[j].getAuthor());
					books[i].setPages(books[j].getPages());
					books[i].setCost(books[j].getCost());

					books[j].setTitle(tmp1);
					books[j].setAuthor(tmp2);
					books[j].setPages(tmp3);
					books[j].setCost(tmp4);
				}
			}
	}

	public String toString() {
		String msg = "I libri all'interno dello scaffale sono:\n";
		for (int i = 0; i < cont; i++) {
			msg += "Libro " + i+1 + ":\n";
			msg += "Titolo: " + books[i].getTitle() + "\n";
			msg += "Autore: " + books[i].getAuthor() + "\n";
			msg += "Pagine: " + books[i].getPages() + "\n";
			msg += "Prezzo: " + books[i].getCost() + "\n\n";
		}
		return msg;
	}
}
