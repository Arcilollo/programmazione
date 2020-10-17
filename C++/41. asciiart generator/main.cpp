#include <iostream>
#include <time.h>
#include <unistd.h>

using namespace std;

void zeroM(char matrix[30][30]) {
	for (int i = 0; i < 30; i++) {
		for (int j = 0; j < 30; j++) {
			matrix[i][j] = ' ';
		}
	}
}

void printM(char matrix[30][30]) {
	for (int i = 0; i < 30; i++) {
		for (int j = 0; j < 30; j++) {
			cout << matrix[i][j] << ' ';
		}
		cout << "\n";
	}
}

void placenext(char matrix[30][30], int &X, int &Y, char ascii) {
	int varX, varY;
	do {
		int direction = rand() % 4;
		if (direction == 0) {
			varX = 1;
			varY = 0;
		}
		else if (direction == 1) {
			varX = 0;
			varY = 1;
		}
		else if (direction == 2) {
			varX = -1;
			varY = 0;
		}
		else {
			varX = 0;
			varY = -1;
		}
	} while (matrix[Y+varY][X+varX] != ascii);
	X += varX;
	Y += varY;

	matrix[Y][X] = ascii;
}

int main() {
	srand((unsigned)time(NULL));
	char matrix[30][30];

	char ascii = '@';
	int num;
	cin >> num;

	int X[num];
	int Y[num];
	for (int i = 0; i < num; i++) {
		X[i] = rand() % 30;
		Y[i] = rand() % 30;
	}

	zeroM(matrix);
	for (int i = 0; i < num; i++) {
		matrix[Y[i]][X[i]] = ascii;
	}

	for (int i = 0; i < 20; i++) {
		system("clear");
		for (int i = 0; i < num; i++) {
			placenext(matrix, X[i], Y[i], ascii);
		}
		printM(matrix);
		usleep(500*1000);
	}

	return 0;
}
