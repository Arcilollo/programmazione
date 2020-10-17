#include <iostream>

using namespace std;

void readV (int v[], int n) {
    for (int i = 0; i < n; i++) {
        cout << "inserisci (" << i << "): ";
        cin  >> v[i];
    }
}

void writeV (int v[], int n) {
    for (int i = 0; i < n; i++)
        cout << v[i] << "\n";
    cout << "\n";
}

void swap (int &n1, int &n2) {
    int temp = n1;
    n1 = n2;
    n2 = temp;
}

void sort (int v[], int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (v[i] < v[j])
                swap (v[i], v[j]);
        }
    }
}

bool isInArray (int v[], int n, int t) {
    bool f = false;

    int l = 0;
    int r = n - 1;

    do {
        int i = (l + r) / 2;

        if (v[i] == t)
            f = true;
        else {
            if (v[i] > t)
                r = i - 1;
            else
                l = i + 1;
        }
    } while (!f && (l <= r));

    return f;
}

int main() {
    int n, t;

    cout << "Inserire grandezza array: ";
    cin  >> n;

    int v[n];
    readV (v, n);

    cout << "Inserire numero da trovare: ";
    cin  >> t;

    sort (v, n);


    if (isInArray(v, n, t))
        cout << "il numero "<< t << " è stato trovato\n";
    else
        cout << "il numero "<< t << " non è stato trovato\n";

    return 0;
}
