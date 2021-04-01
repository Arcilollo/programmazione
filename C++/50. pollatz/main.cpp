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

int pollatz (int n) {
	int length = 1;

	int cLength = collatz(n);

	while (n != 1) {
		if (n % 2 == 0) {
			n = n / 2;
		}
		else {
			n = 5 * n + 1;
		}
		length++;
		if (length > cLength)
			return length;
	}

	return length;
}

int main() {
	freopen("input.txt", "r", stdin);
	freopen("output.txt", "w", stdout);

	int result = 0;

	int n1, n2;
	cin >> n1 >> n2;

	for (int i = n1; i <= n2; i++) {
		int c = collatz(i);
		int p = pollatz(i);

		if (p < c)
			result++;
	}

	cout << result;



	return 0;
}
