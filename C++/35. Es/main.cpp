#include <iostream>

using namespace std;

struct City {
	string name;
	float mm;
};

void enterCity (City city[], int &dim) {
	cout << "Inserisci il nome della città: ";
	cin  >> city[dim].name;
	cout << "Inserisci la quantità di precipitazioni in mm: ";
	cin  >> city[dim].mm;
	dim++;
}

void viewCity (City city[], int dim) {
	for (int i = 0; i < dim; i++) {
		cout << city[i].name << "\t";
		cout << city[i].mm << "\n";
	}
}

float mediumCity (City city[], int dim) {
	float sum = 0;
	for (size_t i = 0; i < dim; i++) {
		sum += city[i].mm;
	}
	sum /= dim;
	return sum;
}

bool isRaining (City city[], int dim) {
	string tmp;
	int pos = 0;
	bool f = false;

	cout << "inserisci il nome della città: ";
	cin  >> tmp;

	while (tmp == city[pos].name) {
		pos++;
	}

	if (city[pos].mm > 2500)
		f = true;

	return f;
}

int main() {
	int choice;
	City city[50];
	int dim = 0;
	do {
		cout << "Cosa vuoi fare?\n";
		cout << "1. Inserisci dati città\n";
		cout << "2. Visualizza dati città\n";
		cout << "3. Media precipitazioni\n";
		cout << "4. Stabilisci se la città è piovosa\n";
		cout << "5. Precipitazione minima\n";
		cout << "6. Precipitazione massima\n";
		cout << "7. Differenza tra massima e minima\n";
		cout << "8. Visualizza in ordine di precipitazioni\n";
		cout << "0. Esci\n";
		cin  >> choice;
		system("clear");

		switch (choice) {
			case 1:
				enterCity (city, dim);
				break;
			case 2:
				viewCity (city, dim);
				break;
			case 3:
				cout << "la media è " << mediumCity (city, dim) << "mm\n";
				break;
			case 4:
				if (isRaining (city, dim))
					cout << "la città inserita è piovosa\n";
				else
					cout << "la città inserita non è piovosa\n";
				break;
			case 5:

				break;
		}
		cout << "\n";
	} while (choice != 0);

	return 0;
}
