#include <iostream>

using namespace std;

struct Swimmer {
    string name;
    int time;
};

void enterS (Swimmer swim[], int &n) {
    cout << "Inserisci il nome del nuotatore: ";
    cin  >> swim[n].name;
    cout << "Inserisci il tempo impiegato: ";
    cin  >> swim[n].time;
    n++;
}

void removeS (Swimmer swim[], int &n) {
    string banned;
    
    for (int i = 0; i < n; i++)
        cout << swim[i].name << "\n";
    cout << "\nQuale nuotatore vuoi rimuovere: ";
    cin  >> banned;
    
    for (int i = 0; i < n; i++) {
        if (swim[i].name == banned) {
            for (int j = i; j < n - 1; j++) {
                swim[j].name = swim[j+1].name;
                swim[j].time = swim[j+1].time;
            }
        }
    }
    n--;
}

void writeS (Swimmer swim[], int n) {
    for (int i = 0; i < n; i++) {
        cout << swim[i].name << "\t";
        cout << swim[i].time << "\n";
    }
    cout << "\n";
}

void swap (Swimmer swim1, Swimmer swim2) {
    string temp1 = swim1.name;
    int temp2 = swim1.time;
    swim1.name = swim2.name;
    swim1.time = swim2.time;
    swim2.name = temp1;
    swim2.time = temp2;
}

void sort (Swimmer swim[], int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (swim[i].time > swim[j].time){
                swap (swim[i], swim[j]);
            }
        }
    }
}

void calculateAll (Swimmer swim1[], int n1, Swimmer swim2[], int n2, Swimmer swim3[]) {
    int n3 = n1 + n2;

    for (int i = 0; i < n1; i++) {
        swim3[i].name = swim1[i].name;
        swim3[i].time = swim1[i].time;
    }

    for (int i = 0; i < n2; i++) {
        swim3[i + n1].name = swim2[i].name;
        swim3[i + n1].time = swim2[i].time;
    }

    sort (swim3, n3);

    writeS (swim3, n3);
}

int main() {
    int n1 = 0;
    int n2 = 0;
    int s;

    Swimmer setM[6];
    Swimmer setF[6];
    Swimmer all[12];

    do {
        cout << "Cosa vuoi fare?\n";
        cout << "1. Inserisci nuotatore della batteria maschile\n";
        cout << "2. Squalifica nuotare della batteria maschile\n";
        cout << "3. Visualizza classifica della batteria maschile\n";
        cout << "4. Inserisci nuotatore della batteria femminile\n";
        cout << "5. Squalifica nuotare della batteria femminile\n";
        cout << "6. Visualizza classifica della batteria femminile\n";
        cout << "7. Visualizza classifica totale\n";
        cout << "0. Esci\n";
        cin  >> s;
        system ("clear");

        switch (s) {
            case 1:
                enterS (setM, n1);
                break;
            case 2:
                removeS (setM, n1);
                break;
            case 3:
                writeS (setM, n1);
                break;
            case 4:
                enterS (setF, n2);
                break;
            case 5:
                removeS (setF, n2);
                break;
            case 6:
                writeS (setF, n2);
                break;
            case 7:
                calculateAll (setM, n1, setF, n2, all);
                break;
        }

    } while (s != 0);

    return 0;
}
