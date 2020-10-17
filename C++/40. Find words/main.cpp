#include <iostream>
#include <fstream>
#include <string.h>

using namespace std;

ifstream fin("input");

void zeroM (char camp[100][100]) {
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10; j++) {
			camp[i][j] = ' ';
		}
	}
}

void printmat(char camp[100][100], int lenght, int height) {
	for (int i = 0; i < lenght; i++) {
		for (int j = 0; j < height; j++) {
			cout << camp[i][j] << ' ';
		}
		cout << '\n';
	}
}

void getMat(char camp[100][100], int lenght, int height) {
	for (int i = 0; i < lenght; i++) {
		for (int j = 0; j < height; j++) {
			fin >> camp[i][j];
		}
	}
}

void findStraight(char camp[100][100], int lenght, int height, int x, int y, char word[]) {
	bool f = true;
	for (int i = 0; i < strlen(word); i++) {
		if (camp[x][y+i] != word[i])
			f = false;
	}
	if (f == true)
		cout << "\"" << word << "\" trovata \nriga: " << x+1 << "\ncolonna: " << y+1 << '\n';

	f = true;
	for (int i = 0; i < strlen(word); i++) {
		if (camp[x][y-i] != word[i])
			f = false;
	}
	if (f == true)
		cout << "\"" << word << "\" trovata \nriga: " << x+1 << "\ncolonna: " << y+1 << '\n';

	f = true;
	for (int i = 0; i < strlen(word); i++) {
		if (camp[x+i][y] != word[i])
			f = false;
	}
	if (f == true)
		cout << "\"" << word << "\" trovata \nriga: " << x+1 << "\ncolonna: " << y+1 << '\n';

	f = true;
	for (int i = 0; i < strlen(word); i++) {
		if (camp[x-i][y] != word[i])
			f = false;
	}
	if (f == true)
		cout << "\"" << word << "\" trovata \nriga: " << x+1 << "\ncolonna: " << y+1 << '\n';

}

void findGay(char camp[100][100], int lenght, int height, int x, int y, char word[]) {
	bool f = true;
	for (int i = 0; i < strlen(word); i++) {
		if (camp[x+i][y+i] != word[i])
			f = false;
	}
	if (f == true)
		cout << "\"" << word << "\" trovata \nriga: " << x+1 << "\ncolonna: " << y+1 << '\n';

	f = true;
	for (int i = 0; i < strlen(word); i++) {
		if (camp[x+i][y-i] != word[i])
			f = false;
	}
	if (f == true)
		cout << "\"" << word << "\" trovata \nriga: " << x+1 << "\ncolonna: " << y+1 << '\n';

	f = true;
	for (int i = 0; i < strlen(word); i++) {
		if (camp[x-i][y+i] != word[i])
			f = false;
	}
	if (f == true)
		cout << "\"" << word << "\" trovata \nriga: " << x+1 << "\ncolonna: " << y+1 << '\n';

	f = true;
	for (int i = 0; i < strlen(word); i++) {
		if (camp[x-i][y-i] != word[i])
			f = false;
	}
	if (f == true)
		cout << "\"" << word << "\" trovata \nriga: " << x+1 << "\ncolonna: " << y+1 << '\n';

}

void findWord(char camp[100][100], int lenght, int height, char word[]) {
	for (int i = 0; i < lenght; i++) {
		for (int j = 0; j < height; j++) {
			if (camp[i][j] == word[0]) {
				findStraight(camp, lenght, height, i, j, word);
				findGay(camp, lenght, height, i, j, word);
			}
		}
	}
}

int main() {
	int lenght, height;
	char word[100];
	cout << "inserisci la parola da cercare in maiuscolo\n";
	cin  >> word;
	fin >> lenght >> height;

	char camp[100][100];

	zeroM(camp);
	getMat(camp, lenght, height);
	printmat(camp, lenght, height);
	findWord(camp, lenght, height, word);

	return 0;
}
