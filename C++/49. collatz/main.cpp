#include <iostream>

using namespace std;

int collatz (int n) {
	int length = 1;

	while (n != 1) {
		if (n % 2 == 0) {
			n = n / 2;
		}
		else {
			n = 3 * n + 1;
		}
		length++;
	}

	return length;
}

int main() {
	freopen("input.txt", "r", stdin);
	freopen("output.txt", "w", stdout);

	int n;
	cin >> n;

	cout << collatz(n);


	return 0;
}
