#include <algorithm>
#include <time.h>

using namespace std;


bool isSorted(int v[], int n) {
	bool control = true;

	for (int i = 1; i < n; i++) {
		if (v[i] < v[i-1])
			control = false;
	}
	return control;
}


int getMax(int v[], int n) {
	int max = -1;

	for (int i = 0; i < n; i++) {
		if(v[i] > max)
			max = v[i];
	}
	return max;
}

void countSort(int v[], int n, int exp) {
	int result[n], i, count[10] = {0};

	for (i = 0; i <n; i++)
		count[(v[i] / exp) % 10]++;

	for (i = 1; i<10; i++)
		count[i] += count[i-1];


	for (i = n - 1; i >= 0; i--) {
		result[count[(v[i] / exp) % 10] - 1] = v[i];
		count[(v[i] / exp) % 10]--;
	}
	for (i = 0; i < n; i++)
		v[i] = result[i];
}

void radixSort(int v[], int n) {
	int exp, i;
	i = getMax(v, n);
	for (exp = 1; i/exp > 0; exp *= 10)
		countSort(v, n, exp);
}


void shellSort(int v[], int n) {
    for (int gap = n / 2; gap > 0; gap /= 2) {
		for (int i = gap; i < n; i++) {
            int temp = v[i];

            int j;
            for (j = i; j >= gap && v[j - gap] > temp; j -= gap)
                v[j] = v[j - gap];

            v[j] = temp;
        }
    }
}


void selectionSort(int v[], int n) {
	int n1, n2;

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (v[i] < v[j]) {
				n1 = v[i];
				n2 = v[j];
				v[i] = n2;
				v[j] = n1;
			}
		}
	}
}

void bogoSort(int v[], int n) {
	while (isSorted(v, n) == false) {
		random_shuffle(v, v + n);
	}
}


void bozoSort(int v[], int n) {
	int n1, n2;
	int i, j;

	srand((unsigned)time(0));

	while (isSorted(v, n) == false) {
    	i = (rand() % n);
		j = (rand() % n);
		n1 = v[i];
		n2 = v[j];
		v[j] = n1;
		v[i] = n2;
	}
}
