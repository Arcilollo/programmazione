#include <iostream>

using namespace std;

struct Node {
	int value;
	Node *next;
};

void addToList (Node *p, Node *&t, int &i) { // Aggiunge un elemento in testa
	p = new Node;    // Crea un nuovo nodo
	p -> value = i;  // Assegna il valore automaticamente
	p -> next = t;
	t = p;           // Sposta la testa
	i++;
}

void addToList2 (Node *p, Node *&t, int &i) { // Aggiunge un elemento in coda
	Node *q = t;
	if (t == NULL) {
		p = new Node;
		p -> value = i;
		p -> next = t;
		t = p;
	}
	else {
		while (q -> next != NULL)
			q = q -> next;         // Si posiziona sull'ultimo elemento

		p = new Node;              // Crea un nuovo nodo
		q -> next = p;             // L'elemento successivo (NULL) sarà p
		p -> value = i;            // Assegna automaticamente un valore
	}
	i++;
}

void remove (Node *&t) {
	t = t -> next;     // Per eliminare un elemento in testa basta muovere la testa nel prossimo nodo
}

void viewList (Node *t) {
	while (t != NULL) {
		cout << t -> value << "\n";
		t = t -> next;
	}
}

int main() {
	int choice;
	int i = 1;  // Serve per assegnare il valore agli elementi automaticamente
	Node *p;
	Node *t = NULL;

	do {
		cout << "Cosa vuoi fare?\n";
		cout << "1. Aggiungere un elemento in testa alla lista\n";
		cout << "2. Aggiungere un elemento in coda alla lista\n";
		cout << "3. Rimuovi elemento in testa alla lista\n";
		cout << "0. Esci\n";
		cin  >> choice;
		system("clear");

		switch (choice) {
			case 1:
				addToList (p, t, i);
				break;
			case 2:
				addToList2 (p, t, i);
				break;
			case 3:
				if (t != NULL)
					remove (t);
				break;
		}

		if (t != NULL)		// In modo da poter visualizzare la lista automaticamente
			viewList (t);	// ogni volta che viene inserito o rimosso un elemento

		cout << "\n";
	} while (choice != 0);

	return 0;
}
