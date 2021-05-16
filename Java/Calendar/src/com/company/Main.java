package com.company;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Calendario calendario = new Calendario("Personale");

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

					Data inizio = new Data(inizioD, inizioM, inizioY);
					Data fine = new Data(fineD, fineM, fineY);

					calendario.aggiungiEvento(new Evento(nome, inizio, fine));

					break;
				case 2:
					String nomeDaRimuovere = inputString("Inserisci il nome dell'evento da rimuovere:");

					if (calendario.rimuoviEvento(nomeDaRimuovere))
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

					Data nuovoInizio = new Data(nuovoInizioD, nuovoInizioM, nuovoInizioY);
					Data nuovaFine = new Data(nuovaFineD, nuovaFineM, nuovaFineY);

					if (calendario.spostaEvento(new Evento(nomeDaSpostare, nuovoInizio, nuovaFine)))
						System.out.println("Evento spostato");
					else
						System.out.println("L'evento non esiste");

					break;
				case 4:
					System.out.println(calendario);
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
