#include <iostream>

using namespace std;

int main() {
	string parola = "Xbox";
	int numero = 360;

	int i;

	cout << parola << numero << "?. allora dove sono finiti ";

	for (i = 1; i < numero - 2; i++) {
		cout << parola << i << ", ";
	}

	cout << parola << i << " e ";
	cout << parola << i+1 << "?\n";

	return 0;
}
