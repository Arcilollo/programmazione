#include <iostream>

using namespace std;

int main() {
	const int n = 5;

	int v[n] = {6,3,7,2,1};
	int *p = &v[0];

	for (int i = 0; i < n; i++) {
		cout << p + i << "\n";
	}
	cout << "\n";
	for (int i = 0; i < n; i++) {
		cout << v + i << "\n";
	}
	return 0;
}
