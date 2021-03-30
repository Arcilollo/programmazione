#include <iostream>

using namespace std;


int main() {
	freopen("input.txt", "r", stdin);
	freopen("output.txt", "w", stdout);

	int h0, m0, h1, m1;
	int hf, mf;

	cin >> h0 >> m0 >> h1 >> m1;

	if (m1 >= m0) {
		mf = m1 - m0;
	}
	else  {
		mf = m1 - m0 + 60;
		h0++;
	}
	if (h1 >= h0) {
		hf = h1 - h0;
	}
	else {
		hf = h1 - h0 + 24;
	}


	cout << hf << " " << mf;

	return 0;
}
