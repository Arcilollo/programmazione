#include <iostream>

using namespace std;

void inserisci_array(int v[], int n) {
	for (int i = 0; i < n; i++){
		cout << "elemento numero " << i + 1 << ": ";
		cin  >> v[i];
	}
	cout << "\n";
}

int max(int a, int b) {
	if (a > b)
		return a;
	else
		return b;
}

void somma_array(int a[], int n1, int b[], int n2) {
	int s[max(n1,n2)];
	for (int i = 0; i < max(n1,n2); i++){
		s[i] = a[i] + b[i];
		cout << a[i] << "\t" << b[i] << "\t" << s[i] << "\n";
	}
}

int main() {
	int n1, n2;

	cout << "inserire elementi del primo array: ";
	cin  >> n1;
	cout << "inserire elementi del primo array: ";
	cin  >> n2;

	int a[max(n1,n2)] = {0};
	int b[max(n1,n2)] = {0};

	inserisci_array(a,n1);
	inserisci_array(b,n2);

	somma_array(a,n1,b,n2);

	return 0;
}
