#include <iostream>
#include <fstream>

using namespace std;

ifstream in("input");
//ofstream ofstream("output.txt");

struct student {
	string name;
	string surname;
	int clas;
	char section;
	float medium;
};

void read_s (student a[], int n) {
	for (int i = 0; i < n; i++) {
		in  >> a[i].name;
		in  >> a[i].surname;
		in  >> a[i].clas;
		in  >> a[i].section;
		in  >> a[i].medium;
	}
}

void write_s (student a[], int n) {
	for (int i = 0; i < n; i++) {
		cout << a[i].name << "\t";
		cout << a[i].surname << "\t";
		cout << a[i].clas;
		cout << a[i].section << "\t";
		cout << a[i].medium << "\n";
	}
}

void write_a (float v[], int n) {
	for (int i = 0; i < n; i++) {
		cout << v[i] << "\n";
	}
	cout << "\n";
}

float media (student a[], int n, int c, int s) {
	float sum = 0;
	int j = 0;
	for (int i = 0; i < n; i++) {
		if ((a[i].clas == c) && (a[i].section == s)) {
			sum += a[i].medium;
			j++;
		}
	}
	sum /= j;
	return sum;
}

void media_s (student a[], int n, float v[], int n1) {
	for (int x = 1; x <= n1; x++) {
		float sum = 0;
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (a[i].clas == x) {
				sum += a[i].medium;
				j++;
			}
		}
		v[x - 1] = sum / j;
	}
}

int main() {
	int n;
	int c;
	char s;
	float y[5];

	in  >> n;
	student a[n];
	read_s (a, n);
	//write_s (a, n);

	cout << "inserisci classe e sezione: ";
	cin  >> c >> s;

	cout << "La media della " << c << s << " e' di " << media(a, n, c, s) << "\n";

	media_s (a, n, y, 5);
	write_a (y, 5);

	return 0;
}
