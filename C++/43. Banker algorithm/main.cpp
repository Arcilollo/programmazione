#include <iostream>

using namespace std;

void assegnazioni(int proc[], int nProc, int &freeRes) {
	for (int i = 0; i < nProc; i++) {
		cout << "Inserisci risorse assegnate a P" << i+1 << ": ";
		cin  >> proc[i];
		freeRes -= proc[i];
	}
}

void richieste(int proc[], int nProc) {
	for (int i = 0; i < nProc; i++) {
		cout << "Inserisci richieste rimanenti da parte di P" << i+1 << ": ";
		cin  >> proc[i];
	}
}

int main() {
	int nProc, maxRes;
	int freeRes;

	cout << "Inserisci il numero di processi: ";
	cin  >> nProc;
	cout << "Inserisci la quantità di instanze di R1: ";
	cin  >> maxRes;

	freeRes = maxRes;
	int Aproc[nProc];
	int Rproc[nProc];

	assegnazioni(Aproc, nProc, freeRes);
	richieste(Rproc, nProc);

	cout << freeRes << " / " << maxRes << "\n";

	return 0;
}
