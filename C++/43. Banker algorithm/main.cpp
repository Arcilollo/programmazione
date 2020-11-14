#include <iostream>

using namespace std;

void zeroM(int M[][100], int n, int m) {	// Funzione per azzerare una matrice
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			M[i][j] = 0;
		}
	}
}

void setFree(int free[], int m) {	// Inserimento del numero di instanze
	for (int i = 0; i < m; i++) {
		cout << "Inserisci quante instanze ci sono in R" << i+1 << ": ";
		cin  >> free[i];
	}
}

void setMax(int max[][100], int n, int m) {
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			cout << "Inserisci quante risorse chiede P" << i+1 << " ad R" << j+1 << ": ";
			cin  >> max[i][j];
		}
	}
}

int main() {
	int m;			// Quantità di risorse
	int n;			// Quantità processi

	cout << "Inserire il numero di processi: ";
	cin  >> n;
	cout << "Inserire il numero delle risorse: ";
	cin  >> m;

	int free[m];			// Instanze disponibili
	int max[n][100];		// Numero massimo di instanze
	int allocated[n][100];		// Instanze assegnate
	int nec[n][100];		// max[][] - allocated[]

	setFree(free, m);
	setMax(max, n, m);
	zeroM(allocated, n, m);
	zeroM(nec, n, m);

	int safe[n];

}
