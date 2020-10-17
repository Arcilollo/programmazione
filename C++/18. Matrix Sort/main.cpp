#include <iostream>
#include <fstream>

using namespace std;

void read_matrix(int m[][1000], int r, int c) {
	ifstream in("input");
	for (int i = 0; i < r; i++) {
		for (int j = 0; j < c; j++) {
			in >> m[i][j];
		}
	}
}

void write_matrix(int m[][1000], int r, int c) {
	ofstream out("output");
	for (int i = 0; i < r; i++) {
		for (int j = 0; j < c; j++) {
			out << m[i][j] << "\t";
		}
		out << "\n";
	}
}

void swap(int &n1, int &n2) {
	int temp = n1;
	n1 = n2;
	n2 = temp;
}

void sort(int m[][1000], int r, int c) {
	for (int i = 0; i < r; i++) {
		for (int j = 0; j < c; j++) {
			for (int x = 0; x < r; x++) {
				for (int y = 0; y < c; y++) {
					if (m[i][j] < m[x][y])
						swap(m[i][j], m[x][y]);
				}
			}
		}
	}
}

int main() {
	int r = 3;
	int c = 3;

	int m[r][1000];

	read_matrix(m, r, c);
	sort(m, r, c);
	write_matrix(m, r, c);

	return 0;
}
