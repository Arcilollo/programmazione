package com.company;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String auth, name;
        float price;
        int pages, year;

        System.out.println("Inserisci l'autore");
        auth = scan.nextLine();
        System.out.println("Inserisci il nome");
        name = scan.nextLine();
        System.out.println("Inserisci il prezzo");
        price = scan.nextFloat();
        System.out.println("Inserisci le pagine");
        pages = scan.nextInt();
        System.out.println("Inserisci l'anno");
        year = scan.nextInt();

        Book book = new Book(auth, name, price, pages, year);

        System.out.println(book.getBookInfo());

        if (book.getYear() < 2000)
            System.out.println("Il prezzo scontato è: " + book.getSalePrice(10));
        else
            System.out.println("Il prezzo scontato è: " + book.getSalePrice(5));
    }
}
