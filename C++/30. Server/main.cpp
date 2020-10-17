#include <iostream>
#include <fstream>

using namespace std;

ifstream in("input.txt");
ofstream out("output.txt");

struct Server {
	int boot;
	int exec;
	int totalTime;
};

void selectionSort(Server v[], int n) {
	int n10, n20;
	int n11, n21;
	int n12, n22;

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (v[i].totalTime < v[j].totalTime) {
				n10 = v[i].totalTime;
				n20 = v[j].totalTime;
				v[i].totalTime = n20;
				v[j].totalTime = n10;
				n11 = v[i].boot;
				n21 = v[j].boot;
				v[i].boot = n21;
				v[j].boot = n11;
				n12 = v[i].exec;
				n22 = v[j].exec;
				v[i].exec = n22;
				v[j].exec = n12;
			}
		}
	}
}


int main() {
	int t;

	in  >> t;

	for (int a = 0; a < t; a++) {
		int serverTot;
		int serverAviable;
		int numberTask;

		in  >> serverTot;
		in  >> serverAviable;
		in  >> numberTask;

		Server server[serverTot];

		int tps = numberTask / serverAviable;
		int tpsR = numberTask % serverAviable;

		for (int i = 0; i < serverTot; i++) {
			in  >> server[i].boot;
			in  >> server[i].exec;
			server[i].totalTime = server[i].boot + tps * server[i].exec;
		}

		selectionSort(server, serverTot);

		int temp1 = server[0].totalTime;
		int temp2 = server[0].boot;
		int temp3 = server[0].exec;
		int j = 1;

		while (tpsR > 0) {
			if ((temp1 == server[0].totalTime) && (temp2 == server[0].boot) && (temp3 == server[0].exec)) {
				server[0].totalTime = server[0].boot + (tps + j) * server[0].exec;
				j++;
				selectionSort(server, serverTot);
				tpsR--;
			}
			else {
				temp1 = server[0].totalTime;
				temp2 = server[0].boot;
				temp3 = server[0].exec;
				j = 1;
			}

		}

		int c = server[serverAviable-1].totalTime;

		out << "Case #" << a+1 << ": " << c << "\n";
	}

	return 0;
}
