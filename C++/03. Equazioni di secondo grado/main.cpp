#include <iostream>
#include <math.h>

using namespace std;

int main() {
	double a, b, c;
	double delta;

	cout << "inserisci a: ";
	cin  >> a;
	cout << "inserisci b: ";
	cin  >> b;
	cout << "inserisci c: ";
	cin  >> c;

	delta = (b * b) - (4 * a * c);

	cout << "delta = " << delta << "\n";
	cout << "xv = " << (-1 * b) / (2 * a) << "\n";
	cout << "yv = " << (-1 * delta) / (4 * a) << "\n";

	if (delta >= 0) {
		cout << "x1 = " << (-1 * b + sqrt(delta))/(2 * a) << "\n";
		cout << "x2 = " << (-1 * b - sqrt(delta))/(2 * a) << "\n";
	}
	else {
		cout << "x1 = impossibile\n";
		cout << "x2 = impossibile\n";
	}

	return 0;
}
