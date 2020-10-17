#include <iostream>
#include <unistd.h>

using namespace std;

int main() {
/*-----    dati    -----*/
    char bar = 47;
    char back = 92;
    char ast = 42;
    char sp = 32;
    char vert = 124;
    char dis[9];
    char riga[4][6];
    int i, j, k;
/*----- istruzioni -----*/
    dis[0] = 65;
    dis[1] = 117;
    dis[2] = 103;
    dis[3] = 117;
    dis[4] = 114;
    dis[5] = 105;
    dis[6] = 33;
    dis[7] = 32;
    dis[8] = '\0';
    for (i=0; i<4; i++)  {
      	for (j=0; j<5; j++) {
          	riga[i][j] = sp;
      	}
      	riga[i][5] = '\0';
    }
    riga[0][2] = ast;
    riga[1][1] = ast;
    riga[1][2] = ast;
    riga[1][3] = ast;
    riga[2][0] = ast;
    riga[2][1] = ast;
    riga[2][2] = ast;
    riga[2][3] = ast;
    riga[2][4] = ast;
    riga[3][2] = vert;
    system("clear");
    cout<<'\n';
    for (i=0; i<4; i++) {
        cout<<"\n\t"<<riga[i];
    }
    cout<<"\n\n"<<sp<<bar<<ast;
    usleep(400000);
    cout<<"\b\b"<<sp<<back<<ast;
    for (i=0; i<7; i+=2) {
        usleep(400000);
        cout<<"\b\b\b"<<dis[i]<<sp<<bar<<ast;
        usleep(400000);
        cout<<"\b\b\b"<<dis[i+1]<<sp<<back<<ast;
    }
    for (i=0; i<7; i++) {
        usleep(400000);
        cout<<"\b\b\b\b\b\b\b\b\b\b\b"<<sp<<dis<<sp<<bar<<ast;
        usleep(400000);
        cout<<"\b\b\b\b\b\b\b\b\b\b\b"<<sp<<dis<<sp<<back<<ast;
    }
    usleep(400000);
    for (k=0; k<11;k++)
           cout<<'\b';
    for (k=0; k<11;k++)
           cout<<sp;
    cout<<'\n';
    for (k=0; k<7;k++)
        cout<<sp;
    for (i=0; i<2; i++){
        usleep(400000);
        cout<<dis;
        usleep(400000);
        for (k=0; k<8;k++)
            cout<<'\b';
        for (k=0; k<8;k++)
            cout<<sp;
        usleep(400000);
        for (k=0; k<8;k++)
            cout<<'\b';
    }
    cout<<dis;
    usleep(800000);
    cout<<"\n\n";
}
