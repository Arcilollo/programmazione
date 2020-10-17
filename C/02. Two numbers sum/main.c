#include <stdio.h>

int main () {
	int x, y;
	int sum;

	printf("inserisci X: ");
	scanf("%d", &x);
	printf("inserisci Y: ");
	scanf("%d", &y);
	sum = x + y;
	printf("somma = %d\n", sum);

	return 0;
}
