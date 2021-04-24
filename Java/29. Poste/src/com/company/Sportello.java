package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Sportello {

	private final List<Cliente> coda;

	public Sportello() {
		this.coda = new LinkedList<>();
	}

	public int clientiInCoda() {
		return coda.size();
	}

	public void aggiungiCoda(Cliente cliente) {
		coda.add(cliente);
	}

	public void rimuoviCoda() {
		coda.remove(0);
	}

	public boolean servi() {
		if(coda.size() > 0) {
			rimuoviCoda();
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String buffer = "";
		for(Cliente cliente : coda) {
			if(!(cliente == null)) {
				buffer += cliente + "\n";
			}
		}
		return buffer;
	}

}
