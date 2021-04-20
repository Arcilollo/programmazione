package com.company;

public class Sportello {

	private final Cliente[] coda;
	private int codaCont = 0;

	public Sportello(int maxCodaLength) {
		this.coda = new Cliente[maxCodaLength];
	}

	public int clientiInCoda() {
		return codaCont;
	}

	public boolean isPieno() {
		return codaCont == coda.length;
	}

	public int getCodaCont() {
		return codaCont;
	}

	public void aggiungiCoda(Cliente cliente) {
		coda[codaCont] = cliente;
		codaCont++;
	}

	public void rimuoviCoda() {
		for(int i = 0; i < codaCont-1; i++) {
			coda[i] = coda[i+1];
		}
		coda[codaCont-1] = null;
		codaCont--;
	}

	public boolean servi() {
		if(codaCont > 0) {
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
