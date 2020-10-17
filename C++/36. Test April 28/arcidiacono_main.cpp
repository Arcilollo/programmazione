#include <iostream>

using namespace std;

struct Student {
	string name;
	string surname;
	int mat;
};

void inserimento (Student a[], int &dim) {
	Student student;
	int pos;

	cout << "inserisci il nome\n";
	cin  >> student.name;
	cout << "inserisci il cognome\n";
	cin  >> student.surname;
	cout << "inserisci la matricola\n";
	cin  >> student.mat;

	if (dim == 0) {		// Se la dimensione è 0 lo mette nel primo elemento
		a[0].name = student.name;
		a[0].surname = student.surname;
		a[0].mat = student.mat;
		dim++;
	}

	else {
		for (int i = 1; i <= dim; i++) { 		// Trova la posizione dove mettere il nuovo dato	(P)
			if (student.mat >= a[i-1].mat)
				pos = i;
		}

		dim++;
		for (int i = dim; i > pos; i--) {		// Sposta gli elementi dalla posizione dalla posizione nuovo dato fino alla fine del vettore di un elemento sotto;
			a[i].name = a[i-1].name;
			a[i].surname = a[i-1].surname;
			a[i].mat = a[i-1].mat;
		}
		a[pos].name = student.name;				// Assegna i valori nella posizione corretta
		a[pos].surname = student.surname;
		a[pos].mat = student.mat;
	}
}

void view (Student a[], int dim) {
	for (int i = 0; i < dim; i++) {
		cout << a[i].name << "\t";
		cout << a[i].surname << "\t";
		cout << a[i].mat << "\n";
	}
}

int main() {

	Student student[50];
	int dim = 0;
	int choice;

	do {
	
		cout << "Cosa vuoi fare?\n";
		cout << "1. Inserisci un alunno\n";
		cout << "2. Visualizza la lista degli alunni in ordine di matricola\n";
		cout << "0. Esci\n";
		cin  >> choice;
		system("clear");

		switch (choice) {
			case 1:
				inserimento (student, dim);
				break;
			case 2:
				view (student, dim);
				break;
		}
		cout << "\n";

	} while (choice != 0);

	return 0;
}
