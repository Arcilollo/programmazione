package com.company;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		GestioneCalendari gestioneCalendari = new GestioneCalendari();
		gestioneCalendari.aggiungiCalendario(new Calendario("Personale"));
		gestioneCalendari.aggiungiCalendario(new Calendario("Scuola"));

		int r;
		do {
			System.out.println("1. Aggiungi Evento");
			System.out.println("2. Rimuovi Evento");
			System.out.println("3. Sposta Evento");
			System.out.println("4. Visualizza eventi");
			System.out.println("0. Esci");
			r = sc.nextInt();

			switch (r) {
				case 1:
					String nome = inputString("Inserisci il nome dell'evento:");
					int inizioD = inputInt("Inserisci la data di inizio(DD MM YYYY):");
					int inizioM = sc.nextInt();
					int inizioY = sc.nextInt();
					int fineD = inputInt("Inserisci la data di fine:");
					int fineM = sc.nextInt();
					int fineY = sc.nextInt();
					String calendario = inputString("inserisci a che calendario vuoi aggiungere l'evento:");

					Data inizio = new Data(inizioD, inizioM, inizioY);
					Data fine = new Data(fineD, fineM, fineY);

					gestioneCalendari.aggiungiEvento(calendario, new Evento(nome, inizio, fine));

					break;
				case 2:
					String nomeDaRimuovere = inputString("Inserisci il nome dell'evento da rimuovere:");
					String calendario2 = inputString("Inserisci da quale calendario vuoi rimuovere l'evento:");

					if (gestioneCalendari.rimuoviEvento(calendario2, nomeDaRimuovere))
						System.out.println("Evento rimosso");
					else
						System.out.println("L'evento non esiste");

					break;
				case 3:
					String nomeDaSpostare = inputString("Inserisci il nome dell'evento da spostare:");
					int nuovoInizioD = inputInt("Inserisci la data di inizio:");
					int nuovoInizioM = sc.nextInt();
					int nuovoInizioY = sc.nextInt();
					int nuovaFineD = inputInt("Inserisci la data di fine:");
					int nuovaFineM = sc.nextInt();
					int nuovaFineY = sc.nextInt();
					String calendario3 = inputString("Inserisci da quale calendario vuoi spostare l'evento:");

					Data nuovoInizio = new Data(nuovoInizioD, nuovoInizioM, nuovoInizioY);
					Data nuovaFine = new Data(nuovaFineD, nuovaFineM, nuovaFineY);

					if (gestioneCalendari.spostaEvento(calendario3, new Evento(nomeDaSpostare, nuovoInizio, nuovaFine)))
						System.out.println("Evento spostato");
					else
						System.out.println("L'evento non esiste");

					break;
				case 4:
					System.out.println(gestioneCalendari);
					break;
			}

		} while (r != 0);

	}

	private static String inputString(String msg) {
		System.out.println(msg);
		return sc.next();
	}

	private static int inputInt(String msg) {
		System.out.println(msg);
		return sc.nextInt();
	}

}
