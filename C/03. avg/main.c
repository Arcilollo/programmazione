#include <stdio.h>

int main () {
	int dim;
	float sum, avg;

	printf("Inserisci il numero degli elementi di cui fare la media: ");
	scanf("%d", &dim);
	float vect[dim];

	for (int i = 0; i < dim; i++) {
		printf("Inserisci il l'elemento %d: ", i+1);
		scanf("%f", &vect[i]);
		sum = sum + vect[i];
	}

	avg = sum / dim;
	printf("la media è: %f\n", avg);

	return 0;
}
