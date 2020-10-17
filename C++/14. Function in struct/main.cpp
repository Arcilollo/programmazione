#include <iostream>

using namespace std;

struct distances {
	int m;
	float cm;
};

distances somma(distances d1, distances d2) {
	distances d3;
	d3.m = d1.m + d2.m;
	d3.cm = d1.cm + d2.cm;
	return d3;
}

int main() {
	distances x, y, z;

	cout << "Inserisci distanza1:\n";
	cout << "Inserisci i metri: ";
	cin  >> x.m;
	cout << "Inserisci i centimetri: ";
	cin  >> x.cm;

	cout << "Inserisci distanza2:\n";
	cout << "Inserisci i metri: ";
	cin  >> y.m;
	cout << "Inserisci i centimetri: ";
	cin  >> y.cm;

	z = somma(x, y);

	cout << "somma distanza3:\n";
	cout << "m: " << z.m << '\n';
	cout << "cm: " << z.cm << '\n';

	return 0;
}
