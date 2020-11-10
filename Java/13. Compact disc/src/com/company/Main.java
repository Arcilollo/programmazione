package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[] song = new String[10];
        int[] time = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Inserisci il nome della canzone " + (i+1) + ": ");
            song[i] = scan.next();
            System.out.println("Inserisci la durata della canzone " + (i+1) + ": ");
            time[i] = scan.nextInt();
        }

        CD cd = new CD(song, time);

        int r;
        do {
            System.out.println("Cosa vuoi fare?");
            System.out.println("1. Cambia nome di una canzone");
            System.out.println("2. Cambia durata di una canzone");
            System.out.println("3. Ottieni durata canzone");
            System.out.println("0. Esci");
            r = scan.nextInt();

            switch (r) {
                case 1:
                    int n;
                    String newName;
                    System.out.println("Quale vuoi cambiare? (1-10): ");
                    n = scan.nextInt();
                    System.out.println("Inserisci il nuovo nome: ");
                    newName = scan.next();
                    cd.setSong(newName,n);
                    break;
                case 2:
                    int newTime, n1;
                    System.out.println("Quale vuoi cambiare? (1-10): ");
                    n1 = scan.nextInt();
                    System.out.println("Inserisci la nuova durata: ");
                    newTime = scan.nextInt();
                    cd.setTime(newTime,n1);
                    break;
                case 3:
                    String songName;
                    System.out.println("Inserisci il nome della canzone");
                    songName = scan.next();
                    System.out.println("La canzone dura: " + cd.getTime(songName));
                    break;
            }

        } while (r != 0);

    }
}
