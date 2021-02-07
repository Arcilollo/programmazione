package com.company;

public class ListaSpesa {
	Alimentare alimentari[];
	Non_Alimentare nonAlimentari[];
	int contA = 0;
	int contNA = 0;

	public ListaSpesa(int aDim, int nADim) {
		alimentari = new Alimentare[aDim];
		nonAlimentari = new Non_Alimentare[nADim];
	}

	public void aggiungiProdotto(Alimentare prod, Data oggi, int carta) {
		alimentari[contA] = prod;
		if (carta == 1)
			alimentari[contA].applicaSconto(oggi);
		contA++;
	}

	public void aggiungiProdotto(Non_Alimentare prod, int carta) {
		nonAlimentari[contNA] = prod;
		if (carta == 1)
			nonAlimentari[contNA].applicaSconto();
		contNA++;
	}

	public float getPrezzoTotale() {
		float prezzoTotale = 0;

		for (int i = 0; i < contA; i++)
			prezzoTotale += alimentari[i].getPrezzo();

		for (int i = 0; i < contNA; i++)
			prezzoTotale += nonAlimentari[i].getPrezzo();

		return prezzoTotale;
	}

	public String toString() {
		String msg = "";

		for (int i = 0; i < contA; i++)
			msg += alimentari[i].toString() + "\n";

		for (int i = 0; i < contNA; i++)
			msg += nonAlimentari[i].toString() + "\n";

		return msg;
	}

}
