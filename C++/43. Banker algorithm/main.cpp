#include <iostream>

using namespace std;

void printM(int max[][100], int n, int m) {
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			cout << max[i][j] << " ";
		}
		cout << "\n";
	}
}

void setFree(int free[], int m) {	// Inserimento del numero di instanze
	for (int i = 0; i < m; i++) {
		cout << "Inserisci quante instanze sono disponibili in R" << i+1 << ": ";
		cin  >> free[i];
	}
}

void setAllocated(int max[][100], int n, int m) {
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			cout << "Inserisci quante risorse sono assegnate a P" << i+1 << " da R" << j+1 << ": ";
			cin  >> max[i][j];
		}
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

void calculateNec(int nec[][100], int n, int m, int max[][100], int allocated[][100]) {
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			nec[i][j] = max[i][j] - allocated[i][j];
		}
	}
}

void printSafe(int safe[], int n) {
	for (int i = 0; i < n; i++) {
		cout << safe[i] << "\n";
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
	int nec[n][100];		// max[][] - allocated[][]

	setFree(free, m);
	setMax(max, n, m);
	setAllocated(allocated, n, m);

	int safeSeq[n], safeindex = 0; 	// Array che memorizza la sequenza sicura
	bool safe;			// variabile che serve per vedere se il processo può entrare nella sequenza sicura o no

	for (int i = 0; safeindex < n; i++) {
		safe = true;
		for (int j = 0; j < m; j++) {
			int zeroCount = 0;
			if (nec[i][j] > free[j]) {
				safe = false;
				cout << nec[i][j] << " > " << free[j];
			}

			if (nec[i][j] == 0)
				zeroCount++;
			if (zeroCount == m)
				safe = false;
		}
		if (safe == true) {
			for (int j = 0; j < m; j++) {
				allocated[i][j] += nec[i][j];
				free[j] -= nec[i][j];
				nec[i][j] = 0;
			}
			for (int j = 0; j < m; j++) {
				free[j] += allocated[i][j];
				allocated[i][j] = 0;
			}
			safeSeq[safeindex] = i;
			safeindex++;
		}
		if (i == n - 1)
			i = 0;
		cout << safe << "\n";
	}

	cout << "la sequenza sicura è: \n";
	printSafe(safeSeq, n);

	return 0;
}
