#include <iostream>

using namespace std;

void viewArrays(int v1[], int v2[], int v3[], int n) {
	for (int i = 0; i < n; i++) {
		cout << v1[i] << "\t" << v2[i] << "\t" << v3[i] << "\n";
	}
	cout << "\n";
}

void cinArray(int v[], int n) {
	for (int i = 0; i < n; i++) {
		cout << "elemento "<< i + 1 << ": ";
		cin  >> v[i];
	}
}

void fillBuffer(int producer[], int buffer[], int dim) {
	for (int i = 0; i < dim; i++) {
		buffer[i] = producer[i];
	}
}

void emptyBuffer(int consumer[], int buffer[], int dim) {
	for (int i = 0; i < dim; i++) {
		consumer[i] = buffer[i];
		buffer[i] = 0;
	}
}

bool isFull(int buffer[], int bufferDim) {
	bool full = true;

	for (int i = 0; i < bufferDim; i++){
		if (buffer[i] == 0)
			full = false;
	}
	return full;
}

bool isEmpty(int buffer[], int bufferDim) {
	bool empty;

	for (int i = 0; i < bufferDim; i++) {
		if (buffer[i] != 0)
			empty = false;
	}

	return empty;
}

int main() {
	int producer[8] = {0};
	int buffer[8] = {0};
	int consumer[8] = {0};

	int r;
	do {
		system("clear");
		cout << "Prod\tBuff\tCons\n";
		viewArrays(producer, buffer, consumer, 8);
		cout << "1. Riempi il buffer (produttore)\n";
		cout << "2. Svuota il buffer (consumatore)\n";
		cout << "3. Nuovi valori da inserire nel buffer (nuovo produttore)\n";
		cout << "0. Esci\n";
		cin  >> r;
		system("clear");

		switch (r) {
			case 1:
				if (isEmpty(buffer, 8))
					fillBuffer(producer, buffer, 8);
				break;
			case 2:
				if (isFull(buffer, 8))
					emptyBuffer(consumer, buffer, 8);
				break;
			case 3:
				cinArray(producer, 8);
				break;
		}
	} while (r != 0);

	return 0;
}
