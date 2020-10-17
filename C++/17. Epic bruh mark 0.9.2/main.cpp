#include <iostream>
#include <fstream>

using namespace std;

struct boomer {
	string subject;
	float marks = 0;
};

int main() {
	int n;

	ifstream in("marks.txt");
	ofstream out("average.txt");

	in >> n;

	boomer subject[n];

	for (int i = 0; i < n; i++) {
		float temp;
		in >> subject[i].subject;
		int j = 0;
		do {
			in >> temp;
			subject[i].marks += temp;
			if (temp != 0)
				j++;
		} while (temp != 0);
		subject[i].marks /= j;
		cout << "calculated the average of " << subject[i].subject << "\n";
	}

	for (int i = 0; i < n; i++){
		out << subject[i].subject << ": " << subject[i].marks << "\n";
		cout << "Writed the average of " << subject[i].subject << " on the file\n";
	}

	return 0;
}
