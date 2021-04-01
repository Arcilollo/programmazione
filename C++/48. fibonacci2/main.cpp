#include <iostream>

using namespace std;

int fibonacci (int n) {
	int prec = 0, num = 1, suc;

	for (int i = 0; i < n - 1; i++){
		suc = prec + num;
		prec = num;
		num = suc;
	}
	return suc;
}

int main() {
	int n;

	cin >> n;

	return 0;
}
