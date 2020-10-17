#include <iostream>
#include <string>

using namespace std;

struct person {
	string name;
	string surname;
	int age;
	string job;
};

void read_struct(person per[], int n) {
	for (int i = 0; i < n; i++) {
		cout << "inserisci il nome di persona n. " << i + 1 << ": " ;
		cin >> per[i].name;
		cout << "inserisci il cognome di persona n. " << i + 1 << ": ";
		cin >> per[i].surname;
		do {
			cout << "inserisci l'età di persona n. " << i + 1 << ": ";
			cin >> per[i].age;
		} while (per[i].age < 18);
		cout << "inserisci il lavoro di persona n. " << i + 1 << ": ";
		cin >> per[i].job;
		cout << "\n";
	}
}

void write_struct(person per[], int n) {
	for (int i = 0; i < n; i++) {
		cout << per[i].name << "\t";
		cout << per[i].surname << "\t";
		cout << per[i].age << "\t";
		cout << per[i].job << "\n";
	}
	cout << "\n";
}

int mag45(person per[], int n) {
	int mag = 0;

	for (int i = 0; i < n; i++) {
		if (per[i].age > 45)
			mag++;
	}
	return mag;
}

void lavori(person per[], int n, int &lav1, int &lav2, int &lav3) {
	for (int i = 0; i < n; i++) {
		if (per[i].job == "amministratore")
			lav1++;
		else if (per[i].job == "dirigente")
			lav2++;
		else if (per[i].job == "esecutivo")
			lav3++;
	}
}

int main() {
	int n;

	int plus45;
	int amministratori = 0;
	int dirigenti = 0;
	int esecutivi = 0;

	cout << "inserire numero impiegati: ";
	cin  >> n;

	system("clear");

	person azienda[n];

	read_struct(azienda, n);
	system("clear");
	write_struct(azienda, n);
	plus45 = mag45(azienda, n);
	lavori(azienda, n, amministratori, dirigenti, esecutivi);

	cout << "\nCi sono " << plus45 << " persone che hanno più di 45 anni\n";
	cout << "Ci sono " << amministratori << " amministratori\n";
	cout << "Ci sono " << dirigenti << " dirigenti\n";
	cout << "Ci sono " << esecutivi << " esecutivi\n";

	cout << "grazie per aver usato il programma \342\230\272\n";

	return 0;
}
