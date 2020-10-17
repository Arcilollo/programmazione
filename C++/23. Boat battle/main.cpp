#include <iostream>
#include <time.h>
#include <unistd.h>

using namespace std;

void zeroM (char camp[10][10]) {
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10; j++) {
			camp[i][j] = ' ';
		}
	}
}

void writeM (char camp[10][10]) {
	cout << "  0 1 2 3 4 5 6 7 8 9\n";
	for (int i = 0; i < 10; i++) {
		cout << i << " ";
		for (int j = 0; j < 10; j++) {
			cout << camp[i][j] << " ";
		}
		cout << "\n";
	}
	cout << "\n";
}

bool isPositionable (char camp[10][10], int r, int c, int dim, int s) {
	bool b = true;
	int v[] = {4, 3, 3, 2, 2, 1};

	switch (s) {
		case 0:
			if (c >= 10-(v[dim]-1))
 				b = false;
			for (int i = 0; i < v[dim]; i++)
				if ((camp[r][c+i] == '-') ^ (camp[r][c+i] == '|'))
					b = false;
			break;
		case 1:
			if (r >= 10-(v[dim]-1))
				b = false;
			for (int i = 0; i < v[dim]; i++)
				if ((camp[r+i][c] == '-') ^ (camp[r+i][c] == '|'))
					b = false;
			break;
	}
	return b;
}

void randomPlace (char camp[10][10]) {
	srand((unsigned)time(NULL));
	int r, c;
	int s;
	int v[] = {4, 3, 3, 2, 2, 1};

	for (int j = 0; j < 6; j++) {
		do {
			s = rand() % 2;
			if (s == 0) {
				r = rand() % 10;
				c = rand() % (10 - (v[j] - 1));
			}
			else {
				r = rand() % (10 - (v[j] - 1));
				c = rand() % 10;
			}
		} while (isPositionable(camp, r, c, j, s) == false);

		switch (s) {
			case 0:
				for (int i = 0; i < v[j]; i++)
					camp[r][c+i] = '-';
				break;
			case 1:
				for (int i = 0; i < v[j]; i++)
					camp[r+i][c] = '|';
				break;
		}
	}
}

void enterB (char camp[10][10]) {
	int r, c;
	int s;
	int v[] = {4, 3, 3, 2, 2, 1};

	for (int j = 0; j < 6; j++) {
		cout << "Inserisci le coordinate della nave: ";
		cin  >> r >> c;

		cout << "\nCome vuoi inserire la nave?\n0. Orizzontale\n1. Verticale\n";
		cin  >> s;
		while (isPositionable(camp,r,c,j,s) == false) {
			system ("clear");
			writeM (camp);
			cout << "Impossibile posizionare la nave\n\n";
			cout << "Reinserisci le coordinate della nave: ";
			cin  >> r >> c;

			cout << "\nCome vuoi inserire la nave?\n0. Orizzontale\n1. Verticale\n";
			cin  >> s;
		}

		switch (s) {
			case 0:
				for (int i = 0; i < v[j]; i++)
					camp[r][c+i] = '-';
				break;
			case 1:
				for (int i = 0; i < v[j]; i++)
					camp[r+i][c] = '|';
				break;
		}
		system ("clear");
		writeM (camp);
	}
}

bool isFinished (char camp[10][10]) {
	bool f = true;

	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10; j++) {
			if ((camp[i][j] == '-') ^ (camp[i][j] == '|'))
				f = false;
		}
	}
	return f;
}

void game (char camp1[10][10], char camp2[10][10], char camp3[10][10], bool &win, bool debug) {
	srand((unsigned)time(NULL));
	int r, c;
	bool f = false;

	system ("clear");
	if (debug)
		writeM (camp2);
	else
		writeM (camp3);
	writeM (camp1);

	while (f == false) {
		cout << "Inserisci dove vuoi colpire: ";
		cin  >> r >> c;

		if ((camp2[r][c] == '-') ^ (camp2[r][c] == '|')) {
			camp2[r][c] = 'X';
			camp3[r][c] = 'X';
			system ("clear");
			if (debug)
				writeM (camp2);
			else
				writeM (camp3);
			writeM (camp1);
			cout << "Complimenti hai colpito\n";
		}
		else {
			camp2[r][c] = 'X';
			camp3[r][c] = 'X';
			system ("clear");
			if (debug)
				writeM (camp2);
			else
				writeM (camp3);
			writeM (camp1);
			cout << "Hai colpito acqua\n";
		}
		usleep(1500*1000);
		if (isFinished(camp2) == true) {
			win = true;
			f = true;
			break;
		}


		r = rand() % 10;
		c = rand() % 10;

		if ((camp1[r][c] == '-') ^ (camp1[r][c] == '|')) {
			camp1[r][c] = 'X';
			system ("clear");
			if (debug)
				writeM (camp2);
			else
				writeM (camp3);
			writeM (camp1);
			cout << "Ti hanno colpito\n";
		}
		else {
			camp1[r][c] = 'X';
			system ("clear");
			if (debug)
				writeM (camp2);
			else
				writeM (camp3);
			writeM (camp1);
			cout << "Non ti hanno colpito\n";
		}
		usleep(1500*1000);
		if (isFinished(camp1) == true) {
			win = false;
			f = true;
		}
	}
}

int main() {
	char camp1[10][10];
	char camp2[10][10];
	char camp3[10][10];
	bool win, debug;

	zeroM (camp1);
	zeroM (camp2);
	zeroM (camp3);
	randomPlace (camp2);

	cout << "Attivare debug?\n0. No\n1. Si\n";
	cin  >> debug;
	system("clear");

	writeM (camp1);
 	enterB (camp1);

	game (camp1, camp2, camp3, win, debug);

	system ("clear");

	if (win == true)
		cout << "Hai vinto!\n";
	else
		cout << "Hai perso\n";

	return 0;
}
