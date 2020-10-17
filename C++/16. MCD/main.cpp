#include <iostream>

using namespace std;

int mcd(int a, int b) {
	int r;
	while (b != 0) {
		r = a % b;
		a = b;
		b = r;
	}
	return a;
}

int main() {
	int a, b;

	cout << "inserisci a: ";
	cin  >> a;
	cout << "inserisci b: ";
	cin  >> b;

	cout << mcd(a, b) << "\n";
	return 0;
}
