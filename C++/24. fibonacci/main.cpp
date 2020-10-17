#include <iostream>

using namespace std;

void fibonacci (long int n) {
	long int prec = 1;
	long int num = 0;
	long int suc;

	for (int i = 0; i < n; i++) {
		cout << num << '\n';
		suc = prec + num;
		prec = num;
		num = suc;
	}
}

int main() {
	int n;

	cout << "Quanti numeri?\n";
	cin  >> n;

	fibonacci (n);
	return 0;
}
