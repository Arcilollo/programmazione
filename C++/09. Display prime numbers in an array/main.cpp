#include <iostream>

using namespace std;

void read_vector (int a[], int n) {
	for (int i = 0; i < n; i++) {
		cout << "inserisci il numero in posizione " << i + 1 << ": ";
		cin  >> a[i];
	}
}

bool prime (int n) {
	for (int i = 2; i <= n / 2; i++) {
		if (n % i == 0)
			return false;
	}
	return true;
}

int count_prime_vector (int a[], int n) {
	int count = 0;
	for (int i = 0; i < n; i++) {
		if (prime(a[i]) == true)
			count++;
	}
	return count;
}

int main() {
	int n;

	cout << "quanti numeri vuoi inserire?: ";
	cin  >> n;

	int v[n];

	read_vector (v, n);3
	cout << "i numeri primi inseriti sono: " << count_prime_vector(v, n) << "\n";

	return 0;
}
