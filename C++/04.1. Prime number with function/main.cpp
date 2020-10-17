#include <iostream>

using namespace std;

bool prime(int n) {
	for (int i = 2; i <= n / 2; i++) {
		if (n % i == 0)
			return false;
	}
	return true;
}

int main() {
	int n;
	bool f = true;

	cout << "inserisci un numero: ";
	cin  >> n;

	if (prime(n) == true)
		cout << "il numero inserito è primo\n";
	else
		cout << "il numero inserito non è primo\n";

	return 0;
}
