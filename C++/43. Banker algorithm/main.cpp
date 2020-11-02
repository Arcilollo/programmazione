#include <iostream>

using namespace std;

int findMinPos(int v[], int n) {
	int min;
	int iMin;
	for (int i = 0; (i < n) && (min == 0); i++) {
		min = v[i];
		iMin = i;
	}
	for (int i = 1; i < n; i++) {
		if (v[i] <= min) {
			if (v[i] != 0) {
				min = v[i];
				iMin = i;
			}
		}
	}

	return iMin;
}

void viewInfo(int Aproc[], int Rproc[], int nProc, int freeRes, int maxRes) {
	cout << "Risorse disponibili: " << freeRes << " / " << maxRes << "\n";

	cout << "Risorse assegnate:\n";
	for (int i = 0; i < nProc; i++) {
		cout << "P" << i+1 << ": " << Aproc[i] << "\n";
	}

	cout << "Risorse da richiedere:\n";
	for (int i = 0; i < nProc; i++) {
		cout << "P" << i+1 << ": " << Rproc[i] << "\n";
	}
	cout << "\n";

}

void avanti(int Aproc[], int Rproc[], int nProc, int &freeRes, int maxRes) {
	int m = findMinPos(Rproc, nProc);

	Aproc[m] += Rproc[m];
	freeRes -= Rproc[m];
	Rproc[m] = 0;

	viewInfo(Aproc, Rproc, nProc, freeRes, maxRes);

	freeRes += Aproc[m];
	Aproc[m] = 0;

	viewInfo(Aproc, Rproc, nProc, freeRes, maxRes);
}

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

	int choice;
	do {
		cout << "Cosa vuoi fare?:\n";
		cout << "1. Avanti\n";
		cout << "0. Esci\n";
		cin  >> choice;
		if (choice == 1) {
			avanti(Aproc, Rproc, nProc, freeRes, maxRes);
		}
	} while (choice != 0);

	return 0;
}
