#include <iostream>
#include <time.h>
#include <unistd.h>
#include "LRF.h"

using namespace std;

void viewArray(int v[], int dim) {
	for (int i = 0; i < dim; i++) {
		cout << v[i] << "\n";
	}
	cout << "\n";
}

void fillArray(int v[], int dim) {
	for (int i = 0; i < dim; i++) {
		v[i] = i + 1;
	}
}

void remove(int v[], int &dim, int n) {
	for (int i = n; i < dim-1; i++) {
		v[i] = v[i+1];
	}
	dim--;
}

int main () {
	srand((unsigned)time(NULL));
	int dim = 69;
	int removed;
	int numbers[dim];

	fillArray(numbers, dim);

	do {
		system("clear");
		int random = rand() % dim;
		removed = numbers[random];
		remove(numbers, dim, random);

		viewArray(numbers, dim);
		usleep(1000*1000);
	} while (removed != 57);

	LRF();

	return 0;
	// Questo
	// commento
	// serve
	// per
	// arrivare
	// a
	// 57
	// righe di codice
}
