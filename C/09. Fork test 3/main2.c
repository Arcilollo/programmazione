#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>

int main() {
	int figlio;

	printf("prima di fork()\n");

	figlio = fork();

	if (figlio == 0)
		printf("Parte eseguita dal figlio\n");
	else if (figlio > 0)
		printf("Parte eseguita dal padre\n");
	else
		printf("errore nella fork\n");

	return 0;
}
