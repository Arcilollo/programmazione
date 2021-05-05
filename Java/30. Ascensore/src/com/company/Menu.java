package com.company;

import java.util.Scanner;

public class Menu {
	static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Inserisci piani dell'edificio");
        int maxPiani = sc.nextInt();
        System.out.println("Inserisci massimo delle persone");
        int maxPersone = sc.nextInt();
	    Ascensore ascensore = new Ascensore(5, 4);

        int r;
        do {
            System.out.println("1. Aggiungi una persona");
            System.out.println("2. Vai ad un piano");
            System.out.println("3. Visualizza elenco delle persone");
            System.out.println("4. Visualizza stato dell'ascensore");
            System.out.println("0. Esci");
            r = sc.nextInt();

            switch (r) {
                case 1:
                    System.out.println("Inserisci il nome:");
                    String nome = sc.next();
                    System.out.println("Inserisci il cognome:");
                    String cognome = sc.next();
                    System.out.println("Inserisci il piano dove la persona deve andare:");
                    int pianoPersona = sc.nextInt();

                    System.out.println(ascensore.inserisciPersona(new Persona(nome, cognome, pianoPersona)));

                    break;
                case 2:
                    System.out.println("Inserisci il piano:");
                    int piano = sc.nextInt();

                    System.out.println(ascensore.vaiAlPiano(piano));
                    break;
                case 3:
                    System.out.println(ascensore.elencoPersone());
                    break;
                case 4:
                    System.out.println(ascensore);
                    break;
            }
        } while (r != 0);
    }
}
