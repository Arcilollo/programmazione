#include <iostream>

using namespace std;

void readV (char v[], int n) {
    for (int i = 0; i < n; i++) {
        cout << "inserisci (" << i << "): ";
        cin  >> v[i];
    }
}

void writeV (char v[], int n) {
    for (int i = 0; i < n; i++)
        cout << v[i] << "\n";
    cout << "\n";
}

void swap (char &n1, char &n2) {
    char temp = n1;
    n1 = n2;
    n2 = temp;
}

void sort (char v[], int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (v[i] < v[j])
                swap(v[i], v[j]);
        }
    }
}

int main() {
    int n;

    cout << "inserisci il numero degli elementi dell'array: ";
    cin  >> n;

    char v[n];

    readV (v, n);
    writeV (v, n);

    sort (v, n);

    writeV (v, n);
   
    return 0;
}
