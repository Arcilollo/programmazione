#include <iostream>

using namespace std;

struct n_pres {
	int num[100] = {0};
	int pres[100] = {0};
};

void readV (int v[], int &n) {		/* Inserimento dell'array */
	cout << "Inserisci il numero degli elementi che vuoi inserire (puoi inserire massimo 100 elementi): ";
	cin  >> n;

	for (int i = 0; i < n; i++) {
		cout << "Inserisci l'elemento numero " << i+1 << ": ";
		cin  >> v[i];
	}
	cout << "\n";
}

void writeV (int v[], int n) {		/* Scrittura dell'array */
	for (int i = 0; i < n; i++)
		cout << v[i] << "\n";
	cout << "\n";
}

bool search (int v[], int n, int num) {		/* Indica se il numero(num) è presente dentro un array*/
	bool f = false;
	for (int i = 0; i < n; i++)
		if (v[i] == num)
			f = true;

	return f;
}

int getMaxPosition (int v[], int n) {		/* Serve a prendere la posizione dell'array che contiene il numero più alto */
	int maxP = 0;
	int max = 0;

	for (int i = n-1; i >= 0; i--)
		if (v[i] >= max) {
			max = v[i];
			maxP = i;
		}

	return maxP;
}

int getPosition (int v[], int n, int num) {		/* serve a prendere la posizione dell'array che contiene il numero(num) */
	int pos = 0;
	for (int i = 0; i < n; i++)
		if (v[i] == num)
			pos = i;

	return pos;
}

int moda (int v[], int n) {			/* Calcola la moda */
	int p = 0;
	n_pres b;

	for (int i = 0; i < n; i++) {
		if (!search(b.num, n, v[i])) {		/* Se nell'array(b.num) non è presente il numero v[i] lo */
			b.num[p] = v[i];				/* aggiunge e gli incrementa il numero delle volte in cui è presente(indicato con b.pres) */
			b.pres[p]++;
			p++;
		}
		else										/* Altrimenti se il numero è già presente */
			b.pres[getPosition(b.num, n, v[i])]++;	/* aumenta b.pres alla posizione di dove è presente v[i] */
	}

	int m = b.num[getMaxPosition(b.pres, p)];	/* la posizione con l'elemento più grande in b.pres dell'array b.num */
												/* sarà la moda degli elementi presenti nell'array */
	return m;
}

int main() {
	int s, n;
	int v[100];
	bool f = false;		/* Questo flag serve per non permettere di usare la scelta 2 e 3 quando non è stato inserito l'array */

	do {
		cout << "Cosa vuoi fare?\n";
		cout << "1. Inserire gli elementi\n";
		cout << "2. Visualizzare gli elementi inseriti\n";
		cout << "3. Visualizza la moda degli elementi inseriti\n";
		cout << "0. Esci\n";
		cin  >> s;
		system("clear");

		switch (s) {
			case 1:
				f = true;
				readV (v, n);
				break;
			case 2:
				if (f == false)
					cout << "Devi prima inserire gli elementi per poterli visualizzare\n\n";
				else
					writeV (v, n);
				break;
			case 3:
				if (f == false)
					cout << "Devi prima inserire gli elementi per poter visualizzare la moda\n\n";
				else
					cout << "La moda è: " << moda(v, n) << "\n";
				break;
		}
	} while (s != 0);

	return 0;
}

/*

PSEUDOCODIFICA


Struttura TabellaPresenti
	num[100] inizializzato a 0
	pres[100] inizializzato a 0
Fine


Inizio leggiV (v[], &n)
	SCRIVI "Inserisci il numero degli elementi che vuoi inserire: "
	INSERISCI n

	per i da 0 a n
		SCRIVI "Inserisci l'elemento numero ", i+1, ": "
		INSERISCI v[i]
Fine


Inizio scriviV (v[], n)
	per i da 0 ad n
		SCRIVI v[i]
Fine


Inizio cerca (v[], n, num)
	f = falso
	per i da 0 a n
		se v[i] == num
			f = vero

	ritorna f
Fine


Inizio ottieniPosizioneMassima (v[], n)
	per i da n-1 a 0
		se v[i] >= max
			max = v[i]
			maxP = i

	ritorna maxP
Fine


Inizio ottieniPosizione (v[], n, num)
	per i da 0 a n
		se v[i] == num
			pos = i

	ritorna pos
Fine


Inizio moda (int v[], int n) {
	dichiaro la struttura TabellaPresenti come b

	per i da 0 a n
		se cerca(b.num, n, v[i]) == falso
			b.num[p] = v[i]
			b.pres[p] = b.pres[p] + 1
			p = p + 1
		altrimenti
			b.pres[ottieniPosizione(b.num, n, v[i])] = b.pres[ottieniPosizione(b.num, n, v[i])] + 1

	m = b.num[ottieniPosizioneMassima(b.pres, p)]

	ritorna m
Fine


Inizio
	dichiaro v[100];
	f = falso;

	esegui
		SCRIVI "Cosa vuoi fare?"
		SCRIVI "1. Inserire gli elementi"
		SCRIVI "2. Visualizzare gli elementi inseriti"
		SCRIVI "3. Visualizza la moda degli elementi inseriti"
		SCRIVI "0. Esci"
		INSERISCI S

		se s == 1
			f = true;
			leggiV (v, n)
		altrimenti se s == 2
			se f == falso
				cout << "Devi prima inserire gli elementi per poterli visualizzare"
			altrimenti
				scriviV (v, n)
		altrimenti se s == 3
			se f == falso
				SCRIVI "Devi prima inserire gli elementi per poter visualizzare la moda"
			altrimenti
				SCRIVI "La moda è: ", moda(v, n)
	mentre s != 0
Fine
*/
