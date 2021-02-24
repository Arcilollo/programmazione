#include <iostream>
#include <string>

using namespace std;

string sort (string a, int n) {
	for (int gap = n / 2; gap > 0; gap /= 2) {
		for (int i = gap; i < n; i++) {
			int temp = a[i];

			int j;
			for (j = i; j >= gap && a[j - gap] > temp; j -= gap)
				a[j] = a[j - gap];

			a[j] = temp;
		}
	}
	return a;
}

string sort2 (string a, int n1, int n2) {
	int n = n2 - n1;
	char epic[n];
	for (int i = 0; i < n; i++)
		epic[i] = a[i+n1];

	for (int i = 0; i < n; i++)
		for (int j = 0; j < n; j++)
			if (epic[i] < epic[j]) {
				char tmp = epic[i];
				epic[i] = epic[j];
				epic[j] = tmp;
			}

	return epic;
}

void shellSort(string a, int n) {
    for (int gap = n / 2; gap > 0; gap /= 2) {
		for (int i = gap; i < n; i++) {
            int temp = a[i];

            int j;
            for (j = i; j >= gap && a[j - gap] > temp; j -= gap)
                a[j] = a[j - gap];

            a[j] = temp;
        }
    }
}

void solve() {
	bool correct = false;
	string P, H;

	cin >> P;
	cin >> H;


	// WRITE YOUR SOLUTION HERE
	string Psorted = sort(P, P.size());
	for (int i = 0; i < H.size(); i++) {
		string Hsorted = sort2(H, i, (i+P.size()));
		if (Psorted == Hsorted) {
			correct = true;
		}
	}

	cout << (correct ? "1" : "0") << endl;
}

int main() {
	int T;
	cin >> T;
	for(int i=0; i<T; i++) {
		solve();
	}

	return 0;
}
