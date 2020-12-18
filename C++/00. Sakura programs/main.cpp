#include <iostream>

using namespace std;

int main() {
	int H = 0;
	for (int i = 2; i <= 2020; i += 2) {
		if (i % 5 == 0 || i % 7 == 0)
			H++;
	}
	cout << H << "\n";
}
