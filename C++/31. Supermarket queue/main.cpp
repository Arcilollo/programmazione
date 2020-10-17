#include <iostream>

using namespace std;

void sort (int v[], int n) {		/* Funzione che mette in ordine crescente i numeri */
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (v[i] < v[j]) {
 				int temp = v[i];
				v[i] = v[j];
				v[j] = temp;
			}
		}
	}
}

void add (int v[], int &n) {	/* Funzione per aggiungere una persona alla fila */
	int code;
	cout << "Inserire il codice della persona che si è messa in fila\n";
	cout << "1. Codice Rosa\n";
	cout << "2. Codice Giallo\n";
	cout << "3. Codice Bianco\n";
	cin  >> code;

	v[n] = code;	/* Una volta inserito il codice esso verrà messo nel primo elemento vuoto dell'array */
	n++;			/* In seguito la posizione dell'array incrementa di 1 */
	sort (v, n);	/* Infine viene fatto il sorting degli elementi in modo che ci sia prima il codice rosa(1), poi il codice giallo(2) e infine il codice bianco(3) */
}

void view (int v[], int n) {	/* Funzione che visualizza il vettore */
	for (int i = 0; i < n; i++) {
		switch (v[i]) {
			case 1:
				cout << "Codice Rosa\n";
				break;
			case 2:
				cout << "Codice Giallo\n";
				break;
			case 3:
				cout << "Codice Bianco\n";
				break;
		}
	}
}

int main() {
	int v[100];
	int n = 0;
	int s;

	do {
		cout << "Cosa vuoi fare?\n";
		cout << "1. Inserire una persona nella fila\n";
		cout << "2. Visualizzare la fila\n";
		cout << "0. Esci\n";
		cin  >> s;
		system("clear");

		switch (s) {
			case 1:
				add(v, n);
				break;
			case 2:
				view(v, n);
				break;
		}
	} while(s != 0);

	return 0;
}
