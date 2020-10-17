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

void scrivi_pari_dispari_array(int v[], int n) {
	int p = 0;
	int d = 0;

	for (int i = 0; i < n; i++) {
		if(v[i] % 2 == 0)
			p++;
		else
			d++;
	}

	int pari[p];
	int dispari[d];
	int j = 0;
	int x = 0;

	for (int i = 0; i < n; i++) {
		if(v[i] % 2 == 0){
			pari[j] = v[i];
			j++;
		}
		else {
			dispari[x] = v[i];
			x++;
		}
	}

	cout << "i numeri pari sono " << p << ": \n";
	scrivi_array(pari, p);
	cout << "i numeri dispari sono " << d << ": \n";
	scrivi_array(dispari,d);
}


int main() {
	int n;

	cout << "inserisci elementi array: ";
	cin  >> n;

	int v[n];

	inserisci_array(v, n);
	scrivi_pari_dispari_array(v,n);

	return 0;
}
