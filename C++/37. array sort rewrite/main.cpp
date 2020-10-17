#include <iostream>

using namespace std;

void read(int v[], int n) {
    for (int i = 0; i < n; i++) {
        cout << "inserisci l'elemento n." << i+1 << ": ";
        cin  >> v[i];
    }
    cout << "\n";
}

void write(int v[], int n) {
    for (int i = 0; i < n; i++) {
        cout << v[i] << "\n";
    }
    cout << "\n";
}

void swap(int &n1, int &n2) {
    int temp = n1;
    n1 = n2;
    n2 = temp;
}

void sort(int v[], int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (v[i] < v[j])
                swap (v[i], v[j]);
        }
    }
}

int main() {
    int n;
    cout << "inserisci quanti numeri vuoi inserire: ";
    cin  >> n;

    int array[n];

    read(array, n);
    sort(array, n);
    write(array, n);

    return 0;
}
