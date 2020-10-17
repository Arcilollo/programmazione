#include <stdio.h>

int prime(int num) {
	int flag = 1;

	for (int i = 2; i <= num/2; i++) {
		if (num % i == 0)
			flag = 0;
	}
	return flag;
}

int main() {
	int num;

	printf("inserisci un numero per verificare se è primo: ");
	scanf("%d", num);

	if (prime(num) == 1)
		printf("Il numero è primo");
	else
		printf("Il numero non è primo");


	return 0;
}
