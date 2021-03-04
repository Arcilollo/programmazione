package com.company;

import java.util.Scanner;

public class Menu {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ListaSpesa carrello = new ListaSpesa(50, 50);

		System.out.println("Inserisci la data di oggi:");
		System.out.print("Giorno: ");
		int giorno = scan.nextInt();
		System.out.print("Mese: ");
		int mese = scan.nextInt();
		System.out.print("Anno: ");
		int anno = scan.nextInt();

		Data oggi = new Data(giorno, mese, anno);

		System.out.print("scrivi 1 se possiedi la carta di fedeltá: ");
		int cartaFedelta = scan.nextInt();

		int r;
		do {
			System.out.println("1. Aggiungi prodotto");
			System.out.println("2. Visualizza lista prodotti");
			System.out.println("3. Visualizza il costo di tutti i prodotti");
			System.out.println("0. Esci");
			r = scan.nextInt();

			switch(r) {
				case 1:
					System.out.println("1. Prodotto alimentare");
					System.out.println("2. Prodotto non alimentare");
					int r1 = scan.nextInt();

					System.out.print("Inserisci il codice del prodotto: ");
					int id = scan.nextInt();
					System.out.print("Inserisci la descrizione del prodotto: ");
					String descrizione = scan.next();
					System.out.print("Inserisci il prezzo del prodotto: ");
					float prezzo = scan.nextFloat();

					switch(r1) {
						case 1:
							System.out.println("Inserisci la data di scadenza:");
							System.out.print("Giorno: ");
							int giorno1 = scan.nextInt();
							System.out.print("Mese: ");
							int mese1 = scan.nextInt();
							System.out.print("Anno: ");
							int anno1 = scan.nextInt();

							carrello.aggiungiProdotto(new Alimentare(descrizione, id, prezzo, new Data(giorno1, mese1, anno1)), oggi, cartaFedelta);
							break;
						case 2:
							System.out.print("Inserisci il materiale: ");
							String materiale = scan.next();

							carrello.aggiungiProdotto(new Non_Alimentare(descrizione, id, prezzo, materiale), cartaFedelta);
							break;
					}
					break;
				case 2:
					System.out.println(carrello.toString());
					break;
				case 3:
					System.out.println("Il totale é: " + carrello.getPrezzoTotale() + " euro");
					break;
			}
		} while (r != 0);
	}
}
