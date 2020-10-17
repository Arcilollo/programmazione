#include <iostream>
#include <fstream>

using namespace std;

ifstream in("input.txt");
ifstream out("output.txt");

void writeM (int m[][100], int r, int c) {
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            cout << m[i][j] << " ";
        }
        cout << "\n";
    }
    cout << "\n";
}

void addPortal (int m[][100], int input[][100], int r, int c, int n) {
    int rp, rc;

    for (int i = 1; i <= n; i++) {
        in  >> rp >> rc;
        m[rp][rc] = i;
        input[rp][rc] = 1;

        in  >> rp >> rc;
        m[rp][rc] = i;
    }
}

bool isCompleted (int m[][100], int r, int c) {
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            if (m[i][j] != 0)
                return false;
        }
    }
    return true;
}

void move (int m[][100], int input[][100], pos[][100] int r, int c, int n) {
    for (i = 0; i < n; i++) {

    }
}

int main() {
    int t;
    int r, c;
    int qr, qc;
    int n;
    int passes = 0;
   
    int m[100][100] = {0};
    int pos[100][100] = {0};
    int input[100][100] = {0};

    in  >> t;

    in  >> r >> c;
    in  >> qr >> qc;

    in  >> n;

    pos[qr][qc] = 1;

    addPortal(m, input, r, c, n);

    writeM(pos, r, c);
    writeM(input, r, c);
    writeM(m, r, c);

    return 0;
}
