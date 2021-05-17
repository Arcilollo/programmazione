package com.company;

import java.util.HashMap;
import java.util.Map;

public class GestioneCalendari {
	private Map<String, Calendario> calendari = new HashMap<>();

	public boolean aggiungiCalendario(Calendario calendario) {
		if (!calendari.containsKey(calendario.getNome())) {
			calendari.put(calendario.getNome(), calendario);
			return true;
		}
		return false;
	}

	public boolean rimuoviCalendario(String nome) {
		if (calendari.containsKey(nome)) {
			calendari.remove(nome);
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		return calendari.isEmpty();
	}

	public boolean aggiungiEvento(String nomeCalendario, Evento evento) {
		return calendari.get(nomeCalendario).aggiungiEvento(evento);
	}

	public boolean rimuoviEvento(String nomeCalendario, String nomeEvento) {
		return calendari.get(nomeCalendario).rimuoviEvento(nomeEvento);
	}

	public boolean spostaEvento(String nomeCalendario, Evento evento) {
		return calendari.get(nomeCalendario).spostaEvento(evento);
	}

	public String toString() {
		String buffer = "";
		for (String key : calendari.keySet()) {
			buffer += "\n" + calendari.get(key);
		}
		return buffer;
	}

}