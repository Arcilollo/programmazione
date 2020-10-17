#include <iostream>
#include <time.h>
#include "sort.h"

using namespace std;

void read_array(int v[], int n) {
	for (int i = 0; i < n; i++) {
		cout << "Element number " << i + 1 << ": ";
		cin  >> v[i];
	}
	cout << "\n";
}

void write_array(int v[], int n) {
	for (int i = 0; i < n; i++) {
		cout << v[i] << "\n";
	}
	cout << "\n";
}

void randomize(int v[], int n) {
	srand((unsigned)time(0));

	for (int i = 0; i < n; i++) {
		v[i] = (rand() % 100);
	}
}

int main() {
	int n, type;

	cout << "Enter the lenght of the array: ";
	cin  >> n;

	int v[n];

	//read_array(v, n);
	randomize(v, n);

	do {
		cout << "What type of sort do you want to use?\n";
		cout << "1. Radix sort\n";
		cout << "2. Shell sort\n";
		cout << "3. Selection sort\n";
		cout << "4. Bogo sort\n";
		cout << "5. Bozo sort\n";
		cin  >> type;
		cout << "\n";
	} while ((type <= 0) || (type > 5));

	switch (type) {
		case 1:
			radixSort(v, n);
			break;
		case 2:
			shellSort(v, n);
			break;
		case 3:
			selectionSort(v, n);
			break;
		case 4:
			bogoSort(v, n);
			break;
		case 5:
			bozoSort(v, n);
			break;
	}

	write_array(v, n);
	return 0;
}
