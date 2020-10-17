#include <iostream>

using namespace std;

int main() {
	float n1, n2;

	cout << "inserisci il primo numero: ";
	cin  >> n1;
	cout << "inserisci il secondo numero: ";
	cin  >> n2;

	cout << "Somma = " << n1 + n2 << "\n";
	cout << "Sottrazione = " << n1 - n2 << "\n";
	cout << "Prodotto = " << n1 * n2 << "\n";
	cout << "Quoziente = " << n1 / n2 << "\n";

	return 0;
}
