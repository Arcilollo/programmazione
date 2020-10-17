#include <iostream>

using namespace std;

void inserisci_array(int v[], int n) {
	for (int i = 0; i < n; i++) {
		cout << "Elemento numero " << i + 1 << ": ";
		cin  >> v[i];
	}
	cout << "\n";
}

int nmax_array(int v[], int n) {
	int max = v[0];
	for (int i = 1; i < n; i++) {
		if (v[i] > max)
			max = v[i];
	}
	return max;
}

int main() {
	int n;
	int max;

	cout << "Quanti numeri vuoi inserire?\n";
	cin  >> n;

	int v[n];

	inserisci_array(v, n);
	max = nmax_array(v, n);

	cout << "Il numero più grande è: " << max << "\n";

	return 0;
}
