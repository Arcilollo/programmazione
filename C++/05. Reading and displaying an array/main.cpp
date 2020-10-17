#include <iostream>

using namespace std;

int main() {
	int n;

	cout << "quanti numeri vuoi inserire? ";
	cin  >> n;

	int v[n];

	for (int i = 0; i < n; i++){
		cout << "elemento numero " << i + 1 << ": ";
		cin  >> v[i];
	}

	cout << "\n";

	for (int i = 0; i < n; i++)
		cout << "elemento numero " << i + 1 << ": " << v[i] << "\n";

	return 0;
}
