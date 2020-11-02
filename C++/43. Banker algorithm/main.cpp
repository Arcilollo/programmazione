#include <iostream>

using namespace std;

void richieste(int proc[], int nProc) {
	for (int i = 0; i < nProc; i++) {
		cout << "Inserisci Richieste da parte di P" << i+1 << ": ";
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

	int proc[nProc];

	richieste(proc, nProc);

	return 0;
}
