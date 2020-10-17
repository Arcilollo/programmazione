#include <iostream>

using namespace std;

void read_m(int m[][100], int n) {
	cout << "Ora inserisci la matrice: \n";

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			cin  >> m[i][j];
		}
	}
}

void write_m(int m[][100], int n) {
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			cout << m[i][j] << "\t";
		}
	cout << "\n";
	}
}

int sum_d(int m[][100], int n) {
	int sum = 0;

	for (int i = 0; i < n; i++) {
		sum += m[i][i];
	}
	return sum;
}

int max_m(int m[][100], int n) {
	int max = m[0][0];
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (m[i][j] > max)
				max = m[i][j];
		}
	}
	return max;
}

int main() {
	int n;
	int sum, max;

	cout << "Inserire la grandezza della matrice quadrata: ";
	cin >> n;

	int m[n][100];

	read_m(m, n);
	sum = sum_d(m, n);
	max = max_m(m, n);
	cout << "La somma della diagonale è: " << sum << "\n";
	cout << "Il numero più alto è: " << max << "\n";

	return 0;
}

/*
PSEUDOCODIFICA


Inizio somma_d (m[][100], n)
	somma = 0

	Per I da 0 ad n con incremento di I
		somma = somma + m[I][I]

	Ritorna somma
Fine somma_d

Inizio max_d(m[][100], n)
	max = m[0][0]
	Per I da 0 ad n con incremento di I
		Per J da 0 ad n con incremento di J
			Se m[i][j] > max
				max = m[i][j]

	Ritorna max
Fine max_d

Inizio
	Scrivi "Inserire la grandezza della matrice quadrata: "
	Inserisci n

	dichiaro m[n][10];

	inserisci_m(m, n)
	somma = somma_d(m, n)
	max = max_d(m,n )
	Scrivi "La somma della diagonale è: ", sum
	Scrivi "Il numero più alto è: ", max
Fine
*/
