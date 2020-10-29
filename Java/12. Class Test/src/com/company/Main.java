package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int id, stipendio, livelloProfessionale;
        String cognome, dipartimento;

        System.out.println("Inserisci i dati del primo dipendente");
        System.out.print("insersci l'ID del dipendente: ");
        id = scan.nextInt();
        System.out.print("insersci il cognome del dipendente: ");
        cognome = scan.next();
        System.out.print("insersci lo stipendio annuo del dipendente: ");
        stipendio = scan.nextInt();
        System.out.print("insersci il livello professionale del dipendente: ");
        livelloProfessionale = scan.nextInt();
        System.out.print("insersci il dipartimento del dipendente: ");
        dipartimento = scan.next();

        Dipendente dipendente = new Dipendente (id, cognome, stipendio, livelloProfessionale, dipartimento);

        System.out.println("\nInserisci i dati del secondo dipendente (QUESTO DIPENDENTE SERVIRÀ SOLO PER ESEGUIRE LA MEDIA DEGLI STIPENDI");
        System.out.print("insersci l'ID del dipendente: ");
        id = scan.nextInt();
        System.out.print("insersci il cognome del dipendente: ");
        cognome = scan.next();
        System.out.print("insersci lo stipendio annuo del dipendente: ");
        stipendio = scan.nextInt();
        System.out.print("insersci il livello professionale del dipendente: ");
        livelloProfessionale = scan.nextInt();
        System.out.print("insersci il dipartimento del dipendente: ");
        dipartimento = scan.next();

        Dipendente dipendente2 = new Dipendente (id, cognome, stipendio, livelloProfessionale, dipartimento);

        int r;
        do {
            System.out.println(dipendente.viewInfo());
            System.out.println("1. Aumenta stipendio");
            System.out.println("2. Sposta tutti i dipendenti che stanno in Amministrazione in Distribuzione");
            System.out.println("3. Calcola media dei dipendenti");
            System.out.println("0. Esci");
            r = scan.nextInt();

            switch (r) {
                case 1:
                    if (dipendente.getLivelloProfessionale() <= 3)
                        dipendente.addStipendioPerc(5);
                    else
                        dipendente.addStipendioPerc(10);
                    break;
                case 2:
                    if (dipendente.getDipartimento().equals("Amministrazione"))
                        dipendente.setDipartimento("Distribuzione");
                    break;
                case 3:
                    int media = (dipendente.getStipendio() + dipendente2.getStipendio()) / 2;
                    System.out.println("la media degli stipendi annui è: " + media);
            }
        } while (r != 0);
    }
}
