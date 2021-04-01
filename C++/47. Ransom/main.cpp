#include <iostream>
#include <string.h>

using namespace std;

int main() {
	freopen("input2.txt", "r", stdin);
	//freopen("output.txt", "w", stdout);

	int N;

	cin >> N;
	string numeri[N];

	for (int i = 0; i < N; i++) {
		cin >> numeri[i];
	}

	string cifre[10];

	for (int i = 0; i < 10; i++)
		cin >> cifre[i];

	for (int i = 0; i < N; i++) {
		for (int j = 0; j < numeri[i].length(); j += cifre[i].length()) {
			for (int x = 0; x < 10; x++) {
				if (numeri[i][j] == cifre[x][1]) {
					cout << x;
				}
			}
		}
		cout << "\n";
	}


	return 0;
}
