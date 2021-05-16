package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Calendario {
	private String nome;
	private Map<String, Evento> eventi = new HashMap<>();

	public Calendario(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public boolean aggiungiEvento(Evento evento) {
		if (!eventi.containsKey(evento.getNome())) {
			eventi.put(evento.getNome(), evento);
			return true;
		}
		return false;
	}

	public boolean rimuoviEvento(String nome) {
		if (eventi.containsKey(nome)) {
			eventi.remove(nome);
			return true;
		}
		return false;
	}

	public boolean spostaEvento(Evento evento) {
		if (eventi.containsKey(evento.getNome())) {
			eventi.put(evento.getNome(), evento);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String buffer = "Nome calendario: " + nome;
		List<Evento> eventiCopy = new LinkedList<>();
		for (String key : eventi.keySet()) {
			eventiCopy.add(eventi.get(key));
		}
		eventiCopy.sort((o1, o2) -> o1.getInizio().getDifference(o2.getInizio()));
		for (Evento evento : eventiCopy) {
			buffer += "\n" + evento;
		}
		return buffer;
	}

}
