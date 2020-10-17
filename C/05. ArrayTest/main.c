#include <stdio.h>

void scanA(int v[], int n) {
	printf("Inserisci 10 numeri interi:\n");

	for (int i = 0; i < n; i++) {
		scanf("%d", &v[i]);
	}

	printf("\n");
}

void printA(int v[], int n) {
	for (int i = 0; i < n; i++) {
		printf("%d\n", v[i]);
	}
}

int main() {
	int array[10];

	scanA(array, 10);
	printA(array, 10);

	return 0;
}
