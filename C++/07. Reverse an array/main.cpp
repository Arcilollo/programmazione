#include <iostream>

using namespace std;

void inserisci_array(int v[], int n) {
	for (int i = 0; i < n; i++){
		cout << "elemento numero " << i + 1 << ": ";
		cin  >> v[i];
	}
	cout << "\n";
}

void scrivi_array(int v[], int n) {
	for (int i = 0; i < n; i++){
		cout << v[i] << "\n";
	}
	cout << "\n";
}

void scambia(int v[], int n) {
	int s[n];
	for (int i = 0; i < n; i++) {
		s[i] = v[i];
	}

	int j = 0;
	for (int i = n - 1; i >= 0; i--){
		v[i] = s[j];
		j++;
	}
}

int main() {
	int n;

	cout << "inserisci elementi dell'array: ";
	cin  >> n;

	int v[n];

	inserisci_array(v,n);
	scambia(v,n);
	scrivi_array(v,n);

	return 0;
}
