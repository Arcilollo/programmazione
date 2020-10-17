#include <iostream>

using namespace std;

void write_array(int v[]) {
	for (int i = 0; i < 8; i++) {
		cout << v[i];
	}
}

void p_intera(int n, int v[]) {
	for (int i = 7; i >= 0; i--) {
		v[i] = n % 2;
		n /= 2;
	}
}

void p_decimale(float n, int v[]) {
	int num = (int)(n);
	n -= num;

	for (int i = 0; i < 8; i++) {
		n *= 2;

		if (n >= 1) {
			n -= 1;
			v[i] = 1;
		}
		else
			v[i] = 0;
	}
}

int main() {
	float n;
	int intero[8];
	int decimale[8];

	cin >> n;

	p_intera(n, intero);
	p_decimale(n, decimale);
	write_array(intero);
	cout << ",";
	write_array(decimale);
	cout << "\n";

	return 0;
}
