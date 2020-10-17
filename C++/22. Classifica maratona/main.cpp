#include <iostream>

using namespace std;

struct Time {
	int hh;
	int mm;
	int ss;
};

struct Atleta {
	int num;
	string surname;
	string nation;
	Time time;
};


void read_at (Atleta a[], int &n) {
	cout << "inserisci il numero dell'atleta: ";
	cin  >> a[n].num;
	cout << "inserisci il cognome dell'atleta: ";
	cin  >> a[n].surname;
	cout << "inserisci la nazione dell'atleta: ";
	cin  >> a[n].nation;
	cout << "inserisci il tempo d'arrivo dell'atleta (hh mm ss): ";
	cin  >> a[n].time.hh;
	cin  >> a[n].time.mm;
	cin  >> a[n].time.ss;

	n++;
}

void write_at (Atleta a[], int n) {
	for (int i = 0; i < n; i++) {
		cout << a[i].num << "\t";
		cout << a[i].surname << "\t";
		cout << a[i].nation << "\t";
		cout << a[i].time.hh << ":";
		cout << a[i].time.mm << ":";
		cout << a[i].time.ss << "\n";
	}
	cout << "\n";
}

void delete_at (Atleta a[], int &n) {
	int b;
	cout << "inserisci il numero dell'atleta: ";
	cin  >> b;

	for (int i = 0; i < n; i++) {
		if (a[i].num == b) {
			for (int j = i; j < n - 1; j++) {
				a[j].num = a[j+1].num;
				a[j].surname = a[j+1].surname;
				a[j].nation = a[j+1].nation;
				a[j].time.hh = a[j+1].time.hh;
				a[j].time.mm = a[j+1].time.mm;
				a[j].time.ss = a[j+1].time.ss;
			}
			n--;
		}
	}
}

int medium_a (int v[], int n) {
	int s = 0;

	for (int i = 0; i < n; i++) {
		s += v[i];
	}
	s /= n;
	return s;
}

void medium (Atleta a[], int n) {
	int t[n];
	int m;
	int hh = 0, mm = 0, ss = 0;

	for (int i = 0; i < n; i++) {
		t[i] = a[i].time.ss;
		for (int j = a[i].time.hh; j > 0; j--) {
			t[i] = t[i] + 3600;
		}
		for (int j = a[i].time.mm; j > 0; j--) {
			t[i] = t[i] + 60;
		}
	}
	m = medium_a(t, n);
	cout << "\n" << m << "\n";


	while (m > 3600) {
		hh++;
		m -= 3600;
	}
	while (m > 60) {
		mm++;
		m -= 60;
	}
	ss = m;

	cout << hh << ":" << mm << ":" << ss << "\n";
}

int main() {
	int s;
	int n = 0;
	Atleta a[100];
    do {
		cout << "Cosa vuoi fare?\n";
		cout << "1. inserisci un atleta\n";
		cout << "2. squalifica un atleta\n";
		cout << "3. visualizza classifica\n";
		cout << "4. calcola media del tempo\n";
		cout << "0. Esci\n";
		cin  >> s;
		cout << "\n";

		switch (s) {
			case 1:
				read_at (a, n);
				break;
			case 2:
				delete_at (a, n);
				break;
			case 3:
				write_at (a, n);
				break;
			case 4:
				medium (a, n);
				break;
		}
	} while (s != 0);
    return 0;
}
