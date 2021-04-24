package com.company;

public class UfficioPostale {

	private Sportello[] sportelli;
	private final String nome;
	private final int cassaforte;

	public UfficioPostale(String nome, int dimSportelli) {
		this.nome = nome;
		this.sportelli = new Sportello[dimSportelli];
		for(int i = 0; i < sportelli.length; i++) {
			sportelli[i] = new Sportello();
		}
		this.cassaforte = 0;
	}

	public boolean aggiungiASportello(Cliente cliente) {
		Sportello sportelloOttimale = null;
		for(Sportello sportello : sportelli) {
			if (sportelloOttimale == null || sportello.clientiInCoda() < sportelloOttimale.clientiInCoda()) {
				sportelloOttimale = sportello;
			}
		}
		if(sportelloOttimale != null) {
			sportelloOttimale.aggiungiCoda(cliente);
			return true;
		}
		return false;
	}

	public int serviClienti() {
		int clientiServiti = 0;
		for(Sportello sportello : sportelli) {
			if(sportello.servi()) {
				clientiServiti++;
			}
		}
		return clientiServiti;
	}

	public boolean serviClienti(int nSportello) {
		return sportelli[nSportello].servi();
	}

	@Override
	public String toString() {
		String buffer = "";
		for(int i = 0; i < sportelli.length; i++) {
			buffer += "Sportello N°" + (i+1) + " Persone in coda: " + sportelli[i].clientiInCoda() + "\n";
			buffer += sportelli[i].toString() + "\n\n";
		}
		return buffer;
	}

}
