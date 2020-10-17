#include <iostream>

using namespace std;

void addToQueue (int queue[], int &dim, int &i) {
	queue[dim] = i;
	dim++;
	i++;
}

void removeFromQueue (int queue[], int &dim) {
	for (int i = 0; i < dim - 1; i++)
		queue[i] = queue[i+1];
	dim--;
}

void viewQueue (int queue[], int dim) {
	for (int i = 0; i < dim; i++)
		cout << queue[i] << "\n";
}

int main() {
	int choice;
	int queue_lenght = 0;
	int i = 1;
	int queue[100];
	do {
		cout << "Cosa vuoi fare?\n";
		cout << "1. Aggiungi persona alla coda\n";
		cout << "2. Fai andare avanti il primo\n";
		cout << "0. Esci\n";
		cin  >> choice;
		system("clear");

		switch (choice) {
			case 1:
				addToQueue (queue, queue_lenght, i);
				break;
			case 2:
				if (queue_lenght > 0)
					removeFromQueue (queue, queue_lenght);
				else
					cout << "Impossibile rimuovere elementi dalla coda\n";
				break;
		}

		viewQueue (queue, queue_lenght);
		cout << "\n";
	} while (choice != 0);

	return 0;
}
