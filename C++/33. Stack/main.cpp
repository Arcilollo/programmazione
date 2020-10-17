/*
PSEUDOCODIFICA

Inizio AggiungiAPila (pila[], &dim, &numero)
	pila[dim] = numero
	dim = dim + 1
	numero = numero + 1
Fine AggiungiAPila

Inizio RimuoviDaPila (pila[], &dim)
	dim = dim - 1
Fine RimuoviDaPila

Inzio SvuotaPila (pila[], &dim,  &numero)
	Per i da 0 a dim
		pila[i] = 0
	numero = 1
	dim = 0
Fine SuotaPila

Inizio Visualizza (pila[], dim)
	Per i da dim a 0
		Scrivi pila[i]
Fine Visualizza

Inizio
	dim = 0
	numero = 1
	Dichiaro pila[100]
	Esegui
		Scrivi "Cosa vuoi fare?"
		Scrivi "1. Inserimento in testa"
		Scrivi "2. Estrazione in testa"
		Scrivi "3. Svuota la pila"
		Scrivi "0. Esci"
		Inserisci scelta

		Cambia (scelta)
			caso 1
				AggiungiAPila (pila, dim, numero)
			caso 2
				Se dim > 0
					RimuoviDaPila (pila, dim)
				Altrimenti
					Scrivi "Impossibile rimuovere elementi dalla coda"
			caso 3
				SvuotaPila (pila, dim, numero)

		Visualizza (pila, dim)
	Mentre scelta <> 0

Fine
*/

#include <iostream>

using namespace std;

void addToStack (int stack[], int &dim, int &number) {
	stack[dim] = number;	// l'ultimo elemento della pila viene assegnato un valore
	dim++;					// viene aumentata la dimensione della pila
	number++;				// viene aumentato questo valore in modo che il prossimo elemento abbia un numero diverso dai precedenti
}

void removeFromStack (int stack[], int &dim) {
	stack[dim] = 0;		// l'ultimo elemento della pila viene azzerato
	dim--;				// la grandezza della pila diminuisce
}

void emptyStack (int stack[], int &dim, int &number) {
	for (int i = 0; i < dim; i++) {
		stack[i] = 0; // nel svuotare la pila si pone ogni elemento a 0
	}
	number = 1; 	// si reinizializzano i valori
	dim = 0;
}

void viewStack (int stack[], int dim) {
	for (int i = dim - 1; i >= 0; i--)
		cout << stack[i] << "\n";
}

int main() {
	int choice; // variabile della scelta del menù
	int stack_lenght = 0; // grandezza della pila (nelle funzioni viene chiamata "dim")
	int number = 1; // valore dell'elemento della pila
	int stack[100] = {0}; // la pila
	do {
		cout << "Cosa vuoi fare?\n";
		cout << "1. Inserimento in testa\n";
		cout << "2. Estrazione in testa\n";
		cout << "3. Svuota la pila\n";
		cout << "0. Esci\n";
		cin  >> choice;
		system("clear");

		switch (choice) {
			case 1:
				addToStack (stack, stack_lenght, number);
				break;
			case 2:
				if (stack_lenght > 0)	// ovviamente la grandezza non può essere negativa
					removeFromStack (stack, stack_lenght);
				else
					cout << "Impossibile rimuovere elementi dalla coda\n";
				break;
			case 3:
				emptyStack (stack, stack_lenght, number);
				break;
		}

		viewStack (stack, stack_lenght); // permette la visualizzazione della pila ogni volta che si sceglie un opzione
		cout << "\n";
		
	} while (choice != 0);

	return 0;
}
