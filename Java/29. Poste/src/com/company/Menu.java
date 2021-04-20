package com.company;

import java.util.Scanner;

public class Menu {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String nomeUP = inputStringa("Inserisci nome ufficio postale: ");
        int nSportelli = inputNumero("Numero sportelli: ");
        int maxCodaSportelli = inputNumero("Massimo clienti in coda per sportello: ");

        UfficioPostale ufficioPostale = new UfficioPostale(nomeUP, nSportelli, maxCodaSportelli);

        int r;
        do {
            System.out.println("1. Aggiungi cliente in fila");
            System.out.println("2. Servi un cliente ad uno sportello specifico");
            System.out.println("3. Servi clienti ad ogni sportello");
            System.out.println("4. Visualizza le code");
            System.out.println("0. Esci");
            r = sc.nextInt();

            switch (r) {
                case 1:
                    String nome = inputStringa("Inserisci nome del cliente");
                    String cognome = inputStringa("Inserisci cognome del cliente");

                    if (ufficioPostale.aggiungiASportello(new Cliente(nome, cognome)))
                        System.out.println("Cliente aggiunto correttamente");
                    else
                        System.out.println("Tutte le code sono piene");
                    break;
                case 2:
                    int nSportello = inputNumero("Inserisci lo sportello del cliente da servire");
                    if (ufficioPostale.serviClienti(nSportello - 1))
                        System.out.println("Cliente servito");
                    else
                        System.out.println("Lo sportello vuoto");

                    break;
                case 3:
                    int clientiServiti = ufficioPostale.serviClienti();
                    System.out.println("Clienti serviti: " + clientiServiti);
                    break;
                case 4:
                    System.out.println(ufficioPostale);
                    break;
            }

        } while (r != 0);
    }

    private static String inputStringa(String msg) {
        System.out.println(msg);
        return sc.next();
    }

    private static int inputNumero(String msg) {
        System.out.println(msg);
        return sc.nextInt();
    }

}
